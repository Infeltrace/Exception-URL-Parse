package com.company;

public class Main {

    public static void main(String[] args) {

	drawRect(7,5);

    }

    private static void drawRect(int height,int width){

        String LT = "\u250F";//Left Top angle
        String LB = "\u2517";//Left Bottom angle
        String RT = "\u2513";//Right Top angle
        String RB = "\u251B";//Right Bottom angle
        String hLine = " \u2501" + "\u2501 ";//Horizontal line
        String vLine = "\u2503";//Vertical line


      for (int i = 0; i < height; i++){
          System.out.println("");
          for(int j = 0; j < width; j++){
              if(j == 0 && i == 0) System.out.print(LT);
              else if(i == 0 && j == width -1) System.out.print(RT);
              else if(i == height -1 && j == 0) System.out.print(LB);
              else if(i == height -1 && j == width -1) System.out.print(RB);
              else if(j == 0 || j == width -1 )System.out.print(vLine);
              else System.out.print(hLine);
          }
      }

    }
}
