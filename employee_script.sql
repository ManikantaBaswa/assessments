create database Employee;
use  Employee;
Create table Department(dept_Id int not null primary key auto_increment, dept_name varchar(50)not null unique);
ALTER TABLE Department AUTO_INCREMENT=10;
insert into Department(dept_name)values('hr'),('sales'),('finance'),('admin'),('Digital Marketing');
show tables;

select * from Department;
DELETE FROM Department WHERE primary_key IS NULL;

Create table Employee (emp_id int not null primary key auto_increment,
e_name varchar(50) not null,
dept_id int not null,
designation varchar(50) not null,
salary bigint DEFAULT 5000.00,
jdate date not null,
Manager varchar(50) references employee(emp_id),
foreign key(dept_id)  references department(dept_id));


ALTER TABLE Employee AUTO_INCREMENT=100;

insert into employee (e_name,dept_id,designation,salary,jdate) values 
('mani',10,'Consultant',6900,'2024-07-30');
insert into employee (e_name,dept_id,designation,salary,jdate) values('vani',11,'Consultant',3000,'2024-07-30');
insert into employee (e_name,dept_id,designation,salary,jdate) values('Sai',12,'hr',15000,'2024-08-30');
insert into employee (e_name,dept_id,designation,jdate) values ('revviiii',13,'sales','2024-07-30');
insert into employee (e_name,dept_id,designation,jdate) values ('mohit',14,'Digital Marketing','2024-07-30');
insert into employee (e_name,dept_id,designation,jdate) values ('carr',15,'Consultant','2024-07-30');


select * from employee;
select * from department;
select * from salary;



Create table salary(emp_id int not null ,amount float, monthsalary varchar(50), primary key(emp_id,monthsalary),foreign key(emp_id) references Employee (emp_id)); 
insert into salary(emp_id,amount,monthsalary) values (100,1000,'janaury');
insert into salary(emp_id,amount,monthsalary) values (100,12000,'Febraury');
insert into salary(emp_id,amount,monthsalary) values (100,12000,'Febraury');



