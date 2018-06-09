/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpstaller2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author obaquerog
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    TextField txtPhrase;
    @FXML
    Button btnRun;

    String phrase;

    String[] variables = {"been", "by", "was","were", "be"};
    
    int intIndex;

    @FXML
    public void actionRun(ActionEvent event) {
        Alert alert = new Alert(AlertType.INFORMATION);
        phrase = txtPhrase.getText();
        for (String var : variables) {
            intIndex = phrase.indexOf(var);
            if(intIndex > 0){
                alert.setTitle("Phrase analyzer");
            alert.setHeaderText("Phrase analyzer");
            alert.setContentText("The Phrase is Passive");
            alert.showAndWait();
            return;
            }
        }
        if (intIndex < 0) {
            alert.setTitle("Phrase analyzer");
            alert.setHeaderText("Phrase analyzer");
            alert.setContentText("The Phrase is Active");
            alert.showAndWait();
        }
        
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
