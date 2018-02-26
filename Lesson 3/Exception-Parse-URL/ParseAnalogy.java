package com.company;

public class ParseAnalogy {

     static public int parseInt(String string)throws NumberFormatException{
         int step = 1;
         int result = 0;

         if(string.matches("[0-9]+")) {

         for(int i = string.length() -1; i>=0; i--){

             switch (string.charAt(i)) {
                 case '0':
                     result += 0;
                     break;
                 case '1':
                     result += step;
                     break;
                 case '2':
                     result += 2 * step;
                     break;
                 case '3':
                     result += 3 * step;
                     break;
                 case '4':
                     result += 4 * step;
                     break;
                 case '5':
                     result += 5 * step;
                     break;
                 case '6':
                     result += 6 * step;
                     break;
                 case '7':
                     result += 7 * step;
                     break;
                 case '8':
                     result += 8 * step;
                     break;
                 case'9':
                     result += 9 * step;
                     break;
             }
             step *= 10;
             }
         }else throw new NumberFormatException();
         return result;
         }
    }

