package controller;

import java.io.IOException;
import java.time.LocalDate;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class TelaRelatorioController extends NavController {
    
    @FXML private Label vendaTotal;
    @FXML private Label vendaDiscos;
    @FXML private Label vendaLivros;
    @FXML private Label lucroSemana;
    @FXML private VBox aluguelLayout;
    @FXML private DatePicker pickDate;


    @FXML
    void pesquisarData(ActionEvent event) {

        LocalDate search = pickDate.getValue(); // data retorna LocalDate
        // returna formato AAAA-MM-DD

        System.out.println(search);
    }

    public void initialize() {
        // ------ Parte de Teste -------//
        Integer vl = 4;
        Integer vd = 7;
        Float lucro = 245.35f;

        vendaLivros.setText("" + vl);
        vendaDiscos.setText("" + vd);
        vendaTotal.setText("" + (vd + vl));

        lucroSemana.setText("" + lucro);
        // -----------------------------//
        try {

            for (int i = 0; i < 7; i++) {

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/VE/ListaRelatorio.fxml"));
                HBox hBox = fxmlLoader.load();

                ListaRelatorioController lc = fxmlLoader.getController();
                lc.setData();
                
                aluguelLayout.getChildren().add(hBox);

            }
        } catch (IOException e) {
            e.printStackTrace();
            // TODO: handle exception
        }

    }


    // TODO: VendaTotal coloca a soma de todas as vendas, pegar do BD

    // TODO: VendaDiscos venda das vendas de discos pegar do BD
    // TODO: VendaLivros venda das vendas de livros pegar do BD

    // TODO: LucroSemana soma de todos os preços das vendas feitas

    // TODO: AluguelLayout coloca os items dinamicos em uma lista

    // TODO: pesquisarData busca uma data no Banco de Dados e filtra a lista de alugueis

}
