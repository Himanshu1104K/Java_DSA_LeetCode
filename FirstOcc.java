public class FirstOcc {
    public static int strStr(String haystack, String needle) {
        if (haystack.contains(needle) == false) {
            return -1;
        }
        
        for(int i = 0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                int j = 0;
                for(;j<needle.length();j++){
                    if(haystack.charAt(i+j)!=needle.charAt(j)){
                        break;
                    }
                }
                if(j==needle.length()){
                    return i;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));
    }
}
