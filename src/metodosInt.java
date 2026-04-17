import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Collectors;

public class metodosInt {

    //Método 1
    public static void elMultiplicador(ArrayList<Integer> lista, int factor){
        lista.replaceAll(n->n*factor);
    }

    //Método 4
    public static HashSet<Integer> cuadradosUnicos(ArrayList<Integer> lista){
        HashSet<Integer> cuadradosUnicos= (HashSet<Integer>) lista.stream().map(n->n*n).collect(Collectors.toSet());
        return cuadradosUnicos;

    }

    //Método 10
    public static void topeFrecuencias(HashMap<String,Integer> frecuencias, int maxFreq){
        frecuencias.replaceAll((palabra, frecuencia)->frecuencia<=maxFreq?frecuencia:maxFreq);
    }



}
