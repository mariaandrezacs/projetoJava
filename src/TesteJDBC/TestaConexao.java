
package TesteJDBC;

public class TestaConexao {
    static String driverJDBC = "com.mysql.cj.jdbc.Driver";
    public static void main(String[] args) {
        try{
            System.out.println("Carregando o driver JDBC...");
            Class.forName(driverJDBC);
            System.out.println("Driver carregado com sucesso!!!");
        } catch(Exception e){
            System.out.println("Falha no carregamento!");
        }
    }
}
