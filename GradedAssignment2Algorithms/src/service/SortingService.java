package service;

public class SortingService {
    /* Created by SDixit-MSC on 15-07-2023 inside the package - service
     *   @Author - SDixit-MSC
     */

    public static int[] sortAscending(int[] array) {
            int n = array.length;

            // One by one move boundary of unsorted subarray
            for (int i = 0; i < n-1; i++)
            {
                // Find the minimum element in unsorted array
                int min_idx = i;
                for (int j = i+1; j < n; j++)
                    if (array[j] < array[min_idx])
                        min_idx = j;

                // Swap the found minimum element with the first
                // element
                int temp = array[min_idx];
                array[min_idx] = array[i];
                array[i] = temp;
            }

            return array;

    }public static int[] sortDescending(int[] array) {

        int n = array.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
            {
                // Find the minimum element in unsorted array
                int max_idx = i;
                for (int j = i+1; j < n; j++)
                    if (array[j] > array[max_idx]) {
                        max_idx = j;
                    }

                // Swap the found minimum element with the first
                // element
                int temp = array[max_idx];
                array[max_idx] = array[i];
                array[i] = temp;
            }

        return array;

    }
}
