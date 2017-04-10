package interfaces;

import java.nio.CharBuffer;//non-blockin input/output
import java.util.Scanner;

/**
 * Created by Rafal on 02017-03-06.
 */
public class RandomWords2 implements Readable{
    public int read(CharBuffer charBuffer){
        charBuffer.append("xD");
        charBuffer.append(" ");
        charBuffer.append("xD");
        charBuffer.append("\n");
        charBuffer.append("xD");
        return -1;
    }

    public static void main(String[] args) {
        RandomWords2 rw2 = new RandomWords2();
        Scanner s = new Scanner(rw2);
        while (s.hasNext())
            System.out.println(s.next());
    }
}
