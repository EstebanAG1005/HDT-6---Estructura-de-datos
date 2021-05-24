  public class Driver{

    /* Driver program to test above function */
    public static void main(String[] args)
    {
        String exprsn = "+8*26";
        GFG.evaluatePrefix(exprsn);

        System.out.println(GFG.evaluatePrefix(exprsn));

        String exp = "100 200 + 2 / 5 * 7 +";

        Test1.evaluatePostfix(exp);
        
        System.out.println(Test1.evaluatePostfix(exp));
    }
  } 