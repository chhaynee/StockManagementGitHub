module com.example.stockmanagement {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.stockmanagement to javafx.fxml;
    opens com.example.stockmanagement.model to javafx.fxml;
    opens com.example.stockmanagement.sreyrothpart to javafx.fxml;
    opens com.example.stockmanagement.hongpart to javafx.fxml;
    opens com.example.stockmanagement.thidapart to javafx.fxml;
    opens com.example.stockmanagement.Categorypage to javafx.fxml;
    exports com.example.stockmanagement;
}