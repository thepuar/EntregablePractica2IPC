/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entregablepractica2ipc;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author thepu
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button bt_1;
    @FXML
    private Button bt_5;
    @FXML
    private Button bt_10;
    @FXML
    private CheckBox cb_resta;
    @FXML
    private TextField tf_suma;
    @FXML
    private Button bt_suma;
    @FXML
    private Label label_sumaresta;
    @FXML
    private Label lb_resultado;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void sumaValor(ActionEvent event) {
        String valors = ((Button) event.getSource()).getText();
        Double valor = 0.0;
        Double resultado = 0.0;
        try {
            resultado = Double.parseDouble(this.lb_resultado.getText());
            valor = Double.parseDouble(valors);
        } catch (NumberFormatException nfx) {
            //No es un valor, por lo que se ha pulsado el boton del textfield
            valor = Double.parseDouble(this.tf_suma.getText());
        }

        if (cb_resta.isSelected()) {
            //Hay que restar
            valor = valor * -1;
        }
        resultado += valor;
        this.lb_resultado.setText(resultado + "");
    }


    @FXML
    private void cambiarLabelResta(ActionEvent event) {
         if (this.cb_resta.isSelected()) {
            this.label_sumaresta.setText("¡Estás restando!");
        } else {
            this.label_sumaresta.setText("Estas sumando");
        }
    }

   

}
