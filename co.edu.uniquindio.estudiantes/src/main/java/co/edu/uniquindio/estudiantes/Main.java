package co.edu.uniquindio.estudiantes;
import co.edu.uniquindio.estudiantes.model.Estudiante;

public class Main {

    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante();
        Estudiante estudiante3 = new Estudiante();

        crearEstudiantes(estudiante1, estudiante2, estudiante3);

        mostrarDefinitivaEstudiantes(estudiante1, estudiante2, estudiante3);

        mostrarPromedioCurso(estudiante1, estudiante2, estudiante3);

        System.out.println("El promedio de edad de los tres estudiantes es: " + calcularPromedioEdad(estudiante1, estudiante2, estudiante3));

        System.out.println("El promedio de la nota 1 de los tres estudiantes es: " + calcularPromedioNota1(estudiante1, estudiante2, estudiante3));

        System.out.println("La nota mayor del curso es: " + calcularNotaMayorDelCurso(estudiante1, estudiante2, estudiante3));

        System.out.println("La nota menor del curso es: " + calcularNotaMenorDelCurso(estudiante1, estudiante2, estudiante3));

        if (verificarAprobacionCurso(estudiante1)){
            System.out.println("El Estudiante " + estudiante1.getNombre() + " aprobo el curso");
        }
        if (verificarAprobacionCurso(estudiante1)){
            System.out.println("El Estudiante " + estudiante2.getNombre() + " aprobo el curso");
        }
        if (verificarAprobacionCurso(estudiante1)){
            System.out.println("El Estudiante " + estudiante3.getNombre() + " aprobo el curso");
        }

        System.out.println("El porcentaje de estudiantes que aprobaron el curso es: "+ calcularAprobaronCurso(estudiante1,estudiante2,estudiante3)+"%");

        System.out.println("El porcentaje de estudiantes que reprobaron el curso es: "+ calcularReprobaronCurso(estudiante1,estudiante2,estudiante3)+"%");

