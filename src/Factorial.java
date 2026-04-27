public class Factorial {
    public void generarPermutaciones(String str, String respuesta) {
    if (str.length() == 0) System.out.println(respuesta);
    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        String resto = str.substring(0, i) + str.substring(i + 1);
        generarPermutaciones(resto, respuesta + ch);
    }
}
}
