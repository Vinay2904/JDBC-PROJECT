package Package;

public class Query {
    static String Insert="Insert into Student_data(Id,Name,Salary,Email) values (?,?,?,?))"; 
    static String Delete="Delete from Student_data where Id=?";
    static String Update="Update Student_data set Salary=? where Id=?"; 
    static String Create="Create table Student_data (Id int primary key,Name varchar(30),Salary int,Email varchar(39))";
    static String Select="Select * from Student_data"; 
}
