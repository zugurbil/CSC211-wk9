public class PolyAnimcalDemo {

    // Making the Animal class static
    public static class Animal {
        private String name;

        // Constructor of the superclass
        public Animal(String name) {
            this.name = name;
            System.out.println("Animal constructor called.");
        }

        // Method in superclass
        public void speak() {
            System.out.println("Animal makes a sound.");
        }

        // Getter for name
        public String getName() {
            return name;
        }
    }

    // Subclass
    public static class Dog extends Animal {
        private String breed;

        // Constructor of the subclass
        public Dog(String name, String breed) {
            // Call the constructor of the superclass
            super(name);
            this.breed = breed;
            System.out.println("Dog constructor called.");
        }

        // Overridden method in subclass
        @Override
        public void speak() {
            System.out.println(getName() + " barks.");
        }

        // Method to get the breed
        public String getBreed() {
            return breed;
        }
    }

    public static void main(String[] args) {
        // Create an object of type Animal but actually instantiate a Dog
        Animal myDog = new Dog("Buddy", "Golden Retriever");
     
        // Calling the method from the subclass (overridden method)
        myDog.speak();  // Output: Buddy barks.

        /*
         * Because the reference variable myDog is of type Animal, but at runtime, 
         * it could be an object of the subclass Dog.
         * Java allows you to cast a superclass object to a subclass type, but you need 
         * to ensure that the actual object being referenced is an instance of that subclass.
         * Before casting myDog to a Dog, you should check whether myDog is an instance of Dog. 
         * You can use the instanceof operator to safely check the type before casting.
         *Accessing the superclass method (not possible directly on Animal reference) */
        
        System.out.println("Dog's breed: " + ((Dog) myDog).getBreed());  // Output: Golden Retriever
        //System.out.println("Dog's breed: " + myDog.getBreed());
        Animal myCaw = new Animal("Angel");
        myCaw.speak();
    }
}
