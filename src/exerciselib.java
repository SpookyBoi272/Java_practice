import java.util.Scanner;

class Library{
    String[] availableBooks;
    int noOfBooks;
    String book;
    public Library(){
        this.availableBooks = new String[100];
        this.noOfBooks = 0;
    }

    public void showAvailabeBooks(){
        System.out.println("-------------------------");
        for (String book : this.availableBooks){
            if (book == null){
                continue;
            }
            System.out.println(book);
        }
        System.out.println("-------------------------");
        System.out.println(this.noOfBooks + " Books are available");
    }

    public void addBook(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the book to be added: ");
        String book = sc.nextLine();
        availableBooks[this.noOfBooks]= book;
        this.noOfBooks++;
        System.out.println(book + " has been Added");
    }

    public void issueBook(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the book to be issued: ");
        String book = sc.nextLine();
        for (int i=0; i<this.noOfBooks; i++){
            if (this.availableBooks[i].equals(book)){
                this.availableBooks[i] = null;
                System.out.println(book + " has been Issued!");
                this.noOfBooks--;
                break;
            }
            else {
                System.out.println("Book not found");
            }
        }
    }

    public void returnBook(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the book to be returned: ");
        String book = sc.nextLine();
        availableBooks[this.noOfBooks]= book;
        this.noOfBooks++;
        System.out.println(book + " has been Returned");
    }
}
public class exerciselib {
    public static void main(String[] args) {
        Library lib = new Library();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("[0]To Exit [1]To add Book [2]To issue Book [3]To return book [4]To show available Books");
            int userInput = sc.nextInt();
            if (userInput == 1){
                lib.addBook();
            }
            else if (userInput == 2) {
                lib.issueBook();
            }
            else if (userInput == 3){
                lib.returnBook();
            }
            else if(userInput == 4){
                lib.showAvailabeBooks();
            }
            else { break; }
            }
        }

    }

