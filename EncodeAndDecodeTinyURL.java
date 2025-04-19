public class EncodeAndDecodeTinyURL {

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        StringBuilder str = new StringBuilder();
        for (char ch : longUrl.toCharArray()) {
            str.append((char) (ch + 1));
        }
        return str.toString();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        StringBuilder str = new StringBuilder();
        for (char ch : shortUrl.toCharArray()) {
            str.append((char) (ch - 1));
        }
        return str.toString();
    }
}