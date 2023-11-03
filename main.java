import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        int sum = 0;
        System.out.println("================== Calculator Program ==================");
        System.out.println("How many numbers do you want to put in the calculator?");
        int numOfNums = scanner1.nextInt();
        System.out.println("Enter the operant do you want to use?(Type the name)");
        String operand = scanner2.nextLine();
        for(int i = 0; i<numOfNums;i++){
            System.out.println("Number: ");
            int num = scanner3.nextInt();
            switch(operand) {
                case "add":
                if (sum != 0){
                    sum += num;
                    } else{
                        sum = num;
                        }
                        break;

                case "minus":
                if (sum != 0){
                    sum -= num;
                    } else{
                        sum = -num;
                        }
                        break;
                case "divide":
                if (sum != 0){
                    sum /= num;
                    } else{
                        sum = 0/num;
                        }
                        break;
                case "multiply":
                if (sum != 0){
                    sum *= num;
                    } else{
                        sum = num;
                        }
                        break;
                
                
                default :
                System.out.println("Invalid Operand!");
                 return;

            }
        }
        
        System.out.println("Sum: " + sum);

    }
}