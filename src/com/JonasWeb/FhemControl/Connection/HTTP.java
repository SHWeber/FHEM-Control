package com.JonasWeb.FhemControl.Connection;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.function.IntToDoubleFunction;

/**
 * Created by jonas on 14.04.15.
 */
public class HTTP  {

    public static void Main(String url, String request){

        HTTP http = new HTTP();
        try {

        if (request.equalsIgnoreCase("GET")) {

            http.sendGet(url);

        } else if (request.equalsIgnoreCase("POST")) {

            http.sendPost(url);
        }
        } catch (Exception e) {
            System.out.println(e);
        }


    }

    private void sendGet(String url) throws Exception {


        URL obj = new URL(url);
        URLConnection con = obj.openConnection();



        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //print result
        System.out.println(response.toString());

    }


    private void sendPost(String url) throws Exception {


        URL obj = new URL(url);
        URLConnection con = obj.openConnection();






        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        int i = 0;
        boolean isContent = false;

        while ((inputLine = in.readLine()) != null) {


            if (inputLine.equalsIgnoreCase("<pre class=\"log\">")) {
                isContent= true;
                inputLine = in.readLine();
            } else  if (inputLine.equalsIgnoreCase("</pre></div></body></html>")) {
                isContent =false;
            }

            if (isContent) {
                System.out.println(inputLine);
            }

            i++;
        }
        in.close();

        System.out.println(String.valueOf(i));

    }
}
