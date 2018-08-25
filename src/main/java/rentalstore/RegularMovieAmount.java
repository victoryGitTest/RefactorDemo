package rentalstore;

public class RegularMovieAmount implements MovieAmount {
    @Override
    public double getMovieThisAmount(int dayRented) {
        double thisAmount =0;
        thisAmount += 2;
        if(dayRented > 2){
            thisAmount+=(dayRented - 2) * 1.5;
        }
        return thisAmount;
    }
}
