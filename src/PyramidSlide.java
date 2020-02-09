public class PyramidSlide {
    public static void main(String[] args) {
        int [][]arr={{3}, {7, 4}, {2, 4, 6}, {8, 5, 9, 3}};

        System.out.println(prog(arr));
    }

    public static int prog(int[][] arr) {
        int j = 0;
        int k = 0;

        int result = arr[j][k];
        for (int i = 1; i < arr.length; i++) {
            if (arr[j + 1][k] > arr[j + 1][k + 1]) {
                result += arr[j + 1][k];
                j++;
            } else {
                result+=arr[j + 1][k + 1];
                j++;
                k++;
            }
        }
        return result;
    }
}
