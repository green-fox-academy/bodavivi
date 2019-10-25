package com.bodavivi.basicwebshop.controllers;

import com.bodavivi.basicwebshop.models.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class Index {
  List<ShopItem> items = new ArrayList<>();

  public Index() {
    addItems();
  }

  public void addItems() {
    items.add(new ShopItem("shoes", "Running shoes.", 100, 2));
    items.add(new ShopItem("doggie", "It is a dalmatian dog.", 30000, 1));
    items.add(new ShopItem("Headset", "It is a headset", 20, 50));
    items.add(new ShopItem("Kitty", "Blackcat", 2990, 0));
  }

  @GetMapping(value = "/itemlist")
  public String itemLister(Model model) {
    model.addAttribute("items", items);
    return "indexController";
  }

  @GetMapping(value = "/onlyavailable")
  public String onlyAvailable(Model model){
    List<ShopItem> availables = items.stream().filter(item-> item.getQuantityOfStock() > 0).collect(Collectors.toList());
    model.addAttribute("items", availables);
    return "indexController";
  }

  @GetMapping(value ="/cheapestfirst")
  public String cheapestFirst(Model model){
    List<ShopItem> itemsSortedByPrice = items.stream().sorted(Comparator.comparingInt(ShopItem::getPrice)).collect(Collectors.toList());
    model.addAttribute("items", itemsSortedByPrice);
    return "indexController";
  }

  @GetMapping(value="/containsnike")
  public String containsNike(Model model){
    List<ShopItem> containsNike = items.stream().filter(item-> item.getDescription().contains("nike")).collect(Collectors.toList());
    model.addAttribute("items", containsNike);
    return "indexController";
  }

  @GetMapping(value = "/averagestock")
  public String averageStock(Model model){
    double average = items.stream().filter(item -> item.getQuantityOfStock() > 0).mapToInt(item -> item.getQuantityOfStock()).summaryStatistics().getAverage();
    String averageString = "Average stock is " + Double.toString(average);
    model.addAttribute("average", averageString);
    return "averageStock";
  }

  @GetMapping(value="/mostExpensive")
  public String mostExpensive(Model model){
    int highestPrice= items.stream().filter(item -> item.getQuantityOfStock() > 0).mapToInt(item -> item.getPrice()).summaryStatistics().getMax();
    List<ShopItem> mostExpensive = items.stream().filter(item -> item.getPrice() == highestPrice).collect(Collectors.toList());
    String mostExpensiveItem = "Most expensive item is " + mostExpensive.get(0).getName();
    model.addAttribute("average", mostExpensiveItem);
    return "averageStock";
  }
}
