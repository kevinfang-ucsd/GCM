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

        c.addRegId("APA91bHHv4xSM1a7moHADVIXJPfHcrZ1oWUiir-oxPUkOkxz0z7A0idv0KlijBB590lJN3eu1hL29Ibbt_Ekw86WwKam341cKBrpHopO-08jJScapYJt2HjIXNkn2Dw7QzCtar2qofV3");

        c.createData("Working!!", "Test message");

        return c;
    }
}

