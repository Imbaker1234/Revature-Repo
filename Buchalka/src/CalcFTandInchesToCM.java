public class CalcFTandInchesToCM {

        public static void main(String[] args) {
            calcFeetAndInchesToCentimers(6, 8);
            calcFeetAndInchesToCentimers(6);
        }


        public static double calcFeetAndInchesToCentimers(double feet, double inches) {
            if (feet < 0 || (inches < 0) || (inches > 12)) {
                System.out.println("Invalid parameters");
                return -1;
            }

            double centimeters = (feet * 12) * 2.54;
            centimeters += inches * 2.54;
            System.out.println(feet + " feet, " + inches + " inches =" + centimeters + " cm");
            return centimeters;
        }

        public static double calcFeetAndInchesToCentimers(double inches) {
            if (inches < 0) {
                return -1;
            }

            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
            return calcFeetAndInchesToCentimers(feet, inches);
        }
    }
