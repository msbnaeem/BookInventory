/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naeemmohammadprogrammingckpt3;

/**
 * this class represents as a parent class along with a Product object
 *
 * @author Mohammad Naeem
 */
public abstract class Product {

    private String productName;
    private int productID;
    private double productCost;
    private int numInStock;

    /**
     * it is a default constructor
     */
    public Product() {

    }

    /**
     * this constructor creates product object with product's: name, id, and
     * cost
     * @param productName
     * @param productID
     * @param productCost
     * @param numInStock
     */
    public Product(String productName, int productID, double productCost, int numInStock) {
        this.productName = productName;
        this.productID = productID;
        this.productCost = productCost;
        this.numInStock = numInStock;
    }

    /**
     * gets name of the product
     *
     * @return productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * gets id of product
     *
     * @return productID
     */
    public int getProductID() {
        return productID;
    }

    /**
     * gets cost of product
     *
     * @return productCost
     */
    public double getProductCost() {
        return productCost;
    }

    /**
     * gets quantity of in stock items
     * 
     * @return numInStock
     */
    public int getNumInStock() {
        return numInStock;
    }

    /**
     * updates quantity of in stock items
     * 
     * @param numInStock
     */
    public void setNumInStock(int numInStock) {
        this.numInStock = numInStock;
    }

    /**
     * sets name of the product
     *
     * @param productName
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * sets the id of the product
     *
     * @param productID
     */
    public void setProductID(int productID) {
        this.productID = productID;
    }

    /**
     * sets product cost
     *
     * @param productCost
     */
    public void setProductCost(double productCost) {
        this.productCost = productCost;
    }

    /**
     * this method demonstrates a decrement by value of 1 in stocked items' quantity after purchase(s).
     */
    public void decreaseNumInStock() {
        numInStock--;
    }

    /**
     * displays product: name, id, and Price as a super display in sub classes
     * along with the product: name, id, and price.
     */
    public void display() {

        System.out.println("Name: " + this.getProductName()
                + " ID: " + this.getProductID()
                + " Price: $" + this.getProductCost()
                + " Items in stock: " + this.getNumInStock());
    }

}
