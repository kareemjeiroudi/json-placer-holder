package com.example.jsonplacerholder.repo;

import com.example.jsonplacerholder.resource.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static com.example.jsonplacerholder.PlaceHolderApiClient.BASE_URL;

@Component
public class UserRepository {

  private static final String RESOURCE_ENDPOINT = "/users";
  @Autowired
  private RestTemplate restTemplate;

  public List<User> getUsers() {
    final ResponseEntity<User[]> responseEntity = restTemplate.getForEntity(BASE_URL + RESOURCE_ENDPOINT, User[].class);
    final User[] users = responseEntity.getBody();
    return users == null ? Collections.emptyList() : Arrays.asList(users);
  }

  public User findUserById(final int userId) {
    final ResponseEntity<User> responseEntity = restTemplate.getForEntity(BASE_URL + "{userId}", User.class, userId);
    return responseEntity.getBody();
  }

  public User saveUser(final User user) {
    final ResponseEntity<User> responseEntity = restTemplate.postForEntity(BASE_URL + RESOURCE_ENDPOINT, user, User.class);
    return responseEntity.getBody();
  }
}
