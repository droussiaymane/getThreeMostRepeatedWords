# getThreeMostRepeatedWords

This repository contains the implementation of the `getThreeMostRepeatedWords` function in both Java and Python. The function identifies the three most frequently occurring words in a given paragraph.

## Description

The `getThreeMostRepeatedWords` function takes a string input, representing a paragraph, and returns the three words that appear most frequently within that paragraph. If the paragraph contains less than three words, it returns an error message.

## Files

- `File.java`: Contains the Java implementation of the function.
- `file.py`: Contains the Python implementation of the function.

## Usage

### Java

To use the function in Java, compile and run the `File.java`. The main method contains an example usage of the function.

```java
public class File {
    public static void main(String[] args) {
        System.out.println(getThreeMostRepeatedWords("your paragraph here"));
    }
}

### Python
To use the function in Python, simply run the `file.py` script. You can call the function with a string argument to test it.

```python
from file import getThreeMostRepeatedWords

print(getThreeMostRepeatedWords("your paragraph here"))
