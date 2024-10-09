public class MinAddtoMakeStringValid {
    public int minAddToMakeValid(String s) {
        int ans = 0;
        int mismatch = 0;
        for (var ch : s.toCharArray()) {
            if (ch == '(') {
                ans++;
            } else{
                if (ans>0){
                    ans--;
                }else{
                    mismatch++;
                }
            }
        }
        return mismatch+ans;
    }
}