package uap.mains;

import java.util.Scanner;
import uap.models.Torus;
import uap.models.Sphere;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("NAMA PRAKTIKAN"); // ganti dengan nama sendiri
        System.out.println("NIM PRAKTIKAN");  // ganti dengan NIM sendiri
        System.out.println("=============================================");

        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        System.out.print("Isikan Radius   : ");
        double R = input.nextDouble(); // 7
        System.out.print("Isikan radius   : ");
        double r = input.nextDouble(); // 3.5

        Torus torus = new Torus(R, r);
        System.out.println("=============================================");
        torus.printInfo();
        System.out.println("=============================================");

        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        System.out.print("Isikan radius   : ");
        double radius = input.nextDouble(); // 21

        Sphere sphere = new Sphere(radius);
        System.out.println("=============================================");
        sphere.printInfo();
        System.out.println("=============================================");
    }
}