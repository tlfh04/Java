package c.oop2.Practice;

public class Library {
    Book[] books;
    int bookCount;

    public Library(int capacity){
        books = new Book[capacity];
        bookCount = 0;
    }
    public void addBook(Book book){
        if (bookCount > books.length){
            System.out.println("더 이상 책을 추가할 수 없습니다.");
            return;
        }
        books[bookCount++] = book;
    }
    public void addBook(String title,String author){
        addBook(new Book(title,author));
    }
    public void addBook(String title,String author,int price){
        addBook(new Book(title,author,price));
    }
    public void displayAllBooks(){
        if  (bookCount == 0){
            System.out.println("등록된 책이 없습니다.");
            return;
        }
        for(int i = 0; i < bookCount; i++){
            Book b = books[i];
            System.out.print((i+1)+". ");
            b.displayInfo();
        }
    }
    public void searchByTitle(String keyword){
        if  (bookCount == 0){
            System.out.println("등록된 책이 없습니다.");
            return;
        }
        for(int i = 0; i < bookCount; i++){
            Book b = books[i];
            if(books[i].title.toLowerCase().contains(keyword.toLowerCase())){
                b.displayInfo();
            }
        }
    }
    public void searchByAuthor(String author){
        if  (bookCount == 0){
            System.out.println("등록된 책이 없습니다.");
            return;
        }
        for(int i = 0; i < bookCount; i++){
            Book b = books[i];
            if(books[i].author.toLowerCase().contains(author.toLowerCase())){
                b.displayInfo();
            }
        }
    }
    public int getTotalPrice(){
        int totalPrice = 0;
        for (int i = 0; i < bookCount; i++){
            Book b = books[i];
            totalPrice += b.price;
        }
        return totalPrice;
    }
    public int getAveragePrice(){
        if  (bookCount == 0){
            System.out.println("등록된 책이 없습니다.");
            return 0;
        }
        return getTotalPrice() / bookCount;
    }
    public int getBookCount(){
        return bookCount;
    }
    public void applyDiscountToAll(int percent){
        for (int i = 0; i < bookCount; i++){
            Book b = books[i];
            b.applyDiscount(percent);
        }
    }
}
