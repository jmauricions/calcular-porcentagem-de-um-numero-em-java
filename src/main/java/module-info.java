module com.example.porcentagem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.porcentagem to javafx.fxml;
    exports com.example.porcentagem;
}