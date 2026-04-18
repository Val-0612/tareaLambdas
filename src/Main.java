void main() {

    // Método 1: elMultiplicador
    ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    System.out.println("elMultiplicador");
    System.out.println("  Antes : " + nums);
    metodosInt.elMultiplicador(nums, 3);
    System.out.println("  Después (x3): " + nums);
    metodosInt.elMultiplicador(new ArrayList<>(), 3); // lista vacía, no explota
    metodosInt.elMultiplicador(null, 3);              // nulo, no explota

    // Método 2: filtroSelectivo
    ArrayList<String> palabras = new ArrayList<>(Arrays.asList("ajolote", "hermano", "ajo", "Diego", "sol"));
    System.out.println("\nfiltroSelectivo (letra='a', longitud=5)");
    System.out.println("  Antes : " + palabras);
    metodosStrings.filtroSelectivo(palabras, 'a', 5);
    System.out.println("  Después: " + palabras);
    metodosStrings.filtroSelectivo(new ArrayList<>(), 'a', 5); // lista vacía, no explota

    // Método 3: convertidorAMayusculas
    ArrayList<String> lista3 = new ArrayList<>(Arrays.asList("hermano", "Diego", "banana"));
    System.out.println("\nconvertidorAMayusculas");
    System.out.println("  Entrada : " + lista3);
    System.out.println("  Salida  : " + metodosStrings.convertidorAMayusculas(lista3));
    System.out.println("  Original sin cambios: " + lista3);
    System.out.println("  Lista vacía: " + metodosStrings.convertidorAMayusculas(new ArrayList<>()));
    System.out.println("  Lista nula : " + metodosStrings.convertidorAMayusculas(null));

    // Método 4: cuadradosUnicos
    ArrayList<Integer> nums4 = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3, 4, -3));
    System.out.println("\ncuadradosUnicos");
    System.out.println("  Entrada: " + nums4);
    System.out.println("  Salida : " + metodosInt.cuadradosUnicos(nums4));
    System.out.println("  Lista vacía: " + metodosInt.cuadradosUnicos(new ArrayList<>()));
    System.out.println("  Lista nula : " + metodosInt.cuadradosUnicos(null));

    // Método 5: mapaLongitudes
    ArrayList<String> lista5 = new ArrayList<>(Arrays.asList("hermano", "banana", "sol"));
    System.out.println("\nmapaLongitudes");
    System.out.println("  Entrada: " + lista5);
    System.out.println("  Salida : " + metodosStrings.mapaLongitudes(lista5));
    System.out.println("  Lista vacía: " + metodosStrings.mapaLongitudes(new ArrayList<>()));
    System.out.println("  Lista nula : " + metodosStrings.mapaLongitudes(null));

    // Método 6: catalogo
    HashMap<String, Double> inventario = new HashMap<>();
    inventario.put("Gan 251m Pro", 34.99);
    inventario.put("Gan Megaminx Maglev v2", 47.99);
    inventario.put("Weilong V11 8mg", 41.99);
    System.out.println("\ncatalogo (precios con 10% de descuento)");
    metodosStrings.catalogo(inventario);
    metodosStrings.catalogo(new HashMap<>()); // vacío, no explota
    metodosStrings.catalogo(null);            // nulo, no explota

    // Método 7: contadorDeFrecuencias
    ArrayList<String> lista7 = new ArrayList<>(
            Arrays.asList("ajo", "Hermano", "Diego", "Diego", "ajo", "Diego", "ajo"));
    System.out.println("\ncontadorDeFrecuencias");
    System.out.println("  Entrada: " + lista7);
    HashMap<String, Integer> frecuencias = metodosStrings.contadorDeFrecuencias(lista7);
    System.out.println("  Salida : " + frecuencias);
    System.out.println("  Lista vacía: " + metodosStrings.contadorDeFrecuencias(new ArrayList<>()));
    System.out.println("  Lista nula : " + metodosStrings.contadorDeFrecuencias(null));

    // Método 8: filtradorDeFrecuencias
    System.out.println("\nfiltradorDeFrecuencias");
    System.out.println("  Frecuencias: " + frecuencias);
    System.out.println("  Umbral 1: " + metodosStrings.filtradorDeFrecuencias(frecuencias, 1));
    System.out.println("  Umbral 3: " + metodosStrings.filtradorDeFrecuencias(frecuencias, 3));
    System.out.println("  Mapa vacío: " + metodosStrings.filtradorDeFrecuencias(new HashMap<>(), 1));
    System.out.println("  Mapa nulo : " + metodosStrings.filtradorDeFrecuencias(null, 1));

    // Método 9: deDuplicador
    System.out.println("\ndeDuplicador");
    System.out.println("  Frase: \"hola como estamos flipo flipo chaval\" (umbral=5)");
    System.out.println("  Salida: " + metodosStrings.deDuplicador("hola como estamos flipo flipo chaval", 5));
    System.out.println("  Frase vacía: " + metodosStrings.deDuplicador("", 3));
    System.out.println("  Frase nula : " + metodosStrings.deDuplicador(null, 3));

    // Método 10: topeFrecuencias
    System.out.println("\ntopeFrecuencias");
    System.out.println("  Antes (maxFreq=3): " + frecuencias);
    metodosInt.topeFrecuencias(frecuencias, 3);
    System.out.println("  Después          : " + frecuencias);
    metodosInt.topeFrecuencias(new HashMap<>(), 3); // vacío, no explota
    metodosInt.topeFrecuencias(null, 3);            // nulo, no explota
}
