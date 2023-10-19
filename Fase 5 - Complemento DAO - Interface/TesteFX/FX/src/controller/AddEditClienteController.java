package controller;

<<<<<<< HEAD
import model.bo.ClienteBO;
import model.entity.Cliente;

import java.util.ArrayList;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
=======
import model.entity.Cliente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
>>>>>>> origin/master
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddEditClienteController {

    @FXML
<<<<<<< HEAD
    private Label erroCliente;
    @FXML
=======
>>>>>>> origin/master
    private TextField nome;
    @FXML
    private TextField cpf;
    @FXML
    private TextField endereco;
    @FXML
<<<<<<< HEAD
    private Button confirm;

    private Cliente selectedcliente;

    @FXML
    void confirmar(ActionEvent event) throws Exception {
        System.out.println("pop-up aberto");
        Stage stage = (Stage) confirm.getScene().getWindow();

        Cliente cliente = new Cliente();

        cliente.setNome(nome.getText());
        cliente.setCpf(cpf.getText());
        cliente.setEndereco(endereco.getText());
        ClienteBO clienteController = new ClienteBO();

        if (selectedcliente == null) {
            Cliente autenticarcliente = clienteController.autenticarCPF(cliente);
            if (autenticarcliente == null) {
                clienteController.criar(cliente);

                List<Cliente> clear = new ArrayList<Cliente>();
                TelaClientesController.listaClientes = clear;

                TelaClientesController.listaClientes = clienteController.listar();

                NavController e = new NavController();
                e.mudarTelaClientes(event);
                stage.close();
            } else {
                erroCliente.setVisible(true);
                // TEXT NO ADDEDITclienteCONTROLLER JÁ EXISTE ESTE TITULO
            }

        } else {
            cliente.setId(selectedcliente.getId());

            System.out.println("AUTENTICAR ALTERAR");
            Cliente autenticarcliente = clienteController.autenticarCPF(cliente);
            if (autenticarcliente == null || autenticarcliente.getCpf().equals(selectedcliente.getCpf())) {
                clienteController.alterar(cliente);

                List<Cliente> clear = new ArrayList<Cliente>();
                TelaClientesController.listaClientes = clear;

                TelaClientesController.listaClientes = clienteController.listar();

                NavController e = new NavController();
                e.mudarTelaClientes(event);
                stage.close();
            } else {
                erroCliente.setVisible(true);
                // TEXT NO ADDEDITclienteCONTROLLER JÁ EXISTE ESTE TITULO
            }
        }
=======
    private TextField telefone;
    @FXML
    private Button confirm;

    @FXML
    void confirmar(ActionEvent event) {
        System.out.println("pop-up aberto");
        Stage stage = (Stage) confirm.getScene().getWindow();
        stage.close();
>>>>>>> origin/master
    }

    public void setData(Cliente cliente) {

<<<<<<< HEAD
        setSelectedCliente(cliente);
        nome.setText(cliente.getNome());
        cpf.setText(cliente.getCpf());
        endereco.setText(cliente.getEndereco());
    }

    public void setSelectedCliente(Cliente selectedCliente) {
        this.selectedcliente = selectedCliente;
    }

    public Cliente getSelectedCliente() {
        return selectedcliente;
=======
        nome.setText(cliente.getNome());
        cpf.setText(cliente.getCpf());
        endereco.setText(cliente.getEndereco());
        telefone.setText("0000000000");
>>>>>>> origin/master
    }
}
