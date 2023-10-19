package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.entity.Cliente;
<<<<<<< HEAD
import model.entity.Cliente;
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
import DAO.ClienteDAO;
import model.entity.Cliente;
import model.bo.ClienteBO;
import model.bo.ClienteBO;
=======
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import DAO.ClienteDAO;
import model.entity.Cliente;
import model.bo.ClienteBO;
>>>>>>> origin/master

public class TelaClientesController extends NavController {

    @FXML
<<<<<<< HEAD
    private Button botaoAdicionar;
    @FXML
=======
>>>>>>> origin/master
    private TextField srchCliente;
    @FXML
    private VBox clientesLayout;

<<<<<<< HEAD
    static List<Cliente> listaClientes = new ArrayList<>();

    public void procurarCliente(ActionEvent event) throws Exception {
        ClienteBO ClienteController = new ClienteBO();
        String search = srchCliente.getText();

        Cliente ClienteBase = new Cliente();
        ClienteBase.setNome(search);

        List<Cliente> clear = new ArrayList<Cliente>();
        listaClientes = clear;

        listaClientes = ClienteController.pesquisaTotal(ClienteBase);

        printClientes(listaClientes);

        NavController e = new NavController();
        e.mudarTelaClientes(event);

        System.out.println("Procurando por: " + search);
    }

    public void adicionarCliente(ActionEvent event) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/VE/AddEditCliente.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
=======
    public void procurarCliente(ActionEvent event) throws Exception {
        // String search = srchCliente.getText();

        // ClienteBO controleCliente =  new ClienteBO();
        // Cliente cliente = new Cliente("000","00000000000",search);

        // System.out.println("Procurando por: " + search);

        
        //Cliente clienteEncontrado = controleCliente.buscar(cliente);

        //System.out.println(clienteEncontrado.getNome());
        //RETURN Cliente encontrado
    }

    public void adicionarCliente(ActionEvent event) throws Exception {
        // System.out.println("Cliente Adicionado."); // Tem que ter um objeto pra eu colocar
        // Cliente cliente = new Cliente("nome", "endereco","00000000000"); // Cliente que me foi enviado

        // ClienteBO controleCliente = new ClienteBO();
        //controleCliente.criar(cliente);
>>>>>>> origin/master

    }

    public void initialize() {
<<<<<<< HEAD

        isGerente();
        showUserLogin();
        ClienteBO controleCliente = new ClienteBO();
        System.out.println(listaClientes.size());
        if (listaClientes.size() == 0) {
            listaClientes = new ArrayList<>(controleCliente.listar());
        } else {
            System.out.println("LISTA COM ITENS");
        }
        printClientes(listaClientes);

    }

    public void printClientes(List<Cliente> clientes) {
        try {
=======
        try {
            // ClienteBO controleCliente = new ClienteBO();

            // List<Cliente> clientes = new ArrayList<>(controleCliente.listar());
            
            List<Cliente> clientes = new ArrayList<>(clientesTeste());


>>>>>>> origin/master
            for (Cliente cliente : clientes) {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/VE/ListaCliente.fxml"));

                HBox hBox = fxmlLoader.load();
                ListaClientesController ldc = fxmlLoader.getController();
<<<<<<< HEAD

                ldc.setData(cliente);
                ldc.userPermissions(!isGerente());
                botaoAdicionar.setDisable(!isGerente());
                clientesLayout.getChildren().add(hBox);

            }
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

=======
                
                ldc.setData(cliente);
                ldc.userPermissions(true);
                clientesLayout.getChildren().add(hBox);

            }
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception appropriately, e.g., show an error message.
        }
    }

    public List<Cliente> clientesTeste() {
        List<Cliente> ls = new ArrayList<>();

        Cliente c = new Cliente("Adriano", "Rua Zero", "123.456.789-11");
        ls.add(c);
        ls.add(c);
        ls.add(c);
        ls.add(c);
        ls.add(c);
        ls.add(c);
        ls.add(c);
        ls.add(c);
        ls.add(c);
        ls.add(c);

        return ls;
    }
>>>>>>> origin/master
}
