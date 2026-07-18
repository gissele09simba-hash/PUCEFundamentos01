import java.util.Scanner;

public class Matrícula {
    private static Scanner scanner = new Scanner(System.in);

public static void main(String[] args) {
    println("""
            ===========================================
            |   SISTEMA DE MATRÍCULA - PUCE TEC       |
            |      Carrera de Desarrollo de Software  |
            ===========================================
            """);

    String fundamentos = "Fundamentos de Programación";
    String materiaPrerequisito = fundamentos;
    double notaPrerequisito = 0.0;
    
    String opcionReingreso = readln("¿Es estudiante de reingreso o arrastre? (S/N): ");

    String[] h_materias = null; 

    if (opcionReingreso.equalsIgnoreCase("S")) {
        h_materias = new String[]{ materiaPrerequisito };
        String inputNota = readln("Ingrese la nota final obtenida en '" + fundamentos + "' (0-10): ");
        notaPrerequisito = Double.parseDouble(inputNota);
    } else {
        println("-> Registrando como estudiante de Primer Semestre...");
    }

    println("\n--- MATERIA A SOLICITAR ---");
    println("Materia destino: [ Estructuras de Datos ] (Requisito: Haber aprobado Fundamentos con >= 7.0)");
    String reqCupo = readln("¿Desea solicitar el cupo para esta materia? (S/N): ");

    if (reqCupo.equalsIgnoreCase("S")) {
        boolean tieneprerequisito = false;

        if (h_materias != null) {
            for (int i = 0; i < h_materias.length; i++) {
                if (h_materias[i].equals(materiaPrerequisito)) {
                    tieneprerequisito = true;
                }
            }
        }

        String resultadoMatricula = switch (String.valueOf(tieneprerequisito)) {
    case "true" -> {
        if (notaPrerequisito == 10.0) {
            yield """
MATRÍCULA APROBADA: Cumple con el prerrequisito.

¡Felicidades! Ha sido seleccionado como Tutor de Programación del PUCE TEC para este semestre.
""";
        } else if (notaPrerequisito >= 7.0) {
            yield "MATRÍCULA APROBADA: Cumple con el prerrequisito.";
        } else {
            yield "MATRÍCULA RECHAZADA: Reprobó el prerrequisito con " + notaPrerequisito;
        }
    }
    case "false" ->
        "MATRÍCULA RECHAZADA: No cuenta con el prerrequisito en su historial.";
    default ->
        "Error del sistema.";
};
        println("\n[RESULTADO]: " + resultadoMatricula);

    } else {
        println("\nProceso finalizado. No se solicitaron materias de segundo nivel.");
    }
    
    scanner.close();
}

private static void println(String string) {
    System.out.println(string);
}

private static String readln(String string) {
    System.out.print(string);
    return scanner.nextLine();
}
}
