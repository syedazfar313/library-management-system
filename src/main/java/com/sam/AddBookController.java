package com.sam;

import java.io.IOException;
import javafx.fxml.FXML;

public class AddBookController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("home");
    }
}