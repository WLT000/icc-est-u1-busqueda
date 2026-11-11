import java.util.List;

import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {

        List<Persona> personas = List.of (
                    new Persona ("Juan", 25 , 'M'),
                    new Persona ("Maria", 30 , 'F'),
                    new Persona ("Pedro", 20 , 'M'),
                    new Persona ("Ana" , 28 , 'F'));
    /**
    //Instanciar
    BusquedaLineal busquedaLineal = new BusquedaLineal(personas);
   
    //1. BUSQUE UNA PERSONA con nombre "Maria"
    //Retorne la persona si lo encontro
    Persona NombreMaria = busquedaLineal.findByName("Maria");
    System.out.println("Se encontro a: " + NombreMaria );

    //2. BUSQUE UNA PERSONA con nombre "Diego" 
    //retorne la persona si lo encontro
    Persona NombreDiego = busquedaLineal.findByName("Diego");
    System.out.println("Se encontro a: " + NombreDiego );

    //3.BUSQUE UNA PERSONA con nombre "Ana"
    // Imprima la posicion de la persona si lo encontro   
    int posAna = busquedaLineal.findPosByName("Ana");
    System.out.println("Se encontro a Ana en posicion: " + posAna);
    **/

        BusquedaBinaria bB = new BusquedaBinaria(personas);
        int resultado = bB.findByName("Ana");
        if(resultado >= 0){
            System.out.println("Se econtro en pos="+ resultado);
        } else {
            System.out.println("No se encontro");
        }

        int resultado2= bB.findByName("Pedro");
        //OPERADPR TERNARIO
        //cond ? accion TRUE : accion FALSE
        System.out.println(resultado2 >= 0 ? "Se econtro en pos="+ resultado2 : "No se encontro nada :(");

        int res = bB.findByAge(25);
        System.out.println(res >=0 ? "Se enctor en pos ="+ res :"NO se econtro nada :(");

        //Persona pBuscar = new Persona("Maria", 30 , 'F');
        //int res3 = bB.findByPersona(pBuscar);

    }
    


}
