/*Assume that class A extends class B, which extends class C. Also all the three classes
 *  implement the method test(). How can a method in a class A invoke the test() method defined
 *   in class C (without creating a new instance of class C).
Select the one correct answer.
a. test();
b. super.test();
c. super.super.test();
d. ::test();
e. C.test();
f. It is not possible to invoke test() method defined in C from a method in A. */

class C {
    public void test() {	//inside test method of class C
        System.out.println("Inside test() of C");
    }
}
class B extends C {		//class B extends C
    public void test(){		//inside test method of class B
        System.out.println("inside test() of B");
    }
}
class A extends B{		//class A extends B
    public void test(){		//inside test method of class A
        System.out.println("inside test() of A");
    }
}
public class InherProblem {
    public static void main(String args[]) {
        A obj = new A();
        obj.test();
    }
}
/* the correct answer for the above statement is option(f). we can not invoke test method defined in C from method in A. 
 * All the above options give error or does not give the desired output as shown in screenshots
 */
