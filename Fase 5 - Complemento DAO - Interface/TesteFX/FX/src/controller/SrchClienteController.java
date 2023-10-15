package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.bo.ClienteBO;
import model.entity.Cliente;

public class SrchClienteController {

    @FXML private VBox clientesLayout;
    @FXML private Button confirm;
    @FXML private TextField nome;

    private static Cliente selectedCliente;

    @FXML
    void confirmar(ActionEvent event) {
        try {
            if (selectedCliente != null) {
                
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/VE/TelaVenda.fxml"));
                
                Parent root = fxmlLoader.load();
                VendaController cl = fxmlLoader.getController();

                cl.setSelectedCliente(selectedCliente);

                try {
                    cl.mudarTelaVenda(event);
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("fechando pop-up");
        Stage stage = (Stage) confirm.getScene().getWindow();
        stage.close();

    }

    public void initialize() {
        try {
            // ClienteBO controleCliente = new ClienteBO();

            // List<Cliente> clientes = new ArrayList<>(controleCliente.listar());
            // ^
            // | Ao inves disso faça tipo assim
            // setSelectedCliente(controleCliente);

            System.out.println("Srch Cliente Controller");
            List<Cliente> clientes = new ArrayList<>(clientesTeste()); // teste (REMOVER)

            for (Cliente cliente : clientes) {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/VE/ListaCliente.fxml"));

                HBox hBox = fxmlLoader.load();
                ListaClientesController ldc = fxmlLoader.getController();
                
                ldc.setData(cliente);

                ldc.userPermissions(false);
                clientesLayout.getChildren().add(hBox);

            }
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception appropriately, e.g., show an error message.
        }
    }

    public List<Cliente> clientesTeste() {
        List<Cliente> ls = new ArrayList<>();
        
        Cliente c1 = new Cliente("Adriano", "Rua Zero", "123.456.789-11");
        ls.add(c1);
        Cliente c2 = new Cliente("Bernardo", "Rua Um", "222.222.222-22");
        ls.add(c2);
        Cliente c3 = new Cliente("Carlos", "Rua Dois", "333.333.333-33");
        ls.add(c3);
        ls.add(c1);
        ls.add(c3);
        ls.add(c2);
        ls.add(c2);
        ls.add(c3);
        ls.add(c1);
        ls.add(c1);
        ls.add(c2);

        return ls;
    }
    
    public Cliente getSelectedCliente() { return selectedCliente; }

    public void setSelectedCliente(Cliente selected) {
        System.out.println("Set Selected Cliente" + selected.getNome());

        selectedCliente = selected;
    }
}
