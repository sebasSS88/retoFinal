package model;

import java.util.ArrayList;

public interface BookShopController {
	
	public ArrayList <Book> getAllBooks();
	
	public ArrayList <Book> getAuthorBooks(String author);
	
	public ArrayList <Book> getGenreBooks(String genre);
	
	public ArrayList <Book> getOfferBooks(String offer);
	
	public Book getTitleBooks(String title);
	
	public Book getISBNBooks(String isbn);
	
	public void addBook();
	
	public void modifyBook();
	
	public void addNewAuthor();
	
	public void addNewGenre();
}
