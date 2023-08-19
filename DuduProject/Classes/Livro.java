package Classes;
//import java.util;

public class Livro {
    private String titulo;
    private String genero; //multivalorado
    private String anoLancamento;
    private String autor;
    private int quantidadePaginas;
    private int codigoObjeto; // autoincrement do banco, primary key
    private float valorAluguel; 
    private int quantidadeExemplares;

    public Livro(String titulo, String genero, String anoLancamento, String autor, float valorAluguel, int quantidaPaginas){
        this.codigoObjeto = 0;// AutoIncrement do banco para codigoObjeto
        setTitulo(titulo);
        setGenero(genero);
        setAnoLancamento(anoLancamento);
        setAutor(autor);
        setValorAluguel(valorAluguel);
        setQuantidadePaginas(quantidaPaginas);
        this.quantidadeExemplares ++;
    }

    public void exemplarAlugado(){
      if (this.quantidadeExemplares < 0) {
        System.out.println("Não há exemplares disponíveis");
      } 
      else {
        this.quantidadeExemplares --;
      }
    }


    public void exemplarAlugado(int quantidade){
        this.quantidadeExemplares = this.quantidadeExemplares - quantidade;
    }


    public void adicionarExemplar() { this.quantidadeExemplares++; }
/*
    public void adicionarExemplar(int quantidade){
        Disco.quantidadeExemplares = Disco.quantidadeExemplares + quantidade;
    }
*/
    public void adicionarGenero(String genero){
        if (genero.length() < 1) {
            System.out.println("Valor Nulo, Coloque um genero válido");
        }
        else {
            this.genero = this.genero + " " +  genero; // concatena os generos em uma string
        }
    }

    
    public int getCodigoObjeto() { return this.codigoObjeto; }
    

    public String getTitulo() { return this.titulo; }

    public void setTitulo(String titulo){
        if (titulo.length() < 1) {
            System.out.println("Valor Nulo, Coloque um titulo válido");
        }
        else {
            this.titulo = titulo;
        }
    }


    public String getGenero() { return this.genero; }

    public void setGenero(String genero){
        if (genero.length() < 1) {
            System.out.println("Valor Nulo, Coloque um genero válido");
        }
        else {
            this.genero = genero;
        }
    }


    public String getAnoLancamento() { return this.anoLancamento; }

    public void setAnoLancamento(String anoLancamento){
        if(anoLancamento.length() < 10){
            System.out.println("Valor Nulo, Coloque uma data válida (26/08/2013)");
        }else{
            this.anoLancamento = anoLancamento;
        }
        // Colocar DateTime futuramente ...
    }
    

    public String getAutor() { return this.autor; }

    public void setAutor(String autor){
        if(autor.length() < 1){
            System.out.println("Valor Nulo, Coloque um autor válido");
        }else{
            this.autor = autor;
        }
    }


    public int getQuantidadePaginas() { return this.quantidadePaginas; }

    public void setQuantidadePaginas(int quantidadePaginas){
        if(quantidadePaginas < 1){
            System.out.println("Valor das páginas devem ser maior que 0");
        }else{
            this.quantidadePaginas = quantidadePaginas;
        }
    }


    public int getQuantidadeExemplares() { return this.quantidadeExemplares; }
    
    public void setQuantidadeExemplares(int quantidadeExemplares){
        this.quantidadeExemplares = quantidadeExemplares; // Podem haver 0 exemplares
    }
    
    
    public float getValorAluguel() { return this.valorAluguel; }

    public void setValorAluguel(float valorAluguel){
        this.valorAluguel = valorAluguel;
    }

    //título, gênero, ano de lançamento, autor, quantidade de
    //páginas e quantidade de exemplares, valor do aluguel
}
