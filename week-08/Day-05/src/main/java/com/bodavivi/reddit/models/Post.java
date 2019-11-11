package com.bodavivi.reddit.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Post {
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  private Long id;
  private int rating;
  private String title;
  private String link;
  @Temporal(TemporalType.TIMESTAMP)
  private Date date;

  public Post() {

  }

  public Post(String title, String link) {
    this.rating = 0;
    this.title = title;
    this.link = link;
    this.date = new Date();
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }
}
