package Array;

public class AscendingOrder {

	public static void main(String[] args) {
		int[] arr = {8,1, 3, 5, 7};   // ascending array
        boolean sorted = true;     // assume array is sorted

        for (int i = 0; i < arr.length - 1; i++) {
            // compare current element with next element
            if (arr[i] > arr[i + 1]) {   
                sorted = false;    // condition breaks ascending order
                break;
            }
        }

        if (sorted)
            System.out.println("Array is sorted in ascending order");
        else
            System.out.println("Array is NOT sorted in ascending order");
    }
}
