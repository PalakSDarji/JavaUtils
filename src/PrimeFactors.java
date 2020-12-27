import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public static void main(String[] args){
        PrimeFactors primeFactors = new PrimeFactors();
        System.out.println(primeFactors.findPrimeFactors(315));
    }

    private List<Integer> findPrimeFactors(int n){
        List<Integer> primeFactors = new ArrayList<>();

        while(n%2 == 0){
            primeFactors.add(2);
            n /= 2;
        }

        //Now, n must be some odd number which is not divisible by 2.
        for(int i=3;i<=Math.sqrt(n);i+=2){

            while (n%i == 0){
                primeFactors.add(i);
                n /= i;
            }
        }

        if(n > 2){
            primeFactors.add(n);
        }

        return primeFactors;
    }
}
