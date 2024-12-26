import java.util.Scanner;

public class Client {
     private DispenseChain c1;

    public Client() {
        this.c1 = new dollar50Dispensor();
        DispenseChain c2 = new dollar20Dispensor();
        DispenseChain c3 = new dollar10Dispensor();
        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }

    public static void main(String[] args) {
        Client atmDispensor = new Client();

        while (true)
        {
            int amount = 0;
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();

            if (amount % 10 != 0)
            {
                System.out.println("Amount should be in multiple of 10s");
                return;
            }

            //process the request
            atmDispensor.c1.dispense(new Currency(amount));
        }
    }

}
