package com.baliwanco.biyahero.gtfs;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class FeedRetriever {
	/**
	 * This class retrieves the zip file containing GTFS data from a specified
	 * URL.
	 */
	private URL feed_url;
	private File feed_file;
	private File save_dir;
	
	public void downloadFeed() throws IOException {
		/**
		 * Downloads the feed from the feed_url and passes the directory
		 * the file is resting on in local space to the feed_file.
		 */
		HttpURLConnection urlConnection = (HttpURLConnection) 
				feed_url.openConnection();
		try {
			// Download the file
			InputStream input;
			int responseCode = urlConnection.getResponseCode();
			if(responseCode == HttpURLConnection.HTTP_OK) {
				input = urlConnection.getInputStream();
			}
			else {
				input = urlConnection.getErrorStream();
			}
			
			// Process the response from the server
			OutputStream output = new FileOutputStream(save_dir.toString() + 
					"gtfs.zip");
			
			byte[] buffer = new byte[8 * 1024];
			int bytesRead;
			while((bytesRead = input.read(buffer)) > 0) {
				output.write(buffer, 0, bytesRead);
			}
			output.close();
		}
		finally {
			urlConnection.disconnect();
			feed_file.renameTo(new File(save_dir.toString() + "gtfs.zip"));
		}
	}

	public URL getFeed_url() {
		return feed_url;
	}

	public void setFeed_url(URL feed_url) {
		this.feed_url = feed_url;
	}

	public File getFeed_file() {
		return feed_file;
	}

	public void setFeed_file(File feed_file) {
		this.feed_file = feed_file;
	}

	public File getSave_dir() {
		return save_dir;
	}

	public void setSave_dir(File save_dir) {
		this.save_dir = save_dir;
	}
}
