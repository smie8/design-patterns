# Template method pattern

Defines the steps of an algorithm and allows subclasses to provide the implementation for one or more steps without changing the algorithm's structure.

Good technique for code reuse.

Hooks are methods that do nothing or default behavior in the superclass, but can be overridden in the subclass.

Pros:
- Clients are less affected by changes to the algorithm when you let them override only certain steps of the algorithm.
- Duplicated code can be moved to a superclass.

Cons:
- Some clients may be limited by the provided skeleton of the algorithm.
- The Liskov Substitution Principle might be violated if subclasses change the behavior of the superclass' hooks.
- The more steps they have, the harder it is to maintain the class.