public class Primes {
    public static void main(String[] args) {
        int size =Integer.parseInt(args[0]);
        boolean[] numbers = new boolean[size + 1];
        for (int i = 2; i < numbers.length; i++) {
            numbers[i] = true;
        }
        int index = 2;
        while (index <= Math.sqrt(size)) {
            if (numbers[index] == true) {
                for (int i = index + 1; i < numbers.length; i++) {
                    if (i % index == 0) {
                        numbers[i] = false;
                    }
                }
            }
            index++;
        }
        System.out.println ("Prime numbers up to " + size + ":");
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == true) {
                System.out.println (i);
                count++;
            }
        }
        double presentage = 100.0 * count / size;
        System.out.println ("There are " + count + " primes between 2 and " + size +" (" + (int)presentage + "% are primes)" );
        

    }
}
