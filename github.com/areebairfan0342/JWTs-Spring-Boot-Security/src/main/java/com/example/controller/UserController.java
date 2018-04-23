package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
//import com.example.service.UserService;
@RestController
public class UserController {
//@Autowired
//UserService user_ser;
  /* Maps to all HTTP actions by default (GET,POST,..)*/
@RequestMapping("/users")
public @ResponseBody String getUsers() {
  return "{\"users\":[{\"firstname\":\"Richard\", \"lastname\":\"Feynman\"}," +
         "{\"firstname\":\"Marie\",\"lastname\":\"Curie\"}]}";
}
//    @RequestMapping(value="/users")
//    public @ResponseBody List<User> getUser() {
//	return user_ser.userService("Areeba", "123");
//  }
}