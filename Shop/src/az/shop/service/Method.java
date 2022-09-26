package az.shop.service;


import az.shop.dto.eNum.Gender;
import az.shop.dto.eNum.Starred_Products;
import az.shop.model.Shoes;
import az.shop.model.Tshirts;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Method {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to MetaVerse!");
        while (true) {
            System.out.println("Please choose one of them: \n1.T-Shirts\n2.Shoes\n3.Exit");
            String customer = sc.nextLine();
            int customers;
            if (customer.equalsIgnoreCase("T-shirts") || customer.equals("1")) {
                List<Tshirts> tShirtList = new ArrayList<>();
                Tshirts tShirts1 = new Tshirts(Gender.MALE, "Madmext", "L", "Black", 120, Starred_Products.FOUR_STAR_PRODUCT);
                Tshirts tShirts2 = new Tshirts(Gender.MALE, "Blue", "M", "Blue", 200, Starred_Products.FOUR_STAR_PRODUCT);
                Tshirts tShirts3 = new Tshirts(Gender.WOMAN, "Blue", "S", "Red", 160, Starred_Products.THREE_STAR_PRODUCT);
                Tshirts tShirts4 = new Tshirts(Gender.MALE, "TrendyolMan", "M", "White", 240, Starred_Products.THREE_STAR_PRODUCT);
                Tshirts tShirts5 = new Tshirts(Gender.WOMAN, "Cotton", "S", "Yellow", 2200, Starred_Products.FIVE_STAR_PRODUCT);
                Tshirts tShirts6 = new Tshirts(Gender.MALE, "AVVA", "L", "Green", 300, Starred_Products.FOUR_STAR_PRODUCT);
                Tshirts tShirts7 = new Tshirts(Gender.MALE, "LC-Waikiki", "L", "Black", 320, Starred_Products.FIVE_STAR_PRODUCT);
                Tshirts tShirts8 = new Tshirts(Gender.WOMAN, "Defacto", "M", "White", 220, Starred_Products.THREE_STAR_PRODUCT);
                Tshirts tShirts9 = new Tshirts(Gender.MALE, "Loft", "L", "Blue", 250, Starred_Products.FOUR_STAR_PRODUCT);
                Tshirts tShirts10 = new Tshirts(Gender.MALE, "Adidas", "L", "White", 400, Starred_Products.FIVE_STAR_PRODUCT);
                tShirtList.add(tShirts1);
                tShirtList.add(tShirts2);
                tShirtList.add(tShirts3);
                tShirtList.add(tShirts4);
                tShirtList.add(tShirts5);
                tShirtList.add(tShirts6);
                tShirtList.add(tShirts7);
                tShirtList.add(tShirts8);
                tShirtList.add(tShirts9);
                tShirtList.add(tShirts10);
                tShirtList.forEach(System.out::println);
                System.out.println("------------------------------------------------------------------------------------------------------" + "\nHow many T-Shirts will u add to ur card?");

                customers = Integer.parseInt(sc.nextLine());
                while (customers-- != 0) {
                    System.out.println("Please select T-Shirts");
                    customer = sc.nextLine();
                    if (customer.equalsIgnoreCase("1")) {
                        System.out.println(tShirts1 + " was added!");
                    } else if (customer.equalsIgnoreCase("2")) {
                        System.out.println(tShirts2 + " was added!");
                    } else if (customer.equalsIgnoreCase("3")) {
                        System.out.println(tShirts3 + " was added!");
                    } else if (customer.equalsIgnoreCase("4")) {
                        System.out.println(tShirts4 + " was added!");
                    } else if (customer.equalsIgnoreCase("5")) {
                        System.out.println(tShirts5 + " was added!");
                    } else if (customer.equalsIgnoreCase("6")) {
                        System.out.println(tShirts6 + " was added!");
                    } else if (customer.equalsIgnoreCase("7")) {
                        System.out.println(tShirts7 + " was added!");
                    } else if (customer.equalsIgnoreCase("8")) {
                        System.out.println(tShirts8 + " was added!");
                    } else if (customer.equalsIgnoreCase("9")) {
                        System.out.println(tShirts9 + " was added!");
                    } else if (customer.equalsIgnoreCase("10")) {
                        System.out.println(tShirts10 + " was added!");
                    }
                }
                System.out.println("------------------------------------------------------------------------------------------------------" + "\nContinue Shopping?\nYes?\nNo?");
                if (sc.nextLine().equalsIgnoreCase("No")) {
                    break;
                }
            } else if (customer.equalsIgnoreCase("Shoes") || customer.equals("2")) {
                List<Shoes> shoeList = new ArrayList<>();
                Shoes shoe1 = new Shoes(Gender.MALE, "Adidas", "40", "Black", 620, Starred_Products.FOUR_STAR_PRODUCT);
                Shoes shoe2 = new Shoes(Gender.WOMAN, "Nike", "37", "Gold", 700, Starred_Products.FOUR_STAR_PRODUCT);
                Shoes shoe3 = new Shoes(Gender.WOMAN, "Puma", "36", "Navy Blue", 400, Starred_Products.FOUR_STAR_PRODUCT);
                Shoes shoe4 = new Shoes(Gender.MALE, "Reebok", "43", "Grey", 300, Starred_Products.THREE_STAR_PRODUCT);
                Shoes shoe5 = new Shoes(Gender.WOMAN, "Hummel", "38", "Orange", 370, Starred_Products.FOUR_STAR_PRODUCT);
                Shoes shoe6 = new Shoes(Gender.MALE, "Nike", "41", "Green", 800, Starred_Products.FIVE_STAR_PRODUCT);
                Shoes shoe7 = new Shoes(Gender.WOMAN, "Bershka", "37", "Pink", 1200, Starred_Products.FOUR_STAR_PRODUCT);
                Shoes shoe8 = new Shoes(Gender.MALE, "Jump", "42", "Black", 420, Starred_Products.FIVE_STAR_PRODUCT);
                Shoes shoe9 = new Shoes(Gender.MALE, "Adidas", "44", "Grey", 900, Starred_Products.FIVE_STAR_PRODUCT);
                Shoes shoe10 = new Shoes(Gender.MALE, "Puma", "42", "White", 700, Starred_Products.FIVE_STAR_PRODUCT);
                shoeList.add(shoe1);
                shoeList.add(shoe2);
                shoeList.add(shoe3);
                shoeList.add(shoe4);
                shoeList.add(shoe5);
                shoeList.add(shoe6);
                shoeList.add(shoe7);
                shoeList.add(shoe8);
                shoeList.add(shoe9);
                shoeList.add(shoe10);
                shoeList.forEach(System.out::println);
                System.out.println("------------------------------------------------------------------------------------------------------" + "\nHow many Shoes will u add to ur card?");

                customers = Integer.parseInt(sc.nextLine());
                while (customers-- != 0) {
                    System.out.println("Please select Shoes");
                    customer = sc.nextLine();
                    if (customer.equalsIgnoreCase("1")) {
                        System.out.println(shoe1 + " was added!");
                    } else if (customer.equalsIgnoreCase("2")) {
                        System.out.println(shoe2 + " was added!");
                    } else if (customer.equalsIgnoreCase("3")) {
                        System.out.println(shoe3 + " was added!");
                    } else if (customer.equalsIgnoreCase("4")) {
                        System.out.println(shoe4 + " was added!");
                    } else if (customer.equalsIgnoreCase("5")) {
                        System.out.println(shoe5 + " was added!");
                    } else if (customer.equalsIgnoreCase("6")) {
                        System.out.println(shoe6 + " was added!");
                    } else if (customer.equalsIgnoreCase("7")) {
                        System.out.println(shoe7 + " was added!");
                    } else if (customer.equalsIgnoreCase("8")) {
                        System.out.println(shoe8 + " was added!");
                    } else if (customer.equalsIgnoreCase("9")) {
                        System.out.println(shoe9 + " was added!");
                    } else if (customer.equalsIgnoreCase("10")) {
                        System.out.println(shoe10 + " was added!");
                    }
                }
                System.out.println("------------------------------------------------------------------------------------------------------" + "\nContinue Shopping?\nYes?\nNo?");
                if (sc.nextLine().equalsIgnoreCase("No")) {
                    break;
                }

            } else if (customer.equalsIgnoreCase("Exit") || customer.equals("3")) {
                System.out.println("You exit succesfully!");
                break;
            } else {
                System.out.println("Wrong input!");
            }
        }
    }
}