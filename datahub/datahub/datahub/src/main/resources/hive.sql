create user hive with password 'password';
create database hive owner hive;
ALTER USER hive WITH Superuser;



kubectl create secret generic postgres-cert