module com.example.increasedecrease {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.increasedecrease to javafx.fxml;
    exports com.example.increasedecrease;
}