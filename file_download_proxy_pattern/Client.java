package file_download_proxy_pattern;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Client {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter URL to download:");
		String url = sc.nextLine();
		System.out.println(url);
		Matcher m = Pattern.compile("^.*\\/(.*\\..*)$").matcher(url);
		String dest = "";
		if (m.find())
			dest = m.group(1);
		System.out.println(dest);
		FileDownloaderProxy fileDownload = new FileDownloaderProxy();

		fileDownload.download(url, dest);
		System.out.println("Download successful !");
	}
}
