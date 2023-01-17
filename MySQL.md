## 1. В подключенном MySQL репозитории создать базу данных “Друзья человека”
sudo mysql
CREATE DATABASE Друзья_человека;
show databases;
## 2. Создать таблицы с иерархией из диаграммы в БД
use Друзья_человека;
CREATE TABLE Animal (ID int);
CREATE TABLE Pets (ID int);
CREATE TABLE Pack_animals (ID int);
CREATE TABLE Dogs (ID int, Command varchar(255), DateOfBirth date, Name varchar(255));
CREATE TABLE Cats (ID int, Command varchar(255), DateOfBirth date, Name varchar(255));
CREATE TABLE Hamsters (ID int, Command varchar(255), DateOfBirth date, Name varchar(255));
CREATE TABLE Horses (ID int, Command varchar(255), DateOfBirth date, Name varchar(255));
CREATE TABLE Camels (ID int, Command varchar(255), DateOfBirth date, Name varchar(255));
CREATE TABLE Donkeys (ID int, Command varchar(255), DateOfBirth date, Name varchar(255));
## 3. Заполнить низкоуровневые таблицы именами(животных), командами которые они выполняют и датами рождения
INSERT INTO Dogs VALUES (1, 'Seat', '2020-05-04', 'Reks'),(2, 'Aport', '2021-02-10', 'Hooch');
SELECT * From Dogs;
INSERT INTO Cats VALUES (1, 'Jump', '2019-05-03', 'Mila'),(2, 'Voice', '2018-02-10', 'Ben'); 
SELECT * From Cats;
INSERT INTO Hamsters VALUES (1, 'Die', '2022-01-01', 'Chan'),(2, 'Run', '2023-01-10', 'Gina');
SELECT * From Hamsters;
INSERT INTO Horses VALUES (1, 'Run', '2019-08-27', 'Inga'),(2, 'Jump', '2017-01-10', 'Bob');
SELECT * From Horses;
INSERT INTO Donkeys VALUES (1, 'Carry', '2016-04-22', 'Jerry'),(2, 'Stop', '2017-11-13', 'Stan');
SELECT * From Donkeys;
INSERT INTO Camels VALUES (1, 'Carry', '2013-02-21', 'Max'),(2, 'Stop', '2017-01-05', 'Rose');
SELECT * From Camels;
## 4. Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой питомник на зимовку. Объединить таблицы лошади, и ослы в одну таблицу.
DELETE FROM Camels;
SELECT * From Camels;
SELECT ID, Command, DateOfBirth, Name FROM Horses UNION ALL SELECT ID, Command, DateOfBirth, Name FROM Donkeys;
## 5. Создать новую таблицу “молодые животные” в которую попадут все животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью до месяца подсчитать возраст животных в новой таблице
CREATE TABLE Young_animals (ID int, Command varchar(255), DateOfBirth date, Name varchar(255));
SHOW TABLES;
INSERT INTO Young_animals SELECT * FROM Cats;
INSERT INTO Young_animals SELECT * FROM Dogs;
INSERT INTO Young_animals SELECT * FROM Donkeys;
INSERT INTO Young_animals SELECT * FROM Hamsters;
INSERT INTO Young_animals SELECT * FROM Horses;
ALTER TABLE Young_animals ADD COLUMN Age int;
UPDATE Young_animals SET Age = (TIMESTAMPDIFF(MONTH, dateOfBirth, curdate()));
SELECT * FROM Young_animals;
DELETE FROM Young_animals WHERE (Age <= 12) or (Age > 36);
SELECT * FROM Young_animals;
## 6. Объединить все таблицы в одну, при этом сохраняя поля, указывающие на прошлую принадлежность к старым таблицам.
SELECT DISTINCT * FROM (SELECT * FROM Cats UNION ALL SELECT * FROM Dogs UNION ALL SELECT * FROM Donkeys UNION ALL SELECT  * FROM Hamsters UNION ALL SELECT  * FROM Horses) AS Animals LEFT JOIN Young_animals ON Animals.Name = Young_animals.Name UNION SELECT  DISTINCT * FROM (SELECT * FROM Cats UNION ALL SELECT * FROM Dogs UNION SELECT * FROM Donkeys UNION ALL SELECT  * FROM Hamsters UNION ALL SELECT  * FROM Horses) AS Animals RIGHT JOIN Young_animals ON Animals.Name = Young_animals.Name WHERE Animals.Name IS NULL OR Young_animals.Name IS NULL;