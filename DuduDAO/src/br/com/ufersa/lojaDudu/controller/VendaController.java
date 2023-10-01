package br.com.ufersa.lojaDudu.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class VendaController extends NavController {
    @FXML private Button addCarrinho;
    @FXML private Button addCliente;
    @FXML private Button finalVenda;
    @FXML private TextField srchCliente;

    public void adicionarCarrinho(ActionEvent event) throws Exception {
        System.out.println("Produto Adicionado ao Carrinho.");
    }
    public void adicionarCliente(ActionEvent event) throws Exception {
        System.out.println("Novo Cliente Adicionado.");
    }
    public void finalizarVenda(ActionEvent event) throws Exception {
        System.out.println("Venda Finalizada.");
    }
    public void procurarCliente(ActionEvent event) throws Exception {
        String search = srchCliente.getText();

        System.out.println("Procurando por: " + search);
    }

}
