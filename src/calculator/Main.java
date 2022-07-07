package calculator;

import com.sun.jdi.IntegerType;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Operations operations = new Operations();
            List<Integer> listOne = List.of(1,2,3,4,5,6);
            List<Integer> listTwo = List.of(1,2,3,4,5,6);

        operations.suma(listOne,listTwo);
        operations.resta(listOne,listTwo);
        operations.multiplication(listOne,listTwo);
        operations.division(listOne,listTwo);
        operations.modulo(listOne,listTwo);


    }
}
