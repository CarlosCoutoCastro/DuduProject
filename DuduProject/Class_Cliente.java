public class Cliente{
    private String nome;
    private String endereco;
    private String cpf; // primary key

    public Cliente(String nome, String endereco, String cpf){
      setNome(nome);
      setEndereco(endereco);
      setCpf(cpf);
    }
  
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        if(nome.lenght() < 1){
            system.out.println("Valor Nulo, Coloque um nome válido");
        }else{
            this.nome = nome;
        }
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        if(endereco.lenght() < 1){
            system.out.println("Valor Nulo, Coloque um endereco válido");
        }else{
            this.endereco = endereco;
        }
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        if(cpf.lenght() < 11){
            system.out.println("Valor inválido, Coloque um cpf válido");
        }else{
            this.cpf = cpf;
        }
    }


    //nome, endereço e
    //cpf
}