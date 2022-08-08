# java-JDBC
Trabalhando com banco de dados
### Algumas observações:
- Ao executar SQL como Statement, temos um risco de segurança, chamado de SQL Injection 
- SQL Injection nada mais é do que passar um novo comando SQL como parâmetro
- Para evitar SQL Injection, devemos usar a interface PreparedStatement
- Diferentemente do Statement, o PreparedStatement trata (sanitiza) cada parâmetro do comando SQL

- O banco de dados oferece um recurso chamado de transação, para juntar várias alterações como unidade de trabalho
- Se uma alteração falha, nenhuma alteração é aplicada (é feito um rollback da transação)
  Todas as alterações precisam funcionar para serem aceitas (é feito um commit) commit e rollback são operações clássicas de transações.
- Para garantir o fechamento dos recursos, existe no Java uma cláusula try-with-resources.
- O recurso em questão deve usar a interface Autoclosable.

- É boa prática usar um pool de conexões
- Um pool de conexões administra/controla a quantidade de conexões abertas
- Normalmente tem um mínimo e máximo de conexões
- Como existe uma interface que representa a conexão (java.sql.Connection), também existe uma interface que representa o pool de conexões (javax.sql.DataSource)
- C3PO é uma implementação Java de um pool de conexão

- Para cada tabela de domínio, temos uma classe de domínio
  Por exemplo, a tabela produtos tem uma classe Produto associada
  Objetos dessa classe representa um registro na tabela
- Para acessar a tabela, usaremos um padrão chamado Data Access Object (DAO)
  Para cada classe de domínio, existe um DAO. Por exemplo, a classe Produto possui um ProdutoDao
  Todos os métodos JDBC relacionados com o produto devem estar encapsulados no ProdutoDao.

  Que quando temos um relacionamento, é preciso ter cuidado para não cair no problema de queries N+1
  - N + 1 significa executar uma query e mais uma nova query (N) para cada relacionamento
  - Queries N + 1 podem gerar um problema no desempenho
  - Queries N + 1 podem ser evitadas através de joins no SQL
  A criar a nossa própria camada de persistência.

