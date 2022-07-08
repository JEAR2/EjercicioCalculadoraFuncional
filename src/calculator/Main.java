package calculator;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Operations operations = new Operations();
            List<Integer> listOne = List.of(1,2,3,10,25,6);
            List<Integer> listTwo = List.of(1,5,3,4,4,6);
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
