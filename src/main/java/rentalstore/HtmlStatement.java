package rentalstore;

public class HtmlStatement extends StatementAbstract {
    @Override
    protected String headString(String customerName) {
        String result = "<H1>Rentals for <EM>" + customerName + "</EM></H1><P>\n";
        return result;
    }

    @Override
    protected String eachRentalString(String movieTitle,double thisAmount) {
        String result="";
        result  += movieTitle
                + "\t"
                + String.valueOf(thisAmount)
                + "\n";
        return result;
    }

    @Override
    protected String footerString(double totalAmount,int frequentRenterPoints) {
        String result = "";
        result  += "<P>You owe<EM>"
                + String.valueOf(totalAmount)
                + "</EM><P>\n"
                + "On this rental you earned <EM>"
                + String.valueOf(frequentRenterPoints)
                + "</EM> frequent renter points<P>";
        return result;
    }
}
