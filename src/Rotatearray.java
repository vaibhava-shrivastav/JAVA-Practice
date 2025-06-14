public class Rotatearray {
    //leetcode question rotate array by k position from right
    // Reverses elements from index s to l in the array
    public void reverse(int[] n, int s, int l) {
        while (s < l) {
            int temp = n[s];
            n[s] = n[l];
            n[l] = temp;
            s++;
            l--;
        }
    }

    // Rotates the array to the right by k positions
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0) return;

        k = k % nums.length;

        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, 0, nums.length - 1);
    }

    // Main method
    public static void main(String[] args) {
        Rotatearray ra = new Rotatearray();
        int[] arr = {1, 2, 3, 4,5,6,7};
        ra.rotate(arr, 2);

        // Print rotated array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
