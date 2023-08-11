import java.util;

public class aluguel{
  private String cpfCliente; // primary key importada 
  private int codigoObjeto; // primary key importada
  private String dataAquisicao; // datetime
  private String dataDevolucao; //datetime

  public aluguel(String cpfCliente, int codigoObjeto, String dataAquisicao, String dataDevolucao){
    setCpfCliente(cpfCliente);
    setCodigoObjeto(codigoObjeto);
    setDataAquisicao(dataAquisicao);
    setDataDevolucao(dataDevolucao);
  }

  public aluguel(){}


  public bool verificarDevolucao(){
    // verificar se a data de devolucao ja passou e devolver um boleano
    //java.time.LocalDateTime.now()
    return 0;
  }
  
  public String getCpfCliente() {
    return cpfCliente;
  }

  public void setCpfCliente(String cpf){
    if(cpf.length() < 11){
      system.out.println("cpf inválido, coloque o numero com 11 digitos");
    }else{
      this.cpfCliente = cpf;
    }
  }

  public int getCodigoObjeto() {
    return codigoObjeto;
  }

  public void setCodigoObjeto(int codigoObjeto){
    if(codigoObjeto < 0){
      system.out.println("Codigo Inválido");
    }else{
      this.codigoObjeto = codigoObjeto;
    }
  }

  public String getDataAquisicao(){
      return dataAquisicao;
  }

  public void setDataAquisicao(String dataAquisicao){
    if(dataAquisicao.length() < 10){
      system.out.println("Data inválida, aplique a formatacao correta 10/10/2013");
    }else{
      this.dataAquisicao = dataAquisicao;
    }
  }

  public String getDataDevolucao(){
      return dataDevolucao;
  }

  public void setDataDevolucao(String dataDevolucao){
    if(dataAquisicao.length() < 10){
      system.out.println("Data inválida, aplique a formatacao correta 10/10/2013");
    }else{
      this.dataDevolucao = dataDevolucao;
    }
  }
  
    
  
}