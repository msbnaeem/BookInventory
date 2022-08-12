/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naeemmohammadprogrammingckpt3;

/**
 * this represents DVD as an object which is a type of product
 *
 * @author Mohammad Naeem
 */
public class DVD extends Product {

    private String dvdGenre;
    private String dvdProducer;

    /**
     * this constructor creates DVD object with product's: name, id, cost, along
     * with object's: author and genre
     *
     * @param productName
     * @param productID
     * @param productCost
     * @param numInStock
     * @param dvdProducer     
     */
    public DVD(String productName, int productID, double productCost, int numInStock, String dvdProducer) {
        super(productName, productID, productCost, numInStock);
        this.dvdProducer = dvdProducer;
    }

    /**
     * gets type of DVD
     *
     * @return DVDGenre
     */
    public String getDVDGenre() {
        return dvdGenre;
    }

    /**
     * gets producer of movie/DVD
     *
     * @return DVDProducer
     */
    public String getDVDProducer() {
        return dvdProducer;
    }

    /**
     * sets type of DVD
     *
     * @param dvdGenre
     */
    public void setDVDGenre(String dvdGenre) {
        this.dvdGenre = dvdGenre;
    }

    /**
     * sets DVD producer
     *
     * @param dvdProducer
     */
    public void setDVDProducer(String dvdProducer) {
        this.dvdProducer = dvdProducer;
    }

    /**
     * an override that allows super display to be used from parent class in
     * this subclass along with DVD: producer and genre(type of DVD/movie)
     */
    @Override
    public void display() {
        super.display();
        System.out.println("Producer: " + this.getDVDProducer()
                + " Genre: " + this.getDVDGenre() + "\n");
    }
}
