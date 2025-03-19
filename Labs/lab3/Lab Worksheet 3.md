#### Lab Worksheet 3

This lab worksheet comprises a series of exercises to work through. Feel free to discuss these with other students. Please ask the lab facilitator if you need help. Their job is to help you learn.

##### Exercise 1

We're going to create a more complex guess the number game. We saw a basic example in Lecture 2. In our new version of the game, the computer will first pick a random number between 1 and 100. To generate a random number, you will want to use the [java.util.Random](https://docs.oracle.com/javase/8/docs/api/java/util/Random.html) class (remember that you need to import it). The .nextInt(...) method is the most convenient. After generating a random number, the user will repeatedly guess numbers. If their guess is too high, the computer should print a message saying the guess was too high, if it is too low, the computer should print a message saying the guess was too low. If the human guesses the right number, the computer should print out that the user was correct and then the program should end.

A good way to start is to grab the GuessTheNumber class from Lecture 2 and modify it. Note that you will need to use Scanner to read input from the terminal.

##### Exercise 2

In this exercise, we implement a program to compute factorials. The factorial of a positive number N (denoted by N!) is the product of integers from 1 to N. For example, five factorial (denoted by 5!) is 1*2*3*4*5=120. Write a program that reads a single "int" from the terminal and then prints the factorial of that number.

- Compute 17!
- Did your program produce the correct output? (355687428096000)
- If not, see if you can fix it
- Your program probably produces an incorrect answer for 30!, if so, why? (30! = 265252859812191058636308480000000)
- Can you approximate the answer using a "double"?
- See the [BigInteger](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/math/BigInteger.html) class from Java's API. Can you modify your program to use this to compute 30 factorial exactly? Note that BigInteger is in java.math when you import it.

##### CodingBat Exercises

- [makeChocolate](https://codingbat.com/prob/p191363)
- [closeFar](https://codingbat.com/prob/p138990)