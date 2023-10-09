# State pattern
Allows an object to alter its behavior when its internal state changes. The object will appear to change its class.

Pros:
- Single Responsibility Principle. Organizes the code related to particular states into separate classes.
- Open/Closed Principle. Makes it easy to introduce new states without changing existing state classes or the context.
- Simplifies the code of the context by eliminating bulky state machine conditionals.

Cons:
- Applying the pattern can be overkill if a state machine has only a few states or rarely changes.