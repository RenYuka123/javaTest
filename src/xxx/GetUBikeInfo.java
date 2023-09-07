package xxx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetUBikeInfo {
	public static final String UBIKE_URL = "https://tcgbusfs.blob.core.windows.net/dotapp/youbike/v2/youbike_immediate.json";

	public static void main(String[] args) throws IOException {
		URL url = new URL(UBIKE_URL);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		if (con.getResponseCode() == HttpURLConnection.HTTP_OK) {
			InputStream is = con.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			StringBuilder sb = new StringBuilder();
			String data;
			while ((data = br.readLine()) != null) {
				sb.append(data);
			}
			
			System.out.println(sb);
			
			br.close();
			isr.close();
			is.close();
			
		} else {
			System.out.println("...");
		}
	}
}
