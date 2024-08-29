package Muhtar_SDET.Day04_Primitive_Castings_Concatenation;

public class Task7_Circle {

    public static void main(String[] args) {
        double radius = 5;
        double findArea = 3.14 * (radius * radius);
        double findPerimeter = 3.14 * (radius * 2);
        System.out.println(findArea);
        System.out.println(findPerimeter);


        System.out.println("Area of the circle is: " + String.format("%1f", findArea)
                + "\nPerimeter of the circle is: " + String.format("%.1f", findPerimeter));

        //System.out.printf("Product: %s, Quantity: %d, Price: %.2f USD\n", product, quantity, price);
    }
}

/*
### **Using `printf`**
The **`printf`** method is generally used in the following form:
System.out.printf(format, arguments);

- **`format`**: The format string that specifies how the output should appear.
- **`arguments`**: The values to be formatted and displayed according to the format string.

### **Format String**

The format string can include plain text as well as placeholders that start with **`%`** and end with a format specifier. Here are some commonly used format specifiers:

- **`%d`**: Decimal integer
- **`%f`**: Floating-point number
- **`%s`**: String
- **`%c`**: Single character
- **`%x`**: Integer in hexadecimal format (base 16)

### **Examples**
Below are some examples demonstrating how to use the **`printf`** method in Java.
int number = 123;
System.out.printf("Integer: %d\n", number); output —>Integer: 123
String name = "Java";
System.out.printf("Hello, %s!\n", name); output—> Hello, Java!

**Using Multiple Placeholders**
String product = "Laptop";
int quantity = 5;
double price = 799.99;
System.out.printf("Product: %s, Quantity: %d, Price: %.2f USD\n", product, quantity, price);

output—> Product: Laptop, Quantity: 5, Price: 799.99 USD
 */