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
public class hex {
    public static double hex_dec(String hex) {
        double dec=0;
        for(int x=0; x<hex.length(); x++) {
            if(hex.charAt(x)=='A'|| hex.charAt(x)=='B'|| hex.charAt(x)=='C'|| hex.charAt(x)=='D'|| hex.charAt(x)=='E'|| hex.charAt(x)=='F') {
                switch(hex.charAt(x)) {
                    case 'A':
                        dec=dec+10*Math.pow(16, hex.length()-x-1);
                    break;
                    case 'B':
                        dec=dec+11*Math.pow(16, hex.length()-x-1);
                    case 'C':
                        dec=dec+12*Math.pow(16, hex.length()-x-1);
                    break;
                    case 'D':
                        dec=dec+13*Math.pow(16, hex.length()-x-1);
                    break;
                    case 'E':
                        dec=dec+14*Math.pow(16, hex.length()-x-1);
                    break;
                    case 'F':
                        dec=dec+15*Math.pow(16, hex.length()-x-1);
                }  
            }
            else {
                //Integer.parseInt(String.valueOf(hex.charAt(x)))>0&&Integer.parseInt(String.valueOf(hex.charAt(x)))<10
                dec=dec+Double.parseDouble(String.valueOf(hex.charAt(x)))*Math.pow(16, hex.length()-x-1); 
            }
        }
        System.out.println(dec);
        return dec;
    }
    
    public static double hex_dec_noprint(String hex) {
        double dec=0;
        for(int x=0; x<hex.length(); x++) {
            if(hex.charAt(x)=='A'|| hex.charAt(x)=='B'|| hex.charAt(x)=='C'|| hex.charAt(x)=='D'|| hex.charAt(x)=='E'|| hex.charAt(x)=='F') {
                switch(hex.charAt(x)) {
                    case 'A':
                        dec=dec+10*Math.pow(16, hex.length()-x-1);
                    break;
                    case 'B':
                        dec=dec+11*Math.pow(16, hex.length()-x-1);
                    case 'C':
                        dec=dec+12*Math.pow(16, hex.length()-x-1);
                    break;
                    case 'D':
                        dec=dec+13*Math.pow(16, hex.length()-x-1);
                    break;
                    case 'E':
                        dec=dec+14*Math.pow(16, hex.length()-x-1);
                    break;
                    case 'F':
                        dec=dec+15*Math.pow(16, hex.length()-x-1);
                }  
            }
            else {
                //Integer.parseInt(String.valueOf(hex.charAt(x)))>0&&Integer.parseInt(String.valueOf(hex.charAt(x)))<10
                dec=dec+Double.parseDouble(String.valueOf(hex.charAt(x)))*Math.pow(16, hex.length()-x-1); 
            }
        }
        return dec;
    }
    
    public static String hex_bin(String hex) {
        String hex_dec_string=String.valueOf(hex_dec_noprint(hex));
        int hex_dec_int=Integer.parseInt(hex_dec_string.substring(0, hex_dec_string.length()-2));
        return dec.dec_bin(hex_dec_int);
    }
}
