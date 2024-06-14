import java.util.Scanner;
class Gpa{
    int gradeint=0;
    String grade;
    public int gradeInput(){
        Scanner sc=new Scanner(System.in);
        grade=sc.nextLine();
        switch (grade) {
            case "A+":
                gradeint=10;
                break;
            case "A":
                gradeint=9;
                break;
            case "B":
                gradeint=8;
                break;    
            case "C":
                gradeint=7;
                break;
            case "D":
                gradeint=6;
                break;
            case "E":
                gradeint=5;
                break;
            default:
                break;
        }
        return gradeint;
    }
}
public class cgpa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose your cycle\n1--> Chemistry Cycle\n2--> Physics Cycle");
        int cycle=sc.nextInt();
        int s1=0;
        int s2=0;
        int s3=0;
        int s4=0;
        int s5=0;
        int s6=0;
        int s7=0;
        int s8=0;
        int s9=0;
        if(cycle==1){
            System.out.println("Enter your grades");
            Gpa g=new Gpa();
            System.out.print("Engineering Mathemeatics 2: ");
            s1=g.gradeInput()*4;
            
            System.out.print("Engineering Chemistry: ");
            s2=g.gradeInput()*3;
            
            System.out.print("Basic Electrical Technology: ");
            s3=g.gradeInput()*3;
            
            System.out.print("Biology for Engineers: ");
            s4=g.gradeInput()*3;
            
            System.out.print("Problem Solving Using Computers: ");
            s5=g.gradeInput()*3;
            
            System.out.print("Environmental Studies: ");
            s6=g.gradeInput()*2;
            
            System.out.print("Engineering Chemistry Lab: ");
            s7=g.gradeInput();
            
            System.out.print("Engineering Graphics: ");
            s8=g.gradeInput();
            
            System.out.print("Problem Solving Using Computers Lab: ");
            s9=g.gradeInput();
            int sum=s1+s2+s3+s4+s5+s6+s7+s8+s9;
            float gp =sum/21.0f;
            System.out.print("Your GPA is ");
            System.out.printf("%.2f",gp);
        }
        if(cycle==2){
            System.out.println("Enter your grades");
            Gpa g=new Gpa();
            System.out.print("Engineering Mathemeatics 2: ");
            s1=g.gradeInput()*4;
            
            System.out.print("Engineering Physics: ");
            s2=g.gradeInput()*3;
            
            System.out.print("Basic Electronics: ");
            s3=g.gradeInput()*3;
            
            System.out.print("Mechanics of Solids: ");
            s4=g.gradeInput()*3;
            
            System.out.print("Basic Mechanical Engineering: ");
            s5=g.gradeInput()*3;
            
            System.out.print("Communication Skills in English: ");
            s6=g.gradeInput()*2;
            
            System.out.print("Engineering Physics Lab: ");
            s7=g.gradeInput();
            
            System.out.print("Engineering Graphics: ");
            s8=g.gradeInput();
            
            System.out.print("Workshop Practice: ");
            s9=g.gradeInput();
            int sum=s1+s2+s3+s4+s5+s6+s7+s8+s9;
            float gp =sum/21.0f;
            System.out.print("Your GPA is ");
            System.out.printf("%.2f",gp);
        }
        
        
}
}
