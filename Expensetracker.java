package ExpenseTracker;

import java.util.Scanner;
import java.util.ArrayList;

public class Expensetracker {
    public static void main(String[] args) {
        String name;
        int age;

        Scanner scanner = new Scanner(System.in);
        ArrayList<Expense> expenses = ExpenseStorage.loadExpenses();

        System.out.println("Create an account:");
        System.out.println("Enter your name: ");
        name = scanner.next();
        System.out.println("Enter your age:");
        age = scanner.nextInt();

        if(name!= null) {
        while (true) {



                System.out.println("\nExpense Tracker Menu:");
                System.out.println("1. Add Expense");
                System.out.println("2. View Expenses");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();


                switch (choice) {
                    case 1:
                        System.out.print("Enter date (YYYY-MM-DD): ");
                        String date = scanner.next();
                        scanner.nextLine();  // Consume newline left over
                        System.out.print("Enter description: ");
                        String desc = scanner.nextLine();
                        System.out.print("Enter amount: ");
                        double amount = scanner.nextDouble();
                        expenses.add(new Expense(date, desc, amount));
                        ExpenseStorage.saveExpenses(expenses);
                        break;
                    case 2:
                        for (Expense e : expenses) {
                            System.out.println(e);
                        }
                        break;
                    case 3:
                        System.out.println("Goodbye!");
                        return;
                    default:
                        System.out.println("Invalid choice. Please select from the menu.");
                }

         }
        }

    }
}