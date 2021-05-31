package com.example.jsonplacerholder;

import com.example.jsonplacerholder.service.CommentService;
import com.example.jsonplacerholder.service.PostService;
import com.example.jsonplacerholder.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class PlaceHolderApiClient {

  public static final String BASE_URL = "https://jsonplaceholder.typicode.com";

  @Autowired
  private CommentService commentService;
  @Autowired
  private UserService userService;
  @Autowired
  private PostService postService;
}
