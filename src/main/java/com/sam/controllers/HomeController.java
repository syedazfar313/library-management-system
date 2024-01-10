package com.sam.controllers;

import java.io.IOException;

import com.sam.App;

import javafx.fxml.FXML;

public class HomeController {

    @FXML
    private void openAddBook() throws IOException {
        App.setRoot("add-book");
    }

    /**
     * @throws IOException
     */
    @FXML
    private void openListBooks() throws IOException {
        App.setRoot("list-book");
    }
}
