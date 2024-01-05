module com.sam {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.sam to javafx.fxml;
    exports com.sam;
}
