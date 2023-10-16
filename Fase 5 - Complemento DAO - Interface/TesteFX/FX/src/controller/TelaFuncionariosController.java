package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// import DAO.FuncionarioDAO;
import model.entity.Funcionario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaFuncionariosController extends NavController {

    @FXML private TextField srchFuncionario;
    @FXML private VBox funcionariosLayout;
    
    public void procurarFuncionario(ActionEvent event) throws Exception {
        String search = srchFuncionario.getText();

        System.out.println("Procurando por: " + search);
    }

    public void adicionarFuncionario(ActionEvent event) throws Exception {
        System.out.println("Funcionario Adicionado.");
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/VE/AddEditFuncionario.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
    }
    
    public void initialize() {
        try {
            // FuncionarioDAO controllerFuncionario = new FuncionarioDAO();

            // List<Funcionario> funcionario = new ArrayList<>(controllerFuncionario.listar());

            List<Funcionario> funcionario = new ArrayList<>(funcionarioTeste());


            for (Funcionario func : funcionario) {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/VE/ListaFuncionario.fxml"));
                HBox hBox = fxmlLoader.load();
                ListaFuncionarioController lfc = fxmlLoader.getController();
                lfc.setData(func);
                funcionariosLayout.getChildren().add(hBox);
            }
        } catch (IOException e) {
            e.printStackTrace();
            // TODO: handle exception
        }
    }

    private List<Funcionario> funcionarioTeste() {
        List<Funcionario> ls = new ArrayList<>();

        Funcionario dudu = new Funcionario("Dudu", "123213", "Gerente");
        ls.add(dudu);
        Funcionario f1 = new Funcionario("fernando", "123213", "Funcionario");
        ls.add(f1);
        ls.add(f1);
        ls.add(f1);
        ls.add(f1);
        ls.add(f1);
        ls.add(f1);
        ls.add(f1);
        ls.add(f1);
        ls.add(f1);
        ls.add(f1);

        return ls;
    }

}
