package soundsystem;

/**
 * Created by gaosong on 2017-11-19
 */
public class Person {

    private String words;

    public void speak(){
        System.out.println(words);
    }

    public Person(String words){
        this.words = words;
    }
}
