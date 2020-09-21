package com.automation.api;

import java.util.Random;

public class Randomtest {
    public static void main(String[] args) {
        String countryCode ="USA";
        String[] ipAdressArrayUsa = {"111","122","123","124","125" };
        int idx = new Random().nextInt(ipAdressArrayUsa.length);
        String ipAddress = (ipAdressArrayUsa[idx]);
        System.out.println(ipAddress);
    }


}
