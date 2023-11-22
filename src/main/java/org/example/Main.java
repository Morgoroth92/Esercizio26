package org.example;
/*

    Scrivi un programma Java dove imposti 2 BigDecimal e 1 operazione aritmetica (Addizione, sottrazione,
    moltiplicazione e divisione, min e max) definita in un enum, crei un metodo per calcolare l'operazione richiesta e ritorni il risultato.
    Il tipo di operazione, i due dati in input e il risultato dovranno essere stampati a schermo


 */
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("13");
        BigDecimal b = new BigDecimal("27");
        Operation operation = Operation.MULTIPLY;

        Calculator calculator = new Calculator();
        BigDecimal result = calculator.calculate(a, b, operation);

        System.out.println("tipo di operazione: " + operation);
        System.out.println("numeri in input: " + a + ", " + b);
        System.out.println("risultato:  " + result);
    }
}