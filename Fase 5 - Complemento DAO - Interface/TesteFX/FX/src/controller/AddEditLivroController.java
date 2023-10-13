package controller;

import model.entity.Livro;

import java.sql.Date;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddEditLivroController {

    @FXML
    private TextField nome;
    @FXML
    private TextField autor;
    @FXML
    private TextField genero;
    @FXML
    private TextField ano; // DATE
    @FXML
    private TextField paginas;
    @FXML
    private TextField quantEstq;
    @FXML
    private TextField preco;
    @FXML
    private Button confirm;

    @FXML
    void confirmar(ActionEvent event) {
        System.out.println("pop-up aberto");
        Stage stage = (Stage) confirm.getScene().getWindow();
        stage.close();
    }

    public void setData(Livro livro) {

        nome.setText(livro.getTitulo());
        autor.setText(livro.getAutor());
        genero.setText(livro.getGenero());

        ano.setText(""+livro.getdataLancamento());
        paginas.setText(""+livro.getQuantidadePaginas());
        quantEstq.setText(""+livro.getQuantidadeExemplares());
        preco.setText(""+livro.getValorAluguel());
    }

}
