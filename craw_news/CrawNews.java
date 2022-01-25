package craw_news;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawNews {

	public static void main(String[] args) {
		try {
            URL url = new URL("https://dantri.com.vn/the-gioi.htm");
            // open the stream and put it into BufferedReader
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            // close scanner 
            scanner.close();
            
            // remove all new line
            content = content.replaceAll("\\n+", "");
            
            // regex
//            Pattern p = Pattern.compile("name_song\">(.*?)</a>");
            Pattern p=Pattern.compile("<div class=\"article-excerpt\"> <a [A-z-=\"\\s/\\d\\.]+>(.*)</a> </div>");
            Matcher m = p.matcher(content);
            while (m.find()) {
                System.out.println(m.group(1));
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}
