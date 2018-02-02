// Question: Given the following method, which of the method calls return 2? (Choose all that apply)

public class Question05 {
    public static void main(String[] args) {
        Question05 obj = new Question05();
        


//        howMany();
//          obj.howMany(true);
   //       obj.howMany(true, true);
    //      obj.howMany(true, {2}, true, true);
//          obj.howMany(true, {true});
//        obj.howMany(true, {true, true});
   //     obj.howMany(true, new boolean[2]); 
            obj.test({1, 2});
    }

   // public int howMany(boolean b, int arr[], boolean... b2) {
    //    System.out.println(b2.length);
 //       Array arr = new Array[] {1,2,3};
 //       Array arr2 = {1,2,3};
   //     return b2.length;
    //}

    public void test(int[] array)
    {
        System.out.println(array);

    }
}

// Hint:

