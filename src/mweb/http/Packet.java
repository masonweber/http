/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mweb.http;

import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Mason
 */
public class Packet {

    public Packet() {
        try {
            URL testURL = new URL("www.google.com");
            URLConnection connection = testURL.openConnection();
            OutputStream out = connection.getOutputStream();
            System.out.println(out.toString());
        } catch (Exception e) {

        }
    }
    //http method

    //url/uri
    public Packet(String s) {

    }
    //http headers
    //http body
    //accept headers/content negotiation
    //user agent
    //---------
    //status code
    //headers
    //body
    //content type
    //content length
}
