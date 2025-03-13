public class fibonaccinum {

    public static void main(String[] args) {

        System.out.println("\nWelcome to the Fibonacci Machine!");
        System.out.println("\nEnter the command 'java fibonaccinum z' (without the quotation marks) with an integer between 0 and 19 (inclusive) in place of z.");
        System.out.println("The Fibonacci number for the position you entered will then be displayed.");
        System.out.println("For example, if you type 'java fibonaccinum 7', '13' will be shown.\n");
        
        if(args.length == 0) {
            System.out.println("Please enter an input from 0 to 19 (inclusive).\n");
            return;
        }

        if (args.length > 0) {
            try {

                int firstInput = Integer.parseInt(args[0]);

                if (firstInput < 0 || firstInput > 19) {
                    System.out.println("Please enter a valid input from 0 to 19 (inclusive).\n");
                }
                else if (firstInput == 0) {
                    System.out.println("The Fibonacci number for position 0 is 0.\n");
                }
                else if (firstInput == 1) {
                    System.out.println("The Fibonacci number for position 1 is 1.\n");
                }
                else if (firstInput >= 0 && firstInput <= 19) {
                    int x1 = 0;
                    int x2 = 1;
                    for (int i = 2; i <= firstInput; i++) {
                    int fibSeqNum = x1 + x2;
                        x1 = x2;
                        x2 = fibSeqNum;
                }
                    System.out.println("The Fibonacci number for position " + firstInput + " is " + x2);

                }
                
        }   catch (NumberFormatException e) {
                System.err.println("Argument " + args[0] + " must be an integer.");
                System.exit(1);
    }

    }

    }

}