package file_download_proxy_pattern;

import java.net.URL;

public class FileDownloaderProxy implements Downloader {
	FileDownloader fileDownloader;

	public FileDownloaderProxy() {
		String userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:96.0) Gecko/20100101 Firefox/96.0";
		this.fileDownloader = new FileDownloader(userAgent);
	}

	@Override
	public void download(String url, String dest) {
		fileDownloader.download(url, dest);

	}

}
