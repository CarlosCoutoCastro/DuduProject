package model.entity;

public class Venda {
    private String titulo;
    private int quantidadeExemplares;
    private double valorAluguel;
<<<<<<< HEAD
    private int idObjeto;

     public Venda(String titulo, int quantidadeExemplares, double valorAluguel, int idObjeto) {
        setTitulo(titulo);
        setQuantidadeExemplares(quantidadeExemplares);
        setValorAluguel(valorAluguel);
        setIdObjeto(idObjeto);
    }
=======

>>>>>>> origin/master

    public Venda(String titulo, int quantidadeExemplares, double valorAluguel) {
        setTitulo(titulo);
        setQuantidadeExemplares(quantidadeExemplares);
        setValorAluguel(valorAluguel);
    }

    public Venda() {}


<<<<<<< HEAD
    public int getIdObjeto() {
        return idObjeto;
    }
    public void setIdObjeto(int idObjeto) {
        this.idObjeto = idObjeto;
    }
    public String getTitulo() { return titulo; }

    public void setTitulo(String titulo) {
            this.titulo = titulo;     
=======
    public String getTitulo() { return titulo; }

    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.trim().isEmpty()) {
            this.titulo = titulo;
        } else {
            throw new IllegalArgumentException("Título não pode ser vazio.");
        }
>>>>>>> origin/master
    }


    public int getQuantidadeExemplares() { return quantidadeExemplares; }

    public void setQuantidadeExemplares(int quantidadeExemplares) {
        if (quantidadeExemplares > 0) {
            this.quantidadeExemplares = quantidadeExemplares;
        } else {
            throw new IllegalArgumentException("A quantidade de exemplares deve ser maior que 0.");
        }
    }


    public double getValorAluguel() { return valorAluguel; }

    public void setValorAluguel(double valorAluguel) {
        if (valorAluguel > 0) {
            this.valorAluguel = valorAluguel;
        } else {
            throw new IllegalArgumentException("O valor de aluguel deve ser maior que 0.");
        }
    }

    
    @Override
    public String toString() {
        return "Título: " + titulo + ", Quantidade de Exemplares: " + quantidadeExemplares + ", Valor de Aluguel: " + valorAluguel;
    }

}



