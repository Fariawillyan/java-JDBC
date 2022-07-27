import java.sql.*;
import java.util.List;

public class TestaListagem {

    public static void main(String[] args) throws SQLException {

        // conexao com o driver (precisar adicionar o jar do drive conect em library)
        Connection conexao = DriverManager
                .getConnection("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC",
                        "root", "root");

        Statement stm = conexao.createStatement();
        stm.execute("SELECT ID, NOME, DESCRICAO FROM PRODUTO");

        ResultSet rst = stm.getResultSet();

        while(rst.next()){
            Integer id = rst.getInt("ID");
            System.out.println(id);

            String nome = rst.getString("NOME");
            System.out.println(nome);

            String descricao = rst.getString("DESCRICAO");
            System.out.println(descricao);
        }

        conexao.close();

    }


}
