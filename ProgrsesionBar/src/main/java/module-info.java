module com.example.progrsesionbar {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.progrsesionbar to javafx.fxml;
    exports com.example.progrsesionbar;
}