package back_joon.소수팰린드롬;

public class Test {
    public static void main(String[] args) {

        String num = "31";
        int inum = 31;

        System.out.println(num.length());

        System.out.println(
                " < -------- >");

        System.out.println(inum);

        String newString = String.valueOf(inum);

        int toInt = Integer.parseInt(num);

        System.out.println(toInt);


        System.out.println(newString);

        for (int i = 0; i < toInt; i++) {
            System.out.println("toInt");
        }
    }
}
