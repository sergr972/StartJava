--выведите всю таблицу
SELECT * FROM Jaegers;

--отображение только не уничтоженных роботов
SELECT * FROM Jaegers WHERE status = 'active';

--отображение роботов серий: Mark-1 и Mark-4
SELECT * FROM Jaegers WHERE mark IN ('Mark-1', 'Mark-4');

--отображение всех роботов, кроме Mark-1 и Mark-4
SELECT * FROM Jaegers WHERE mark NOT IN ('Mark-1', 'Mark-4');

--сортировка таблицы по убыванию по столбцу mark
SELECT * FROM Jaegers ORDER BY mark DESC;

--информация о самом старом роботе
SELECT * FROM Jaegers WHERE launch = (SELECT MAX(launch) FROM Jaegers);

--роботы, которые уничтожили больше всех kaiju
SELECT * FROM Jaegers WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM Jaegers);

--средний вес роботов
SELECT AVG(weight) FROM Jaegers;

--увеличение на единицу количества уничтоженных kaiju у роботов, которые до сих пор не разрушены
UPDATE Jaegers SET kaijuKill = (kaijuKill + 1) WHERE status = 'active';

--удаление уничтоженных роботов
DELETE FROM Jaegers WHERE status = 'destroyed';
