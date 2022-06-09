package edu.escuelaing.arem.ASE.app;

import java.io.File;
import java.util.Scanner;

/**
 * Clase que lee un archivo con una lista de numeros y dados estos numeros,
 * imprime desviacion estandar y media
 */
public class App {

    public static void main(String[] args) throws Exception {
        File archivo = new File(args[0]);
        LList numeros = lectorArchivo(archivo);
        Double media = calcularMedia(numeros);
        System.out.println("Media: " + media);
        System.out.println("Desviacion Estandar: " + calcularStd(numeros, media));
    }

    private static Double calcularStd(LList numeros, Double media) {
        Double sumatoria = 0.0;
        for (Double num : numeros) {
            sumatoria += Math.pow(num - media, 2);
        }
        Double res = Math.sqrt(sumatoria / (numeros.getLongitud() - 1));
        return Math.round(res * 10000.0) / 10000.0;
    }

    private static Double calcularMedia(LList numeros) {
        Double sumatoria = 0.0;
        for (Double num : numeros) {
            sumatoria += num;
        }
        Double res = sumatoria / numeros.getLongitud();
        return Math.round(res * 10000.0) / 10000.0;
    }

    public static LList lectorArchivo(File archivo) throws Exception {
        LList numeros = new LList();
        Scanner obj = new Scanner(archivo);
        while (obj.hasNextLine()) {
            numeros.add(Double.valueOf(obj.nextLine().toString()));
        }
        obj.close();
        return numeros;
    }
}
