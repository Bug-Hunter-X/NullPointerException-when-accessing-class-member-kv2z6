# NullPointerException in Scala

This example demonstrates a common error in Scala: a `NullPointerException` that occurs when accessing a member of a class that could potentially be `null`.  The code attempts to get the length of the `name` field in `MyClass`, but if `name` is `null`, a `NullPointerException` will be thrown.  The solution shows how to safely handle this situation using a null check.

## How to Reproduce

1. Save the code in `bug.scala`.
2. Compile and run the code using the Scala compiler.
3. Observe the `NullPointerException`. 

## Solution

The solution demonstrates using `Option` to handle potential `null` values, providing a more robust way to manage data that may be missing or invalid.