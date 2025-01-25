interface two {
    void makeSound(); 
    default void bike() {
        System.out.println("This bikes makessound.");
    }
}

class pulsar implements two {
    public void makeSound() {
        System.out.println("dur!");
    }
}
class inheritance2 {
    public static void main(String[] args) {
        pulsar bikes = new  pulsar();
        bikes.makeSound(); 
        bikes.bike();      
    }
}
	