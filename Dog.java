
public class Dog  implements Walkable, Swimmable {
	@Override
    public void walk() {
        System.out.println("The dog is walking.+ maximum waking distance is "+ MAXWALK);
    }

    @Override
    public void swim() {
        System.out.println("The dog is swimming.");
    }
}


