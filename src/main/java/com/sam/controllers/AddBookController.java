package com.sam.controllers;

import java.io.IOException;
import java.time.ZoneId;
import java.util.Date;

import com.sam.App;
import com.sam.models.Book;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class AddBookController {

    @FXML
    TextField bookNameText;

    @FXML
    TextField bookAuthorNameText;

    @FXML
    TextField bookPublisherNameText;

    @FXML
    TextField bookNumOfPagesText;

    @FXML
    DatePicker publishedDatePicker;

    @FXML
    private void save() throws IOException {
        // log values on screen
        if (!CheckText(bookNameText.getText(), "Book Name", 3))
            return;

        if (!CheckText(bookAuthorNameText.getText(), "Author Name", 5))
            return;

        if (!CheckText(bookPublisherNameText.getText(), "Publisher Name", 2))
            return;

        System.out.println(bookNameText.getText());
        System.out.println(bookAuthorNameText.getText());
        System.out.println(bookPublisherNameText.getText());
        System.out.println(bookNumOfPagesText.getText());
        System.out.println(publishedDatePicker.getValue());

        // TODO: Create book object from obtained values and save somewhere

        Book book = new Book();
        book.Name = bookNameText.getText();
        book.AuthorName = bookAuthorNameText.getText();
        book.PublisherName = bookPublisherNameText.getText();
        book.NumberOfPages = Integer.parseInt(bookNumOfPagesText.getText());
        book.PublishedDate = Date.from(publishedDatePicker.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant());

        System.out.println("Book " + book.toString());
    }

    private boolean CheckText(String text, String promptName, int minLengthRequired) {
        if (text == null || text == "" || text.length() < minLengthRequired) {
            Alert alert = new Alert(AlertType.ERROR, promptName + " is required.", ButtonType.OK);
            alert.showAndWait();

            if (alert.getResult() == ButtonType.OK) {
                // do stuff
                return false;
            }
        }

        return true;
    }

    @FXML
    private void cancel() throws IOException {
        App.setRoot("home");
    }
}