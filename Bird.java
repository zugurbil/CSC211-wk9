
public class Bird implements Flyable, Walkable {
	//@Override
    public void fly() {
        System.out.println("The bird is flying.");
    }

   // @Override
    public void walk() { 
        System.out.println("The bird is walking. Maximum distance is " + MAXWALK);
    }  
}
