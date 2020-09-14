public class Encrypter {
    public String encrypt(String s){

        //variable initialization
        int a, b, c, d;
        String e, f, g, h;

        //converts ints to chars
        char first = s.charAt(0);
        a = Character.getNumericValue(first);
        char second = s.charAt(1);
        b = Character.getNumericValue(second);
        char third = s.charAt(2);
        c = Character.getNumericValue(third);
        char fourth = s.charAt(3);
        d = Character.getNumericValue(fourth);

        //does encrypting
        a+=7;
        b+=7;
        c+=7;
        d+=7;
        a = a%10;
        b = b%10;
        c = c%10;
        d = d%10;

        //converts integers to strings
        e = Integer.toString(a);
        f = Integer.toString(b);
        g = Integer.toString(c);
        h = Integer.toString(d);

        //puts strings together to form encrypted number
        s = g + h + e + f;

        return s;
    }
}
