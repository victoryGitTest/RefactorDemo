package rentalstore;

public class MovieAmountFactory {

    public static MovieAmount getMovieAmount(int priceCode){
        double thisAmount =0;
        switch (priceCode){
            case Movie.REGULAR:
                return new RegularMovieAmount();
            case Movie.NEW_RELEASE:
                return new NewReleaseMovieAmount();
            case Movie.CHILDRENS:
                return new ChildrensMovieAmount();
            default:
                return null;
        }
    }
}
