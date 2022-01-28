package file_download_proxy_pattern;

import java.net.URL;

public interface Downloader {
	void download(String url,String dest);

}
