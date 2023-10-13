package controller;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import model.bo.LivroBO;
import model.entity.Livro;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EstqLivroController extends NavController {
    @FXML private TextField srchLivro;
    @FXML private Button addLivro;
    @FXML private VBox livrosLayout;
    
    public void procurarLivro(ActionEvent event) throws Exception {
        String search = srchLivro.getText();

        System.out.println("Procurando por: " + search);
    }

    public void adicionarLivro(ActionEvent event) throws Exception {
        System.out.println("Livro Adicionado.");
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/VE/AddEditLivro.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
    }
    
    public void initialize() {
        try {
            LivroBO controllerLivro = new LivroBO();

            List<Livro> livros = new ArrayList<>(controllerLivro.listar());

            for (Livro livro : livros) {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/VE/ListaLivro.fxml"));
                HBox hBox = fxmlLoader.load();
                ListaLivroController ldc = fxmlLoader.getController();
                ldc.setData(livro);
                ldc.userPermissions(true);
                livrosLayout.getChildren().add(hBox);
                
            }
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception appropriately, e.g., show an error message.
        }
    }

    private List<Livro> livroTeste() {
        List<Livro> ls = new ArrayList<>();

        Date data = new Date(100,0,0);
        
        Livro livro1 = new Livro(22, 22, "Unico", "fefons", data, "Alow", 999);
        ls.add(livro1);
        ls.add(livro1);
        ls.add(livro1);
        ls.add(livro1);
        ls.add(livro1);
        ls.add(livro1);
        ls.add(livro1);
        ls.add(livro1);
        ls.add(livro1);
        

        return ls;
        
    }
}
