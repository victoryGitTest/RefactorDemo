package rentalstore;

public class NewReleaseMovieAmount implements MovieAmount {
    @Override
    public double getMovieThisAmount(int dayRented) {
        double thisAmount =0;
        thisAmount+=dayRented*3;
        return thisAmount;
    }
}
