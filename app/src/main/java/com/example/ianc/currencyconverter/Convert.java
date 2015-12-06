package com.example.ianc.currencyconverter;

/**
 * Created by IanC on 12/5/2015.
 * This class includes function to converter from one currency to another
 * The currency rate is based on 12/5/2015
 */
public class Convert {

    // Japan to US
    public static double JapanToUs(double amount){
        double rate = 0.0081;
        return amount * rate;
    }

    // Us to Japan
    public static double UsToJapan(double amount){
        double rate = 123.11;
        return amount * rate;
    }

    // Taiwan to Us
    public static double TaiwanToUs(double amount){
        double rate = 0.031;
        return amount * rate;
    }

    // Us to Taiwan
    public static double UsToTaiwan(double amount){
        double rate = 32.74;
        return amount * rate;
    }

    // Us to Korea
    public static double UsToKorea(double amount){
        double rate = 1161.39;
        return amount * rate;
    }

    // Korea to Us
    public static double KoreaToUs(double amount){
        double rate = 0.00086;
        return amount * rate;
    }
}