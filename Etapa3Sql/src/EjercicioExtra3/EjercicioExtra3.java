/*1. Mostrar el nombre de todos los pokemon.
SELECT nombre
FROM pokemon;
2. Mostrar los pokemon que pesen menos de 10k.
SELECT nombre
FROM pokemon
WHERE peso < 10;
3. Mostrar los pokemon de tipo agua.
SELECT p.nombre
FROM pokemon p
INNER JOIN pokemon_tipo pt ON p.numero_pokedex = pt.numero_pokedex
INNER JOIN tipo t ON pt.id_tipo = t.id_tipo
WHERE t.nombre = 'agua';
4. Mostrar los pokemon de tipo agua, fuego o tierra ordenados por tipo.
SELECT p.nombre
FROM pokemon p
INNER JOIN pokemon_tipo pt ON p.numero_pokedex = pt.numero_pokedex
INNER JOIN tipo t ON pt.id_tipo = t.id_tipo
WHERE t.nombre IN ('agua', 'fuego', 'tierra')
ORDER BY t.nombre;
5. Mostrar los pokemon que son de tipo fuego y volador.
SELECT p.nombre
FROM pokemon p
INNER JOIN pokemon_tipo pt ON p.numero_pokedex = pt.numero_pokedex
INNER JOIN tipo t ON pt.id_tipo = t.id_tipo
WHERE t.nombre IN ('fuego', 'volador')
GROUP BY p.numero_pokedex
HAVING COUNT(DISTINCT t.nombre) = 2;
6. Mostrar los pokemon con una estadística base de ps mayor que 200.
SELECT p.nombre
FROM pokemon p
INNER JOIN estadisticas_base eb ON p.numero_pokedex = eb.numero_pokedex
WHERE eb.ps > 200;
7. Mostrar los datos (nombre, peso, altura) de la prevolución de Arbok.
SELECT p.nombre, p.peso, p.altura
FROM pokemon p
INNER JOIN evoluciona_de e ON p.numero_pokedex = e.pokemon_origen
WHERE e.pokemon_evolucionado = (SELECT numero_pokedex FROM pokemon WHERE nombre = 'Arbok');
8. Mostrar aquellos pokemon que evolucionan por intercambio.
SELECT p.nombre
FROM pokemon p
INNER JOIN forma_evolucion fe ON p.numero_pokedex = fe.numero_pokedex
INNER JOIN tipo_forma_aprendizaje tfa ON fe.id_forma_evolucion = tfa.id_tipo_aprendizaje
WHERE tfa.tipo_aprendizaje = 'intercambio';
9. Mostrar el nombre del movimiento con más prioridad.
SELECT nombre
FROM movimiento
ORDER BY prioridad DESC
LIMIT 1;
10. Mostrar el pokemon más pesado.
SELECT nombre
FROM pokemon
ORDER BY peso DESC
LIMIT 1;
11. Mostrar el nombre y tipo del ataque con más potencia.
SELECT m.nombre, t.nombre AS tipo
FROM movimiento m
INNER JOIN tipo t ON m.id_tipo = t.id_tipo
ORDER BY m.potencia DESC
LIMIT 1;
12. Mostrar el número de movimientos de cada tipo.
SELECT t.nombre AS tipo, COUNT(m.id_tipo) AS cantidad_movimientos
FROM tipo t
LEFT JOIN movimiento m ON t.id_tipo = m.id_tipo
GROUP BY t.nombre;
13. Mostrar todos los movimientos que puedan envenenar.
SELECT m.nombre
FROM movimiento m
WHERE EXISTS (
    SELECT 1
    FROM movimiento_efecto_secundario mes
    INNER JOIN efecto_secundario es ON mes.id_efecto_secundario = es.id_efecto_secundario
    WHERE mes.id_movimiento = m.id_movimiento AND es.efecto_secundario = 'envenenar'
);
14. Mostrar todos los movimientos que causan daño, ordenados alfabéticamente por nombre.
SELECT nombre
FROM movimiento
WHERE potencia > 0
ORDER BY nombre;
15. Mostrar todos los movimientos que aprende pikachu.
SELECT m.nombre
FROM movimiento m
INNER JOIN pokemon_movimiento_forma pmf ON m.id_movimiento = pmf.id_movimiento
INNER JOIN pokemon p ON pmf.numero_pokedex = p.numero_pokedex
WHERE p.nombre = 'Pikachu';
16. Mostrar todos los movimientos que aprende pikachu por MT (tipo de aprendizaje).
SELECT m.nombre
FROM movimiento m
INNER JOIN pokemon_movimiento_forma pmf ON m.id_movimiento = pmf.id_movimiento
INNER JOIN forma_aprendizaje fa ON pmf.id_forma_aprendizaje = fa.id_forma_aprendizaje
INNER JOIN MT mt ON fa.id_forma_aprendizaje = mt.id_forma_aprendizaje
INNER JOIN pokemon p ON pmf.numero_pokedex = p.numero_pokedex
WHERE p.nombre = 'Pikachu';
17. Mostrar todos los movimientos de tipo normal que aprende pikachu por nivel.
SELECT m.nombre
FROM movimiento m
INNER JOIN pokemon_movimiento_forma pmf ON m.id_movimiento = pmf.id_movimiento
INNER JOIN forma_aprendizaje fa ON pmf.id_forma_aprendizaje = fa.id_forma_aprendizaje
INNER JOIN nivel_aprendizaje na ON fa.id_forma_aprendizaje = na.id_forma_aprendizaje
INNER JOIN pokemon p ON pmf.numero_pokedex = p.numero_pokedex
WHERE p.nombre = 'Pikachu' AND m.id_tipo = 1;
18. Mostrar todos los movimientos de efecto secundario cuya probabilidad sea mayor al 30%.
SELECT m.nombre
FROM movimiento m
INNER JOIN movimiento_efecto_secundario mes ON m.id_movimiento = mes.id_movimiento
WHERE mes.probabilidad > 0.3;
19. Mostrar todos los pokemon que evolucionan por piedra.
SELECT p.nombre
FROM pokemon p
INNER JOIN pokemon_forma_evolucion pfe ON p.numero_pokedex = pfe.numero_pokedex
INNER JOIN forma_evolucion fe ON pfe.id_forma_evolucion = fe.id_forma_evolucion
INNER JOIN tipo_piedra tp ON fe.id_tipo_piedra = tp.id_tipo_piedra;
20. Mostrar todos los pokemon que no pueden evolucionar.
SELECT p.nombre
FROM pokemon p
LEFT JOIN forma_evolucion fe ON p.numero_pokedex = fe.pokemon_evolucionado
WHERE fe.id_forma_evolucion IS NULL;
21. Mostrar la cantidad de los pokemon de cada tipo.
SELECT t.nombre AS tipo, COUNT(pt.numero_pokedex) AS cantidad_pokemon
FROM tipo t
LEFT JOIN pokemon_tipo pt ON t.id_tipo = pt.id_tipo
GROUP BY t.nombre;*/