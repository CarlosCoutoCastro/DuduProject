package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.entity.Venda;

public class SrchItemController {
    @FXML private TextField nome;
    @FXML private Button confirm;
    @FXML private VBox itemsLayout;
    
    private static List<Venda> itemsCarrinho = new ArrayList<Venda>();


    @FXML
    void confirmar(ActionEvent event) {
        try {
            // System.out.println(itemsCarrinho.size());

            if (itemsCarrinho.size() > 0) {

                // for (Venda venda : itemsCarrinho) {
                //     System.out.println(venda.getTitulo());
                // }

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/VE/TelaVenda.fxml"));
                Parent root = fxmlLoader.load();
                VendaController sr = fxmlLoader.getController();
                sr.addCarrinho(itemsCarrinho);

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
    }

    public void addItem(Venda item) {
        System.out.println(item.getTitulo() + " addItem");

        itemsCarrinho.add(item);

        for (Venda venda : itemsCarrinho) {
            System.out.println(venda.getTitulo() + " forEach");
        }
    }

    public List<Venda> getItemsCarrinho() { return itemsCarrinho; }

    // public void setItemsCarrinho(List<Venda> itemsCarrinho) {
    //     itemsCarrinho = itemsCarrinho;
    // }
}
