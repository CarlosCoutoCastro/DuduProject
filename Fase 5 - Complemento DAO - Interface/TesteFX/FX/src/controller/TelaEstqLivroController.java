package controller;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import model.bo.LivroBO;
<<<<<<< HEAD
import model.entity.Disco;
=======
>>>>>>> origin/master
import model.entity.Livro;
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

public class TelaEstqLivroController extends NavController {
<<<<<<< HEAD

    @FXML
    private Button botaoAdicionar;
    @FXML
    private TextField srchLivro;
    @FXML
    private VBox livrosLayout;

    static List<Livro> listaLivros = new ArrayList<>();

    public void procurarLivro(ActionEvent event) throws Exception {
        String search = srchLivro.getText();
        Livro livroBase = new Livro();
        livroBase.setTitulo(search);

        List<Livro> clear = new ArrayList<Livro>();
        listaLivros = clear;

        LivroBO livroController = new LivroBO();
        listaLivros = livroController.pesquisaTotal(livroBase);

        printLivros(listaLivros);

        NavController e = new NavController();
        e.mudarTelaEstqLivros(event);
=======
    
    @FXML private TextField srchLivro;
    @FXML private VBox livrosLayout;
    
    public void procurarLivro(ActionEvent event) throws Exception {
        String search = srchLivro.getText();
>>>>>>> origin/master

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
<<<<<<< HEAD

    public void initialize() {
        isGerente();
        showUserLogin();
        LivroBO controllerLivro = new LivroBO();
        System.out.println(listaLivros.size());
        if (listaLivros.size() == 0) {
            listaLivros = new ArrayList<>(controllerLivro.listar());
        } else {
            System.out.println("LISTA COM ITENS");
        }

        printLivros(listaLivros);
    }

    public void printLivros(List<Livro> livros) {
        try {
=======
    
    public void initialize() {
        try {
            // LivroBO controllerLivro = new LivroBO();

            // List<Livro> livros = new ArrayList<>(controllerLivro.listar());
            
            List<Livro> livros = new ArrayList<>(livroTeste());
>>>>>>> origin/master

            for (Livro livro : livros) {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/VE/ListaLivro.fxml"));
                HBox hBox = fxmlLoader.load();
                ListaLivroController ldc = fxmlLoader.getController();
                ldc.setData(livro);
<<<<<<< HEAD
                ldc.userPermissions(isGerente());
                botaoAdicionar.setDisable(!isGerente());
                livrosLayout.getChildren().add(hBox);

=======
                ldc.userPermissions(true);
                livrosLayout.getChildren().add(hBox);
                
>>>>>>> origin/master
            }
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception appropriately, e.g., show an error message.
        }
    }
<<<<<<< HEAD
=======

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
>>>>>>> origin/master
}
