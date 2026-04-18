import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Collectors;


public class metodosStrings {

    //Método 2
    public static void filtroSelectivo(ArrayList<String> lista, char letra, int longitud){
        if (lista == null || lista.isEmpty()){
            return;
        }
            lista.removeIf(s -> s == null || s.isEmpty() ||
                    Character.toLowerCase(s.charAt(0)) == letra || s.length() < longitud);
    }

    //Método 3
    public static ArrayList<String> convertidorAMayusculas(ArrayList<String> lista){
        ArrayList<String> mayusculas = new ArrayList<>();
        if (lista == null || lista.isEmpty()) return mayusculas;
        lista.stream()
                .map(s -> s == null ? null : s.toUpperCase()).forEach(mayusculas::add);
        return mayusculas;

    }

    //Método 5
    public static HashMap<String,Integer> mapaLongitudes(ArrayList<String> lista){
        if (lista == null || lista.isEmpty()){
            return new HashMap<>();
        }
        return (HashMap<String, Integer>) lista.stream()
                .filter(s -> s != null)
                .collect(Collectors.toMap(s -> s, s -> s.length()));
    }

    //Método 6
    public static void catalogo(HashMap<String,Double> inventario){
        if (inventario == null || inventario.isEmpty()){
            return;
        }
        inventario.entrySet().stream().forEach(e -> {
            System.out.println(e.getKey());
            System.out.println(e.getValue() == null ? null : e.getValue() * 0.9);
        });
    }

    //Método 7
    public static HashMap<String,Integer> contadorDeFrecuencias(ArrayList<String> lista){
        HashMap<String,Integer> frecuencias= new HashMap<>();
        if (lista == null || lista.isEmpty()){
            return frecuencias;
        }
        lista.forEach(palabra->frecuencias.merge(palabra,1,(valorViejo,uno)->valorViejo+uno));
        return frecuencias;
    }

    //Método 8
    public static ArrayList<String> filtradorDeFrecuencias(HashMap<String,Integer> frecuencias, int umbral){
        if (frecuencias == null || frecuencias.isEmpty()) return new ArrayList<>();
        return frecuencias.entrySet().stream()
                .filter(frecuencia->frecuencia.getValue()>=umbral)
                .map(frecuencia->frecuencia.getKey())
                .collect(Collectors.toCollection(ArrayList::new));
    }

    //Método 9
    public static HashSet<String> deDuplicador(String frase, int umbral){
        if (frase == null || frase.isEmpty()) return new HashSet<>();
        return Arrays.stream(frase.split("\\W"))
                .filter(palabra -> palabra != null && !palabra.isEmpty() && palabra.length() >= umbral)
                .map(String::toLowerCase)
                .collect(Collectors.toCollection(HashSet::new));
    }
}
