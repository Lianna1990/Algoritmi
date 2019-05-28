package lesson2;

public class AwesomeStack {

    public static void main(String[] args) {
        Stack2 mStack2 = new Stack2 (10);

        mStack2.addElement(14);
        mStack2.addElement(32);
        mStack2.addElement(54);
        mStack2.addElement(74);

        mStack2.deleteElement();

        System.out.print("Стек: ");
        while (!mStack2.isEmpty()) {
            int value = mStack2.deleteElement();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println("");
    }
}
