# Simple Factory "pattern"
Encapsulates object creation, but isn't really a design pattern. A factory is a separate component responsible solely for the wholesale (not piecewise) creation of objects. 

A Simple Factory is sufficient for scenarios where you have a limited set of object types that need to be created, and there's no anticipated need for extensibility or customization beyond what the factory can handle

# Factory Method pattern
Defines an interface for creating an object, but lets subclasses decide which class to instantiate. Lets a class defer instantiation to subclasses.

Pros:
- You avoid tight coupling between the creator and the concrete products.
- Single Responsibility Principle - the product creation code is isolated from the rest of the code.
- Open/Closed Principle - you can introduce new types of products into the program without breaking existing client code.

Cons:
- The code may become more complicated since you need to introduce a lot of new subclasses to implement the pattern.

# Abstract Factory pattern
Provides an interface for creating families of related or dependent objects without specifying their concrete classes.

Pros:
- You can be sure that the products you're getting from a factory are compatible with each other.
- You avoid tight coupling between concrete products and client code.
- Single Responsibility Principle
- Open/Closed Principle

Cons:
- Lot of new interfaces and classes are introduced along with the pattern, which means more complexity and harder maintenance.