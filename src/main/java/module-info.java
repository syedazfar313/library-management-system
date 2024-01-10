module com.sam {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.sam.controllers to javafx.fxml;

    exports com.sam;
}
