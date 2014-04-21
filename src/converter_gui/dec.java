/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package converter_gui;

/**
 *
 * @author lorenz
 */
public class dec {
    public static String dec_bin(int dec) {
        int var=dec;
        String bin="";
        for(int x=0; x<var; x++) {
            bin=dec%2+bin;
            dec=(dec-(dec%2))/2;
        }
        if(var<=256) {
            bin=bin.substring(bin.length()-8, bin.length());
        }
        else if(var<=65536) {
            bin=bin.substring(bin.length()-16, bin.length());
        }
        else if(var>65536) {
            System.out.println("Number is to high!\n");
        }
        return bin;
    }
    
    public static String dec_hex(int dec) {
        String hex="";
        int var=dec;
        int op=0, marker=0;
        for(int x=0; x<var; x++) {
            op=dec%16;
            if(op>=0&&op<10) {
                hex=op+hex;
            }
            else {
                switch(op) {
                    case 10:
                        hex="A"+hex;
                    break;
                    case 11:
                        hex="B"+hex;
                    break;
                    case 12:
                        hex="C"+hex;
                    break;
                    case 13:
                        hex="D"+hex;
                    break;
                    case 14:
                        hex="E"+hex;
                    break;
                    case 15:
                        hex="F"+hex;
                    break;
                }
            }  
            dec=(dec-(dec%16))/16;
        }
        for(int x=0; x<hex.length(); x++) {
             if(hex.charAt(x)!='0') {
                marker++;
            }
        }
        hex=hex.substring(hex.length()-marker, hex.length());
        return hex;
    }
}
