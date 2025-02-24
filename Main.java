// Extends Starter    A+CR
import java.util.ArrayList;
public class Main 
{
  public static void main(String[] args) 
  {
     Cat p1 = new Cat();
     Cat p2 = new Cat();
     Cat p3 = new Cat();

     p1.changeName("Fluffy");
     p2.changeAge(3);
     p3.changeName("Mr. Whiskers");
     p3.changeAge(4);

     ArrayList<Cat> cats = new ArrayList<Cat>();
     cats.add(p1);
     cats.add(p2);
     cats.add(p3);

     for(int i = 0; i < cats.size(); i ++) {
      System.out.println(cats.get(i));
     }

     Cat oldCat = p1;
     for(int i = 0; i < cats.size(); i++) {
      if(oldCat.getAge() < cats.get(i).getAge()) {
        oldCat = cats.get(i);
      }
     }
     System.out.println(oldCat);

     Dog d1 = new Dog();
     d1.changeName("Zoe");
     d1.changeAge(5);
     System.out.println(d1.speak());
     System.out.println(d1.getName());
     System.out.println(d1.getAge());
     System.out.println(d1);

     Poodle po1 = new Poodle();
     po1.changeName("Bob");
     po1.changeAge(7);
     System.out.println(po1.speak());
     System.out.println(po1.getName());
     System.out.println(po1.getAge());
     System.out.println(po1);
  }
}