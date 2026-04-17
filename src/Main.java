
void main() {
    ArrayList<String> lista = new ArrayList<>(Arrays.asList(
            "ajolote", "hermano", "ajo","Diego"));
    System.out.println("  Antes  : " + lista);
    metodosStrings.filtroSelectivo(lista, 'a', 5);
    System.out.println("  Después: " + lista);
    System.out.println(metodosStrings.convertidorAMayusculas(lista));

    ArrayList<Integer> numeros = new ArrayList<>();
    for (int i=0; i<10; i++){
        numeros.add(i);
        numeros.add(i);
    }

    System.out.println(metodosInt.cuadradosUnicos(numeros));
    System.out.println(metodosStrings.mapaLongitudes(lista));
    HashMap<String,Double> inventario= new HashMap<>();
    inventario.put("Gan 251m Pro",34.99);
    inventario.put("Gan Megaminx Maglev v2",47.99);
    inventario.put("Weilong V11 8mg", 41.99);
    metodosStrings.catalogo(inventario);

}
