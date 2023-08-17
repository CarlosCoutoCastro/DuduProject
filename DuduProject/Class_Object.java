
import java.util;

public class Disco{
    private int codigoObjeto; // Autoincrement do banco de dados
    private float valorAluguel; 
    private int quantidadeExemplares = 0;
    private static int numeroCodigos = 0; //Valor futuramente extraido do banco para autoincrement

    public Disco(String titulo, String nomeBanda, String estilo, float valorAluguel){
        setCodigoObjeto();// AutoIncrement do banco para codigoObjeto
        setValorAluguel(valorAluguel);
        adicionarExemplar();
    }

    public void setCodigoObjeto(){
       this.codigoObjeto = Disco.numeroCodigos ++;
    }


    public int getQuantidadeExemplares(){
        return quantidadeExemplares;
    }

    public void setQuantidadeExemplares(int quantidadeExemplares){
        this.quantidadeExemplares = quantidadeExemplares; // Podem haver 0 exemplares
    }

    public float getValorAluguel(){
        return valorAluguel;
    }

    public void getValorAluguel(float valorAluguel){
        this.valorAluguel = valorAluguel;
    }

}
