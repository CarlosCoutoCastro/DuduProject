import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Tela extends Application {

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("----------------------");
        System.out.println(getClass().getResource("layout.fxml"));
        System.out.println("----------------------");
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("layout.fxml"));
        Parent root = fxmlLoader.load();
        Scene tela = new Scene(root);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(tela);

        primaryStage.show();

         try{
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc_test", "postgres", "1234");
            if(conexao != null){
                System.out.print("Banco de dados conectado com sucesso");
                Statement stm = conexao.createStatement();
                insereDados(stm);
                consultadados(stm);
                conexao.close();
            }else{
                System.out.println("Erro na conexao");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }

       

    }

    public static void consultadados(Statement stm){
        String sql = "select id,nome from usuario";
        try {
            ResultSet result = stm.executeQuery(sql);
            while(result.next()){
                System.out.println("id: "+ result.getInt("id") + " Nome: " + result.getString("nome"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void insereDados(Statement stm){
        String sql = "insert into usuario (id, nome) values (5, 'Joao')";
        try {
            stm.executeUpdate(sql);
        } catch (Exception e) {
            
        }
    }

}
