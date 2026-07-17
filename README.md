## Sistema de Matricula - PUCE TEC

## Descripción
Este proyecto consiste en un sistema de matrícula desarrollado en Java para simular el proceso de inscripción de estudiantes de la carrera de Desarrollo de Software.

## Integrantes
- Sophia Mendoza
- Angie Simba

## Funcionamiento del Sistema
El programa solicita al usuario indicar si es un estudiante de reingreso o de primer semestre.

Si el estudiante es de reingreso, el sistema registra la nota obtenida en la asignatura "Fundamentos de Programación". Posteriormente, se pregunta si desea solicitar el cupo para la materia "Estructuras de Datos".

El sistema valida si el estudiante posee el prerrequisito y si obtuvo una calificación mínima de 7.0. Dependiendo del resultado de la validación, la matrícula puede ser aprobada o rechazada.

Asimismo, si el estudiante obtuvo una calificación perfecta de 10.0 en la materia prerrequisito, el sistema muestra un mensaje especial indicando que ha sido seleccionado como Tutor de Programación del PUCE TEC.

## Flujo de datos
1. El usuario indica si es estudiante de reingreso o de primer semestre.
2. Si es de reingreso, ingresa la nota obtenida en "Fundamentos de Programación".
3. El usuario decide si desea solicitar el cupo para "Estructuras de Datos".
4. El sistema verifica el historial académico y la nota del prerrequisito.
5. Finalmente, se genera el resultado de la matrícula.

## Problemas Encontrados en el Código Legacy
- Existían nombres de variables poco descriptivos, lo que dificultaba la comprensión del código.
- El sistema presentaba un error al intentar evaluar estudiantes nuevos, debido a que el historial de materias podía tener un valor nulo, generando una excepción NullPointerException.
- La nueva regla de negocio para la selección de tutores no estaba implementada.

## Mejoras Implementadas
- Se refactorizaron los nombres de las variables para mejorar la legibilidad del código.
- Se corrigió el error `NullPointerException` validando que el historial de materias no sea nulo antes de recorrerlo.
- Se implementó el uso de `Scanner` para la lectura de datos desde la consola.
- Se añadió la funcionalidad que selecciona como Tutor de Programación a los estudiantes que obtengan una nota perfecta de 10.0.
