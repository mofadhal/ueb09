public class Main {
    public static void main(String[] args) {
        Queue moon = new StringQueue(5);
        //Queue pq = new PersonQueue (8);
        System.out.println("\nist Leer =  "+moon.empty());
        System.out.println("ist Full = "+moon.full());
        System.out.println("lastEle = "+moon.size());
        moon.addLast("1");
        moon.addLast("2");
        moon.addLast("3");
        moon.addLast("4");
        moon.addLast("5");
        System.out.println("ist Full = "+moon.full());
        System.out.println("removeFirst = "+moon.removeFirst());
        System.out.println("Schlange :- "+moon);
        System.out.println("Get = "+moon.get(2));
        System.out.println("ist Leer = "+moon.empty());
        System.out.println("lastEle = "+moon.size());
        Person x = new Person("mofadhal", "almanari");
        System.out.println("ist equal = "+x.equals(x));

    }
}
