import java.util;

public class Disco{
    private int codigoObjeto; // Autoincrement do banco de dados
    private String titulo;
    private String nomeBanda; // multivalorado
    private String estilo; // multivalorado
    private float valorAluguel; 
    private int quantidadeExemplares = 0;
    private static int numeroCodigos = 0; //Valor futuramente extraido do banco para autoincrement

    public Disco(String titulo, String nomeBanda, String estilo, float valorAluguel){
        setCodigoObjeto();// AutoIncrement do banco para codigoObjeto
        setTitulo(titulo);
        setNomeBanda(nomeBanda);
        setEstilo(estilo);
        setValorAluguel(valorAluguel);
        adicionarExemplar();
    }

     public void exemplarAlugado(){
        quantidadeExemplares --;
    }

    public void exemplarAlugado(int quantidade){
        this.quantidadeExemplares = this.quantidade - quantidade;
    }

    public void adicionarExemplar(){
        quantidadeExemplares ++;
    }

    public void adicionarExemplar(int quantidade){
        this.quantidadeExemplares = this.quantidadeExemplares + quantidade;
    }

    public void adicionarNomeBanda(String nomeBanda){
        if(nomeBanda.lenght() < 1){
            system.out.println("Valor Nulo, Coloque um nome da banda válido");
        }else{
            this.nomeBanda = this.nomeBanda + " " +  nomeBanda; // concatena duas bandas em uma string
        }
    }

     public void adicionarEstilo(String estilo){
        if(estilo.lenght() < 1){
            system.out.println("Valor Nulo, Coloque um estilo válido");
        }else{
            this.estilo = this.estilo + " " +  estilo; // concatena dois estilos em uma string
        }
    }

    public void setCodigoObjeto(){
       this.codigoObjeto = Disco.numeroCodigos ++;
    }


    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        if(titulo.length() < 1){
            system.out.println("Valor Nulo, Coloque um titulo válido");
        }else{
            this.titulo = titulo;
        }
    }

    public String getNomeBanda(){
        return this.nomeBanda;
    }
    public void setNomeBanda(String nomeBanda){
        if(nomeBanda.length() < 1){
            system.out.println("Valor Nulo, Coloque um nome para a Banda válido");
        }else{
            this.nomeBanda = nomeBanda;
        }
    }

    public String getEstilo(){
        return nomeEstilo;
    }
    public void setEstilo(String estilo){
            this.estilo = estilo; // pode não haver estilo.
            //Criar classe para estilo no futuro ...
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
    //título, nome da banda, estilo
    //<ex:Rock, MPB…>, quantidade de exemplares, valor do aluguel)

}