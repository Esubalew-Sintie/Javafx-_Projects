package com.example.progrsesionbar;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.stage.FileChooser;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController  {
    @FXML
    private Label label;

    @FXML
    private Slider slider;
    FileChooser chooser=new FileChooser();
    @FXML
    void selectFile(ActionEvent event) {
         File file=chooser.showOpenDialog(HelloApplication.stage);
         if (file!=null ){
             System.out.println(file.getAbsolutePath());
        }

    }


}