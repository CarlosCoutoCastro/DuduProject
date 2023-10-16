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
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaEstqDiscoController extends NavController {

    @FXML private TextField srchDisco;
    @FXML private VBox discosLayout;
    
    public void procurarDisco(ActionEvent event) throws Exception {
        String search = srchDisco.getText();

        System.out.println("Procurando por: " + search);
    }

    public void adicionarDisco(ActionEvent event) throws Exception {
        System.out.println("Disco Adicionado.");
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/VE/AddEditDisco.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
    }
    
    public void initialize() {
        try {
            // DiscoBO controllerDisco = new DiscoBO();

            // List<Disco> discos = new ArrayList<>(controllerDisco.listar());
            // System.out.println("----------------Cheguei aqui--------------------");


            List<Disco> discos = new ArrayList<>(discosTeste());

            for (Disco disco : discos) {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/VE/ListaDisco.fxml"));
                HBox hBox = fxmlLoader.load();
                ListaDiscoController ldc = fxmlLoader.getController();
                ldc.setData(disco);
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
        
    }

}
