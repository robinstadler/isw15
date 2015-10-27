package de.uhd.bookexample.client;

import java.util.ArrayList;
import java.util.Comparator;

import com.google.gwt.cell.client.EditTextCell;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.ColumnSortEvent.ListHandler;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.view.client.ListDataProvider;

/**
 * A simple web application showing a list of books.
 * */
public class BookExample implements EntryPoint { // <- Start der Webanwendung

	@Override
	public void onModuleLoad() { // <- main in Java-Programmen

		RootPanel root = RootPanel.get("content");
		
		HTML header = new HTML("Books");
		root.add(header);
		
		HorizontalPanel hp = new HorizontalPanel();
		
		Label bookNameLabel = new Label("Bookname");
		hp.add(bookNameLabel);
		
		TextBox bookNameTextBox = new TextBox();
		hp.add(bookNameTextBox);
		
		Button addBook = new Button();
		hp.add(addBook);
		
		root.add(hp);
		
		CellTable<Book> bookTable = new CellTable<Book>();
		root.add(bookTable);
		
		Column<Book, String> isbnCol = new Column<Book, String>(new EditTextCell()) {

			@Override
			public String getValue(Book object) {
				// Die ISBN von dem Buch
				return "" + object.getIsbn();
			}
			
		};
		
		bookTable.addColumn(isbnCol, "ISBN");
		
		Column<Book, String> titleCol = new Column<Book, String>(new EditTextCell()) {

			@Override
			public String getValue(Book object) {
				// Der Titel von dem Buch
				return "" + object.getTitle();
			}
			
		};
		
		bookTable.addColumn(isbnCol, "Title");
		
		
		Column<Book, String> authorCol = new Column<Book, String>(new EditTextCell()) {

			@Override
			public String getValue(Book object) {
				// Der Author von dem Buch
				return "" + object.getAuthor();
			}
			
		};
		
		bookTable.addColumn(isbnCol, "Author");
		
		ArrayList<Book> bookList = new ArrayList<Book>();
		bookList.add(new Book(1234, "Krieg und Frieden", "Leo Tolstoi"));
		bookList.add(new Book(4567, "Iluminati", "Dan Brown"));
		
		ListDataProvider<Book> bookDataProvider = new ListDataProvider<Book>();
		bookDataProvider.setList(bookList);
		bookDataProvider.addDataDisplay(bookTable);
		
		ListHandler<Book> sortHandler = new ListHandler<Book>(
				bookDataProvider.getList());
		
		bookTable.addCol
		
		sortHandler.setComparator(isbnCol, new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				if (o1.getIsbn() > o2.getIsbn()) {
					return 1;
				}
				if (o1.getIsbn() < o2.getIsbn()) {
					return -1;
				}
				return 0;
			}
			
		});
		
		isbnCol.setSortable(true);
		
		sortHandler.setComparator(titleCol, new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				// TODO Auto-generated method stub
				return o1.getTitle().compareTo(o2.getTitle());
			}
			
		});
		
		titleCol.setSortable(true);
		
		sortHandler.setComparator(authorCol, new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				// TODO Auto-generated method stub
				return o1.getTitle().compareTo(o2.getTitle());
			}
			
		});
		
		authorCol.setSortable(true);

	}
}
