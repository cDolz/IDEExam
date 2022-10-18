import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        boolean validar = false;
        double nota = 0;
        do {
            String respuesta = JOptionPane.showInputDialog("1.El lenguaje de alto nivel es: " +
                    "\na. Un lenguaje que ordena a la máquina las operaciones fundamentales para su " +
                    "funcionamiento." +
                    "\nb. Un lenguaje que expresa los algoritmos de manera adecuada a la capacidad " +
                    "cognitiva humana." +
                    "\nc. Un lenguaje derivado del lenguaje máquina formado por abreviaturas de " +
                    "letras y números llamadas mnemotécnicos." +
                    "\nd. Ninguna de las anteriores.");
            if (respuesta.toLowerCase().equals("a") || respuesta.toLowerCase().equals("b")
                    || respuesta.toLowerCase().equals("c") || respuesta.toLowerCase().equals("d")) {
                validar = true;
            } else {
                JOptionPane.showMessageDialog(null, "La respuesta seleccionada no es " +
                        "valida");
            }
            if (respuesta.toLowerCase().equals("b")) {
                nota++;
            } else {
                nota-=0.5;
            }
        } while (validar == false);
        validar = false;
        do {
            String respuesta = JOptionPane.showInputDialog("2.El diagrama de clases es: " +
                    "\na. Un diagrama fundamental en el análisis del sistema desde la perspectiva a la " +
                    "orientación de objetos que resuelve uno de los principales problemas del proceso de" +
                    " \n  producción de software: la falta de comunicación entre el equipo de desarrollo y " +
                    "el equipo que necesita una solución software." +
                    "\nb. A y D son correctas." +
                    "\nc. Un diagrama que describe un escenario o un conjunto de ellos representando" +
                    " que mensajes fluyen en el sistema así como quien los envía y quien los recibe. " +
                    "\nd. Un diagrama estructural que representa los elementos estáticos del sistema, " +
                    "sus atributos y comportamientos, y como se relacionan entre ellos.");
            if (respuesta.toLowerCase().equals("a") || respuesta.toLowerCase().equals("b")
                    || respuesta.toLowerCase().equals("c") || respuesta.toLowerCase().equals("d")) {
                validar = true;
            } else {
                JOptionPane.showMessageDialog(null, "La respuesta seleccionada no es " +
                        "valida");
            }
            if (respuesta.toLowerCase().equals("d")) {
                nota++;
            } else {
                nota-=0.5;
            }
        } while (validar == false);
        validar = false;
        do {
            String respuesta = JOptionPane.showInputDialog("3. Cual de estas respuestas no es una función" +
                    " básica de un IDE?" +
                    "\na. Editar código en un lenguaje de alto nivel." +
                    "\nb. Depurar código o debuggearlo." +
                    "\nc. Construir código automáticamente." +
                    "\nd. Todas las respuestas anteriores son funciones básicas de un IDE.");
            if (respuesta.toLowerCase().equals("a") || respuesta.toLowerCase().equals("b")
                    || respuesta.toLowerCase().equals("c") || respuesta.toLowerCase().equals("d")) {
                validar = true;
            } else {
                JOptionPane.showMessageDialog(null, "La respuesta seleccionada no es " +
                        "valida");
            }
            if (respuesta.toLowerCase().equals("d")) {
                nota++;
            } else {
                nota-=0.5;
            }
        } while (validar == false);
        validar = false;
        do {
            String respuesta = JOptionPane.showInputDialog("En el diagrama de clases tenemos los siguientes" +
                    " tipos de relaciones" +
                    "\na. Asociación, agregación, composición, dependencia y herencia." +
                    "\nb. Adaptación, agregación, composición, dependencia y herencia." +
                    "\nc. Asociación, agregación, compensación, dependencia y herencia." +
                    "\nd. Asociación, agregación, composición, dependencia y compilación.");
            if (respuesta.toLowerCase().equals("a") || respuesta.toLowerCase().equals("b")
                    || respuesta.toLowerCase().equals("c") || respuesta.toLowerCase().equals("d")) {
                validar = true;
            } else {
                JOptionPane.showMessageDialog(null, "La respuesta seleccionada no es " +
                        "valida");
            }
            if (respuesta.toLowerCase().equals("a")) {
                nota++;
            }
        } while (validar == false);
        validar = false;
        do {
            String respuesta = JOptionPane.showInputDialog("Que tipo de usuarios encontramos en los" +
                    " diagramas de casos de uso?" +
                    "\na. Sistemas y datos" +
                    "\nb. Usuarios y clientes" +
                    "\nc. Usuarios y sistemas." +
                    "\nd. a y b son correctas.");
            if (respuesta.toLowerCase().equals("a") || respuesta.toLowerCase().equals("b")
                    || respuesta.toLowerCase().equals("c") || respuesta.toLowerCase().equals("d")) {
                validar = true;
            } else {
                JOptionPane.showMessageDialog(null, "La respuesta seleccionada no es " +
                        "valida");
            }
            if (respuesta.toLowerCase().equals("c")) {
                nota++;
            } else {
                nota-=0.5;
            }
        } while (validar == false);
        validar = false;
        do {
            String respuesta = JOptionPane.showInputDialog("Una relación de herencia es: " +
                    "\na. Una relación que representa una dependencia semántica." +
                    "\nb. Una relación que representa un objeto y las partes que componen dicho objeto." +
                    "\nc. Una relación que permite que una clase herede los atributos y métodos de " +
                    "otra clase." +
                    "\nd. Todas las respuestas son correctas.");
            if (respuesta.toLowerCase().equals("a") || respuesta.toLowerCase().equals("b")
                    || respuesta.toLowerCase().equals("c") || respuesta.toLowerCase().equals("d")) {
                validar = true;
            } else {
                JOptionPane.showMessageDialog(null, "La respuesta seleccionada no es " +
                        "valida");
            }
            if (respuesta.toLowerCase().equals("c")) {
                nota++;
            } else {
                nota-=0.5;
            }
        } while (validar == false);
        validar = false;
        do {
            String respuesta = JOptionPane.showInputDialog("En un diagrama de clases, una flecha con " +
                    "un rombo relleno en su extremo representa una relación de: " +
                    "\na. Asociación" +
                    "\nb. Agregación" +
                    "\nc. Cardinalidad" +
                    "\nd. Ninguna respuesta es correcta");
            if (respuesta.toLowerCase().equals("a") || respuesta.toLowerCase().equals("b")
                    || respuesta.toLowerCase().equals("c") || respuesta.toLowerCase().equals("d")) {
                validar = true;
            } else {
                JOptionPane.showMessageDialog(null, "La respuesta seleccionada no es " +
                        "valida");
            }
            if (respuesta.toLowerCase().equals("d")) {
                nota++;
            } else {
                nota-=0.5;
            }
        } while (validar == false);
        validar = false;
        do {
            String respuesta = JOptionPane.showInputDialog("En un diagrama de casos de uso, un include " +
                    "se utiliza para: " +
                    "\na. El include no pertenece al tipo de relaciones que se dan en un caso de uso." +
                    "\nb. Señalar que un caso de uso tiene un comportamiento opcional reflejado en otro " +
                    "caso de uso." +
                    "\nc. Representar que un caso de uso utiliza siempre a otro caso de uso. Es" +
                    "decir , un caso de uso se ejecutará obligatoriamente." +
                    "\nd. Representar que una clase está incluida en la composición de otra clase.");
            if (respuesta.toLowerCase().equals("a") || respuesta.toLowerCase().equals("b")
                    || respuesta.toLowerCase().equals("c") || respuesta.toLowerCase().equals("d")) {
                validar = true;
            } else {
                JOptionPane.showMessageDialog(null, "La respuesta seleccionada no es " +
                        "valida");
            }
            if (respuesta.toLowerCase().equals("c")) {
                nota++;
            }
        } while (validar == false);
        validar = false;
        do {
            String respuesta = JOptionPane.showInputDialog("IntelliJ Idea es: " +
                    "\na. Un IDE." +
                    "\nb. Un lenguaje de programación." +
                    "\nc. Un lenguaje estandarizado para crear diagramas" +
                    "\nd. Ninguna es correcta");
            if (respuesta.toLowerCase().equals("a") || respuesta.toLowerCase().equals("b")
                    || respuesta.toLowerCase().equals("c") || respuesta.toLowerCase().equals("d")) {
                validar = true;
            } else {
                JOptionPane.showMessageDialog(null, "La respuesta seleccionada no es " +
                        "valida");
            }
            if (respuesta.toLowerCase().equals("a")) {
                nota++;
            } else {
                nota-=0.5;
            }
        } while (validar == false);
        validar = false;
        do {
            String respuesta = JOptionPane.showInputDialog("Los tipos de diagramas UML principales son: " +
                    "\na. De clases, de objetos, de componentes y de despliegue." +
                    "\nb. De clases, de secuencia, de componentes y de despliegue." +
                    "\nc. De clases, de objetos, de usos y de despliegue." +
                    "\nd. De usuarios, de objetos, de componentes y de despliegue.");
            if (respuesta.toLowerCase().equals("a") || respuesta.toLowerCase().equals("b")
                    || respuesta.toLowerCase().equals("c") || respuesta.toLowerCase().equals("d")) {
                validar = true;
            } else {
                JOptionPane.showMessageDialog(null, "La respuesta seleccionada no es " +
                        "valida");
            }
            if (respuesta.toLowerCase().equals("a")) {
                nota++;
            } else {
                nota-=0.5;
            }
        } while (validar == false);
        validar = false;
        JOptionPane.showMessageDialog(null, "Tu nota es: " + nota + " sobre 10.");
    }
}