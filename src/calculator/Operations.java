package calculator;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Operations {
    public void suma(List<Integer> listOne, List<Integer> listTwo){
        AtomicInteger indice = new AtomicInteger();

        System.out.println("SUMA: " + listOne.stream().map(element->element + listTwo.get(indice.getAndIncrement()))
                .collect(Collectors.toList()));
    }

    public void resta(List<Integer> listOne, List<Integer> listTwo){
        AtomicInteger indice = new AtomicInteger();
        System.out.println("RESTA: "+listOne.stream().map(element->element - listTwo.get(indice.getAndIncrement()))
                .collect(Collectors.toList()));
    }

    public void multiplication(List<Integer> listOne, List<Integer> listTwo){
        AtomicInteger indice = new AtomicInteger();
        System.out.println("MULTIPLICACIÓN: "+listOne.stream().map(element->element * listTwo.get(indice.getAndIncrement()))
                .collect(Collectors.toList()));

    }


    public void division(List<Integer> listOne, List<Integer> listTwo){

        AtomicInteger indice = new AtomicInteger();
        System.out.println("DIVISIÓN: "+listTwo.stream()
                .map(element-> {
                    if (element!=0){
                       return ((listOne.get(indice.getAndIncrement()) / element ));
                    }
                    indice.getAndIncrement();
                    return "--";
                })
                .collect(Collectors.toList()));
    }

    public void modulo(List<Integer> listOne, List<Integer> listTwo){
        AtomicInteger indice = new AtomicInteger();
        System.out.println("MODULO: "+listTwo.stream()
                .map(element-> {
                    if (element!=0){
                        return listOne.get(indice.getAndIncrement()) % element ;
                    }
                    indice.getAndIncrement();
                    return "--";
                })
                .collect(Collectors.toList()));

    }

}
