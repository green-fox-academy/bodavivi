package com.bodavivi.practice.models;

public class Book {
  private static int nextId = 0;

  private int id;
  private String title;
  private String author;
  private int releaseYear;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public int getReleaseYear() {
    return releaseYear;
  }

  public void setReleaseYear(int releaseYear) {
    this.releaseYear = releaseYear;
  }


  public Book(String title, String author, int releaseYear){
    this.author = author;
    this.id = nextId++;
    this.releaseYear = releaseYear;
    this.title = title;
  }

  public Book(){

  }
}
