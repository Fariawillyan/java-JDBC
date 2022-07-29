import java.sql.SQLException;
import java.sql.Statement;

public class TestaRemocao {

    public static void main(String[] args) throws SQLException {

        var factory = new ConnectionFactory();
        var connection = factory.recuperaConexao();

         Statement stm = connection.createStatement();
         stm.execute("DELETE FROM loja_virtual.PRODUTO WHERE ID > 2");

         int linhasModificadas = stm.getUpdateCount();

        System.out.println("Quantidades de linhas que foram modificadas " + linhasModificadas);



    }
}
