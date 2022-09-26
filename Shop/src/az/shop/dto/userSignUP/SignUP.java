package az.shop.dto.userSignUP;


import az.shop.db.UserRepositoryImpl;
import az.shop.service.Method;
import java.util.Scanner;


public class SignUP {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        String input = "";
        boolean state = false;
        az.shop.db.UserRepository userRepository = new UserRepositoryImpl();
        while (true) {
            String menu = "1.Login\n2.Sign up\n3.Exit\n\n" +
                    "Please choose one!";
            System.out.println(menu);
            input = new Scanner(System.in).nextLine();

            if (input.equalsIgnoreCase("login") || input.equals("1")) {
                System.out.print("Username: ");
                String username = sc.next();
                System.out.print("password: ");
                String password = sc.next();

                if (!userRepository.checkUserNamePass(username, password)) {
                    System.out.println("Wrong username and password");
                } else {
                    Method.run();
                }

            } else if (input.equalsIgnoreCase("sign up") || input.equals("2")) {
                System.out.print("name: ");
                String name = sc.next();
                System.out.print("surname: ");
                String surname = sc.next();
                System.out.print("username: ");
                String username = sc.next();
                System.out.print("password: ");
                String password = sc.next();
                System.out.print("age: ");
                int age = sc.nextInt();

                User user = new User(name, surname, username, password, age);
                userRepository.addUser(user);

            } else if (input.equals("3") || input.equalsIgnoreCase("exit")) {
                System.out.println("You exit successfully!");
                break;
                //main method ise dusmesin
            } else {
                System.out.println("Wrong input!Please try again");
            }
        }
    }
}