package hu.wup.wuppadavans.controller;

import hu.wup.wuppadavans.Account;
import hu.wup.wuppadavans.User;
import hu.wup.wuppadavans.Application;
import hu.wup.wuppadavans.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


@RestController
public class UserController {

    private UserService userService = new UserService();

    @RequestMapping(value = "getusers", method = RequestMethod.GET)
    @ResponseBody
    public List<User> getUser() {
        return userService.getList();
    }

    @RequestMapping(value = "createusers", method = RequestMethod.POST)
    @ResponseBody
    public void createUsers(@RequestBody User user) {
        userService.getList().add(user);
    }



    @RequestMapping(value = "delete/{id}/", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteUser(@PathVariable("id") Long id) {

        userService.getList().remove(id);
    }


    public void magic() {

        long limit;
        Scanner scanner = new Scanner(System.in);
        List<User> userList = new ArrayList<>();

        System.out.println("Number of users:");
        long userAmount = scanner.nextLong();

        for (long i = 0; i < userAmount; i++) {

            User user = new User();
            user.setId(i);
            System.out.println(i + 1 + ". User\nGive the first name:");
            user.setFirstname(scanner.next());
            System.out.println(i + 1 + ". User\nGive the last name:");
            user.setLastname(scanner.next());
            System.out.println(i + 1 + ". User\nGive the age:");
            user.setAge(scanner.nextInt());
            System.out.println(i + 1 + ". User\nGender:");
            user.setGender(scanner.next());

            System.out.println(i + 1 + ". User\nAccount quantity:");
            limit = scanner.nextLong();
            List<Account> accountList = new ArrayList<>();

            for (int accountQuantity = 0; accountQuantity < limit; accountQuantity++) {
                Account account = new Account();
                System.out.println(accountQuantity + 1 + ". Account number:");
                account.setAccountNumber(scanner.next());
                System.out.println(accountQuantity + 1 + ". Account's currency:");
                account.setCurrency(scanner.next());

                accountList.add(account);

            }
            user.setAccounts(accountList);
            userList.add(user);
        }
        userList.forEach(System.out::println);
    }
}

