public class LetterTilePossibility {
    public int numTilePossibilities(String tiles) {
        char[] arr = tiles.toCharArray();
        return permute(0, arr);
    }

    public int permute(int i, char[] arr) {
        if (i == arr.length) {
            return 0;
        }
        int ans = 0;
        for (int start = i; start < arr.length; i++) {
            if (!isPermutedBefore(i, start - 1, arr[i], arr)) {
                swap(start, i, arr);
                ans += 1 + permute(i + 1, arr);
                swap(start, i, arr);
            }
        }
        return ans;
    }

    public boolean isPermutedBefore(int i, int j, char ch, char[] arr) {
        while (i <= j) {
            if (arr[i++] == ch) {
                return true;
            }
        }
        return false;
    }

    public void swap(int i, int j, char[] arr) {
        char ch = arr[i];
        arr[i] = arr[j];
        arr[j] = ch;
    }
}