public class Principal {
    public static void main(String[] args) {
        //Criação de uma instancia da classe Empresa
         Empresa empresa = new Empresa();
         
         //Criação de uma instancia da classe vendedor, gerente e cliente
         Empresa.Vendedor vendedor = empresa.new Vendedor("Felipe 123456789", "01/01/2000", "01/01/2021", null, 3000, 10);
         Empresa.Gerente gerente = empresa.new Gerente("Maria", "987654321", "02/02/1980", "01/01/2020", 5000, "RH");
         Empresa.Cliente cliente = empresa.new Cliente("João", "456123789", "15/03/1995", "joao@email.com", "12345", "1234-5678");

         //Exibição das informações geradas
         System.out.println("Nome do Vendedor: " + vendedor.getNome());
         System.out.println("Departamento do Gerente: " + gerente.getDepartamento());
         System.out.println("Email do Cliente: " + cliente.getEmail());
     }
 }



