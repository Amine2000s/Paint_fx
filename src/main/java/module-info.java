module com.paint_fx.paint_fx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.paint_fx.paint_fx to javafx.fxml;
    exports com.paint_fx.paint_fx;
}