package com.training;

import com.training.Book;
import com.training.BookStore;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java8.En;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BookStoreRunSteps implements En {

    private BookStore store;
    private List<Book> foundBooks;
    private Book foundBook;

    public BookStoreRunSteps() {
        store = new BookStore();
        foundBooks = new ArrayList<>();
    }

    @Given("^The following books are available in the store$")
    public void haveBooksInTheStore(DataTable table) {
        List<List<String>> rows = table.asLists(String.class);

        for (List<String> columns: rows) {
            store.addBook(new Book(columns.get(0), columns.get(1)));
        }
    }

    @When("^I ask for a book by the author (.+)$")
    public void searchForBooksByAuthor(String author) {
        foundBooks = store.booksByAuthor(author);
    }

    @Then("^The salesperson says that there are (\\d+) books$")
    public void findBooks(int count) {
        assertEquals(count, foundBooks.size());
    }

}
