module com.example.imersaojavaalura {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.imersaojavaalura to javafx.fxml;
    exports com.example.imersaojavaalura;
}