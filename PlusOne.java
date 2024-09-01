
public class PlusOne {

    public static int[] plusOne(int[] digits) {
        int carry = (digits[digits.length - 1] + 1) / 10;
        digits[digits.length - 1] = ((digits[digits.length - 1] + 1) % 10);
        if (carry == 0) {
            return digits;
        }else{
            for(int i = digits.length-2;i>=0 &&  carry!=0;i--){
                int bit = (digits[i]+carry)%10;
                carry = (digits[i]+carry)/10;
                digits[i] = bit;
            }
            if(carry!=0){
                int newArray[] = new int[digits.length+1];
                newArray[0]= carry;
                for(int i = 1;i<newArray.length;i++){
                    newArray[i] = digits[i-1];
                }
                return  newArray;
            }
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] list = plusOne(new int[]{9});
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
