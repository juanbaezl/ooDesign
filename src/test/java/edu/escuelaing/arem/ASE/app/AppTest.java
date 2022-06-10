package edu.escuelaing.arem.ASE.app;

import static org.junit.Assert.fail;

import java.io.File;
import org.junit.*;

/**
 * Unit test for AppTest.
 */
public class AppTest {
    @Test
    public void deberiaLeerArchivo1() {
        try {
            File doc = new File("num1.txt");
            Assert.assertEquals("[160.0,591.0,114.0,229.0,230.0,270.0,128.0,1657.0,624.0,1503.0]",
                    App.lectorArchivo(doc).toString());
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void deberiaLeerArchivo2() {
        try {
            File doc = new File("num2.txt");
            Assert.assertEquals("[15.0,69.9,6.5,22.4,28.4,65.9,19.4,198.7,38.8,138.2]",
                    App.lectorArchivo(doc).toString());
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void deberiaEncontrarMediaArchivo1() {
        try {
            File doc = new File("num1.txt");
            LList<Double> numeros = App.lectorArchivo(doc);
            Assert.assertEquals((Double) 550.6,
                    App.calcularMedia(numeros));
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void deberiaEncontrarMediaArchivo2() {
        try {
            File doc = new File("num2.txt");
            LList<Double> numeros = App.lectorArchivo(doc);
            Assert.assertEquals((Double) 60.32,
                    App.calcularMedia(numeros));
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void deberiaEncontrarStdArchivo1() {
        try {
            File doc = new File("num1.txt");
            LList<Double> numeros = App.lectorArchivo(doc);
            Assert.assertEquals((Double) 572.0268,
                    App.calcularStd(numeros, 550.6));
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void deberiaEncontrarStdArchivo2() {
        try {
            File doc = new File("num2.txt");
            LList<Double> numeros = App.lectorArchivo(doc);
            Assert.assertEquals((Double) 62.2558,
                    App.calcularStd(numeros, 60.32));
        } catch (Exception e) {
            fail();
        }
    }
}