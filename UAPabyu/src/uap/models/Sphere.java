package uap.models;

import uap.bases.Bentuk;
import uap.interfaces.*;

public class Sphere extends Bentuk implements MenghitungVolume, MenghitungLuas, MenghitungMassa {
    private double r;

    public Sphere(double r) {
        this.r = r;
    }

    @Override
    public double getVolume() {
        return 4.0 / 3.0 * PI * r * r * r;
    }

    @Override
    public double getLuasPermukaan() {
        return 4 * PI * r * r;
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