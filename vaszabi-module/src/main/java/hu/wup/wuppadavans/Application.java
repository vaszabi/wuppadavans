package hu.wup.wuppadavans;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

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
