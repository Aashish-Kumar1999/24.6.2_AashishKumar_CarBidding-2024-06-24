package com.auction.com.users.controller;


import com.auction.com.users.entity.UsersEntity;
import com.auction.com.users.service.Userservice;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class UsersController {


    public final  Userservice userservice;


    @GetMapping("/getalluser")
    public List<UsersEntity> getallUsers() {
        return userservice.getallUsers();
    }

    @PostMapping("/Users")
    public UsersEntity addUsers(@RequestBody UsersEntity users) {
        UsersEntity p = userservice.save(users);
        return p;
    }

    @DeleteMapping("/Users/{}")
    public void delete(@PathVariable("UserId") Long UserId)
    {
        userservice.deleteUser(UserId);
    }

    @PutMapping("/users/{UserId}")
    public void updateteachers(@PathVariable ("userId") long UserId,@RequestBody UsersEntity users)
    {
        userservice.updateuser( UserId ,users );
    }

}
