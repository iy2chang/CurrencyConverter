package com.example.ianc.currencyconverter;

/**
 * Created by IanC on 12/5/2015.
 * This class includes function to converter from one currency to another
 * The currency rate is based on 12/5/2015
 */
public class Convert {
    // variable for currency rate
    private double JP_US = 0.0081;
    private double US_JP = 123.11;
    private double TW_US = 0.031;
    private double US_TW = 32.71;
    private double US_KR = 1161.39;
    private double KR_US = 0.00086;

    // Japan to US
    public double JapanToUs(double amount){

        return amount * JP_US;
    }

    // Us to Japan
    public double UsToJapan(double amount){
        return amount * US_JP;
    }

    // Taiwan to Us
    public double TaiwanToUs(double amount){
        return amount * TW_US;
    }

    // Us to Taiwan
    public double UsToTaiwan(double amount){
        return amount * US_TW;
    }

    // Us to Korea
    public double UsToKorea(double amount){
        return amount * US_KR;
    }

    // Korea to Us
    public double KoreaToUs(double amount){
        return amount * KR_US;
    }
}