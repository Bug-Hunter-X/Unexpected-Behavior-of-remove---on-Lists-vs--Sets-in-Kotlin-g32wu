# Kotlin remove() Function Behavior

This repository demonstrates a subtle difference in the behavior of the `remove()` function when applied to `MutableList` and `MutableSet` in Kotlin.  While seemingly straightforward, this distinction can lead to unexpected results if not understood.

## The Problem

The `remove()` function, when used with `MutableList`, removes the *first* occurrence of the specified element. In contrast, when used with `MutableSet`, it removes the element irrespective of its position (since sets are unordered).  This can cause confusion if the programmer isn't aware of this difference.

## The Solution

The solution involves understanding the underlying data structures and choosing the appropriate collection based on the desired behavior. If you need to preserve the order of elements and remove only the first occurrence, `MutableList` is suitable. If order is unimportant and you simply want to remove a particular element, a `MutableSet` is a better choice.  This example also shows how to handle potential exceptions if the element is not found.