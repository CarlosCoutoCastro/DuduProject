package br.com.ufersa.lojaDudu.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class EstqDiscoController extends NavController {
    @FXML private TextField srchDisco;
    @FXML private Button addDisco;
    
    public void procurarDisco(ActionEvent event) throws Exception {
        String search = srchDisco.getText();

        System.out.println("Procurando por: " + search);
    }

    public void adicionarDisco(ActionEvent event) throws Exception {
        System.out.println("Disco Adicionado.");
    }
    
}
