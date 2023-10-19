package controller;

import java.io.IOException;
<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;

import model.bo.LivroBO;
=======
import java.sql.Date;

>>>>>>> origin/master
import model.entity.Livro;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ListaLivroController {
    @FXML
    private Label id;
    @FXML
    private Label titulo;
    @FXML
    private Label autor;
    @FXML
    private Label genero;
    @FXML
    private Label ano;
    @FXML
    private Label quant_pag;
    @FXML
    private Label quant_stq;
    @FXML
    private Label preco_uni;
    @FXML
    private Button delete;
    @FXML
    private Button editar;

    private Livro selectedLivro;

    @FXML
    void deletePU(ActionEvent event) throws Exception {
        System.out.println("<Deletando Livro: " + selectedLivro.getTitulo() + ">");
<<<<<<< HEAD
        LivroBO livroController = new LivroBO();

        livroController.Deletar(selectedLivro);
        List<Livro> clear = new ArrayList<Livro>();
        TelaEstqLivroController.listaLivros = clear;

        TelaEstqLivroController.listaLivros = livroController.listar();
=======

        // delete no Banco e recarrege a tela
>>>>>>> origin/master

        NavController e = new NavController();
        e.mudarTelaEstqLivros(event); // recarrega a tela
    }

    @FXML
    void editarPU(ActionEvent event) {
        System.out.println("<Abrindo Pop-Up AddEditLivro>");

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/VE/AddEditLivro.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));

            // preenche a tela aberta con os dados desse funcionario
            AddEditLivroController aef = fxmlLoader.getController();
            aef.setData(getSelectedLivro());

            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void setData(Livro livro) {

<<<<<<< HEAD
        System.out.println("SETDATA");
        setSelectedLivro(livro);
        id.setText("" + livro.getId());
        titulo.setText(livro.getTitulo());
        autor.setText(livro.getAutor());
        genero.setText(livro.getGenero());
        ano.setText("" + livro.getdataLancamento());
        quant_pag.setText("" + livro.getQuantidadePaginas());
        quant_stq.setText("" + livro.getQuantidadeExemplares());
        preco_uni.setText("" + livro.getValorAluguel());
=======
        setSelectedLivro(livro);
        id.setText(""+livro.getId());
        titulo.setText(livro.getTitulo());
        autor.setText(livro.getAutor());
        genero.setText(livro.getGenero());
        ano.setText(""+livro.getdataLancamento());
        quant_pag.setText(""+livro.getQuantidadePaginas());
        quant_stq.setText(""+livro.getQuantidadeExemplares());
        preco_uni.setText(""+livro.getValorAluguel());
>>>>>>> origin/master
    }

    // visibilidade dos controles para somente gerentes
    public void userPermissions(Boolean controlVisibility) {
<<<<<<< HEAD
        editar.setDisable(!controlVisibility);
        delete.setDisable(!controlVisibility);
=======
        editar.setVisible(controlVisibility);
        editar.setManaged(controlVisibility);
        delete.setVisible(controlVisibility);
        delete.setManaged(controlVisibility);
>>>>>>> origin/master
    }

    public Livro getSelectedLivro() {
        return selectedLivro;
    }

    public void setSelectedLivro(Livro selectedLivro) {
        this.selectedLivro = selectedLivro;
    }

}
