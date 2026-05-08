package week2.day1;

public class Library {
    
    //declare a method name
    public String addBook(String bookTitle){
        //print the statement

        System.out.println("Book Added Sucessfully");
        return bookTitle;
    }
    //another method defining
    public void issueBook() {
        //print statemnt
        System.out.println("Book Issued Successfully");
    
    }
 public static void main(String[] args) {

    Library options=new Library();
    options.addBook("Tiny Tales");
    options.issueBook();

    
 }

}


