package br.com.ufersa.lojaDudu.controller;

import br.com.ufersa.lojaDudu.view.Telas;
import javafx.event.ActionEvent;

public class NavController {
    
    public void mudarTelaVenda(ActionEvent event) throws Exception {
        Telas.telaVenda();
    }
    public void mudarTelaEstqLivros(ActionEvent event) throws Exception {
        Telas.telaEstqLivros();
    }
    public void mudarTelaEstqDiscos(ActionEvent event) throws Exception {
        Telas.telaEstqDiscos();
    }
    public void mudarTelaClientes(ActionEvent event) throws Exception {
        Telas.telaClientes();
    }
    public void mudarTelaRelatorio(ActionEvent event) throws Exception {
        Telas.telaRelatorio();
    }
    public void mudarTelaFuncionarios(ActionEvent event) throws Exception {
        Telas.telaFuncionarios();
    }
    public void mudarTelaLogin(ActionEvent event) throws Exception {
        Telas.telaLogin();
    }
}
