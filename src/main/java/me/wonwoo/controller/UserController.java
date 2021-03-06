package me.wonwoo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import me.wonwoo.domain.User;
import me.wonwoo.service.UserService;

/**
 * Created by wonwoo on 2016. 7. 16..
 */
@RestController
//@RequiredArgsConstructor
public class UserController {

	@Autowired
  private UserService userService;
  //private final UserRepository userRepository;

  @GetMapping("/findOne/{id}")
  public User user(@PathVariable Long id){
    return userService.findOne(id);
	//  return userRepository.findById(id);
  }
}
