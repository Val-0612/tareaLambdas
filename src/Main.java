
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


}
