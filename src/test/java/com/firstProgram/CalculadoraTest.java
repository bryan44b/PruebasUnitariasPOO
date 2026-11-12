
package com.firstProgram;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    // Se crea un objeto de la clase Calculadora
    // para poder utilizar sus métodos.
    Calculadora calc = new Calculadora();

    // Comprueba si el método numZero cuenta correctamente
    // los ceros cuando uno de ellos está en la primera posición.
    @Test
    void testNumZeroPrimeraPosición() {

        int[] numeros = {0, 2, 3, 0, 0, 4};

        // Se llama al método numZero y se almacena
        // el resultado obtenido.
        int numZero = calc.numZero(numeros);

        // Se espera que encuentre 3 ceros.
        // falla porque no cuenta el primer elemento
        assertEquals(3, numZero);
    }

    // Comprueba que numZero encuentre los ceros
    // cuando aparecen en diferentes posiciones del arreglo.
    @Test
    void testNumZeroEnCualquierPosición() {

        int[] numeros = {1, 2, 3, 0, 0, 4};

        int numZero = calc.numZero(numeros);

        // Se espera que encuentre 2 ceros.
        assertEquals(2, numZero);
    }

    // Comprueba el comportamiento del método cuando
    // el arreglo no contiene ningún cero.
    @Test
    void testNumZeroSinCeros() {

        int[] numeros = {1, 2, 3, 4, 5, 6};

        int numZero = calc.numZero(numeros);

        // Se espera que el resultado sea 0.
        assertEquals(0, numZero);
    }

    // Comprueba el comportamiento del método cuando
    // recibe un arreglo vacío, es decir, sin elementos.
    @Test
    void testNumZeroVacio() {

        int[] numeros = {};

        int numZero = calc.numZero(numeros);

        // Se espera que devuelva 0 porque no hay
        // elementos que puedan contener ceros.
        assertEquals(0, numZero);
    }

    // Comprueba que el método cuente correctamente
    // todos los elementos cuando el arreglo contiene únicamente ceros.
    @Test
    void testNumZeroConTodosCero() {

        int[] numeros = {0, 0, 0, 0, 0, 0};

        int numZero = calc.numZero(numeros);

        // Se espera que encuentre los 6 ceros.
        // falla porque se inicializa en 1
        assertTrue(numZero == 6);
    }

    // Comprueba que findLast encuentre un elemento
    // ubicado en la primera posición del arreglo.
    @Test
    void testFindLast() {

        int[] numeros = {1, 2, 3, 6, 7, 4};

        // Se busca el número 1 dentro del arreglo.
        int findLast = calc.findLast(numeros, 1);

        // Se espera que devuelva el índice 0.
        // falla porque no cuenta nunca el primer elemento
        assertEquals(0, findLast);
    }

    // Comprueba que findLast encuentre correctamente
    // un elemento ubicado en la segunda posición.
    @Test
    void testFindLast2() {

        int[] numeros2 = {1, 2, 3, 6, 7, 4};

        // Se busca el número 2 dentro del arreglo.
        int findLast2 = calc.findLast(numeros2, 2);

        // Se espera que devuelva el índice 1.
        assertEquals(1, findLast2);
    }
}
