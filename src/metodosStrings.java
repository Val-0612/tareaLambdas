import java.util.ArrayList;

public class metodosStrings {

    //Método 2
    public static void filtroSelectivo(ArrayList<String> lista, char letra, int longitud){
        lista.removeIf(s -> Character.toLowerCase(s.charAt(0)) == letra
                || s.length() < longitud);

    }
}
