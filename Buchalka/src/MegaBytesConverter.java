//package BuchalkaChallenge;
//
//import static java.lang.Integer.parseInt;
//
//public class MegaBytesConverter {
//
//    public static void main(String [] args) {
//        int input = parseInt(args[0]);
//        printMegaBytesAndKiloBytes(input);
//    }
//
//    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
//       if(kiloBytes < 0) {
//           System.out.println("Invalid Value");
//       } else {
//           int megaBytes = kiloBytes / 1024;
//           int rolloverKilos = kiloBytes % 1024;
//           System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + rolloverKilos + " KB");
//       }
//    }
//}
