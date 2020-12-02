import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s = "1234";

        //calls classes and methods
        Encrypter enc = new Encrypter();
        String s2 = enc.encrypt(s);
        Decrypter denc = new Decrypter();
        String s3 = denc.decrypt(s2);

        //output statement
        System.out.println("With " + s + " being the original number " + s2 + " is the encrypted value and " + s3 + " is the decrypted value.");


    }
}

