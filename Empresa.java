public class Empresa {
   //Classe abstrata que mostra a pessoa
	 public abstract class Pessoa {
        String nome;
        String cpf;
        String dataNascimento;

        //Construtor da classe Pessoa
       public Pessoa(String nome, String cpf, String dataNascimento) {
           this.nome = nome;
           this.cpf = cpf;
           this.dataNascimento = dataNascimento;
       }

     //Métodos de getters e setters nos atributos
       public String getNome() {
           return nome;
       }

       public void setNome(String nome) {
           this.nome = nome;
       }

       public String getCpf() {
           return cpf;
       }

       public void setCpf(String cpf) {
           this.cpf = cpf;
       }

       public String getDataNascimento() {
           return dataNascimento;
       }

       public void setDataNascimento(String dataNascimento) {
           this.dataNascimento = dataNascimento;
       }
   }

   //Classe na qual representa um vendedor
   public class Vendedor extends Pessoa {
       public String dataContratacao;
       public double salarioBase;
       public double percentualComissao;

       //Construtor da classe Vendedor
       public Vendedor(String nome, String cpf, String dataNascimento, String dataContratacao, double salarioBase, double percentualComissao) {
           super(nome, cpf, dataNascimento);
           this.dataContratacao = dataContratacao;
           this.salarioBase = salarioBase;
           this.percentualComissao = percentualComissao;
       }

      //Métodos de Getters setters nos atributos
       public String getDataContratacao() {
           return dataContratacao;
       }

       public void setDataContratacao(String dataContratacao) {
           this.dataContratacao = dataContratacao;
       }

       public double getSalarioBase() {
           return salarioBase;
       }

       public void setSalarioBase(double salarioBase) {
           this.salarioBase = salarioBase;
       }

       public double getPercentualComissao() {
           return percentualComissao;
       }

       public void setPercentualComissao(double percentualComissao) {
           this.percentualComissao = percentualComissao;
       }
   }

  //Classe na qual representa Gerente
   public class Gerente extends Pessoa {
      public String dataContratacao;
      public double salarioBase;
      public String departamento;

      //Construtor da classe Gerente
       public Gerente(String nome, String cpf, String dataNascimento, String dataContratacao, double salarioBase, String departamento) {
           super(nome, cpf, dataNascimento);
           this.dataContratacao = dataContratacao;
           this.salarioBase = salarioBase;
           this.departamento = departamento;
       }

    //Metodos Getters e Setters dos Atributos
       public String getDataContratacao() {
           return dataContratacao;
       }

       public void setDataContratacao(String dataContratacao) {
           this.dataContratacao = dataContratacao;
       }

       public double getSalarioBase() {
           return salarioBase;
       }

       public void setSalarioBase(double salarioBase) {
           this.salarioBase = salarioBase;
       }

       public String getDepartamento() {
           return departamento;
       }

       public void setDepartamento(String departamento) {
           this.departamento = departamento;
       }
   }

  //Classe que representa um cliente 
   public class Cliente extends Pessoa {
       public String email;
       public String numeroCartaoFidelidade;
       public String telefone;

       //Construtor da classe Cliente
       public Cliente(String nome, String cpf, String dataNascimento, String email, String numeroCartaoFidelidade, String telefone) {
           super(nome, cpf, dataNascimento);
           this.email = email;
           this.numeroCartaoFidelidade = numeroCartaoFidelidade;
           this.telefone = telefone;
       }

       //Métodos getters e setters dos atributos
       public String getEmail() {
           return email;
       }

       public void setEmail(String email) {
           this.email = email;
       }

       public String getNumeroCartaoFidelidade() {
           return numeroCartaoFidelidade;
       }

       public void setNumeroCartaoFidelidade(String numeroCartaoFidelidade) {
           this.numeroCartaoFidelidade = numeroCartaoFidelidade;
       }

       public String getTelefone() {
           return telefone;
       }

       public void setTelefone(String telefone) {
           this.telefone = telefone;
       }
   }
}


