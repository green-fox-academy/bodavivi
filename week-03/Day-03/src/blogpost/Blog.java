package blogpost;

import java.util.ArrayList;
import java.util.List;

public class Blog {
  List<BlogPost> listOfBlogPosts;

  Blog(){
    this.listOfBlogPosts = new ArrayList<>();
  }

  public void add(BlogPost blogPostToAdd){
    listOfBlogPosts.add(blogPostToAdd);
  }

  public void delete(int i){
    listOfBlogPosts.remove(i);
  }

  public void update (int j, BlogPost blogPost){
    listOfBlogPosts.add(j, blogPost);
    listOfBlogPosts.remove(j+1);
  }
}
