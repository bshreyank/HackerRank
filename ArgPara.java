/**
 * Arg-para
 */
public class ArgPara {

    static void display(String str) //Parameter
    {
        System.out.println("Welcome Back " + str);
    }

    static int addition(int a, int b)
    {
        System.out.println(a+b);
        return a+b;
    }

    //main
    public static void main(String[] args) {
        
        display("Archit"); //Argument

        addition(10, 20);

    }//main
    
}//class

///Ambiguity error 