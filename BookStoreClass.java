public class BookStoreClass {

    private static String bookNAME,bookAuthor;
    private int bookYear;

 public BookStoreClass(){

 }

 public String getbookNAME(){

     return bookNAME;
   
   
    }

public void  setbookNAME(string newBookName){

   this.bookNAME = newBookName;

}

public String getBookAuthor(){

    return bookAuthor;
  
  }

public void setBookAuthor(string newbookAuthor){

    this.bookAuthor = newbookAuthor;

}

public int getbookYear(){

    return bookYear;
  
  }

public void  setbookYear(string newBookName){

  this.bookNAME = newBookName;

}


 public static void main(String[] args){

System.out.println("Book Shop");
System.out.println();

//adding 
System.out.println("Please enter a book name");
System.out.println("Please enter a book author");
System.out.println("Please enter a book year");

//viewing
System.out.println("Please select a book name");


///update
System.out.println("Please select a book to update");


//delete
System.out.println("Please select a book to delete");

 }



}   