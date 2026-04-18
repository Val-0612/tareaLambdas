import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Collectors;

public class metodosInt {

    //Método 1
    public static void elMultiplicador(ArrayList<Integer> lista, int factor){
        if (lista == null || lista.isEmpty()){
            return;
        }
        lista.replaceAll(n -> n == null ? null : n * factor);
    }

    //Método 4
    public static HashSet<Integer> cuadradosUnicos(ArrayList<Integer> lista){
        if (lista == null || lista.isEmpty()){
            return new HashSet<>();
        }
        HashSet<Integer> cuadradosUnicos= (HashSet<Integer>) lista.stream().map(n->n*n).collect(Collectors.toSet());
        return cuadradosUnicos;

    }

    //Método 10
    public static void topeFrecuencias(HashMap<String,Integer> frecuencias, int maxFreq){
        if (frecuencias == null || frecuencias.isEmpty()){
            return;
        }
        frecuencias.replaceAll((palabra, frecuencia)->frecuencia == null ? null : (frecuencia <= maxFreq ? frecuencia : maxFreq));
    }



}
