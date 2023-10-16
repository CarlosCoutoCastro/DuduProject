package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.entity.Cliente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import DAO.ClienteDAO;
import model.entity.Cliente;
import model.bo.ClienteBO;

public class TelaClientesController extends NavController {

    @FXML
    private TextField srchCliente;
    @FXML
    private VBox clientesLayout;

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

    }

    public void initialize() {
        try {
            // ClienteBO controleCliente = new ClienteBO();

            // List<Cliente> clientes = new ArrayList<>(controleCliente.listar());
            
            List<Cliente> clientes = new ArrayList<>(clientesTeste());


            for (Cliente cliente : clientes) {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/VE/ListaCliente.fxml"));

                HBox hBox = fxmlLoader.load();
                ListaClientesController ldc = fxmlLoader.getController();
                
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
}
