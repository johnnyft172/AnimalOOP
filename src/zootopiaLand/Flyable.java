package zootopiaLand;    //SPARROW EXTEND BIRD

public interface Flyable {  //Interfaces should be named after functionality we are trying to abstract away.

    public void fly();  //Interface do NOT have a body and these methods are called abstract methods. Interface only has abstract methods
                        //Abstract method is what it sounds like, it's an abstraction of the idea of something being able to fly
}

/*

    //Interface is a CONTRACT, any class that implements that interface, the interface wants that class to promise that it will implement that method
    //Key point, a class can only extend one class, another class. It can only have ONE PARENT, that makes sense. A sparrow can only be one thing, it's a
    bird and a bird can only be one thing, it's an animal. Any class cannot have multiple parents but it can have as many interfaces as it wants
    The sparrow can implement flyable, it can implement eatable, it can implement many other kinds of interfaces without a problem*/
