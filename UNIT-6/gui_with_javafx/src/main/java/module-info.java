module com.unit6.gui_with_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.unit6.gui_with_javafx to javafx.fxml;
    exports com.unit6.gui_with_javafx;
}