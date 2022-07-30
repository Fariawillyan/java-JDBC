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
