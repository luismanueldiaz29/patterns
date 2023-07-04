module com.luis.decorator.decoratorpattern {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.luis.decorator.decoratorpattern to javafx.fxml;
    exports com.luis.decorator.decoratorpattern;
}