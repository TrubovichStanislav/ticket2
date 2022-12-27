public class Main {

    public static void main(String[] args) {
        String str = "123321";
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        if (str.equalsIgnoreCase(stringBuilder.toString())) {
            System.out.println(str + " Данная строка является полиндромом");
        } else {
            System.out.println(str + " Данная строка не является полиндромом");
        }
    }
}