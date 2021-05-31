package com.example.jsonplacerholder.resource;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class Address implements Serializable {

  private String street;
  private String suite;
  private String city;
  private String zipcode;

}
