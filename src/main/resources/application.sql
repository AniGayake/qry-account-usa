select * from boa_salary_account_details;

select * from boa_account_details;

select * from id_mapping;

select * from account_code_type;

ALTER TABLE boa_salary_account_details add account_balance DECIMAL(20,2) DEFAULT(0.0);

ALTER TABLE boa_salary_account_details drop column account_balance;  

  
create table id_mapping (account_number BIGINT(12) NOT NULL,
 guid varchar(36),
 entity_type varchar(36),
 account_type_code INT(2),
 PRIMARY KEY (account_number,guid),
 FOREIGN KEY (account_type_code) references account_code_type(account_type_code)
 );
 
 insert into id_mapping (account_number,guid, entity_type, account_type_code) values (600568058742,'80950742-adc0-4acc-b886-fea2e8c33974','ACCOUNT',12);
 insert into id_mapping (account_number,guid, entity_type, account_type_code) values (600568058744,'ac1ce712-3c72-437a-a1d1-c1cf1a6b26d1','ACCOUNT',12);
 
 

 create table account_code_type (account_type_code INT(2) PRIMARY KEY, account_type varchar(20));
  insert into account_code_type (account_type_code,account_type) values (10,'Savings');
 insert into account_code_type (account_type_code,account_type) values (11,'Current');
 insert into account_code_type (account_type_code,account_type) values (12,'Salary');
 insert into account_code_type (account_type_code,account_type) values (13,'Corporate');
 insert into account_code_type (account_type_code,account_type) values (14,'Joint');
 insert into account_code_type (account_type_code,account_type) values (15,'Senior Citizen');
 insert into account_code_type (account_type_code,account_type) values (16,'Pension');
 insert into account_code_type (account_type_code,account_type) values (17,'Minor');