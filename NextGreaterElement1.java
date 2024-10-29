public class NextGreaterElement1 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for (int i = 0; i < nums1.length; i++) {
            int element = nums1[i];
            int j = 0;
            while (j < nums2.length && nums2[j] != element) {
                j++;
            }

            int largest = -1;
            for (; j < nums2.length; j++) {
                if (nums2[j] > element) {
                    largest = nums2[j];
                    break;
                }
            }
            nums1[i] = largest;
        }
        return nums1;
    }
}
