package com.matskiv;

public class Sorting {
    public static void main(String[] args) {
        //sortingLikeBubble();
        sortingLikeSelectionSort();
    }

    public static void sortingLikeBubble() {
        int[] bubble = new int[]{5, 3, 1, 6, 7, 34, 9, 143, 0, 3, 56};
        int result;

        for (int i = 0; i < bubble.length; i++) {
            for (int j = 1; j < bubble.length; j++) {
                if (bubble[j - 1] > bubble[j]) {
                    result = bubble[j - 1];
                    bubble[j - 1] = bubble[j];
                    bubble[j] = result;
                }

            }
        }

        for (int k = 0; k < bubble.length; k++) {
            System.out.println(bubble[k]);

        }
    }

    public static void sortingLikeSelectionSort() {
        int[] bubble = new int[]{5, 3, 1, 6, 7, 34, 9, 143, 0, 3, 56};
        int result;

        for (int i = 0; i < bubble.length; i++) {
            for (int j = 0; j < bubble.length; j++) {
                if (bubble[j] > bubble[i]) {
                    result = bubble[i];
                    bubble[i] = bubble[j];
                    bubble[j] = result;
                }
            }
        }
        for (int k = 0; k < bubble.length; k++) {
            System.out.println(bubble[k]);
        }
    }
}

