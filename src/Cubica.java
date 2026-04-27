public class Cubica {
    void buscarTriosQueSumen(int[] arr, int sumaObjetivo) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == sumaObjetivo) {
                        System.out.println("Encontrado: " + arr[i] + "+" + arr[j] + "+" + arr[k]);
                    }
                }
            }
        }
    }

}
