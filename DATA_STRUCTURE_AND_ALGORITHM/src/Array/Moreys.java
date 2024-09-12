package Array;

/**
 *
 * @author khushi pandey
 */
public class Moreys {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1};

        int candidate = findCandidate(arr);
        if (isMajority(arr, candidate)) {
            System.out.println("Majority element: " + candidate);
        } else {
            System.out.println("No majority element found");
        }
    }

    // Function to find the candidate for the majority element
    public static int findCandidate(int[] arr) {
        int point = 0;
        int cnt = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[point]) {
                cnt++;
            } else {
                cnt--;
            }

            if (cnt == 0) {
                point = i;
                cnt = 1;
            }
        }

        return arr[point];
    }

    // Function to check if the candidate is actually the majority element
    public static boolean isMajority(int[] arr, int candidate) {
        int cnt = 0;
        for (int num : arr) {
            if (num == candidate) {
                cnt++;
            }
        }
        return cnt > arr.length / 2;
    }
}
