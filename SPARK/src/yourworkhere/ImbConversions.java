package yourworkhere;

import java.text.DecimalFormat;

public class ImbConversions {

    public static double CurrencyConvert(double inputVar) {

        /* First we use DecimalFormat (Imported above) to convert our lengthy double. */

        String midVar = (new DecimalFormat("#.##").format(inputVar));

        /* The problem is this conversion outputs a String. If we want it to be usable in
         * conversions later we must convert it back to a double.
         */

        double outputVar = Double.parseDouble(midVar);

        return outputVar;
    }
}
