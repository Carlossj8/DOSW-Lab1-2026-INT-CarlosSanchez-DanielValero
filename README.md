[Hoja de vida - Carlos Andres Sanchez Jimenez.pdf](https://github.com/user-attachments/files/30868723/Hoja.de.vida.-.Carlos.Andres.Sanchez.Jimenez.pdf)
Yo, Carlos Sanchez soy el candidato ideal para DOSW company, ya que, poseo grandes habilidades para resolver los problemas que se nos presentan, tengo conocimientos suficientes en software para desarrollar las actividades y, trabajo bien en equipo 

[IMG_1539.pdf](https://github.com/user-attachments/files/30868715/IMG_1539.pdf) Yo, Daniel Valero soy un candidato ideal para DOSW company, debido a que tengo grandes habilidades al abstraer informacion para resolver problemas, tengo conocimiento en diferentes lenguajes de programacion, soy un gran compañero y lider a la hora de trabajar en equipo, no destaco en el desarrollo pero si aporto significativamente en los avances, entregables y proyectos.

Preguntas Teoricas:

1. merge: une dos ramas creando normalmente un commit de merge y conserva el historial.
rebase: mueve los commits de una rama encima de otra, creando un historial más lineal.
2. Se produce un conflicto de merge. Git no sabe cuál cambio conservar, así que debemos resolverlo manualmente y luego hacer el commit.
3. con git log --oneline --graph --all
4. Commit: guarda los cambios en el repositorio local.
Push: envía esos commits desde el repositorio local al repositorio remoto, como GitHub.
5. git stash: guarda temporalmente los cambios que todavía no has hecho commit.
git stash pop: recupera esos cambios y los aplica nuevamente al proyecto.
6. HashMap: no está sincronizado y permite valores null.
Hashtable: está sincronizado y no permite null en claves ni valores.
7. Evita escribir el bucle manualmente: en una sola línea generas el mapa a partir del stream, indicando qué es la clave y qué es el valor. El código queda más corto y más fácil de leer, y se puede combinar directamente con filter() o sorted().
8. Una transformación. Por cada objeto que entra, map() devuelve un nuevo valor (puede ser otro tipo de dato), sin eliminar ni filtrar elementos.
9.  Evalúa cada elemento según una condición y se queda solo con los que la cumplen. Retorna un nuevo stream con esos elementos; no modifica la lista original.
10. Te ubicas en develop, actualizas con pull por si hay cambios nuevos, y creas la rama con checkout -b, que además te deja trabajando en ella de inmediato asi:

git checkout develop

git pull origin develop

git checkout -b feature/nombre-funcionalidad

11. git branch nombre solo crea la rama, pero sigues en la rama actual. git checkout -b nombre crea la rama y además te cambia a ella sin necesidad de checkout.
12. Porque así los cambios y errores quedan aislados mientras se desarrollan, sin afectar el código estable de main. Solo se integran una vez probados, lo que reduce conflictos y mantiene el historial más ordenado.
