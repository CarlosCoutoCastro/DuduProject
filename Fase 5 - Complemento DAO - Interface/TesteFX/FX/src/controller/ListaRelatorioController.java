package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ListaRelatorioController {


    @FXML private Label cod_alug;
    @FXML private Label cpf_cliente;
    @FXML private Label cod_obj;
    @FXML private Label data_ini;
    @FXML private Label data_end;

    public void setData() {
        cod_alug.setText("....");
        cpf_cliente.setText("....");
        cod_obj.setText("....");
        data_ini.setText("....");
        data_end.setText("....");
    }
    // TODO: inserir todos os valores
    // ver nas outras listar

    // acho q é só setData pq não tem botões
    
}