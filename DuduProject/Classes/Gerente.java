package Classes;

public class Gerente {
  private String login;
  private String senha;
  private Boolean isGerente;

  public Gerente(String login, String senha){
    setLogin(login);
    setSenha(senha);
    setIsGerente();
  }


  public void alterarSenha(String senha) {
    if (senha.length() < 3) {
      System.out.println("Valor Invalido");
    }
    else {
      this.senha = senha;
    }
  }


  public Boolean getIsGerente() { return isGerente; }
  
  public void setIsGerente(){
    this.isGerente = true;
  }


  public String getLogin() { return login; }

  public void setLogin(String login) {
    if(login.length() < 1){
      System.out.println("Valor Invalido");
    }else{
      this.login = login;
    }
  }


  public String getSenha() { return senha; }

  public void setSenha(String senha) {
    if(senha.length() < 3){
      System.out.println("Valor Invalido");
    }else{
      this.senha = senha;
    }
  }

}