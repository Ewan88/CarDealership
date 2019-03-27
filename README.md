# Polymorphism & Composition Homework - Quiz

# Polymorphism

1. What does the ___word___ 'polymorphism' mean?

    a. Polymorphism (in computing) means applying the same functionality to different data types.

2. What does it mean when we apply polymorphism to OO design? Give a simple Java example.
    
    a. Polymorphism is exclusive to OOP in the sense that classes are data types with their own functionality. Through polymorphism, it is possible to use the same methods on multiple instances of each class - even if they have different properties.
    
    Run CarTest.java and notice that ```tankIsCar()``` passes

3. What can we use to implement polymorphism in Java?

    a. In the example, the class Tank is interfaced with the abstract class Car through IDrive.

4. How many 'forms' can an object take when using polymorphism?

    a. The number of forms that any particular object can take is equivalent to the number of methods each class is required to share.

5. Give an example of when you could use polymorphism.

    a. In the example, polymorphism allows Car to have a damage property, while Tank does not, they still share the same method ```drive()``` through their interface.


# Composition

6. What do we mean by 'composition' in reference to object-oriented programming?

    a. Composition means that classes contain instances of other classes which have desired functionaliy.

7. When would you use composition? Provide a simple example in Java.

    a. In the example, Car has the ```drive()``` method which is shared by each of its children through IDrive.
    
    Notice that ```carsCanDrive()``` passes in CarTest

8. What is/are the advantage(s) of using composition?

    a. Composition allows for each class which implements IDrive to use ```drive()```.

9. When an object is destroyed, what happens to all the objects it is composed of?

    a. If the object being destroyed is a child of an abstract class then there is no effect on the parent. If the object being destroyed is a parent, the child will not have access to its methods or properties.