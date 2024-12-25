public class CapitalizeTheTitle {
    public String capitalizeTitle(String title) {
        StringBuilder result = new StringBuilder();
        for (String word : title.split(" ")) {
            if (word.length() > 2) {
                String out = word.toLowerCase();
                result.append(" ").append((out.substring(0, 1).toUpperCase() + out.substring(1)));
            } else {
                result.append(" ").append(word.toLowerCase());
            }
        }
        return result.toString().trim();
    }
}