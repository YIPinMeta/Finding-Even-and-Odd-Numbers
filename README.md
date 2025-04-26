
# 🔢 Find Even and Odd Numbers in an Array (Java)

A simple Java console program that counts how many even and odd numbers are present in a given array.

## 📋 Features

- Predefined integer array
- Counts:
  - Number of **even** numbers
  - Number of **odd** numbers
- Outputs the final count for both even and odd numbers

Example array:  
`[2, 33, 84, 72, 5]`

## 🚀 Getting Started

### Requirements

- Java Development Kit (JDK 8 or higher)

### How to Compile

```bash
javac FindEven_OddNumbersInArray.java
```

### How to Run

```bash
java day7.FindEven_OddNumbersInArray
```

> 📁 Note: Because of `package day7;`, the `.java` file must be inside a folder named `day7`.

## 🖥️ Example Output

```
Number of Even numbers 3
Number of Odd numbers 2
```

(For the array: `[2, 33, 84, 72, 5]`)

## 🧠 How It Works

- Iterates through the array using a `for` loop
- Checks each number:
  - If divisible by 2 → increments the even counter
  - Otherwise → increments the odd counter
- Displays the final counts

## 💡 Ideas for Improvement

- Allow user input to define the array dynamically
- Separate and print the even and odd numbers in two lists
- Extend functionality to handle very large arrays or random arrays
- Add percentages (e.g., "60% even, 40% odd")

## 📄 License

This project is licensed under the [MIT License](https://opensource.org/licenses/MIT).

# Finding-Even-and-Odd-Numbers
