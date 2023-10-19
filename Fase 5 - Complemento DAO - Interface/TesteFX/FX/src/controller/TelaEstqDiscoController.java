package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.bo.DiscoBO;
import model.entity.Disco;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
<<<<<<< HEAD
import javafx.scene.control.Button;
=======
>>>>>>> origin/master
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaEstqDiscoController extends NavController {

<<<<<<< HEAD
    @FXML
    private Button botaoAdicionar;
    @FXML
    private TextField srchDisco;
    @FXML
    private VBox discosLayout;

    static List<Disco> listaDiscos = new ArrayList<>();
=======
    @FXML private TextField srchDisco;
    @FXML private VBox discosLayout;
    
    public void procurarDisco(ActionEvent event) throws Exception {
        String search = srchDisco.getText();

        System.out.println("Procurando por: " + search);
    }
>>>>>>> origin/master

    public void adicionarDisco(ActionEvent event) throws Exception {
        System.out.println("Disco Adicionado.");
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/VE/AddEditDisco.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
    }
<<<<<<< HEAD

    public void initialize() {
        isGerente();
        showUserLogin();
        DiscoBO controllerDisco = new DiscoBO();
        if (listaDiscos.size() == 0) {
            System.out.println("LISTAVAZIA");
            listaDiscos = controllerDisco.listar();
        } else {
            System.out.println("LISTA COM ITENS");
        }
        printDiscos(listaDiscos);
    }

    public void printDiscos(List<Disco> discos) {
        try {
=======
    
    public void initialize() {
        try {
            // DiscoBO controllerDisco = new DiscoBO();

            // List<Disco> discos = new ArrayList<>(controllerDisco.listar());
            // System.out.println("----------------Cheguei aqui--------------------");


            List<Disco> discos = new ArrayList<>(discosTeste());

>>>>>>> origin/master
            for (Disco disco : discos) {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/VE/ListaDisco.fxml"));
                HBox hBox = fxmlLoader.load();
                ListaDiscoController ldc = fxmlLoader.getController();
                ldc.setData(disco);
<<<<<<< HEAD
                ldc.userPermissions(isGerente());
                botaoAdicionar.setDisable(!isGerente());
                discosLayout.getChildren().add(hBox);

            }
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    public void procurarDisco(ActionEvent event) throws Exception {
        DiscoBO discoController = new DiscoBO();
        String search = srchDisco.getText();

        Disco discoBase = new Disco();
        discoBase.setTitulo(search);

        List<Disco> clear = new ArrayList<Disco>();
        listaDiscos = clear;

        listaDiscos = discoController.pesquisaTotal(discoBase);

        printDiscos(listaDiscos);

        NavController e = new NavController();
        e.mudarTelaEstqDiscos(event);

        System.out.println("Procurando por: " + search);
=======
                ldc.userPermissions(true);
                discosLayout.getChildren().add(hBox);
                
            }
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception appropriately, e.g., show an error message.
        }
    }

    private List<Disco> discosTeste() {
        List<Disco> ls = new ArrayList<>();
        
        Disco disco1 = new Disco(22, 22, "Unico", "fefons", "dale");
        ls.add(disco1);
        ls.add(disco1);
        ls.add(disco1);
        ls.add(disco1);
        ls.add(disco1);
        ls.add(disco1);
        ls.add(disco1);
        ls.add(disco1);
    
        return ls;
        
>>>>>>> origin/master
    }

}
