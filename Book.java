/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naeemmohammadprogrammingckpt3;

/**
 * this class represents book object which is a type of product
 *
 * @author Mohammad Naeem
 */
public class Book extends Product {

    private String bookAuthor;
    private String bookGenre;

    /**
     * this constructor creates book object with product's: name, id, cost,
     * along with object's: author and genre
     *
     * @param productName
     * @param productID
     * @param productCost
     * @param numInStock
     * @param bookAuthor
     */
    public Book(String productName, int productID, double productCost, int numInStock, String bookAuthor) {
        super(productName, productID, productCost, numInStock);
        this.bookAuthor = bookAuthor;

    }

    /**
     * gets book author's name
     *
     * @return bookAuthor
     */
    public String getBookAuthor() {
        return bookAuthor;
    }

    /**
     * gets bookGenre (means type of book)
     *
     * @return bookGenre
     */
    public String getBookGenre() {
        return bookGenre;
    }

    /**
     * sets bookAuthor's name
     *
     * @param bookAuthor
     */
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    /**
     * sets bookGenre (the type of the book)
     *
     * @param bookGenre
     */
    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    /**
     * an override that allows super display to be used from parent class in
     * this subclass along book: author, and genre(type)
     */
    @Override
    public void display() {
        super.display();
        System.out.println("Author: " + this.getBookAuthor()
                + " Genre: " + this.getBookGenre() + "\n");
    }

}
