import poo.Emotion;
import poo.Human;
import user.User;

public class Main {
    public static void main(String[] args) {
        //Emotions

        Emotion joy = new Emotion("Joy", 13, "yellow", true, 9);
        joy.introduce();
        joy.wakeUp();

        Emotion sadness = new Emotion("Sadness", 13, "blue", false, 7);
        sadness.introduce();
        sadness.sleep();

        Emotion anxiety = new Emotion("Anxiety", 13, "orange", false, 10);
        anxiety.introduce();
        System.out.println("\n");

        //Humans

        Human riley = new Human("Riley", 13, "main character");
        riley.introduce();
        riley.eat();

        Human bill = new Human("Bill", 40, "main character's father");
        bill.introduce();

        Human jill = new Human("Jill", 38, "main character's mother");
        jill.introduce();
    }
}






