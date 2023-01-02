\qecho 'вывод всей таблицы'
SELECT *
  FROM Jaegers;

\qecho 'отображение только не уничтоженных роботов'
SELECT *
  FROM Jaegers
 WHERE status = 'active';

\qecho 'отображение роботов серий: Mark-1 и Mark-4'
SELECT *
  FROM Jaegers
 WHERE mark
    IN ('Mark-1', 'Mark-4');

\qecho 'отображение всех роботов, кроме Mark-1 и Mark-4'
SELECT *
  FROM Jaegers
 WHERE mark
NOT IN ('Mark-1', 'Mark-4');

\qecho 'сортировка таблицы по убыванию по столбцу mark'
SELECT *
  FROM Jaegers
 ORDER BY mark DESC;

\qecho 'информация о самом старом роботе'
SELECT *
  FROM Jaegers
 WHERE launch =
       (SELECT MIN(launch) FROM Jaegers);

\qecho 'роботы, которые уничтожили больше всех kaiju'
SELECT *
  FROM Jaegers
 WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM Jaegers);

\qecho 'средний вес роботов'
SELECT AVG(weight) AS averageWeight
  FROM Jaegers;

\qecho 'увеличение на единицу количества уничтоженных kaiju у роботов, которые до сих пор не разрушены'
UPDATE Jaegers
   SET kaijuKill = (kaijuKill + 1)
 WHERE status = 'active';

SELECT *
  FROM Jaegers
 WHERE status = 'active';

\qecho 'удаление уничтоженных роботов'
DELETE FROM Jaegers
 WHERE status = 'destroyed';

SELECT *
  FROM Jaegers;

