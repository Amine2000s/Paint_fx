package com.paint_fx.paint_fx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PaintController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}