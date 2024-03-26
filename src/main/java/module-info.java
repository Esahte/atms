module com.kloneborn {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.kloneborn to javafx.fxml;
    exports com.kloneborn;
}
