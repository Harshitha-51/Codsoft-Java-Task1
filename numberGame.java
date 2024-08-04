import java.util.*;
class numberGame{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int Random_number=rand.nextInt(100)+1;
        System.out.print("Enter the number of attempts: ");
        int max_attempts=sc.nextInt();
        String play_again="Yes";
        int score=0;
        int user_attempts=0;
        String user_try="No";
        int attempt_num=0;
        // for(int i=0;i<max_attempts;i++)
        System.out.println("The random number generated is: "+Random_number);
        do{
            System.out.print("Enter your guess number: ");
            int guess_number=sc.nextInt();
            if(Random_number==guess_number){
                user_attempts+=1;
                System.out.println("Yayyy!!! your guess is CORRECT");
                if(user_attempts==1){
                    score+=10;
                }
                else{
                    score+=5;
                }
                break;
            }
            else if(Random_number>guess_number){
                System.out.println("YOUR GUESS IS TOO LOW");
                user_attempts+=1;
            }
            else{
                System.out.println("YOUR GUESS IS TOO HIGH");
                user_attempts+=1;
            }
            if(user_attempts==max_attempts){
                System.out.println("OOPS!! YOUR ATTEMPTS ARE COMPLETED..");
                System.out.println("Wanna give another try..!?");
                user_try=sc.next();
                if(user_try.equals("YES") || user_try.equals("yes")  ){
                    user_attempts=0;
                    attempt_num+=1;
                }
                else{
                    break;
                }
            }
            
        }while(user_attempts<=max_attempts );
        System.out.println("Your Score is: "+(score-attempt_num));
    }
}