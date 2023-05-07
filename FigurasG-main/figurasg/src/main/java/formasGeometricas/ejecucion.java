package formasGeometricas;

import java.util.Scanner;

public class ejecucion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seleccion;
        System.out.println("Eliga una forma : 1.Pentagono\n2.Decagono\n3.Rombo");
        seleccion = scanner.nextInt();

        switch (seleccion) {
            case 1:
                pentagono(scanner);
                break;
            case 2:
                decagono(scanner);
                break;
            case 3:
                rombo(scanner);
                break;
        }
        scanner.close();
    }

    public static void pentagono(Scanner scanner) {
        pentagono p = new pentagono();
        System.out.println("Ingrese el valor del lado");
        double lado = scanner.nextDouble();
        p.setLado(lado);
        p.calcularPerimetro();
        System.out.println("Perimetro Pentagono " + p.getPerimetro());
        System.out.println("Ingrese el valor de la apotema");
        p.setApotema(scanner.nextDouble());
        p.calcularArea();
        System.out.println("Area Pentagono " + p.getAreap());
    }

    public static void decagono(Scanner scanner) {
        decagono d = new decagono();
        System.out.println("Ingrese el valor del lado");
        d.setLadoD(scanner.nextDouble());
        d.calcularPerimetro();
        System.out.println("Perimetro Decagono " + d.getPerimetroD());
        System.out.println("Ingrese el valor de la apotema");
        d.setApotemaD(scanner.nextDouble());
        d.calcularArea();
        System.out.println("Area Decagono " + d.getAreaD());

    }

    public static void rombo(Scanner scanner) {
        rombo r = new rombo();
        System.out.println("Ingrese el valor del lado");
        r.setLadoR(scanner.nextDouble());
        r.calcularPerimetro();
        System.out.println("Perimetro Rombo " + r.getPerimetroR());
        System.out.println("Ingrese de la Diagonal Mayor");
        r.setDiagonalMayorR(scanner.nextDouble());
        System.out.println("Ingrese de la Diagonal Menor");
        r.setDiagonalMenorR(scanner.nextDouble());
        r.calcularArea();
        System.out.println("Area Rombo " + r.getAreaR());
    }
}
