# Observer Pattern
Defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically.

It allows one object (called the subject or observable) to notify multiple other objects (called observers) when its state changes. This pattern is commonly used to implement distributed event handling systems, where one object (the subject) keeps track of a list of other objects (observers) that are interested in being notified when something interesting happens.
- loose coupled (strive for loosely coupled designs between objects that interact)

Pros:
- Open/Closed Principle - new observers can be added without having to change the subject.
- You can establish relations between objects at runtime.

Cons:
- Observers/subscribers are notified in random order.