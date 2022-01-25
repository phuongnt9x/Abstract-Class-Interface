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
			Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
			scanner.useDelimiter("\\Z");
			String content = scanner.next();
			scanner.close();
			content = content.replaceAll("\\n+", "");
			Pattern pattern = Pattern.compile(
					"<div class=\\\"article-excerpt\\\"> <a [A-z-=\\\"\\s/\\d\\.]+>([\\d\\(\\)\\,\\.aAàÀảẢãÃáÁạẠăĂằẰẳẲẵẴắẮặẶâÂầẦẩẨẫẪấẤậẬbBcCdDđĐeEèÈẻẺẽẼéÉẹẸêÊềỀểỂễỄếẾệỆ fFgGhHiIìÌỉỈĩĨíÍịỊjJkKlLmMnNoOòÒỏỎõÕóÓọỌôÔồỒổỔỗỖốỐộỘơƠờỜởỞỡỠớỚợỢpPqQrRsStTu\\-UùÙủỦũŨúÚụỤưƯừỪửỬữỮứỨựỰvVwWxXyYỳỲỷỶỹỸýÝỵỴzZ]*)</a");
			Matcher matcher = pattern.matcher(content);
			while (matcher.find()) {
				System.out.println(matcher.group(1));
				System.out.println("-----------------------");
			}
			System.out.println();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
