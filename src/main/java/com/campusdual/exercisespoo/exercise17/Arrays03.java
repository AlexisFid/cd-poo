package com.campusdual.exercisespoo.exercise17;

public class Arrays03 {

    public static void main(String[] args) {
        // Array unidimensional
        int[] intArrayUni = {1, 2, 3, 4, 5};

        // Array biidimensional
        int[][] intArrayBi = {
                {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}
        };

        // Array Tridimensional
        int[][][] intArrayTri = {
                {{1, 1, 1, 1, 1}, {2, 2, 2, 2, 2}, {3, 3, 3, 3, 3}, {4, 4, 4, 4, 4}, {5, 5, 5, 5, 5},
                {1, 1, 1, 1, 1}, {2, 2, 2, 2, 2}, {3, 3, 3, 3, 3}, {4, 4, 4, 4, 4}, {5, 5, 5, 5, 5},
                {1, 1, 1, 1, 1}, {2, 2, 2, 2, 2}, {3, 3, 3, 3, 3}, {4, 4, 4, 4, 4}, {5, 5, 5, 5, 5},
                {1, 1, 1, 1, 1}, {2, 2, 2, 2, 2}, {3, 3, 3, 3, 3}, {4, 4, 4, 4, 4}, {5, 5, 5, 5, 5},
                {1, 1, 1, 1, 1}, {1, 2, 2, 2, 2}, {3, 3, 3, 3, 3}, {4, 4, 4, 4, 4}, {5, 5, 5, 5, 5}}
        };

        //Recorrido del array Uni
        for( int i = 0; i < intArrayUni.length; i++){
            System.out.print(intArrayUni[i] + " ");
        };

        //Recorrido del array Bi
        System.out.println("\n\nBidimensional");
        for( int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++){
                System.out.print(intArrayBi[i][j] + " ");
            }
            System.out.println();
        };

        //Recorrido del array Tri
        System.out.println("\n\nSuma Tridimensional");
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                int val = 0;
                for (int k = 0; k < 5; k++){
                    val+= intArrayTri[i][j][k];
                }
                System.out.print(val+ " ");
            }
            System.out.println();
        };
    }
}
