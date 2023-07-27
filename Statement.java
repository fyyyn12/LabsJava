public class Statement {
    public static void main(String[] args) {
//        if statement
        Boolean Bol = true;
       var nBol = "a";
       Integer tern = 1;
//         if(nBol == Bol){
//             System.out.println("salah");
//         } else if (nBol != Bol) {
//             System.out.println("benar");
//         }
//        switch
//        switch (nBol){
//            case "a":
//                System.out.println("true!");
//                break;
//            case "b":
//                System.out.println("false");
//                break;
//            default:
//                System.out.println("is default");
//        }

//        lambda

//        switch (nBol){
//            case "" -> System.out.println("is A");
//            case "b" -> System.out.println("is B");
//            default -> {
//                System.out.println("is default's");
//                System.out.println("is wrongs");
//            }
//        }

//        ternarry

        String Ter = (tern >10) ? "is true" : "is wrong";
        System.out.println(Ter);
        for (int x =1; x <= 100; x++){
            System.out.print("-"+x);
        }
    }
}
