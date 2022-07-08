package calculator;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Operations operations = new Operations();
            List<Double> listOne = List.of(1.0,2.0,3.0,10.0,25.0,6.0);
            List<Double> listTwo = List.of(1.0,5.0,3.0,4.0,4.0,6.0);
        System.out.println("LISTAS");
        System.out.println(listOne.stream().collect(Collectors.toList()));
        System.out.println(listTwo.stream().collect(Collectors.toList()));
        System.out.println("");
        operations.suma(listOne,listTwo);
        operations.resta(listOne,listTwo);
        operations.multiplication(listOne,listTwo);
        operations.division(listOne,listTwo);
        operations.modulo(listOne,listTwo);

    }
}
