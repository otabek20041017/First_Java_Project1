import java.util.*;

public class Kahoot {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
//
//        //WRITE YOUR CODE BELOW
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//
//            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
//                count++;
//            }else if (str.charAt(i) == 'h' || str.charAt(i) == 'i'){
//                System.out.println(0);
//                }
//            }
//        }
//        System.out.println(count);
//    }
//}

//
//        //WRITE YOUR CODE BELOW
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if (str.equals(i + "hi") && str.equals("h")) {
//                count++;
//            }
//        }
//        System.out.println(count);
//    }
//}


//===============================================================
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//
//            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
//                count++;
//            } else if (str.equals(i + "h")) {
//                System.out.println(str.length());
//            } else {
//            }
//        }
//        System.out.println(count);
//    }
//}


        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
                count++;
            } else{
                if (str.contains("h") && str.contains("i")) {
                    System.out.println(str.contains(str));
                }
            }
        }
        System.out.println(count);
    }
}