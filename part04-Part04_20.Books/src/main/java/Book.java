/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Myami
 */
public class Book {
    private String title;
    private int pages;
    private int  publication ;
    
    public Book (String Title, int Pages , int  Publication ){
    this.pages = Pages;
    this.title = Title;
    this.publication = Publication ;
}
    public String getTitle(){
        return this.title;
    }
    public int getPages(){
        return this.pages;
    }
    public int publication(){
        return this.publication;
    }
    
    
}
