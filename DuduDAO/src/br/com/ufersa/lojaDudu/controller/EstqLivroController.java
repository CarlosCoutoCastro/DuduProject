package br.com.ufersa.lojaDudu.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class EstqLivroController extends NavController {
    @FXML private TextField srchLivro;
    @FXML private Button addLivro;
    
    public void procurarLivro(ActionEvent event) throws Exception {
        String search = srchLivro.getText();

        System.out.println("Procurando por: " + search);
    }

    public void adicionarLivro(ActionEvent event) throws Exception {
        System.out.println("Livro Adicionado.");
    }
}
