# java-JDBC
Trabalhando com banco de dados

- Ao executar SQL como Statement, temos um risco de segurança, chamado de SQL Injection 
- SQL Injection nada mais é do que passar um novo comando SQL como parâmetro
- Para evitar SQL Injection, devemos usar a interface PreparedStatement
- Diferentemente do Statement, o PreparedStatement trata (sanitiza) cada parâmetro do comando SQL

