/*#1. Mostrar el nombre de todos los jugadores ordenados alfabéticamente.
SELECT nombre FROM Jugador ORDER BY nombre;
#2. Mostrar el nombre de los jugadores que sean pivots (‘C’) y que pesen más de 200 libras,
SELECT nombre
FROM Jugador
WHERE posicion = 'C' AND peso > 200
ORDER BY nombre;
#3. Mostrar el nombre de todos los equipos ordenados alfabéticamente.
SELECT nombre FROM Equipo ORDER BY nombre;
#4. Mostrar el nombre de los equipos del este (East).
SELECT nombre
FROM Equipo
WHERE conferencia = 'East';
#5. Mostrar los equipos donde su ciudad empieza con la letra ‘c’, ordenados por nombre.
SELECT nombre
FROM Equipo
WHERE ciudad LIKE 'C%'
ORDER BY nombre;
#6. Mostrar todos los jugadores y su equipo ordenados por nombre del equipo.
SELECT J.nombre, E.nombre_equipo AS equipo
FROM Jugador J
JOIN Equipo E ON J.nombre_equipo = E.nombre;
#7. Mostrar todos los jugadores del equipo “Raptors” ordenados por nombre.
SELECT nombre
FROM Jugador
WHERE nombre_equipo = 'Raptors'
ORDER BY nombre;
#8. Mostrar los puntos por partido del jugador ‘Pau Gasol’.
SELECT Puntos_por_partido
FROM Estadistica
WHERE jugador = (SELECT codigo FROM Jugador WHERE nombre = 'Pau Gasol');
#9. Mostrar los puntos por partido del jugador ‘Pau Gasol’ en la temporada ’04/05′.
SELECT Puntos_por_partido
FROM Estadistica
WHERE jugador = (SELECT codigo FROM Jugador WHERE nombre = 'Pau Gasol') AND temporada = '04/05';
#10. Mostrar el número de puntos de cada jugador en toda su carrera.
SELECT nombre, SUM(Puntos_por_partido) AS Total_Puntos
FROM Jugador
JOIN Estadistica ON Jugador.codigo = Estadistica.jugador
GROUP BY Jugador.codigo, nombre;
#11. Mostrar el número de jugadores de cada equipo.
SELECT E.nombre_equipo, COUNT(J.codigo) AS Num_Jugadores
FROM Equipo E
LEFT JOIN Jugador J ON E.nombre = J.nombre_equipo
GROUP BY E.nombre_equipo;
#12. Mostrar el jugador que más puntos ha realizado en toda su carrera.
SELECT J.nombre
FROM Jugador J
JOIN (
    SELECT jugador, SUM(Puntos_por_partido) AS Total_Puntos
    FROM Estadistica
    GROUP BY jugador
    ORDER BY Total_Puntos DESC
    LIMIT 1
) AS MaxPuntos ON J.codigo = MaxPuntos.jugador;
#13. Mostrar el nombre del equipo, conferencia y división del jugador más alto de la NBA.
SELECT E.nombre, E.conferencia, E.division
FROM Jugador J
JOIN Equipo E ON J.nombre_equipo = E.nombre
WHERE J.altura = (SELECT MAX(altura) FROM Jugador);
#14. Mostrar el partido o partidos (equipo_local, equipo_visitante y diferencia) con mayor
diferencia de puntos.
SELECT equipo_local, equipo_visitante, puntos_local - puntos_visitante AS Diferencia
FROM Partido
ORDER BY Diferencia DESC
LIMIT 1;
#15. Mostrar quien gana en cada partido (codigo, equipo_local, equipo_visitante,
equipo_ganador), en caso de empate sera null.
SELECT codigo, equipo_local, equipo_visitante,
    CASE
        WHEN puntos_local > puntos_visitante THEN equipo_local
        WHEN puntos_local < puntos_visitante THEN equipo_visitante
        ELSE NULL
    END AS equipo_ganador
FROM Partido;*/