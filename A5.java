//turabaev69 
// JAVA Program takes operation and two integers num1 and num2, 
// according to chosen operation (-, +, *, %), gives results of the integers (num1 and num2) calulated 
// via Abstract methods which dont have bodies inside abstract class.  but provided their body inside 
/// sub class (with 3 @Overrides ) and called them from main class via (object) objects  with two integers type parameters

import java.util.Scanner; 

// abstract class Bike with one abstract method sum works as well. if u want to test, just comment abstract class with four abstract methods and -->
//  change name of integer inside child class to all similar like this --> (div --> sum .etc) 
// (int a3 = obj.div(num1, num2); --> int a3 = obj.sum(num1, num2);)

// abstract class Bike {
//   abstract int sum(int a, int b);
// }

abstract class Bike {
  abstract int sum(int a, int b);
  abstract int sub(int a, int b);
  abstract int div(int a, int b);
  abstract int mul(int a, int b);
}
// class A5 extends Bike {
//   int sum(int a, int b) {
//     return (a + b);
//   }
// }

// class A1 extends Bike{
//   int sub(int a, int b) {
//     return (a - b);
// }
// }

// class A4 extends Bike{
//   int mul(int a, int b) {
//     return (a * b);
// }
// }

class A3 extends Bike{
  int div(int a, int b) {
    return (a / b);
}

  public static void main(String args[]) {

    Scanner myObj = new Scanner(System.in); 

    System.out.print("Choose one operation('1 = -'. ' 2 = +'. '3 = %'. '4 = x' ): ");

    int oper = myObj.nextInt();

    System.out.print("1 number: ");
    int num1 = myObj.nextInt();
    System.out.print("2 number: ");
    int num2 = myObj.nextInt();
    A3 obj = new A3();
    if (oper == 1) {
      // A1 obj1 = new A1();
      // int a1 = obj1.sub(num1, num2);
      int a1 = obj.sub(num1, num2);
      System.out.println(num1 + " - " + num2 + " = " + a1); 

    } else if (oper == 2) {

      // A5 obj = new A5();
      int a = obj.sum(num1, num2);
      System.out.println(num1 + " + " + num2 + " = " + a);

    } else if (oper == 3){
      int a3 = obj.div(num1, num2);
      System.out.println(num1 + " % " + num2 + " = " + a3);

    } else if (oper == 4){
      // A4 obj = new A4();
      int a4 = obj.mul(num1, num2);
      System.out.println(num1 + " x " + num2 + " = " + a4);

    } else {
      System.out.println("I dunno ");
    }
       
  }

  @Override
  int sum(int a, int b) {
      return (a + b);
   
  }

  @Override
  int sub(int a, int b) {
    return (a - b);
  }

  @Override
  int mul(int a, int b) {
    return (a * b);
  }
}