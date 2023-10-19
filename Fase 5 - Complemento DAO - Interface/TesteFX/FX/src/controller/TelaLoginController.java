package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
<<<<<<< HEAD
import javafx.scene.control.Label;
=======
>>>>>>> origin/master
import javafx.scene.control.TextField;
import view.Telas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

<<<<<<< HEAD
import DAO.FuncionarioDAO;
import model.bo.FuncionarioBO;
=======
>>>>>>> origin/master
// import DAO.FuncionarioDAO;
import model.entity.Funcionario;

public class TelaLoginController {
<<<<<<< HEAD

    @FXML
    private Label erroLogin;
=======
>>>>>>> origin/master
    @FXML
    private TextField usuario;
    @FXML
    private TextField senha;
    @FXML
    private Hyperlink recuperar;

    public void autenticar(ActionEvent event) throws Exception {

<<<<<<< HEAD
        Funcionario novFuncionario = new Funcionario(usuario.getText(), senha.getText(), "00000");

        FuncionarioBO funcionarioBO = new FuncionarioBO();
        Funcionario funcionarioEncontrado = funcionarioBO.login(novFuncionario);

        NavController.setFuncionarioLogado(funcionarioEncontrado);

        if (funcionarioEncontrado != null) {
            Telas.telaVenda(); // Passar funcionario como parametro.
        } else {
            System.out.println("Funcionario não encontrado");// Aplicar pop-up de
            erroLogin.setVisible(true);
        }

=======
        // Funcionario novFuncionario = new Funcionario(usuario.getText(), senha.getText(), "00000");

        // FuncionarioDAO conexao = new FuncionarioDAO();

        // try {
        //     conexao.getConnection();
        //     if (conexao != null) {
        //         Funcionario funcionarioEncontrado = conexao.autenticar(novFuncionario);
        //         if (funcionarioEncontrado != null) {
        //             Telas.telaVenda(); // Passar funcionario como parametro.
        //         } else {
        //             System.out.println("Funcionario não encontrado");// Aplicar pop-up de
        //         }
        //     } else {
        //         System.out.println("Erro na conexao");
        //     }
        // } catch (Exception e) {
        //     System.out.println("Falha na conexão");
        // }

        System.out.println("Usuário: " + usuario.getText() + " | Senha: " + senha.getText());
        
        Telas.telaVenda();
>>>>>>> origin/master
    }

    public void recuperarConta(ActionEvent event) throws Exception {
        System.out.println("Abrindo Pop-Up <Recuperar Senha>");
    }
<<<<<<< HEAD

=======
>>>>>>> origin/master
}
