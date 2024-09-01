import java.util.HashMap;

public class KthDistinctString {
    public static String kthDistinct(String[] arr, int k) {
        if (arr.length == 0 || k > arr.length) {
            return "";
        }

        HashMap<String, Integer> map = new HashMap<>();

        for (String str : arr) {
            if(map.containsKey(str)){
                map.put(str, map.get(str)+1);
            }else{
                map.put(str, 1);
            }
        }

        for(String str:arr){
            if(map.get(str)==1){
                k--;
            }
            if(k==0){
                return str;
            }
        }

        return "";
    }
    public static void main(String[] args) {
        String str = kthDistinct(new String[] {"d","b","c","b","c","a"}, 2);
        System.out.println(str);
    }
}