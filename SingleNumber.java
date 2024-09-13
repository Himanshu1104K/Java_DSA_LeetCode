
public class SingleNumber {

    public int singleNumber(int[] nums) {
        int num = 0;
        for (var no : nums) {
            num = num ^ no;
        }
        return num;
    }

    public static void main(String[] args) {

    }
}
