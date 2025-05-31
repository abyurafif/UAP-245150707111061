package uap.models;

import uap.bases.Bentuk;
import uap.interfaces.*;

public class Torus extends Bentuk implements MenghitungVolume, MenghitungLuas, MenghitungMassa {
    private double R;
    private double r;

    public Torus(double R, double r) {
        this.R = R;
        this.r = r;
    }

    @Override
    public double getVolume() {
        return 2 * PI * PI * R * r * r;
    }

    @Override
    public double getLuasPermukaan() {
        return 4 * PI * PI * R * r;
    }

    @Override
    public double getMassa() {
        return getVolume() * KETEBALAN * MASSA_JENIS;
    }

    public int getBiayaKirim() {
        double massaKg = getMassa() / 1000;
        return (int) Math.ceil(massaKg) * 5000;
    }

    @Override
    public void printInfo() {
        System.out.printf("Volume          : %.2f\n", getVolume());
        System.out.printf("Luas permukaan  : %.2f\n", getLuasPermukaan());
        System.out.printf("Massa           : %.2f\n", getMassa());
        System.out.printf("Massa dalam kg  : %.2f\n", getMassa() / 1000);
        System.out.println("Biaya kirim     : Rp" + getBiayaKirim());
    }
}