package br.com.ufersa.lojaDudu.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TelaEstqLivros extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
       FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("VE/TelaEstqLivros.fxml"));
       Parent root = fxmlloader.load();
       Scene tela = new Scene(root);
    
       primaryStage.setScene(tela);
       primaryStage.show();
    }
    
}
