package OfficeHours;

import java.util.Arrays;

public class Problem_5 {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = new int[]{3, 7, 3, 1, 2};

        int [] result = Solution(array2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] Solution(int[] array) {
        int[] result = new int[array.length];
        int currentIndex = 0;

        //me
        while (currentIndex < array.length){
            int resultOfMultiplications = 1;
            for (int i = 0; i < array.length; i++){
                if (currentIndex != i){
                    resultOfMultiplications *= array[i];
                }
            }
            result[currentIndex] = resultOfMultiplications;
            currentIndex++;
        }

        //ChatGPT
        for (int i = 0; i < array.length; i++){
            int resultOfMultiplications = 1;
            for (int j = 0; j < array.length; j++){
                if (i != j){
                    resultOfMultiplications *= array[j];
                }
            }
            result[i] = resultOfMultiplications;
        }

        return result;
    }
}
