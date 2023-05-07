package formasGeometricas;

import java.util.Scanner;

public class ejecucion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pentagono pentagono = new pentagono();
        decagono decagono = new decagono();
        rombo rombo = new rombo();
        int seleccion;
        System.out.println("Eliga una forma : 1.Pentagono\n2.Decagono\n3.Rombo");
        seleccion = sc.nextInt();

        switch (seleccion) {
            case 1:
                System.out.println("Ingrese el valor del lado");
                double lado = sc.nextDouble();
                pentagono.setLado(lado);
                pentagono.calcularPerimetro();
                System.out.println("Perimetro Pentagono " + pentagono.getPerimetro());
                System.out.println("Ingrese el valor de la apotema");
                pentagono.setApotema(sc.nextDouble());
                pentagono.calcularArea();
                System.out.println("Area Pentagono " + pentagono.getAreap());
                break;
            case 2:
                System.out.println("Ingrese el valor del lado");
                decagono.setLadoD(sc.nextDouble());
                decagono.calcularPerimetro();
                System.out.println("Perimetro Decagono " + decagono.getPerimetroD());
                System.out.println("Ingrese el valor de la apotema");
                decagono.setApotemaD(sc.nextDouble());
                decagono.calcularArea();
                System.out.println("Area Decagono " + decagono.getAreaD());
                break;
            case 3:
                System.out.println("Ingrese el valor del lado");
                rombo.setLadoR(sc.nextDouble());
                rombo.calcularPerimetro();
                System.out.println("Perimetro Rombo " + rombo.getPerimetroR());
                System.out.println("Ingrese de la Diagonal Mayor");
                rombo.setDiagonalMayorR(sc.nextDouble());
                System.out.println("Ingrese de la Diagonal Menor");
                rombo.setDiagonalMenorR(sc.nextDouble());
                rombo.calcularArea();
                System.out.println("Area Rombo " + rombo.getAreaR());
                break;
        }
        sc.close();
    }
}
