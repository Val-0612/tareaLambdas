//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    ArrayList<String> lista = new ArrayList<>(Arrays.asList(
            "ajolote", "hermano", "ajo","Diego"));
    System.out.println("  Antes  : " + lista);
    metodosStrings.filtroSelectivo(lista, 'a', 5);
    System.out.println("  Después: " + lista);

    System.out.println(metodosStrings.convertidorAMayusculas(lista));
}
