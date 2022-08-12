package naeemmohammadprogrammingckpt3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.InputMismatchException;

/**
 * This class represents as a test harness and is a main class of the project
 *
 * @author Mohammad Naeem
 */
public class BookStore {

    /**
     * @param args the command line arguments
     */
    private static ArrayList<Product> inventory = new ArrayList();
    private static ArrayList<Member> members = new ArrayList();
    private static ArrayList<Product> itemSold = new ArrayList();
    private static int memberID;
    private static int totalItemSold;
    private static double tax = 0.07;
    private static int newMembersAdded;
    private static double totalRevenue;

    /**
     * this method stores the inventory, all the implementations for products
     * and members purchasing options along with stor keeping
     *
     * @param args
     */
    public static void main(String[] args) {

        BookStore bookstore = new BookStore();
        MainMenuFram mainFrame = new MainMenuFram(bookstore);
        mainFrame.setVisible(true);

        Scanner fileScanner;

        try {
            fileScanner = new Scanner(new FileReader("ProductInventory.csv"));

            while (fileScanner.hasNext()) {
                String line = fileScanner.nextLine();

                String[] str = line.split(",");

                if (str[1].equalsIgnoreCase("book")) {
                    Book book = new Book(str[2],
                            Integer.parseInt(str[0]),
                            Double.parseDouble(str[5]),
                            Integer.parseInt(str[4]),
                            str[3]);
                    inventory.add(book);

                } else if (str[1].equalsIgnoreCase("cd")) {
                    CD cd = new CD(str[2],
                            Integer.parseInt(str[0]),
                            Double.parseDouble(str[5]),
                            Integer.parseInt(str[4]),
                            str[3]);
                    inventory.add(cd);

                } else if (str[1].equalsIgnoreCase("dvd")) {
                    DVD dvd = new DVD(str[2], Integer.parseInt(str[0]), Double.parseDouble(str[5]), Integer.parseInt(str[4]), str[3]);
                    inventory.add(dvd);
                }
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Oops, File not found!");
        }

        Scanner scnr = new Scanner(System.in);

        System.out.println("><><><><><><>< Hello and Welcome to our Book-Store ><><><><><><>< \n");
        System.out.println("What brought you in today?");

        boolean flag = true;
        do {
            try {
                flag = false;
                String userInput0 = scnr.nextLine();
            } catch (InputMismatchException IME) {
                flag = true;
                System.out.println("Invalid input, please type in words!");
            } catch (Exception e) {
                System.out.println("Ooops, Something went wrong!");
            }
        } while (flag);

        System.out.println("");
        System.out.println("Sure, I will be happy to help!");

        while (true) {
            System.out.println("***You can make your selection below***\n" + "\nSelect from 1-3");
            System.out.println("1. For Purchasing ");
            System.out.println("2. For Membership ");
            System.out.println("3. For Exit ");

            int userInput1 = 0;
            do {
                try {
                    flag = false;

                    userInput1 = scnr.nextInt();

                } catch (InputMismatchException IME) {
                    flag = true;
                    scnr.nextLine();
                    System.out.println("Invalid input, please type in numbers!");
                } catch (Exception e) {
                    System.out.println("Ooops, Something went wrong!");
                }
            } while (flag);

            if (userInput1 == 1) {

                for (int i = 0; i < inventory.size(); i++) {
                    inventory.get(i).display();
                }

                double totalCost = 0;

                while (true) {
                    System.out.println("For purchase, please type in the item ID number");

                    int userInput2 = 0;
                    do {
                        try {
                            flag = false;
                            userInput2 = scnr.nextInt();

                        } catch (InputMismatchException IME) {
                            flag = true;
                            scnr.nextLine();
                            System.out.println("Invalid input, please type in numbers!");
                        } catch (Exception e) {
                            System.out.println("Ooops, Something went wrong!");
                        }
                    } while (flag);

                    for (int i = 0; i < inventory.size(); i++) {
                        if (userInput2 == inventory.get(i).getProductID()) {
                            totalCost += inventory.get(i).getProductCost();
                            System.out.println("You have Bought: " + "[" + inventory.get(i).getProductName() + "]" + " for $" + inventory.get(i).getProductCost() + "\n");
                            inventory.get(i).decreaseNumInStock();
                            totalItemSold++;
                            itemSold.add(inventory.get(i));
                            totalRevenue += totalCost;
                        }
                    }
                    System.out.println("Continue Shopping? " + "Yes/No");

                    String userInput3 = "";
                    do {
                        try {
                            flag = false;
                            scnr.nextLine();
                            userInput3 = scnr.nextLine();
                        } catch (InputMismatchException IME) {
                            flag = true;
                            scnr.nextLine();
                            System.out.println("Invalid input, please type in words!");
                        } catch (Exception e) {
                            System.out.println("Ooops, Something went wrong!");
                        }
                    } while (flag);
                    if (userInput3.equalsIgnoreCase("no")) {
                        System.out.println("");
                        break;
                    }

                }
                System.out.println("Total Purchase Amount is: $" + (totalCost + (totalCost * tax)) + " after tax");
                System.out.println("Your total was " + "$" + totalCost + " before tax");
                System.out.println("We appreciate your bussiness with us \n" + "Have a Nice Day!\n");

            } else if (userInput1 == 2) {

                System.out.println("Are you a member? \n" + "Yes/No");

                String userInput4 = "";
                do {
                    try {
                        flag = false;
                        scnr.nextLine();
                        userInput4 = scnr.nextLine();

                    } catch (InputMismatchException IME) {
                        flag = true;
                        scnr.nextLine();
                        System.out.println("Invalid input, please type in words!");
                    } catch (Exception e) {
                        System.out.println("Ooops, Something went wrong!");
                    }
                } while (flag);

                if (userInput4.equalsIgnoreCase("yes")) {
                    System.out.println("Enter your Member ID:");

                    int userInput5 = 0;
                    do {
                        try {
                            flag = false;
                            userInput5 = scnr.nextInt();

                        } catch (InputMismatchException IME) {
                            flag = true;
                            scnr.nextLine();
                            System.out.println("Invalid input, please type in numbers!");
                        } catch (Exception e) {
                            System.out.println("Ooops, Something went wrong!");
                        }
                    } while (flag);

                    for (int i = 0; i < members.size(); i++) {

                        if (userInput5 == members.get(i).getMemberID()) {
                            members.get(i).display();
                        }
                    }
                } else if (userInput4.equalsIgnoreCase("no")) {
                    System.out.println("");
                    System.out.println("Sign Up now!");

                    System.out.println("Enter your Full-Name if you have one");

                    String userInput6 = "";
                    do {
                        try {
                            flag = false;
                            userInput6 = scnr.nextLine();
                        } catch (InputMismatchException IME) {
                            flag = true;
                            scnr.nextLine();
                            System.out.println("Invalid input, please type in words!");
                        } catch (Exception e) {
                            System.out.println("Ooops, Something went wrong!");
                        }
                    } while (flag);

                    System.out.println("Do you want to become a premium member?\n" + " Yes/No");
                    String userInput7 = scnr.nextLine();

                    if (userInput7.equalsIgnoreCase("yes")) {
                        int newID = incrementID();

                        Member m5 = new PremiumMember(userInput7, newID, 0, true);
                        members.add(m5);

                        System.out.println("WoooHaaa! You have been added to the membership and been charged for $5 " + "Your ID is: " + newID);
                        newMembersAdded++;

                    } else if (userInput7.equalsIgnoreCase("no")) {
                        System.out.println("");
                        int newID = incrementID();

                        Member m5 = new PremiumMember(userInput7, newID, 0, false);
                        members.add(m5);

                        System.out.println("woooHaaa! You have been added to the membership " + "Your ID is: " + newID);

                        System.out.println("You have selscted to be a regular member");
                        newMembersAdded++;

                    } else {
                        System.out.println("Invalid Input!");
                    }
                } else {
                    System.out.println("Invalid Input!");
                }

            } else if (userInput1 == 3) {
                System.out.println("We appreciate your visit \n" + "Have a Nice Day!");
                break;
            }
        }

        File file = new File("endOfDay2Inventory.txt");

        FileOutputStream fs = null;
        try {
            fs = new FileOutputStream("C:/Users/binna/Desktop/ITSC 1213 STUFF/NaeemMohammadProgrammingCkpt3/endOfDay2Inventory.txt");

        } catch (FileNotFoundException ex) {
            System.out.println("Oops, File not found!");
        }

        PrintWriter outFS = new PrintWriter(fs);
        outFS.print("End of Day 2 Report:- \n"
                + "\nTotal Items Sold: " + totalItemSold
                + "\nTotal Members Registered: " + newMembersAdded
                + "\nTotal Revenue after tax: " + "$" + (totalRevenue + (totalRevenue * tax)) + "\n"
                + "Total Revenue before tax was: " + "$" + totalRevenue + "\n");

        for (Product i : itemSold) {
            i.getProductName();
            i.getNumInStock();
            i.getProductID();
            i.getProductCost();

            outFS.println("\nProduct Name: " + i.getProductName() + "\nProduct ID: " + i.getProductID()
                    + "\nPost-tax product cost : " + "$" + (i.getProductCost() + (i.getProductCost() * tax))
                    + "\nPre-tax product cost: $" + i.getProductCost() + "\nProduct in Stock Left: " + i.getNumInStock() + "\n");
        }

        outFS.close();

        try {
            fs.close();
        } catch (IOException ex) {
            System.out.println("Input/Output Exception!");
        }

        File file2 = new File("BookInventoryDay2.csv");
        FileOutputStream fs2 = null;

        try {
            fs2 = new FileOutputStream("C:/Users/binna/Desktop/ITSC 1213 STUFF/NaeemMohammadProgrammingCkpt3/BookInventoryDay2.csv");
        } catch (FileNotFoundException ex) {
            System.out.println("Oops, File not found!");
        }

        PrintWriter outFS2 = new PrintWriter(fs2);
        outFS2.println("productID,type,title,author/artist,numInStock,price");
        for (Product i : inventory) {
            if (i instanceof Book) {

                outFS2.println(i.getProductID() + ","
                        + "book," + i.getProductName() + "," + ((Book) i).getBookAuthor() + "," + i.getNumInStock() + "," + i.getProductCost());
            }

            if (i instanceof CD) {

                outFS2.println(i.getProductID() + ","
                        + "cd," + i.getProductName() + "," + ((CD) i).getCDArtist() + "," + i.getNumInStock() + "," + i.getProductCost());
            }

            if (i instanceof DVD) {

                outFS2.println(i.getProductID() + ","
                        + "dvd," + i.getProductName() + "," + ((DVD) i).getDVDProducer() + "," + i.getNumInStock() + "," + i.getProductCost());
            }

        }

        outFS2.close();
        try {
            fs2.close();
        } catch (IOException ex) {
            System.out.println("Input/Output Exception!");
        }

    }

    /**
     * Creates memberID for new members
     *
     * @return memberID++
     */
    public static int incrementID() {
        return memberID++;
    }

    /**
     * this method gets inventory from Product array list and displays items
     * when called
     *
     * @return inventory
     */
    public static ArrayList<Product> getInventory() {
        return inventory;
    }

    /**
     * this method gets product id if the id matches with the user input id and
     * stores it in variable p
     *
     * @param id
     * @return p
     */
    public Product getProduct(int id) {
        Product p = null;
        for (Product i : inventory) {
            if (i.getProductID() == id) {
                p = i;
            }

        }
        return p;
    }

}
