public class SeniorCitizen {
    public static int countSeniors(String[] details) {
        if(details.length==0){
            return 0;
        }
        int count = 0;
        for(int i =0 ; i<details.length;i++){
            if(details[i].substring(11,13).compareTo("60")==0){
                continue;
            }
            if(details[i].charAt(11)>='6' && details[i].charAt(12)>='0'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countSeniors(new String[] {"5612624052M0130","5378802576M6424","5447619845F0171","2941701174O9078"}));
    }
}
