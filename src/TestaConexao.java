import java.sql.SQLException;

public class TestaConexao {

    public static void main(String[] args) throws SQLException {

        //testando inferencia de tipo com o java 10 (var)
        var connectionFactory = new ConnectionFactory();
        var connection = connectionFactory.recuperarConexao();


        System.out.println("FECHA CONEXAO");

        connection.close();

    }
}
