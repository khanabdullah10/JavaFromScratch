package com.important.relationshipBwClasses;

class Heart{

}
class Human{
    Heart heart;
}
//weakly coupled
public class HAS_A {
    public static void main(String[] args) {
        Human human = new Human();
    }
}
