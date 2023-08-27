package co.edu.uniquindio.estudiantes;
import co.edu.uniquindio.estudiantes.model.Estudiante;

public class Main {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante();
        Estudiante estudiante3 = new Estudiante();

        crearEstudiantes(estudiante1, estudiante2, estudiante3);

        mostrarDefinitivaEstudiantes(estudiante1, estudiante2, estudiante3);

        mostrarPromedioCurso(estudiante1,estudiante2,estudiante3);

        System.out.println("El promedio de edad de los tres estudiantes es: " +calcularPromedioEdad(estudiante1,estudiante2,estudiante3));

        System.out.println("El promedio de la nota 1 de los tres estudiantes es: " +calcularPromedioNota1(estudiante1,estudiante2,estudiante3));

        

    }
    public static void crearEstudiantes(Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3){
        estudiante1.setNombre("Juan");
        estudiante1.setEdad(17);
        estudiante1.setCorreo("juan@mail.com");
        estudiante1.setSemestre(3);
        estudiante1.setNota1(3);
        estudiante1.setNota2(3.5);
        estudiante1.setNota3(4.5);

        estudiante2.setNombre("Maria");
        estudiante2.setEdad(15);
        estudiante2.setCorreo("pepita@mail.com");
        estudiante2.setSemestre(1);
        estudiante2.setNota1(2);
        estudiante2.setNota2(2.5);
        estudiante2.setNota3(4.5);

        estudiante3.setNombre("Pepe");
        estudiante3.setEdad(20);
        estudiante3.setCorreo("pepe@mail.com");
        estudiante3.setSemestre(4);
        estudiante3.setNota1(4);
        estudiante3.setNota2(2.5);
        estudiante3.setNota3(4);
    }

    private static double calcularDefinitivaEstudiante(Estudiante estudiante){

       double nota1 = estudiante.getNota1();
       double nota2 = estudiante.getNota2();
       double nota3 = estudiante.getNota3();
       int cantidadNotas = 3;

       double resultado = (nota1+nota2+nota3) / cantidadNotas;

       return resultado;
    }
    private static void mostrarDefinitivaEstudiantes(Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3){

        String mensaje = "La nota definitiva de "+estudiante1.getNombre()+ " es: "+calcularDefinitivaEstudiante(estudiante1)+"\n";
        mensaje+="La nota definitiva de "+estudiante2.getNombre()+ " es: " +calcularDefinitivaEstudiante(estudiante2)+"\n";
        mensaje+="La nota definitiva de "+estudiante3.getNombre()+ " es: "+calcularDefinitivaEstudiante(estudiante3)+"\n";

        System.out.println(mensaje);
    }
    private static void mostrarPromedioCurso(Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3){

        double promedioEstudiante1 = calcularDefinitivaEstudiante(estudiante1);
        double promedioEstudiante2 = calcularDefinitivaEstudiante(estudiante2);
        double promedioEstudiante3 = calcularDefinitivaEstudiante(estudiante3);
        int cantidadPromedioEstudiantes = 3;

        double resultado = (promedioEstudiante1+promedioEstudiante2+promedioEstudiante3) / cantidadPromedioEstudiantes;

        System.out.println("El promedio del Curso es: " +resultado);
    }
    private static int calcularPromedioEdad(Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3){

        int edadEstudiante1 = estudiante1.getEdad();
        int edadEstudiante2 = estudiante2.getEdad();
        int edadEstudiante3 = estudiante3.getEdad();
        int cantidadEdades = 3;

        int resultado = (edadEstudiante1+edadEstudiante2+edadEstudiante3) / cantidadEdades;

        return resultado;
    }
    private static double calcularPromedioNota1(Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3){

        double nota1Estudiante1 = estudiante1.getNota1();
        double nota1Estudiante2 = estudiante2.getNota1();
        double nota1Estudiante3 = estudiante3.getNota1();
        double numNotas = 3;

        double resultado = (nota1Estudiante1+nota1Estudiante2+nota1Estudiante3) / numNotas;

        return resultado;
    }


}

