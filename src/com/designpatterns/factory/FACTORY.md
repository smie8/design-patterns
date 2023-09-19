# Simple Factory "pattern"
Encapsulates object creation, but isn't really a design pattern. A factory is a separate component responsible solely for the wholesale (not piecewise) creation of objects. 

A Simple Factory is sufficient for scenarios where you have a limited set of object types that need to be created, and there's no anticipated need for extensibility or customization beyond what the factory can handle

# Factory Method pattern
Defines an interface for creating an object, but lets subclasses decide which class to instantiate. Lets a class defer instantiation to subclasses.

# Abstract Factory pattern
provides an interface for creating families of related or dependent objects without specifying their concrete classes.