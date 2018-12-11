package com.lnu.social.mashup;

import com.google.gson.Gson;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@Service
public class WebGenomicsClient {
    private final String HOST = "websitegenomics.trafficmanager.net";
    private final String BASE_URL = "http://" + HOST + "/Classify/?uri=";

    /**
     *
     * @param url The target website
     * @return
     * @throws IOException
     */
    public Analysis getGenomics(String url) throws IOException {
        Analysis result = null;
        //Build final request URI
        String uri = BASE_URL.concat(url);
        //GET the JSON result from the WebGenomics
        String content = makeRequest(uri);
        //Deserialize to Analysis class
        result = new Gson().fromJson(content, Analysis.class);
        return result;
    }

    public static String makeRequest(String requestUrl) throws IOException {
        URL url = new URL(requestUrl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8");
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setRequestProperty("Accept-Encoding", "gzip, deflate");

        InputStream in = (conn.getResponseCode() / 100 == 2 ? conn.getInputStream() : conn.getErrorStream());


        // Read the response
        BufferedReader replyReader =
                new BufferedReader
                        (new InputStreamReader
                                (conn.getInputStream()));
        String line;
        String replyString = "";
        while ((line = replyReader.readLine()) != null) {
            replyString = replyString.concat(line + "\n");
        }

        replyReader.close();

        return replyString;

    }
}
