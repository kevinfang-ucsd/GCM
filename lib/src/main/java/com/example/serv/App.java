package com.example.serv;

/**
 * Created by Agneev on 22-04-2016.
 */
import com.example.server.vo.Content;

public class App {
    public static void main(String[] args) {

        System.out.println("Sending POST to GCM");

        String apiKey = "AIzaSyAFoYzxAOStqAkBReqedUwmDNbPuo2r8jU";
        Content content = createContent();

        Post2Gcm.post(apiKey, content);
    }

    public static Content createContent() {
        Content c = new Content();

        c.addRegId("APA91bFzTrqxwWwEKi72eHULKQVDWlpglFgXJ3joMbCa3J8RgKZZTj3KZc8zqh3YPkSYjhQK9rDImKfBgLxSB6rmq6Z_e0XfXWERdUODsSlQHXnsQRk1Y_JegBnnvL9fznbr1RHH_nyD");

        c.createData("Working!!", "Test message");

        return c;
    }
}

