import java.util.ArrayList;
import java.util.List;

public class Q535 {
    List<String> url=new ArrayList<String>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        url.add(longUrl);
        return String.valueOf(url.size()-1);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return url.get(Integer.valueOf(shortUrl));
    }
}
