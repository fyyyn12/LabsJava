public class IsArray {
    public static void main(String[] args) {
        String[] isStrArray = {
          "in0","in1","in2"
        };
        Integer[] inIntArray ={
                0,1,2,3,4,5,6,7,8,9,10
        };
        inIntArray[1] = 12;
//        array in array
        String[][] ArrayinArray ={
                {"1","2","3"},
                {"4","5","6"},
                {
                    "7","8","9"
                }
        };
        System.out.println(inIntArray[1]);
        System.out.println(ArrayinArray[1][0]);
    }
}
