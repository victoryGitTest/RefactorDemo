package rentalstore;

public class Statement extends StatementAbstract{

    @Override
    protected String headString(String customerName) {
        String result = "Rental Record for " + customerName + "\n";
        return result;
    }

    @Override
    protected String eachRentalString(String movieTitle,double thisAmount) {
        String result="";
        result  += "\t"
                + movieTitle
                + "\t"
                + String.valueOf(thisAmount)
                + "\n";
        return result;
    }

    @Override
    protected String footerString(double totalAmount,int frequentRenterPoints) {
        String result = "";
        result  += "Amount owed is "
                + String.valueOf(totalAmount)
                + "\n"
                + "You earned "
                + String.valueOf(frequentRenterPoints)
                + " frequent renter points";
        return result;
    }
}
