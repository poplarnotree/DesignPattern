package org.Single.Iterator;

public class Main {
	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("���������ʮ��"));
		bookShelf.appendBook(new Book("���μ�"));
		bookShelf.appendBook(new Book("�����֮��"));
		bookShelf.appendBook(new Book("��������"));
		bookShelf.appendBook(new Book("��������1"));
		bookShelf.appendBook(new Book("��������2"));
		Iterator it = bookShelf.iterator();
		while(it.hasNext()) {
			Book book = (Book)it.next();
			System.out.println(book.getName());
		}
	}

}
