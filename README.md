# SierpinskiTriangle
An Implementation of constructing Sierpinski Triangle using Chaos game
Sierpinski Triangle: https://en.wikipedia.org/wiki/Sierpi%C5%84ski_triangle
There are many ways to construct a Sierpinski Triangle. Chaos game process is used in this Java implmentation.
These steps are followed:
 1. Start with choosing there end points of an equalateral triangle.
 2. Choose any point P inside the triangle
 3. Choose a random point X from the three initial end points taken at step 1
 4. Calculate the mid point of P and X and draw it
 5. Update P with the mid point calculated at Step 4
 6. Repeat step 3-5 for N times, where N in the number of iteration
 
## Usage:
Compile the Java file, then rum

`java SierpinskiTriangle dim iteration`

dim is the dimension of the image, iteration is the number of times the algorithm should run


## Example

SierpinskiTriangle in a 500X500 pixel image with after 1000 iteration

SierpinskiTriangle in a 500X500 pixel image with after 10000 iteration

SierpinskiTriangle in a 500X500 pixel image with after 25000 iteration



