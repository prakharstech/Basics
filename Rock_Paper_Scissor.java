import java.util.Scanner;
import java.util.Random;
public class rock_paper_scissor {
    public static void main(String[] args) {
        int flag1=0,flag2=0;
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        System.out.println("Welcome to the Rock Paper Scissor Game!\n");
        for (int i=1;i<6;i++){
            System.out.printf("Round %d\n",i);
        System.out.println("\nChoose your move\n\nChoose\n1:Rock\n2:Paper\n3:Scissor\n");
        int move=sc.nextInt();
        int num=r.nextInt(1,4);
        if (move==1 && num==2){
            System.out.println("Your move: Rock");
            System.out.println("Computer's move: Paper\n");
            System.out.println("You Loose! :(\n");
            flag2++;
        }
        else if (move==1 && num==3){
            System.out.println("Your move: Rock");
            System.out.println("Computer's move: Scissor\n");
            System.out.println("You Win!! :)\n");
            flag1++;
        }
        else if (move==2 && num==1){
            System.out.println("Your move: Paper");
            System.out.println("Computer's move: Rock\n");
            System.out.println("You Win!! :)\n");
            flag1++;
        }
        else if (move==2 && num==3){
            System.out.println("Your move: Paper");
            System.out.println("Computer's move: Scissor\n");
            System.out.println("You Loose! :(\n");
            flag2++;
        }
        else if (move==3 && num==1){
            System.out.println("Your move: Scissor");
            System.out.println("Computer's move: Rock\n");
            System.out.println("You Loose! :(\n");
            flag2++;
        }
        else if (move==3 && num==2){
            System.out.println("Your move: Scissor");
            System.out.println("Computer's move: Paper\n");
            System.out.println("You Win!! :)\n");
            flag1++;
        }
        else if (move==1 && num==1){
            System.out.println("Your move: Rock");
            System.out.println("Computer's move: Rock\n");
            System.out.println("It's a Tie!!\n");
        }
        else if (move==2 && num==2){
            System.out.println("Your move: Paper");
            System.out.println("Computer's move: Paper\n");
            System.out.println("It's a Tie!!\n");
        }
        else if (move==3 && num==3){
            System.out.println("Your move: Scissor");
            System.out.println("Computer's move: Scissor\n");
            System.out.println("It's a Tie!!\n");
        }
    }
    if (flag1>flag2){
        System.out.println("You are the winner of the game!!! :))");
    }
    else if(flag1<flag2){
        System.out.println("You lost the game!! :((");
    }
    else System.out.println("The game is a Tie!!");
    }
    
}
