package com.example.jsonplacerholder.resource;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class User implements Serializable {

  private int id;
  private String name;
  private String email;
  private Address address;
  private String phone;
  private String website;
  private Company company;

}
