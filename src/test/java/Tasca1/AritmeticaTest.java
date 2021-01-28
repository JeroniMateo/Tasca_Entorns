package Tasca1;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

class AritmeticaTest {
    @Test
    void suma() {
        Aritmetica suma = new Aritmetica();
        float primerSumando = 2;
        float segundoSumando = 4;
        float resultadoSuma = suma.suma(primerSumando,segundoSumando);
        System.out.println(resultadoSuma);
    }

    @Test
    void resta() {

        Aritmetica resta = new Aritmetica();
        float minuendo = 2f;
        float sustraendo = 4f;
        float resultadoResta = resta.resta(minuendo,sustraendo);
        System.out.println(resultadoResta);
    }

    @Test
    void multiplicacion() {
        Aritmetica multiplicacion = new Aritmetica();
        float primerFactor = 2f;
        float segundoFactor = 4f;
        float resultadoMult = multiplicacion.multiplicacion(primerFactor,segundoFactor);
        System.out.println(resultadoMult);
    }

    @Test
    void division() {
        Aritmetica division = new Aritmetica();
        float dividendo = 2f;
        float divisor = 4f;
        if (divisor == 0) {
            System.out.println("INFINITO");
        } else {
            float resultadoDivision = division.division(dividendo,divisor);
            System.out.println(resultadoDivision);

        }
    }
}
