package interfaces;

import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Rafal on 02017-03-07.
 */
public class LottoNumbers {
    public byte[] getNumbers() {
        return numbers;
    }
    private void numbersGenerator(){
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            numbers[i]=((byte)(random.nextInt(49)+1));
        }
    }
    private byte[] numbers = new byte[3];
    LottoNumbers(){
        numbersGenerator();
    }

    public static void main(String[] args) {
        byte[] lottoNumbers = new byte[3];
        byte[] myNumbers = new byte[]{4,8,15};
        int i = 0;
        while (!Arrays.equals(lottoNumbers,myNumbers)){
            lottoNumbers = new LottoNumbers().getNumbers();
            Arrays.sort(lottoNumbers);
            i++;
        }
        System.out.println(i+" "+Arrays.toString(lottoNumbers));

    }

}
