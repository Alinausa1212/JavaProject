package class3;

public class E3TypeCasting {
    public static void main(String[] args) {

        int number=128;
        byte number2;
        // number2=number;Java give us error bc number is bigger than num2
        number2=(byte)number;
        System.out.println(number2);

        short box1=2000;
        int box2=box1; // implicit/auto
        System.out.println(box2);

    }
}
