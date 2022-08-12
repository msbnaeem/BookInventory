/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naeemmohammadprogrammingckpt3;

/**
 * this class represents cd as an object which is a type of product
 *
 * @author Mohammad Naeem
 */
public class CD extends Product {

    private String cdArtist;
    private String cdGenre;

    /**
     * this constructor creates cd object with product's: name, id, cost, along
     * with object's: author and genre
     *
     * @param productName
     * @param productID
     * @param productCost
     * @param numInStock
     * @param cdArtist
     */
    public CD(String productName, int productID, double productCost, int numInStock, String cdArtist) {
        super(productName, productID, productCost, numInStock);
        this.cdArtist = cdArtist;

    }

    /**
     * gets artist the song/music
     *
     * @return cdArtist
     */
    public String getCDArtist() {
        return cdArtist;
    }

    /**
     * gets type of CD
     *
     * @return cdGenre
     */
    public String getCDGenre() {
        return cdGenre;
    }

    /**
     * sets song/music artist
     *
     * @param cdAstist
     */
    public void setCDArtist(String cdAstist) {
        this.cdArtist = cdArtist;
    }

    /**
     * sets type of the song/music
     *
     * @param cdGenre
     */
    public void setCDGenre(String cdGenre) {
        this.cdGenre = cdGenre;
    }

    /**
     * an override that allows super display to be used from parent class in
     * this subclass along with cd: artist and genre(type of song/music)
     */
    @Override
    public void display() {
        super.display();
        System.out.println("Artist: " + this.getCDArtist()
                + " Genre: " + this.getCDGenre() + "\n");
    }
}
