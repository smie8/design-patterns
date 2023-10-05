# Facade pattern
Allows you to simplify a complex system by providing a simple interface to it. Provides a unified interface to a set of interfaces in a subsystem. Defines a higher-level interface that makes the subsystem easier to use.

Difference between facade and adapter is that the facade is used to only _simplify_ an interface, while the adapter is used to _convert_ an interface to another.

Pros:
- Decouples a client implementation from a complex subsystem.
- Does not encapsulate the subsystem classes or interfaces. It just provides a simplified interface to them, but the client can still access them directly.

Cons:
- Can become a god object (a class that knows too much or does too much) and is coupled to all classes of an app.