create table boa_account_details (
 account_number BIGINT(12) NOT NULL,
 account_holder_name varchar(255) NOT NULL,
 account_type varchar(255) NOT NULL,
 mode_of_operation varchar(255),
 account_description varchar(255),
 bank_name varchar(255) NOT NULL,
 branch_code varchar(255) NOT NULL,
 branch_name varchar(255) NOT NULL,
 bank_city varchar(255) NOT NULL,
 bank_state varchar(255) NOT NULL,
 bank_country varchar(255) NOT NULL,
 bank_pincode integer(6) NOT NULL,
 ifsc_code varchar(11) NOT NULL,
 currency_code varchar(3),
 bank_phone BIGINT (10) UNSIGNED,
 bank_phone_extension varchar(3),
 PRIMARY KEY (account_number)
 );

 CREATE TABLE boa_salary_account_details (
 salary_account_number BIGINT(12),
 organisation_Name varchar(255),
 interest_rate_on_savings DECIMAL(4,2),
 interest_rate_on_fd DECIMAL(4,2),
 account_balance DECIMAL(20,2) DEFAULT(0),
 foreign key (salary_account_number) references boa_account_details(account_number)
 );

 ALTER TABLE boa_salary_account_details add account_balance BIGINT DEFAULT(0);

 insert into boa_salary_account_details (salary_account_number,organisation_Name,interest_rate_on_savings,interest_rate_on_fd,account_balance)
  values (600568058742,'Google',7.30,7.5,89000.0);


 insert into boa_account_details (account_number,account_holder_name,account_type,mode_of_operation,
 account_description,bank_name,branch_code,branch_name,bank_city,bank_state,bank_country,bank_pincode,ifsc_code,
 currency_code,bank_phone,bank_phone_extension
 )
 values (600568058742,'Aniruddha Gayake','Salary','Single','  ','Bank of America',
 'BOA0000891','Charholi Phata','Pune','Maharashtra','India',412105,'BOA0000891','INR','9168151552','+91'
 );


create table id_mapping (account_number BIGINT(12) NOT NULL,
 guid varchar(36),
 entity_type varchar(36),
 account_type_code INT(2),
 PRIMARY KEY (account_number,guid),
 FOREIGN KEY (account_type_code) references account_code_type(account_type_code)
 );

 create table account_code_type (account_type_code INT(2), account_type varchar(20));


insert into account_code_type (account_type_code,account_type) values (10,'Savings');
insert into account_code_type (account_type_code,account_type) values (11,'Current');
insert into account_code_type (account_type_code,account_type) values (12,'Salary');
insert into account_code_type (account_type_code,account_type) values (13,'Corporate');
insert into account_code_type (account_type_code,account_type) values (14,'Joint');
insert into account_code_type (account_type_code,account_type) values (15,'Senior Citizen');
insert into account_code_type (account_type_code,account_type) values (16,'Pension');
insert into account_code_type (account_type_code,account_type) values (17,'Minor');

sudo /usr/local/mysql/support-files/mysql.server start

sudo /usr/local/mysql/support-files/mysql.server stop
sudo /usr/local/mysql/support-files/mysql.server restart