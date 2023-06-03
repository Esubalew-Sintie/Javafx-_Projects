module com.example.jj {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.jj to javafx.fxml;
    exports com.example.jj;
}