        if (obtenerEstudianteNotaMayor4(estudiante1)){
            System.out.print("Todas las notas de: " + estudiante1.getNombre() + "son mayores a 4.0");
        }
        if (obtenerEstudianteNotaMayor4(estudiante2)){
            System.out.print("Todas las notas de: " + estudiante2.getNombre() + "son mayores a 4.0");
        }
        if (obtenerEstudianteNotaMayor4(estudiante3)){
            System.out.print("Todas las notas de: " + estudiante3.getNombre() + "son mayores a 4.0");
        }
        System.out.println("La nota mayor de  " +estudiante1.getNombre() + " es: " + obtenerNotaMaximaEstudiante(estudiante1));
        System.out.println("La nota mayor de  " +estudiante2.getNombre() + " es: " + obtenerNotaMaximaEstudiante(estudiante2));
        System.out.println("La nota mayor de  " +estudiante3.getNombre() + " es: " + obtenerNotaMaximaEstudiante(estudiante3));

    }

    public static void crearEstudiantes(Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3) {
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

    private static double calcularDefinitivaEstudiante(Estudiante estudiante) {

        double nota1 = estudiante.getNota1();
        double nota2 = estudiante.getNota2();
        double nota3 = estudiante.getNota3();
        int cantidadNotas = 3;

        double resultado = (nota1 + nota2 + nota3) / cantidadNotas;

        return resultado;
    }

    private static void mostrarDefinitivaEstudiantes(Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3) {

        String mensaje = "La nota definitiva de " + estudiante1.getNombre() + " es: " + calcularDefinitivaEstudiante(estudiante1) + "\n";
        mensaje += "La nota definitiva de " + estudiante2.getNombre() + " es: " + calcularDefinitivaEstudiante(estudiante2) + "\n";
        mensaje += "La nota definitiva de " + estudiante3.getNombre() + " es: " + calcularDefinitivaEstudiante(estudiante3) + "\n";

        System.out.println(mensaje);
    }

    private static void mostrarPromedioCurso(Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3) {

        double promedioEstudiante1 = calcularDefinitivaEstudiante(estudiante1);
        double promedioEstudiante2 = calcularDefinitivaEstudiante(estudiante2);
        double promedioEstudiante3 = calcularDefinitivaEstudiante(estudiante3);
        int cantidadPromedioEstudiantes = 3;

        double resultado = (promedioEstudiante1 + promedioEstudiante2 + promedioEstudiante3) / cantidadPromedioEstudiantes;

        System.out.println("El promedio del Curso es: " + resultado);
    }

    private static int calcularPromedioEdad(Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3) {

        int edadEstudiante1 = estudiante1.getEdad();
        int edadEstudiante2 = estudiante2.getEdad();
        int edadEstudiante3 = estudiante3.getEdad();
        int cantidadEdades = 3;

        int resultado = (edadEstudiante1 + edadEstudiante2 + edadEstudiante3) / cantidadEdades;

        return resultado;
    }

    private static double calcularPromedioNota1(Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3) {

        double nota1Estudiante1 = estudiante1.getNota1();
        double nota1Estudiante2 = estudiante2.getNota1();
        double nota1Estudiante3 = estudiante3.getNota1();
        double numNotas = 3;

        double resultado = (nota1Estudiante1 + nota1Estudiante2 + nota1Estudiante3) / numNotas;

        return resultado;
    }

    private static double calcularNotaMayorDelCurso(Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3) {

        double nota1Estudiante1 = estudiante1.getNota1();
        double nota2Estudiante1 = estudiante1.getNota2();
        double nota3Estudiante1 = estudiante1.getNota3();
        double nota1Estudiante2 = estudiante2.getNota1();
        double nota2Estudiante2 = estudiante2.getNota2();
        double nota3Estudiante2 = estudiante2.getNota3();
        double nota1Estudiante3 = estudiante3.getNota1();
        double nota2Estudiante3 = estudiante3.getNota2();
        double nota3Estudiante3 = estudiante3.getNota3();

        double notaMayor = nota1Estudiante1;

        if (nota1Estudiante1 > notaMayor) {
            notaMayor = nota1Estudiante1;
        }

        if (nota2Estudiante1 > notaMayor) {
            notaMayor = nota2Estudiante1;
        }

        if (nota3Estudiante1 > notaMayor) {
            notaMayor = nota3Estudiante1;
        }

        if (nota1Estudiante2 > notaMayor) {
            notaMayor = nota1Estudiante2;
        }

        if (nota2Estudiante2 > notaMayor) {
            notaMayor = nota2Estudiante2;
        }

        if (nota3Estudiante2 > notaMayor) {
            notaMayor = nota3Estudiante2;
        }

        if (nota1Estudiante3 > notaMayor) {
            notaMayor = nota1Estudiante3;
        }
        if (nota2Estudiante3 > notaMayor) {
            notaMayor = nota2Estudiante3;
        }
        if (nota3Estudiante3 > notaMayor) {
            notaMayor = nota3Estudiante3;
        }

        return notaMayor;

    }

    private static double calcularNotaMenorDelCurso(Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3) {

        double nota1Estudiante1 = estudiante1.getNota1();
        double nota2Estudiante1 = estudiante1.getNota2();
        double nota3Estudiante1 = estudiante1.getNota3();
        double nota1Estudiante2 = estudiante2.getNota1();
        double nota2Estudiante2 = estudiante2.getNota2();
        double nota3Estudiante2 = estudiante2.getNota3();
        double nota1Estudiante3 = estudiante3.getNota1();
        double nota2Estudiante3 = estudiante3.getNota2();
        double nota3Estudiante3 = estudiante3.getNota3();

        double notaMenor = nota1Estudiante1;

        if (nota1Estudiante1 < notaMenor) {
            notaMenor = nota1Estudiante1;
        }

        if (nota2Estudiante1 < notaMenor) {
            notaMenor = nota2Estudiante1;
        }

        if (nota3Estudiante1 < notaMenor) {
            notaMenor = nota3Estudiante1;
        }

        if (nota1Estudiante2 < notaMenor) {
            notaMenor = nota1Estudiante2;
        }

        if (nota2Estudiante2 < notaMenor) {
            notaMenor = nota2Estudiante2;
        }

        if (nota3Estudiante2 < notaMenor) {
            notaMenor = nota3Estudiante2;
        }

        if (nota1Estudiante3 < notaMenor) {
            notaMenor = nota1Estudiante3;
        }
        if (nota2Estudiante3 < notaMenor) {
            notaMenor = nota2Estudiante3;
        }
        if (nota3Estudiante3 < notaMenor) {
            notaMenor = nota3Estudiante3;
        }
        return notaMenor;
    }
    private static boolean verificarAprobacionCurso(Estudiante estudiante){

        boolean aprobarCurso = false;
        double notaMinima = 3.0;

        double resultado = calcularDefinitivaEstudiante(estudiante);

        if (resultado >= notaMinima){

            aprobarCurso = true;
        }
        return aprobarCurso;
    }
    private static double calcularAprobaronCurso(Estudiante estudiante1,Estudiante estudiante2,Estudiante estudiante3){

        double estudiantesAprobados = 0;
        int cantidadEstudianteCurso = 3;

        if (verificarAprobacionCurso(estudiante1) == true){

                estudiantesAprobados += 1;
        }
        if (verificarAprobacionCurso(estudiante2) == true){

            estudiantesAprobados += 1;
        }
        if (verificarAprobacionCurso(estudiante3) == true){

            estudiantesAprobados += 1;
        }

        double porcentajeAprobado = (estudiantesAprobados * 100) / cantidadEstudianteCurso;

        return porcentajeAprobado;
    }
    private static double calcularReprobaronCurso(Estudiante estudiante1,Estudiante estudiante2,Estudiante estudiante3){

        double estudiantesReprobados = 0;
        int cantidadEstudianteCurso = 3;

        if (verificarAprobacionCurso(estudiante1) == false){

            estudiantesReprobados += 1;
        }
        if (verificarAprobacionCurso(estudiante2) == false){

            estudiantesReprobados += 1;
        }
        if (verificarAprobacionCurso(estudiante3) == false){

            estudiantesReprobados+= 1;
        }

        double porcentajeReprobado = (estudiantesReprobados * 100) / cantidadEstudianteCurso;

        return porcentajeReprobado;
    }
    private static boolean obtenerEstudianteNotaMayor4(Estudiante estudiante){

        double nota1 = estudiante.getNota1();
        double nota2 = estudiante.getNota2();
        double nota3 = estudiante.getNota3();
        double notaRequerida = 4.0;

        boolean notasMayor4 = false;

        if (nota1 >= notaRequerida && nota2 >= notaRequerida && nota3 >= notaRequerida){

            notasMayor4 = true;
        }
        return notasMayor4;
    }
    private static double obtenerNotaMaximaEstudiante(Estudiante estudiante){

        double nota1 = estudiante.getNota1();
        double nota2 = estudiante.getNota2();
        double nota3 = estudiante.getNota3();

        double notaMayor = 0;

        if (nota1 > notaMayor){
            notaMayor = nota1;
        }
        if (nota2 > notaMayor){
            notaMayor = nota2;
        }
        if (nota3 > notaMayor){
            notaMayor = nota3;
        }
        return notaMayor;
    }



}

