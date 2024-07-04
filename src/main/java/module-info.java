module com.jubal.juperirc {
    requires javafx.controls;
    requires javafx.fxml;
    requires pircbotx;

    opens com.jubal.juperirc to javafx.fxml;
    exports com.jubal.juperirc;
}
