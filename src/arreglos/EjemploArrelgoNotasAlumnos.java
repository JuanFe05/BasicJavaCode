package arreglos;

import java.util.Scanner;

public class EjemploArrelgoNotasAlumnos {

    public static void main(String[] args) {

        double[] matematicas, historia, lenguaje;
        double sumMate = 0, sumHist = 0, sumLeng = 0;
        matematicas = new double[5];
        historia = new double[5];
        lenguaje = new double[5];

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa las 5 notas de matemáticas: ");
        for (int i = 0; i < matematicas.length; i++) {
            matematicas[i] = sc.nextDouble();
        }

        System.out.println("Ingresa las 5 notas de historia: ");
        for (int i = 0; i < historia.length; i++) {
            historia[i] = sc.nextDouble();
        }

        System.out.println("Ingresa las 5 notas de lenguaje: ");
        for (int i = 0; i < lenguaje.length; i++) {
            lenguaje[i] = sc.nextDouble();
        }

        for (int i = 0; i < 5; i++) {
            sumMate += matematicas[i];
            sumHist += historia[i];
            sumLeng += lenguaje[i];
        }

        double promedioCurso = ((sumMate + sumHist + sumLeng) / 3);

        System.out.println("El promedio de la clase de matemáticas es de: " + (sumMate / matematicas.length));
        System.out.println("El promedio de la clase de historia es de: " + (sumHist / historia.length));
        System.out.println("El promedio de la clase de lenguaje es de: " + (sumLeng / lenguaje.length));
        System.out.println("El promedio total del curso es de: " + promedioCurso);

        System.out.print("Ingrese el ID del alumno (de 0 a 6): ");
        int id = sc.nextInt();

        double promedioAlumno = ((matematicas[id] + historia[id] + lenguaje[id]) / 3);

        System.out.println("El promedio del alumno N° " + id + " es: " + promedioAlumno);

        sc.close();

    }

}
