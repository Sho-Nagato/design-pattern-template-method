public class Main {
    public static void main(String[] args) {

        // CharDisplayを使用
        AbstractDisplay d1 = new CharDisplay('H');
        d1.display();

        System.out.println("");

        // StringDisplayを使用
        AbstractDisplay d2 = new StringDisplay("Hello World");
        d2.display();
    }
}
