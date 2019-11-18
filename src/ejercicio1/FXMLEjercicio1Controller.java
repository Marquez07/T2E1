/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.text.Text;

/**
 *
 * @author usuario
 */
public class FXMLEjercicio1Controller implements Initializable {
    
    @FXML
    private Text actiontarget;
    @FXML
    private PasswordField passwordField;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        actiontarget.setText("Conectando...");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
