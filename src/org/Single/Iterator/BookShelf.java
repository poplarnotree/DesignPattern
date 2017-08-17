package org.Single.Iterator;

import java.util.ArrayList;

public class BookShelf implements Aggregate {
//	private Book[] books;
//	private int last = 0;
//	public BookShelf(int maxsize) {
//		this.books = new Book[maxsize];
//	}
//	
//	public Book getBookAt(int index) {
//		return books[index];
//	}
//	
//	public void appendBook(Book book) {
//		this.books[last] = book;
//		last++;
//	}
//	
//	public int getLength() {
//		return last;
//	}
	private ArrayList books;
	public BookShelf(int initialsize) {
		this.books = new ArrayList(initialsize);
	}
	
	public Book getBookAt(int index) {
		return (Book)books.get(index);
	}
	
	public void appendBook(Book book) {
		books.add(book);
	}
	public int getLength() {
		return books.size();
	}
	
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new BookShelfIteraotr(this);
	}

}
