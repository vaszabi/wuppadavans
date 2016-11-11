package hu.wup.wuppadavans.controller;

import hu.wup.wuppadavans.model.Account;
import hu.wup.wuppadavans.model.User;
import hu.wup.wuppadavans.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "getusers", method = RequestMethod.GET)
    @ResponseBody
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @RequestMapping(value = "createusers", method = RequestMethod.POST)
    @ResponseBody
    public void createUsers(@RequestBody User user) {
        userService.createUser(user);
    }


    @RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteUser(@PathVariable("id") Long id) {
        userService.delete(id);
    }

    @RequestMapping(value = "getuser/{id}", method = RequestMethod.GET)
    @ResponseBody
    public User getUser(@PathVariable("id") Long id) {
       return userService.getOneUser(id);
    }

    @RequestMapping(value = "modify/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public void modifyUser(@PathVariable("id") Long id,@RequestBody User user) {
        userService.modify(id, user);
    }

}

