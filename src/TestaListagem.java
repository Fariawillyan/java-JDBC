import java.sql.*;

public class TestaListagem {

    public static void main(String[] args) throws SQLException {

        /* connection com o driver (precisar adicionar o jar do drive conect em library)
        Connection connection = DriverManager               <---(virou classe ConnectionFactory)
                .getConnection("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC",
                        "root", "root");*/


        ConnectionFactory factory = new ConnectionFactory();
        Connection connection = factory.recuperarConexao();


        PreparedStatement stm = connection.prepareStatement("SELECT ID, NOME, DESCRICAO FROM PRODUTO");
        stm.execute();

        ResultSet rst = stm.getResultSet();

        while(rst.next()){
            Integer id = rst.getInt("ID");
            System.out.println(id);

            String nome = rst.getString("NOME");
            System.out.println(nome);

            String descricao = rst.getString("DESCRICAO");
            System.out.println(descricao);
        }

        connection.close();

    }


}
