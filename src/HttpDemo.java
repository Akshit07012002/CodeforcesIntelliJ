import java.io.*;
import java.net.*;
//import com.fasterxml.jackson.databind.ObjectMapper;

public class HttpDemo {
    public static void main(String[] args) throws IOException {

        // Creation of a neat value object to hold the url
        URL url = new URL("https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY");

        // Open connection on the url and cast the response
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        // Now, set headers, requests etc
        connection.setRequestProperty("accept", "application/json");

        // Make the request
        InputStream responseStream = connection.getInputStream();

        System.out.println(responseStream.toString());


    }
}
