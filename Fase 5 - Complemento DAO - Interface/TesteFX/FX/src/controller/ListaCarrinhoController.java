package controller;

import model.entity.Venda;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ListaCarrinhoController {
    @FXML
    private Label nome;
    @FXML
    private Label tipo;
    @FXML
    private Label preco;
    @FXML
    private Button delete;

    private Venda selectedVenda;

    @FXML
    void deletePU(ActionEvent event) {
        System.out.println("<Abrindo Pop-Up Confirmação>");
    }

    public void setData(Venda venda) {
        nome.setText("....");
        // +venda.getTitulo()
        tipo.setText("....");
        // +venda.getQuantidadeExemplares()
        preco.setText("....");
        // +venda.getValorAluguel()
    }

    public Venda getSelectedVenda() {
        return selectedVenda;
    }

    public void setSelectedVenda(Venda selectedVenda) {
        this.selectedVenda = selectedVenda;
    }

}
