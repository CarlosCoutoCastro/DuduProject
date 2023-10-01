package br.com.ufersa.lojaDudu.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FuncionariosController extends NavController {
    @FXML private TextField srchFuncionario;
    @FXML private Button addFuncionario;
    
    public void procurarFuncionario(ActionEvent event) throws Exception {
        String search = srchFuncionario.getText();

        System.out.println("Procurando por: " + search);
    }

    public void adicionarFuncionario(ActionEvent event) throws Exception {
        System.out.println("Funcionario Adicionado.");
    }
    
}
