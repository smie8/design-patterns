# Composite pattern
(see the iterator package for example usage)
Allows you to compose objects into tree structures to represent part-whole hierarchies.

Composite lets clients treat individual objects and compositions of objects uniformly.

Pros:
- You can work with complex tree structures more conveniently: use polymorphism and recursion to your advantage.
- Open/Closed principle: you don't have to change the client code when adding new elements to the tree.

Cons:
- It might be difficult to provide a common interface for classes whose functionality differs too much. In certain scenarios, you'd need to overgeneralize the component interface, making it harder to comprehend.
