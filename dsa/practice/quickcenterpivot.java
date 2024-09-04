public class quickcenterpivot {
            // Partition method: rearranges the array by placing elements smaller than the pivot 
        // on the left side and larger elements on the right side.
        public static int partition(int arr[], int low, int high) {
            int mid = low + (high - low) / 2; // Calculate the middle index
            int pivot = arr[mid]; // Choose the middle element as the pivot
            
            // Swap the middle element with the last element to use the same partition logic
            int temp = arr[mid];
            arr[mid] = arr[high];
            arr[high] = temp;
    
            int i = low - 1; // Index of the smaller element, initially set to one before the first element
    
            // Traverse the array from the low index to one before the high index (pivot)
            for (int j = low; j < high; j++) {
                // If the current element is smaller than the pivot
                if (arr[j] < pivot) {
                    i++; // Increment the index of the smaller element
                    
                    // Swap the current element with the element at index i
                    int tempSwap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tempSwap;
                }
            }
            
            // Place the pivot element in its correct sorted position
            i++;
            temp = arr[i];
            arr[i] = arr[high];
            arr[high] = temp;
    
            // Return the index of the pivot element
            return i;
        }
    
        // QuickSort method: recursively sorts the array by partitioning it and sorting the sub-arrays
        public static void quickSort(int arr[], int low, int high) {
            if (low < high) { // Base case: if low is less than high, continue sorting
                int pidx = partition(arr, low, high); // Get the pivot index from the partitioning
    
                // Recursively apply quickSort to the left sub-array
                quickSort(arr, low, pidx - 1);
    
                // Recursively apply quickSort to the right sub-array
                quickSort(arr, pidx + 1, high);
            }
        }
    
        public static void main(String args[]) {
            int[] arr = {6, 3, 9, 5, 2, 8}; // Initialize an unsorted array
            int n = arr.length; // Get the length of the array
    
            // Call quickSort on the entire array
            quickSort(arr, 0, n - 1);
    
            // Print the sorted array
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " "); // Print each element followed by a space
            }
            System.out.println(); // Print a newline after the array is fully printed
        }
    }
