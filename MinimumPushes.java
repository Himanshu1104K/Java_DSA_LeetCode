import java.util.*;

public class MinimumPushes {
    // public static int minimumPushes(String word) {
    // if (word.length() == 0 || word.length() == 1) {
    // return word.length();
    // }
    // HashMap<Character, Integer> map = new HashMap<>();
    // for (char ch : word.toCharArray()) {
    // if (map.containsKey(ch)) {
    // map.put(ch, map.get(ch) + 1);
    // } else {
    // map.put(ch, 1);
    // }
    // }
    // System.out.println(map);
    // int out = 0;
    // int i = 0;
    // List<Integer> l1 = new ArrayList<>(map.values());
    // Collections.sort(l1);
    // for (int j = l1.size()-1;j>=0;j--) {
    // if (i < 8) {
    // out = out + 1 * l1.get(j);
    // } else if (i < 16) {
    // out = out + 2 * l1.get(j);
    // } else if(i<24) {
    // out = out + 3 * l1.get(j);
    // }else{
    // out = out + 4*l1.get(j);
    // }
    // i++;
    // }
    // return out;
    // }

    public static int minimumPushes(String word) {
        int arr[] = new int[26];
        for (char ch : word.toCharArray()) {
            arr[ch - 'a'] += 1;
        }
        int i = 1;
        int out = 0;
        int std = 1;
        Arrays.sort(arr);
        for (int j = arr.length - 1; j >= 0; j--) {
            if (arr[j] != 0) {
                out = out + std*arr[j];
                if (i % 8 == 0) {
                    std++;
                }
                i++;
            }
        }
        return out;
    }

    public static void main(String[] args) {
        System.out.println(minimumPushes("xyzxyzxyzxyz"));
    }
}