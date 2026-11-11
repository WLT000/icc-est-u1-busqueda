import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import models.Persona;

public class BusquedaBinaria{
    private List<Persona> personas;

    public BusquedaBinaria(List<Persona> personas) {
        this.personas = new ArrayList<>( personas);
    }
    
    public int findByName(String name){
        //1. Ordenado -> Nombre
        personas.sort(Comparator.comparing(Persona::getName));

        //Busqueda Binaria
        int lo = 0;
        int hi = personas.size()-1;

        //2 def bucle con su condicion
        while (lo<=hi){
            //3. calculamos mid
            int mid = (lo + hi)/2;

            //4 . preguntar si el mid es lo buscado
            if(personas.get(mid).getName().equals(name)){
                return mid;
            }
            //5 actualizar limites
            //5.1 verificar si es mayor o menor y escoger un lado
            if(personas.get(mid).getName().compareTo(name) <= 0){
                //5.2 actualizo el limit XXXX
                lo = mid + 1;
            } else {
                //5.2 actualizo el limit YYYY
                hi = mid - 1;
            }
            
        }
        return -1;
    }

    public int findByAge(int age){
        this.personas = new ArrayList<>(personas);
        personas.sort((p1,p2)-> Integer.compare(p1.getAge(),p2.getAge()));
        int lo =0;
        int hi =0;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(personas.get(mid).getAge() == age){
                return mid;
            }
            if (personas.get(mid).getAge()<age){
                lo = mid+1;

            } else {
                hi = mid -1;
            }
        }
        return -1;
    } 

}
