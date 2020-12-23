/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author sahar
 */
public class Book {
    //Creating the private attributes of the Book class
    // The book's title, author, year of publishing, and array ints of book sales
    private String title;
    private String author;
    private int year;
    private int[] saleNumber; 
    
    //First constructor taking the title, author, year of publishing as parameters
    //and initializing the array
    public Book(String t, String a, int y){
        title = t;
        author = a;
        year = y;
        // Initializing the array to contain 6 elements for 6 months
        saleNumber = new int[6];
    }
    
    // Second constructor taking the title, author, year of publishing,
    // and an array for book sales as parameters
    public Book(String t, String a, int y, int[] saleArr){
        title = t;
        author = a;
        year = y;
        // Taking the sales from the first 6 months
        saleNumber = new int[6];
        for (int i = 0; i < saleNumber.length; i++) {
            saleNumber[i] = saleArr[i];
        }
    }
    
    // Mutators for attributes
    public void setTitle(String t) {
        title = t;       
    } 
    
    public void setAuthor(String a) {
        author = a;       
    }
    
    public void setYear(int y) {
        year = y;       
    }
    
    public void setSaleNumber(int[] saleArr) {
        for (int i = 0; i < saleArr.length; i++) {
            saleNumber[i] = saleArr[i];
        }
    }
    
    public void setSaleNumber(int month, int sales) {
        saleNumber[month - 1] = sales;
    }
    
    // Accessors for attributes
    public String getTitle() {
        return title;       
    } 
    
    public String getAuthor() {
        return author;       
    }
    
    public int getYear() {
        return year;       
    }
    
    public int[] getSaleNumber() {
        return saleNumber;
    }
    
    // Accesor retruning number of sales of a specified month
    public int getSaleNumber(int month) {
        return saleNumber[month - 1];
    }
    
    // Accessor for the total amount of book sales in the past 6 months
    public int getTotal() {
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            sum += saleNumber[i];
        }
        return sum;
    }
}   
