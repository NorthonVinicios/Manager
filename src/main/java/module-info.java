module com.northon.manager {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.northon.manager to javafx.fxml;
    exports com.northon.manager;
}