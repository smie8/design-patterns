# Iterator pattern

Provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

Pros:
- Single Responsibility Principle. You can clean up the client code and the collections by extracting bulky traversal algorithms into separate classes.
- Open/Closed Principle. You can implement new types of collections and iterators and pass them to existing code without breaking anything.
- You can iterate over the same collection in parallel because each iterator object contains its own iteration state.
- You can delay an iteration and continue it when needed, for the same reason as above.

Cons:
- Applying the pattern can be an overkill if your app only works with simple collections.
- Using an iterator may be less efficient than going through elements of some specialized collections directly.