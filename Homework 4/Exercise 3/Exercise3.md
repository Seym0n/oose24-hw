# Exercise 3

The strategy pattern can be realized in modern Java programming by combining the Functionalinterface and Lambda Expressions.

In this example, we can define a strategy in a few lines of a code, in contrast to old programming, by defining a new class for every strategy.

In the example code, we define a strategy to output the word _as it is_ and another strategy that reverses the word in a few lines of code.

The code can be found in directory _code_.

## Benefits and Shortcoming

The benefit is apparently to reduce writing new strategies to a few lines of code instead of a new class.
However, this approach can be used for small strategies.

For strategies that is lengthy and need therefore be decomposed into multiple methods, the use of FunctionalInterface and Lambda Expressions may not make sense to use. In that case, the traditional way of making a new class per Strategy should be taken in consideration.