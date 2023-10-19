package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
<<<<<<< HEAD
import javafx.scene.Scene;
=======
>>>>>>> origin/master
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
<<<<<<< HEAD
import model.bo.AluguelBO;
import model.entity.Venda;
import model.entity.Venda;

public class SrchItemController {
    @FXML
    private TextField nome;
    @FXML
    private Button confirm;
    @FXML
    private VBox itemsLayout;
    @FXML
    private TextField srchVenda;

    private static List<Venda> itemsCarrinho = new ArrayList<Venda>();
    static List<Venda> listaVendas = new ArrayList<>();
=======
import model.entity.Venda;

public class SrchItemController {
    @FXML private TextField nome;
    @FXML private Button confirm;
    @FXML private VBox itemsLayout;
    
    private static List<Venda> itemsCarrinho = new ArrayList<Venda>();

>>>>>>> origin/master

    @FXML
    void confirmar(ActionEvent event) {
        try {
<<<<<<< HEAD

            if (itemsCarrinho.size() > 0) {
=======
            // System.out.println(itemsCarrinho.size());

            if (itemsCarrinho.size() > 0) {

                // for (Venda venda : itemsCarrinho) {
                //     System.out.println(venda.getTitulo());
                // }

>>>>>>> origin/master
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/VE/TelaVenda.fxml"));
                Parent root = fxmlLoader.load();
                TelaVendaController sr = fxmlLoader.getController();

                sr.addCarrinho(itemsCarrinho);
<<<<<<< HEAD
=======

>>>>>>> origin/master
                sr.printVendas();

                try {
                    sr.mudarTelaVenda(event);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("fechando pop-up");
        Stage stage = (Stage) confirm.getScene().getWindow();
        stage.close();
<<<<<<< HEAD

    }

    public void initialize() {
        AluguelBO aluguelController = new AluguelBO();

        if (listaVendas.size()==0) {
            listaVendas = new ArrayList<>(aluguelController.listarVendas());
        }else{

        }
        printVendas(listaVendas);
    }

    public void procurarVenda(ActionEvent event) throws Exception {
        AluguelBO VendaController = new AluguelBO();
        String search = srchVenda.getText();

        Venda VendaBase = new Venda();
        VendaBase.setTitulo(search);

        List<Venda> clear = new ArrayList<Venda>();
        listaVendas = clear;

        listaVendas = VendaController.pesquisarVendas(VendaBase);

        printVendas(listaVendas);

        Stage stage = (Stage) confirm.getScene().getWindow();
        stage.close();

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/VE/SrchItem.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage openStage = new Stage();
        openStage.setScene(new Scene(root1));
        openStage.show();

        System.out.println("Procurando por: " + search);
=======
        
    }


    public void initialize() {
        List<Venda> vendas = new ArrayList<>(vendaTeste());

        if (vendas != null) {
            try {
                for (Venda venda : vendas ) {

                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/VE/ListaItem.fxml"));
                    HBox hBox = fxmlLoader.load();
                    ListaItemController ldc = fxmlLoader.getController();

                    ldc.setData(venda);

                    itemsLayout.getChildren().add(hBox);
                }
            } catch (IOException e) {
                e.printStackTrace();
                // Handle the exception appropriately, e.g., show an error message.
            }            
        }
    }

    private List<Venda> vendaTeste() {
        List<Venda> ls = new ArrayList<>();

        Venda venda1 = new Venda("Livro", 6, 20.00);
        Venda venda2 = new Venda("Disco", 4, 45.00);
        ls.add(venda1);
        ls.add(venda2);
        ls.add(venda1);
        ls.add(venda2);
        ls.add(venda2);
        ls.add(venda1);
        ls.add(venda2);
        ls.add(venda1);

        return ls;
>>>>>>> origin/master
    }

    public void addItem(Venda item) {
        System.out.println(item.getTitulo() + " addItem");

        itemsCarrinho.add(item);

        for (Venda venda : itemsCarrinho) {
            System.out.println(venda.getTitulo() + " forEach");
        }
    }

<<<<<<< HEAD
    public void printVendas(List<Venda> vendas){
        try {
                for (Venda venda : vendas) {

                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/VE/ListaItem.fxml"));
                    HBox hBox = fxmlLoader.load();
                    ListaItemController ldc = fxmlLoader.getController();

                    ldc.setData(venda);
                    itemsLayout.getChildren().add(hBox);
                }
            } catch (IOException e) {
                e.printStackTrace();
                // Handle the exception appropriately, e.g., show an error message.
            }
    }

    public List<Venda> getItemsCarrinho() {
        return itemsCarrinho;
    }
=======
    public List<Venda> getItemsCarrinho() { return itemsCarrinho; }
>>>>>>> origin/master

    public void setItemsCarrinho(List<Venda> items) {
        itemsCarrinho = items;
    }
}
