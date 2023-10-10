# Design patterns

Someone have already solved your problems. Design patterns are proven general solutions to common design problems.

Most patterns and principles address issues of change in software.

Most patterns allow some part of a system to vary independently of all other parts.

We often try to take what varies in a system and encapsulate it.

All design involves tradeoffs, as does all software design.

Consider these before applying design patterns:
- Abstraction vs speed
- Space vs time


# Design principles

1. Identify the aspects of your application that vary and separate them from what stays the same.
2. Program to an interface, not an implementation.
3. Favor composition over inheritance.
4. Strive for loosely coupled designs between objects that interact.
5. Classes should be open for extension but closed for modification.
6. Depend upon abstractions. Do not depend upon concrete classes.
7. Only talk to your friends.
8. Don't call us, we'll call you.
9. A class should have only one reason to change.

# Quick reference of design patterns

Adapter = Convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.

Command = Encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.

Composite = Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.

Decorator = Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

Facade = Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.

Factory Method = Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.

Iterator = Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

Observer = Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

Proxy = Provide a surrogate or placeholder for another object to control access to it.

Singleton = Ensure a class only has one instance, and provide a global point of access to it.

State = Encapsulate state-based behavior and delegate behavior to the current state.

Strategy = Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently of clients that use it.

Template Method = Define the skeleton of an algorithm in an operation, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.