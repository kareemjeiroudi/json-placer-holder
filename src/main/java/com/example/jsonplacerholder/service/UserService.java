package com.example.jsonplacerholder.service;

import com.example.jsonplacerholder.repo.UserRepository;
import com.example.jsonplacerholder.resource.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class UserService {

  private UserRepository userRepository;
  private ObjectMapper objectMapper;

  public List<User> getUsers() {
    final List<User> users = userRepository.getUsers();
    // here goes business logic
    return users;
  }

  public User saveUser(final User user) {
    return userRepository.saveUser(user);
  }

}
