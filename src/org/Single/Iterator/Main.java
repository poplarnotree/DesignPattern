package org.Single.Iterator;

public class Main {
	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("环游世界八十天"));
		bookShelf.appendBook(new Book("西游记"));
		bookShelf.appendBook(new Book("冰与火之歌"));
		bookShelf.appendBook(new Book("三国演义"));
		bookShelf.appendBook(new Book("三国演义1"));
		bookShelf.appendBook(new Book("三国演义2"));
		Iterator it = bookShelf.iterator();
		while(it.hasNext()) {
			Book book = (Book)it.next();
			System.out.println(book.getName());
		}
	}

}
