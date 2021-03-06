package com.example.jsonplacerholder.resource;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class Comment implements Serializable {

  private int id;
  private int postId;
  private String name;
  private String email;
  private String body;

}
