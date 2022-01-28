package file_download_proxy_pattern;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class FileDownloader implements Downloader {
	public String UserAgent;

	public FileDownloader(String userAgent) {
		UserAgent = userAgent;
	}

	@Override
	public void download(String url, String dest) {
		try {
			URLConnection connection = new URL(url).openConnection();
			connection.setRequestProperty("User-Agent", UserAgent);
			System.out.println("Downloading ...");
			OutputStream os = new FileOutputStream(new File(dest));
			BufferedOutputStream bos = new BufferedOutputStream(os);
			InputStream in = connection.getInputStream();
			byte[] buffer = new byte[1024];

			int numRead;
			long numWritten = 0;

			while ((numRead = in.read(buffer)) != -1) {
				bos.write(buffer, 0, numRead);
				numWritten += numRead;
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
