package calculator;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Operations {
    public void suma(List<Integer> listOne, List<Integer> listTwo){
        List<Integer> list= Stream.concat(listOne.stream(),listTwo.stream())
                .collect(Collectors.toList());
        int Suma = list.stream().reduce(0,(element,acumulator)->element+acumulator);
        System.out.println("La suma de las listas es: "+Suma);
    }

    public void resta(List<Integer> listOne, List<Integer> listTwo){
        List<Integer> list= Stream.concat(listOne.stream(),listTwo.stream())
                .collect(Collectors.toList());
        int RestaListaUno= listOne.stream().reduce(0,(element,acumulator)->element-acumulator);
        int RestaListaDos = listTwo.stream().reduce(0,(element,acumulator)->element-acumulator);
        System.out.println("La resta de las listas reducidas es: "+(RestaListaUno-RestaListaDos));
    }

    public void multiplication(List<Integer> listOne, List<Integer> listTwo){
        List<Integer> list= Stream.concat(listOne.stream(),listTwo.stream())
                .collect(Collectors.toList());
        int MultiplicacionListaUno= listOne.stream().reduce(0,(element,acumulator)->element-acumulator);
        int MultiplicacionListaDos = listTwo.stream().reduce(0,(element,acumulator)->element-acumulator);

        System.out.println("La multipplicación de las listas es: "+MultiplicacionListaUno*MultiplicacionListaDos);

    }


    public void division(List<Integer> listOne, List<Integer> listTwo){
        List<Integer> list= Stream.concat(listOne.stream(),listTwo.stream())
                .collect(Collectors.toList());
        int Division = list.stream().reduce(1,(element,acumulator)->element/acumulator);
        int sumaListaUno= listOne.stream().reduce(0,(element,acumulator)->element+acumulator);
        int sumaListaDos = listTwo.stream().reduce(0,(element,acumulator)->element+acumulator);
        if(sumaListaUno==0 || sumaListaDos==0){
            System.out.println("No es posible la division entre cero (0): ");
        }else{
            System.out.println("La division de las listas es: "+sumaListaUno/sumaListaDos);
        }

    }

    public void modulo(List<Integer> listOne, List<Integer> listTwo){
        List<Integer> list= Stream.concat(listOne.stream(),listTwo.stream())
                .collect(Collectors.toList());
        int Modulo = list.stream().reduce(1,(element,acumulator)->element%acumulator);
        int sumaListaUno= listOne.stream().reduce(0,(element,acumulator)->element+acumulator);
        int sumaListaDos = listTwo.stream().reduce(0,(element,acumulator)->element+acumulator);
        if(sumaListaUno==0 || sumaListaDos==0){
            System.out.println("No es posible la division entre cero (0): ");
        }else{
            System.out.println("El modulo de las listas es: "+sumaListaUno%sumaListaDos);
        }

    }
}
