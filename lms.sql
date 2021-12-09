create database lms;
use lms
create table student(studentID int(10) NOT NULL PRIMARY KEY, name char(25), fatherName char(25), courseName varchar(25), branchName varchar(25));

create table book(bookId int(10) NOT NULL PRIMARY KEY, name char(25), publisher char(25), price float(5), publisherYear year(4));

create table issue(bookId int(10) NOT NULL , studentID int(10) NOT NULL , issueDate varchar(25), dueDate varchar(25), returnBook varchar(25)); 
