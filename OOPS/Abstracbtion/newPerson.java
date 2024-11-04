package OOPS.Abstracbtion;

public interface newPerson {
    void spwak();//abstract methods
    void eat();

default void dance(){
    System.out.println("Humans Dance By Deafult");
}

// default method belongs to the objeccyt or instance  - It allows to evolve without breaking exixting Implementation

static void play (){
    System.out.println("Humnas Are Playing at Night By Default ");
}

// Static method belongs to the interface - utility method at the level of interface

// Abstractiponn   Do tarike se hota hai interface ke jariye or abstarct calss ke jariye

}



//   Difference Between Abstract class And Interface.


// Abstract Class : 
//1. instance variable
//2.Abstract + Concrete Methods
//3. Class can Extend Only 1 abstract class



//INterface 
// 1. Static Final Face.
// 2.Abstract method + defailt + static
//3.Multiple Interfaces can be implemented