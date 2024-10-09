public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] image1 : image) {
            int left = 0;
            int right = image1.length - 1;
            while (left < right) {
                int temp = image1[left];
                image1[left] = image1[right];
                image1[right] = temp;
                left++;
                right--;
            }

            for (int i = 0; i < image.length; i++) {
                image1[i] = image1[i] == 0 ? 1 : 0;
            }
        }
        return image;
    }
}
