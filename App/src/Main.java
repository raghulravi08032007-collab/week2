import java.util.*;

public class MainApp {

    public static void main(String[] args) {

        // 🔹 Transaction Sorting
        List<Transaction> list = new ArrayList<>();
        list.add(new Transaction("T1", 10.5, "10:00"));
        list.add(new Transaction("T2", 25.0, "09:30"));
        list.add(new Transaction("T3", 5.0, "10:15"));

        TransactionSort.bubbleSort(list);
        System.out.println("Transactions Sorted:");
        for (Transaction t : list) {
            System.out.println(t.id + " " + t.fee);
        }

        // 🔹 Merge Sort
        int[] arr = {500, 100, 300};
        MergeQuickSort.mergeSort(arr, 0, arr.length - 1);
        System.out.println("Merge Sorted: " + Arrays.toString(arr));

        // 🔹 Search
        System.out.println("Binary Search 300: " +
                SearchOperations.binarySearch(arr, 300));

        // 🔹 Floor & Ceiling
        int[] risk = {10, 25, 50, 100};
        FloorCeil.findFloorCeil(risk, 30);
    }
}