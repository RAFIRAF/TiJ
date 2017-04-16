package net.mindview.util;

import java.io.File;

/**
 * Created by Rafal on 02017-04-16.
 */
public class Hex {
    public static String format(byte[] data){
        StringBuilder result = new StringBuilder();
        int n = 0;
        for (byte b:data
             ) {
            if (n%16==0)
                result.append(String.format("%05X: ",n));
            result.append(String.format("%02X ",b));
            n++;
            if (n%16 == 0 )result.append("\n");
        }
        result.append("\n");
         return result.toString();
    }

    public static void main(String[] args) {
//        if (args.length==0)
//            System.out.println(format(BinaryFile.read("src/net/mindview/util/Hex.java")));
//        else System.out.println(format(BinaryFile.read(new File(args[0]))));
    }
}
