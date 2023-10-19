package controller;

import java.io.IOException;
<<<<<<< HEAD
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import model.bo.AluguelBO;
import model.bo.ClienteBO;
import model.entity.Aluguel;
=======
import java.util.ArrayList;
import java.util.List;

>>>>>>> origin/master
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

public class TelaVendaController extends NavController {

<<<<<<< HEAD
    @FXML
    private Button finalVenda;
    @FXML
    private Label precoTotal;

    @FXML
    private VBox carrinhoLayout;
    @FXML
    private VBox clienteLayout;
=======
    @FXML private Button finalVenda;
    @FXML private Label precoTotal;

    @FXML private VBox carrinhoLayout;
    @FXML private VBox clienteLayout;
>>>>>>> origin/master

    private static List<Venda> carrinhoVenda = new ArrayList<Venda>();
    private static Cliente selectedCliente;

<<<<<<< HEAD
=======


>>>>>>> origin/master
    public void adicionarCarrinho(ActionEvent event) throws Exception {
        System.out.println("<PU Add Carrinho>");

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/VE/SrchItem.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
    }

<<<<<<< HEAD
=======

>>>>>>> origin/master
    public void adicionarCliente(ActionEvent event) throws Exception {
        System.out.println("<PU Add Cliente>");

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/VE/SrchCliente.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
<<<<<<< HEAD

        ClienteBO ClienteController = new ClienteBO();
        List<Cliente> clear = new ArrayList<Cliente>();
        SrchClienteController.listaClientes = clear;

        SrchClienteController.listaClientes = ClienteController.pesquisaTotal(new Cliente());

=======
>>>>>>> origin/master
        stage.setScene(new Scene(root1));
        stage.show();
    }

<<<<<<< HEAD
    public void initialize() {
        isGerente();
        showUserLogin();
        printClientes();
        printVendas();
=======

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
>>>>>>> origin/master
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

<<<<<<< HEAD
                ldc.userPermissions(isGerente());

                clienteLayout.getChildren().add(hBox);
            }
=======
                ldc.userPermissions(true);

                clienteLayout.getChildren().add(hBox);
            } 
>>>>>>> origin/master

        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception appropriately, e.g., show an error message.
        }
    }

    public void printVendas() {
        System.out.println("Print Vendas");

        try {
<<<<<<< HEAD
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
=======
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
>>>>>>> origin/master

        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception appropriately, e.g., show an error message.
        }
    }

<<<<<<< HEAD
    public void finalizarVenda(ActionEvent event) throws Exception {
        System.out.println("Venda Finalizada.");
        model.bo.AluguelBO aluguelController = new model.bo.AluguelBO();

        for (Venda venda : carrinhoVenda) {
            Aluguel aluguel = new Aluguel();
            aluguel.setCodigoObjeto(venda.getIdObjeto());
            System.out.println("ID DO OBJETO" + venda.getIdObjeto());
            aluguel.setCpfCliente(selectedCliente.getCpf());
            System.out.println("CPF" + selectedCliente.getCpf());

            // Data atual
            java.util.Date dataAtual = new java.util.Date();
            Date sqlDateAtual = new Date(dataAtual.getTime());

            // Data daqui a 15 dias
            java.util.Date dataDaquiA15Dias = new java.util.Date(
                    System.currentTimeMillis() + 15L * 24L * 60L * 60L * 1000L);
            Date sqlDateDaquiA15Dias = new Date(dataDaquiA15Dias.getTime());

            System.out.println("Data atual (java.sql.Date): " + sqlDateAtual);
            System.out.println("Data daqui a 15 dias (java.sql.Date): " + sqlDateDaquiA15Dias);

            aluguel.setDataAquisicao(sqlDateAtual);
            aluguel.setDataDevolucao(sqlDateDaquiA15Dias);

            aluguelController.criar(aluguel);
        }

        List<Venda> clear = new ArrayList<>();
        carrinhoVenda = clear;

=======

    public void finalizarVenda(ActionEvent event) throws Exception {
        System.out.println("Venda Finalizada.");
        List<Venda> clear = new ArrayList<>();
        carrinhoVenda = clear;
        
>>>>>>> origin/master
        SrchItemController si = new SrchItemController();
        si.setItemsCarrinho(clear);

        mudarTelaVenda(event);
    }

<<<<<<< HEAD
=======

>>>>>>> origin/master
    private void precoFinal() {
        Float total = 0f;

        for (Venda venda : carrinhoVenda) {

            total += (float) venda.getValorAluguel();
        }

        precoTotal.setText("" + total);
    }

<<<<<<< HEAD
=======

>>>>>>> origin/master
    public void addCarrinho(List<Venda> itemsCarrinho) {
        // Adicione os itens do carrinho à lista de carrinho.
        for (Venda venda : itemsCarrinho) {
            System.out.println(venda.getTitulo());
        }
        carrinhoVenda = itemsCarrinho;
    }
<<<<<<< HEAD

    public static List<Venda> getCarrinhoVenda() {
        return carrinhoVenda;
    }
=======
    public static List<Venda> getCarrinhoVenda() { return carrinhoVenda; }
>>>>>>> origin/master

    public static void setCarrinhoVenda(List<Venda> carrinho) {
        carrinhoVenda = carrinho;
    }

<<<<<<< HEAD
    public Cliente getSelectedCliente() {
        return selectedCliente;
    }
=======
    

    public Cliente getSelectedCliente() { return selectedCliente; }
>>>>>>> origin/master

    public void setSelectedCliente(Cliente cliente) {
        selectedCliente = cliente;
    }
}
