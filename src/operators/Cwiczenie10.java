package operators;

/**
 * Created by Rafal on 02017-02-21.
 */
public class Cwiczenie10 {
    public static void main(String[] args) {
        int l1 = 0xaa;
        int l2 = 0x155;
        System.out.println("l1 = " + Integer.toBinaryString(+ l1)
                + " : " + Integer.toBinaryString(+ l1).length());
        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + Integer.toBinaryString(l2)
                + " : " + Integer.toBinaryString(+ l2).length());
        System.out.println("l2 = " + l2);
        System.out.println("l1 & l2 = " + Integer.toBinaryString(l1 & l2)
                + " : " + Integer.toBinaryString(l1 & l2).length());
        System.out.println("l1 & l2 = " + (l1 & l2));
        System.out.println("l1 | l2 = " + Integer.toBinaryString(l1 | l2)
                + " : " + Integer.toBinaryString(l1 | l2).length());
        System.out.println("l1 | l2 = " + (l1 | l2));
        System.out.println("l1 ^ l2 = " + (l1 ^ l2));
        System.out.println("l1 ^ l2 = " + Integer.toBinaryString(l1 ^ l2)
                + " : " + Integer.toBinaryString(l1 ^ l2).length());
        System.out.println("~l1 = " + Integer.toBinaryString(~l1)
                + " : " + Integer.toBinaryString(~l1).length());
        System.out.println("~l1 = " + (~l1));
        System.out.println("~l2 = " + Integer.toBinaryString(~l2)
                + " : " + Integer.toBinaryString(~l2).length());
        System.out.println("~(l1&l2) = " + Integer.toBinaryString(~(l1&l2))
                + " : " + Integer.toBinaryString(~(l1&l2)).length());
        System.out.println("~(l1&l2) = " + (~(l1&l2)));
        System.out.println("~(l1 | l2) = " + Integer.toBinaryString(~(l1 | l2))
                + " : " + Integer.toBinaryString(~(l1 | l2)).length());
        System.out.println("~(l1 | l2) = " + (~(l1 | l2)));
        System.out.println("0 = " + Integer.toBinaryString(0));
        System.out.println("~0 = " + Integer.toBinaryString(~0));
        System.out.println("0 = " + (~0));
        System.out.println(new Integer(999).toString().length());
        System.out.println(2+2);
        System.out.println(""+2+2);
    }
}
