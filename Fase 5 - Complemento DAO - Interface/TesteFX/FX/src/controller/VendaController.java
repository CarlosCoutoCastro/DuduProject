package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.bo.AluguelBO;
import model.bo.ObjetoBO;
import model.entity.Cliente;
import model.entity.Objeto;
import model.entity.Venda;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class VendaController extends NavController {
    @FXML private Button addCarrinho;
    @FXML private Button addCliente;
    @FXML private Button finalVenda;
    @FXML private TextField srchCliente;
    @FXML private Label precoTotal;
    @FXML private VBox ObjetosLayout;


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


    public void initialize() {
        try {
            //AluguelBO controllerVenda = new AluguelBO();

            List<Venda> vendas = new ArrayList<>(ObjetosTeste());

            for (Venda venda : vendas) {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/VE/ListaCarrinho.fxml"));
                HBox hBox = fxmlLoader.load();
                System.out.println(venda.getTitulo());
                ListaCarrinhoController ldc = fxmlLoader.getController();
                ldc.setData(venda);
                
                if (vendas.size() >= 0) {
                    precoFinal(vendas);
                }

                ObjetosLayout.getChildren().add(hBox);
            }
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception appropriately, e.g., show an error message.
        }
    }


    private void precoFinal (List<Venda> vendas) {
        Double total = 0d;

        for (Venda venda : vendas) {
            total =+ (double)venda.getValorAluguel();
        }

        precoTotal.setText(Double.toString(total));
    }

    
    private List<Venda> ObjetosTeste() {
        List<Venda> ls = new ArrayList<>();

        return ls;
    }

}
