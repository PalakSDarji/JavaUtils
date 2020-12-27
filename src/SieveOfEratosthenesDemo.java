import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SieveOfEratosthenesDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        scanner.close();

        SieveOfEratosthenesDemo sieveOfEratosthenesDemo = new SieveOfEratosthenesDemo();
        sieveOfEratosthenesDemo.findPrime(number);
    }

    private void findPrime(int n){

        boolean[] primeArr = new boolean[n];
        List<Integer> primeList = new ArrayList<>();
        primeArr[0] = false;
        for(int i= 1; i< n; i++){
            primeArr[i] = true;
        }

        for(int i=2; i<=n; i++){
            if(primeArr[i-1]){
                System.out.println("prime: "+ i);
                primeList.add(i);
                for(int j = i*i; j<=n; j+=i){
                    //System.out.println("making prime: "+ j);
                    primeArr[j-1] = false;
                }
            }
        }

        System.out.println(primeList);
    }
}
