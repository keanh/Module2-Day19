
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlNews {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://dantri.com.vn/the-gioi.htm");
        Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
        scanner.useDelimiter("\\Z");
        String content = scanner.next();
        scanner.close();
        content = content.replaceAll("//n+"," ");
        Pattern pattern = Pattern.compile("<b> (.*?)</b>");
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()){
            System.out.println(matcher.group(1));
        }
    }
}
