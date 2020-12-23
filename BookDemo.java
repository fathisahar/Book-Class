/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.util.Scanner;

/**
 *
 * @author sahar
 */
public class BookDemo {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);

        // Creating an array that will hold five Book objects
        Book[] bookArray = new Book[5];

        // Loop to get user date for the 2 first books with the first constructor
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter title of book " + (i + 1) + ": ");
            String title = input.next();
            System.out.println("Enter author of book " + (i + 1) + ": ");
            String author = input.next();
            System.out.println("Enter year which book " + (i + 1) + " was published: ");
            int year = input.nextInt();

            // Creating a Book object using the first constructor
            bookArray[i] = new Book(title, author, year);

            int month;
            int sales;

            // Loop to get the user input for sales using the overloaded method setSaleNumber
            for (int j = 0; j < 6; j++) {

                System.out.print("Enter the month of the sale: ");
                month = input.nextInt();
                System.out.print("Enter the number of sales during month " + month + " : ");
                sales = input.nextInt();

                // Placing sale value at specified month
                bookArray[i].setSaleNumber(month, sales);
                System.out.println();
            }
        }

        // Loop to get user date for the 3 last books with the second constructor
        for (int i = 2; i < 5; i++) { 
            System.out.println("Enter title of book " + (i + 1) + ": ");
            String title = input.next();
            System.out.println("Enter author of book " + (i + 1) + ": ");
            String author = input.next();
            System.out.println("Enter year which book " + (i + 1) + " was published: ");
            int year = input.nextInt();

            // Creating an array to place the sale values of each Book object
            int[] salesArr = new int[6];
            for (int j = 0; j < 6; j++) {
                System.out.print("Enter the sales for book " + (i + 1) + " during the month " + (j + 1) + ": ");
                salesArr[j] = input.nextInt();
            }
            System.out.println();

            // Creating Book object with second constructor using the user's data
            bookArray[i] = new Book(title, author, year, salesArr);
            
        }
        
        // Selection sorting the books on their total sales in descending order
        

        int maxIndex;
        int max;
        for (int i = 0; i < bookArray.length; i++) {
            maxIndex = i;

            for (int j = i + 1; j < bookArray.length; j++) {
                if (bookArray[maxIndex].getTotal() < bookArray[j].getTotal()) {
                    maxIndex = j;
                }
            }

            // Swap values
            if (maxIndex != i) {
                Book temp = bookArray[i];
                bookArray[i] = bookArray[maxIndex];
                bookArray[maxIndex] = temp;
            }
        }

        // Printing books in order with information on each book
        System.out.println("The books in order of highest sale to lowest are: ");
        for (int i = 0; i < bookArray.length; i++) {
            System.out.println(bookArray[i].getTitle() + " written by " 
                    + bookArray[i].getAuthor() + " in the year " 
                    + bookArray[i].getYear() + " with a total of "  
                    + bookArray[i].getTotal() + " sales." );
        }
    }
}

