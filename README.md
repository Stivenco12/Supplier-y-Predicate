# Uso de Supplier y Predicate en Java

Hola, soy Stivenco12, y este proyecto demuestra el uso de **Supplier** y **Predicate** en Java para la manipulación de objetos de tipo Persona y Estudiante. Con este código, busco ilustrar cómo las expresiones lambda y las interfaces funcionales pueden hacer que el código sea más limpio y modular.

## 🚀 Tecnologías Utilizadas
- **Java 8+**: Para aprovechar las expresiones lambda y las interfaces funcionales.
- **Maven**: Para la gestión de dependencias y construcción del proyecto.

## 📂 Estructura del Proyecto
```
Supplier-y-Predicate-main/
│── pom.xml                           # Configuración de Maven
│── src/main/java/supplier/           # Código fuente principal
│   │── Main.java                      # Punto de entrada del programa
│   │── Persona.java                   # Clase base Persona
│   │── Estudiante.java                 # Subclase de Persona
│── target/                            # Archivos compilados
```

## 📌 Instalación y Uso
1. Clona el repositorio:
   ```bash
   git clone https://github.com/tuusuario/tu-repo.git
   ```
2. Accede al directorio del proyecto:
   ```bash
   cd Supplier-y-Predicate-main
   ```
3. Compila y ejecuta con Maven:
   ```bash
   mvn clean install
   mvn exec:java -Dexec.mainClass="supplier.Main"
   ```

## ✨ Explicación del Código
### **Uso de `Supplier`**
`Supplier<T>` es una interfaz funcional que no recibe parámetros pero devuelve un resultado. En este proyecto, lo utilizo para generar objetos de tipo `Persona` de manera dinámica.
```java
Supplier<Persona> personaSupplier = () -> new Persona("Juan", 25);
Persona nuevaPersona = personaSupplier.get();
```
Cada vez que se invoca `get()`, se obtiene un nuevo objeto de `Persona` con los valores especificados.

### **Uso de `Predicate`**
`Predicate<T>` es una interfaz funcional que evalúa una condición sobre un objeto y devuelve un booleano. Aquí lo uso para filtrar estudiantes según su edad:
```java
Predicate<Estudiante> esMayorDeEdad = estudiante -> estudiante.getEdad() >= 18;
```
Este `Predicate` se usa para verificar si un estudiante es mayor de edad.

## 📌 Posibles Mejoras
- Ampliar el uso de más interfaces funcionales como `Function` y `Consumer`.
- Implementar un sistema de persistencia para almacenar los datos de los estudiantes.
- Integrar pruebas unitarias para garantizar la correcta funcionalidad del código.

## 👨‍💻 Desarrollador
- **Stivenco12**

