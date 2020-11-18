package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {

    @FXML
    public Button idBoton;
    public PasswordField password;
    public TextField textField2;
    public Label idLabel2;


    public void contboton(ActionEvent evento){
        idBoton.setText("Boton pulasado");

    }

    public void onKeyPressed(){

        password.setText(password.getSelectedText());
    }
   public void onMouseEntered(){

            String con= password.getText();
            textField2.setText(con);
            password.setVisible(false);

    }

    public void onMouseExited(){
        password.setVisible(true);

    }
}

