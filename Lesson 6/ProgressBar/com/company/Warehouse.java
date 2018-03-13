package com.company;

import java.io.*;

public class Warehouse {

    private int res, summary;
    private double temp;
    private FileInputStream fileInputStream;
    private FileOutputStream fileOutputStream;
    private byte[] byteArray = new byte[200];

    public Warehouse(String source, String destination) throws IOException {
        fileInputStream = new FileInputStream(source);
        fileOutputStream = new FileOutputStream(destination);
        temp = fileInputStream.available() / (double)100;
    }

    public void copy() throws IOException, InterruptedException {

        while (true){
            res = fileInputStream.read(byteArray);
            if(res != -1) {
                fileOutputStream.write(byteArray, 0, res);
                summary += res;
                System.out.println("Progress %: " + String.format("%.2f", summary/temp));
                Thread.sleep(500);
            }else break;
        }

        fileInputStream.close();
        fileOutputStream.close();
    }

}
