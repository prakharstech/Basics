import java.util.Scanner;

class Library{
    String[] books;
    String book;
    int nob;
    int flag=0;
    int ad=0;
    Scanner s=new Scanner(System.in);
    Library(){
        this.books=new String[100];
        this.nob=0;
    }
    public void addBooks(){
        int a;
        System.out.println("Enter the number of books you want to add to the library:");
        a=s.nextInt();
        s.nextLine();
        System.out.println("Enter the name(s) of book:");
        for(int i=1;i<=a;i++){
        book=s.nextLine();
        this.books[nob]=book;
        nob++;
        flag++;
        ad++;
        System.out.println(book+" has been added");
        }
    }
    public void showBooks(){
        System.out.println("Available books are:");
        for(String book:this.books){
            if(book==null){continue;}
            System.out.println("* "+book);
        }
    }
    public void issueBook(){
        int b;
        System.out.println("Enter the number of books you want to borrow:");
        b=s.nextInt();
        s.nextLine();
        System.out.println("Enter the name of book(s) which you want to borrow:");
        for(int j=0;j<b;j++){
            String bs=s.nextLine();
        for(int i=0;i<books.length;i++){
            if(books[i]!=null && books[i].equals(bs)){
                System.out.println(bs+" has been issued to you");
                flag--;
                books[i]=null;
                return;
            }
        }
        System.out.println("This book does not exists");
    }
    }
    public void returnBook(){
        System.out.println("How many books are you returning?");
        int c=s.nextInt();
        s.nextLine();
        System.out.println("Enter the name of book to be returned back:");
        for(int k=0;k<c;k++){
        String bk=s.nextLine();
        nob++;
        flag++;
        this.books[nob]=bk;
        System.out.println(bk+" has been returned back");
        }
    }
    public void run(){
        System.out.println("1--> Add books to the library\n2--> Display available books\n3--> Borrow books\n4--> Return books back\n5--> Show book stats");
        int d=s.nextInt();
        switch(d){
            case 1:
            addBooks();
            run();
            case 2:
            showBooks();
            run();
            case 3:
            issueBook();
            run();
            case 4:
            returnBook();
            run();
            case 5:
            System.out.println("Total books in library: "+ad);
            System.out.println("Available books to borrow: "+flag);
            run();
            default:
            System.out.println("Enter a valid input");
            run();
        }
}
}
public class lib_adv {
    public static void main(String[] args) {
        System.out.println("Welcome to Prakhar's Library!!");
        Library l=new Library();
        l.run();
    }
}
