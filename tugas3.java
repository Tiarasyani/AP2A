/*
 * Nama  :   Tiarasyani Junia Bahri
 * NPM   :   51424335
 * Kelas :   1IA20
 * Tugas :   3
 */


import java.util.*;

public class tugas3 {
    
    public static void cariDuplikat1D(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.putIfAbsent(arr[i], new ArrayList<>());
            map.get(arr[i]).add(i);
        }

        int counter = 1;
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            if (entry.getValue().size() > 1) {
                System.out.println("Elemen ganda " + counter + ": " + entry.getKey());
                System.out.print("Lokasi : ");
                for (int idx = 0; idx < entry.getValue().size(); idx++) {
                    System.out.print("[" + entry.getValue().get(idx) + "]");
                    if (idx < entry.getValue().size() - 1)
                        System.out.print(" dan ");
                }
                System.out.println("\n");
                counter++;
            }
        }
    }

    public static void cariDuplikat2D(int[][] arr) {
        Map<Integer, List<String>> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                map.putIfAbsent(arr[i][j], new ArrayList<>());
                map.get(arr[i][j]).add("[" + i + "][" + j + "]");
            }
        }

        int counter = 1;
        for (Map.Entry<Integer, List<String>> entry : map.entrySet()) {
            if (entry.getValue().size() > 1) {
                System.out.println("Elemen ganda " + counter + ": " + entry.getKey());
                System.out.print("Lokasi : ");
                for (int idx = 0; idx < entry.getValue().size(); idx++) {
                    System.out.print(entry.getValue().get(idx));
                    if (idx < entry.getValue().size() - 1)
                        System.out.print(" dan ");
                }
                System.out.println("\n");
                counter++;
            }
        }
    }

    public static void main(String[] args) {
        // Contoh array 1D
        int[] array1D = {12, 5, 12, 1, 1};
        System.out.println("Output 1D:");
        cariDuplikat1D(array1D);

        // Contoh array 2D
        int[][] array2D = {
            {4, 8, 10, 12},
            {9, 10, 12, 7}
        };
        System.out.println("Output 2D:");
        cariDuplikat2D(array2D);
    }
}
