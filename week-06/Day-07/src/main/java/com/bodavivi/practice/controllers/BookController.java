package com.bodavivi.practice.controllers;

import com.bodavivi.practice.models.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class BookController {
  List<Book> books = new ArrayList<>();

  public BookController() {

    addBooks();
  }

  public void addBooks() {
    Book first = new Book("The Fifth Sally", "Daniel Keyes", 1980);
    Book second = new Book("Flower for Algernon", "Daniel Keyes", 1959);
    Book third = new Book("Pedig olyan szépen éltek", "Szentesi Éva", 2018);
    Book fourth = new Book("Asszony a fronton", "Polcz Alaine", 1994);

    books.add(first);
    books.add(second);
    books.add(third);
    books.add(fourth);

  }

  @GetMapping(value = "/books")
  public String showBooks(Model model, @RequestParam(name = "author", required = false) String author) {
    List<Book> booksByAuthor = books.stream().filter(book -> book.getAuthor().equals(author)).collect(Collectors.toList());

    if (author != null){
      model.addAttribute("books", booksByAuthor);
    }else{
      model.addAttribute("books", books);
    }
    return "index";
  }

  @GetMapping(value = "/books/{id}/details")
  public String getBookById(Model model, @PathVariable(name = "id") Integer id) {
    Book bookById = null;

    for (Book book : books) {
      if (book.getId() == id) {
        bookById = book;
      }
    }

    if (bookById != null) {
      model.addAttribute("book", bookById);
    } else {
      model.addAttribute("error", "No book found");
    }
    return "details";
  }

  @RequestMapping(path = "/books/add", method = RequestMethod.GET)
  public String addBookForm(Model model, @ModelAttribute(name="book") Book book) {
    model.addAttribute("book", book);
    return "create";
  }

  @RequestMapping(path = "/books/add", method = RequestMethod.POST)
  public String addBook(@ModelAttribute(name="book") Book book) {
    books.add(book);
    return "redirect:/books";
  }
}
