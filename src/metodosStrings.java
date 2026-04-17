import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;


public class metodosStrings {

    //Método 2
    public static void filtroSelectivo(ArrayList<String> lista, char letra, int longitud){
        lista.removeIf(s -> Character.toLowerCase(s.charAt(0)) == letra
                || s.length() < longitud);

    }

    //Método 3
    public static ArrayList<String> convertidorAMayusculas(ArrayList<String> lista){
        ArrayList<String> mayusculas = new ArrayList<>();
        lista.stream()
                .map(s->s.toUpperCase()).forEach(s -> mayusculas.add(s));
        return mayusculas;

    }

    //Método 5
    public static HashMap<String,Integer> mapaLongitudes(ArrayList<String> lista){
        HashMap<String,Integer> longitudes= (HashMap<String, Integer>) lista.stream()
                .collect(Collectors.toMap(s -> s, s->s.length()));
        return longitudes;


    }

    //Método 6
    public static void catalogo(HashMap<String,Double> inventario){
        inventario.entrySet().stream().forEach(e -> {
            System.out.println(e.getKey());
            System.out.println(e.getValue()*.9);
        });
    }

    //Método 7
    public static HashMap<String,Integer> contadorDeFrecuencias(ArrayList<String> lista){
        HashMap<String,Integer> frecuencias= new HashMap<>();
        lista.forEach(palabra->frecuencias.merge(palabra,1,(valorViejo,uno)->valorViejo+uno));
        return frecuencias;
    }
}
