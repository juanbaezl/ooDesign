package edu.escuelaing.arem.ASE.app;

import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Clase que lee un archivo con una lista de numeros y dados estos numeros,
 * imprime desviacion estandar y media
 */
public class App {

    public static void main(String[] args) throws Exception {
        File archivo = new File(args[0]);
        LinkedList<Double> numeros = lectorArchivo(archivo);
        Double media = calcularMedia(numeros);
        System.out.println("Media: " + media);
        System.out.println("Desviacion Estandar: " + calcularStd(numeros, media));
    }

    private static Double calcularStd(LinkedList<Double> numeros, Double media) {
        Double sumatoria = 0.0;
        for (Double num : numeros) {
            sumatoria += Math.pow(num - media, 2);
        }
        Double res = Math.sqrt(sumatoria / numeros.size());
        return res;
    }

    private static Double calcularMedia(LinkedList<Double> numeros) {
        Double sumatoria = 0.0;
        for (Double num : numeros) {
            sumatoria += num;
        }
        Double res = sumatoria / numeros.size();
        return res;
    }

    public static LinkedList<Double> lectorArchivo(File archivo) throws Exception {
        LinkedList<Double> numeros = new LinkedList<Double>();
        Scanner obj = new Scanner(archivo);
        while (obj.hasNextLine()) {
            numeros.add(Double.valueOf(obj.nextLine().toString()));
        }
        obj.close();
        return numeros;
    }
}
