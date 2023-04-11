# What's an abstract class? How are abstract classes similar or different in Java from C++?

In Java an Abstract class cannot be instantiated, so it's not possible use new();

## How it works? 

By adding the keyword `abstract`
public abstract class Cat { //class attributes and methods... }

## Why should I use it? 

to share attributes and methods between classes since it represents generic categories of the world

e.g. it makes sense to create an abstract class called Animal, a normal class called Cat that extends Animal and another normal class called Dog that also extends Animal
so, you can not instantiate, but you can create subclasses of an abstract one

## And what about abstract methods? 

In abstract class It is possible to choose having abstract methods.
In order to do a method abstract just add the keyword `abstract` and do not implement a body

e.g. public abstract void makeNoise();

But, then, in the child classes,  we have to create an implementation of that method that will receive the @Override annotation

## Why create abstract classes? 

To enforce and organize what each child has to have.

Inside an abstract class it is possible to create normal methods, so the children doesn't need to implement them, they use the parent class method.


## Abstract class X Interface:

- `public interface AnimalStuff { public void poop(); }` -> Classes that are interfaces use the key-word `interface` instead of `class`

- In an interface every method is assumed to be abstract, so the keyword `abstract` is dispensable

- Then, other classes can implement that one: `public class Cat implements AnimalStuff {}` and it has to implement the `poop()` method as well...


! you can implement as many interfaces as you want, but only extend one class; 

! Tt is possible to use both: extend and implement: `public class Cat extends Animal implements AnimalStuff {}`

! Every field/property declared in an interface has to be: static and final like so `int age = 1;` -> so it has to have a value assigned which make every child have the same value, which doesn't have much sense. 

! Properties/States are common in abstract classes and Methods/Behaviors/Actions are common in Interfaces
