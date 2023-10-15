package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.entity.Cliente;
import model.entity.Venda;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VendaController extends NavController {

    @FXML private Button addCarrinho;
    @FXML private Button addCliente;
    @FXML private Button finalVenda;
    @FXML private Label precoTotal;

    @FXML private VBox carrinhoLayout;
    @FXML private VBox clienteLayout;

    private static List<Venda> carrinhoVenda = new ArrayList<Venda>();
    private static Cliente selectedCliente;



    public void adicionarCarrinho(ActionEvent event) throws Exception {
        System.out.println("<PU Add Carrinho>");

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/VE/SrchItem.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
    }


    public void adicionarCliente(ActionEvent event) throws Exception {
        System.out.println("<PU Add Cliente>");

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/VE/SrchCliente.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
    }


    public void initialize() {
        printClientes();
        
        printVendas();
        // try {

            

        //     //AluguelBO controllerVenda = new AluguelBO();

        //     //List<Venda> vendas = new ArrayList<>(ObjetosTeste());
        //     // // if (carrinhoVenda.size() >= 0) {
        //     //     for (Venda venda : carrinhoVenda) {

        //     //         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/VE/ListaCarrinho.fxml"));
        //     //         HBox hBox = fxmlLoader.load();

        //     //         System.out.println(venda.getTitulo());
                    
        //     //         ListaCarrinhoController ldc = fxmlLoader.getController();

        //     //         ldc.setData(venda);
                    
        //     //         if (carrinhoVenda.size() >= 0) {
        //     //             precoFinal(carrinhoVenda);
        //     //         }

        //     //         carrinhoLayout.getChildren().add(hBox);
        //     //     }
        //     // }
        // } catch (IOException e) {
        //     e.printStackTrace();
        //     // Handle the exception appropriately, e.g., show an error message.
        // }
    }

    public void printClientes() {
        System.out.println("Print Clientes");

        try {
            if (selectedCliente != null) {

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/VE/ListaCliente.fxml"));
                HBox hBox = fxmlLoader.load();

                System.out.println(selectedCliente.getNome());

                ListaClientesController ldc = fxmlLoader.getController();

                ldc.setData(selectedCliente);

                ldc.userPermissions(true);

                clienteLayout.getChildren().add(hBox);
            } 

        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception appropriately, e.g., show an error message.
        }
    }

    public void printVendas() {
        System.out.println("Print Vendas");

        try {
                for (Venda venda : carrinhoVenda) {

                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/VE/ListaCarrinho.fxml"));
                    HBox hBox = fxmlLoader.load();

                    System.out.println(venda.getTitulo());
                    
                    ListaCarrinhoController ldc = fxmlLoader.getController();

                    ldc.setData(venda);

                    carrinhoLayout.getChildren().add(hBox);
                }

                if (carrinhoVenda.size() != 0)
                    precoFinal();

        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception appropriately, e.g., show an error message.
        }
    }


    public void finalizarVenda(ActionEvent event) throws Exception {
        System.out.println("Venda Finalizada.");
        List<Venda> clear = new ArrayList<>();
        carrinhoVenda = clear;
    }


    private void precoFinal() {
        Float total = 0f;

        for (Venda venda : carrinhoVenda) {

            total += (float) venda.getValorAluguel();
        }

        precoTotal.setText("" + total);
    }


    public void addCarrinho(List<Venda> itemsCarrinho) {
        // Adicione os itens do carrinho à lista de carrinho.
        for (Venda venda : itemsCarrinho) {
            System.out.println(venda.getTitulo());
        }
        carrinhoVenda.addAll(itemsCarrinho);
    }
    

    public Cliente getSelectedCliente() { return selectedCliente; }

    public void setSelectedCliente(Cliente cliente) {
        selectedCliente = cliente;
    }
}
