package com.sam.controllers;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import java.io.IOException;

import com.sam.App;
import com.sam.models.Book;

public class ListBooksController {

    @FXML
    private TableView<Book> bookTable;

    @FXML
    private TableColumn<Book, String> nameColumn;

    @FXML
    private TableColumn<Book, String> authorColumn;

    @FXML
    private TableColumn<Book, String> publisherColumn;

    @FXML
    private TableColumn<Book, Integer> pagesColumn;

    @FXML
    private TableColumn<Book, String> publishedDateColumn;

    private ObservableList<Book> books;

    @FXML
    private void initialize() {
        // Initialize the columns
        if (nameColumn != null && authorColumn != null && publisherColumn != null &&
                pagesColumn != null && publishedDateColumn != null) {

            nameColumn.setCellValueFactory(new PropertyValueFactory<>("Name"));
            authorColumn.setCellValueFactory(new PropertyValueFactory<>("AuthorName"));
            publisherColumn.setCellValueFactory(new PropertyValueFactory<>("PublisherName"));
            pagesColumn.setCellValueFactory(new PropertyValueFactory<>("NumberOfPages"));
            publishedDateColumn.setCellValueFactory(new PropertyValueFactory<>("PublishedDate"));

            // Set the items in the table
            if (bookTable != null && books != null) {
                bookTable.setItems(books);
            }
        }
    }

    public void setBooks(ObservableList<Book> books) {
        this.books = books;
        initialize();
    }

    @FXML
    private void goBackToHome() throws IOException {
        App.setRoot("home");
    }
}
