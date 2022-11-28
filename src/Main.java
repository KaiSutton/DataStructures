import com.prog2.datastructers.DoublyLinkedList;
import com.prog2.datastructers.SinglyLinkedList;
import com.prog2.interfaces.List;

import javax.swing.*;
import java.awt.*;

public class Main {

    MeleeAI bill = new MeleeAI(100, 10);
    RangedAI shauniqua = new RangedAI(50, 20);
    MageAI e = new MageAI(20, 45);


    void printList(List a){
        // System.out.println("-------------------------------------------------");
        for (int i = 0; i < a.getLength(); i++) {
            System.out.println(a.get(i));
        }
        System.out.println("-------------------------------------------------");
    }

    void test(){
        DoublyLinkedList<String> list = new DoublyLinkedList<>();

        list.prepend("Frodo").prepend("Sam").prepend("Merry").prepend("Pippin");

        // expected: Pippin, Merry, Sam, Frodo
        printList(list);


        list.append("Gandalf");

        // expected: Pippin, Merry, Sam, Frodo, Gandalf
        printList(list);

        list.insert("Aragorn", 3);

        // expected: Pippin, Merry, Sam, Aragorn, Frodo, Gandalf
        printList(list);

        list.insert("Legolas", 2);

        // expected: Pippin, Merry, Legolas, Sam, Aragorn, Frodo, Gandalf
        printList(list);

        list.remove(4);

        // expected: Pippin, Merry, Legolas, Sam, Frodo, Gandalf
        printList(list);

        // expected: 3
        System.out.println(list.indexOf("Sam"));



    }


    public static void main(String[] args) {
       Calculator calc = new Calculator();
       calc.start();
    }

}
