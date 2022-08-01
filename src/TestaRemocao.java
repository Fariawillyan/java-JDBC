import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaRemocao {

    public static void main(String[] args) throws SQLException {

        var factory = new ConnectionFactory();
        var connection = factory.recuperarConexao();

         PreparedStatement stm = connection.prepareStatement("DELETE FROM loja_virtual.PRODUTO WHERE ID > ?");
         stm.setInt(1, 2);
         stm.execute();

         int linhasModificadas = stm.getUpdateCount();

        System.out.println("Quantidades de linhas que foram modificadas " + linhasModificadas);



    }
}
