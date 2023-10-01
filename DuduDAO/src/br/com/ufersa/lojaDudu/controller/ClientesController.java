package br.com.ufersa.lojaDudu.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ClientesController extends NavController {
    @FXML private TextField srchCliente;
    @FXML private Button addCliente;
    
    public void procurarCliente(ActionEvent event) throws Exception {
        String search = srchCliente.getText();

        System.out.println("Procurando por: " + search);
    }

    public void adicionarCliente(ActionEvent event) throws Exception {
        System.out.println("Cliente Adicionado.");
    }

}
