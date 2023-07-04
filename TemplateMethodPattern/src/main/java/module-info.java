module com.luis.templete.templatemethodpattern {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.luis.templatemethodpattern to javafx.fxml;
    exports com.luis.templatemethodpattern;
}