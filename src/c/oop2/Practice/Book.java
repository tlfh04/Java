package c.oop2.Practice;

public class Book {
    String title,author,isbn;
    int price;


    // 생성자
    Book(String title, String author){
        this(title,author,null,0);
    }
    Book(String title, String author, int price){
        this(title,author,null,price);
    }
    Book(String title, String author, String isbn, int price){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }
    public void displayInfo(){
        displayInfo(false);
    }
    public void displayInfo(boolean detailed){
        System.out.println(this.title+" - "+"저자:"+this.author+", 가격:"+this.price);
        if(detailed == true && this.isbn != null){
        System.out.print("ISBN: "+this.isbn);
        }
    }
    public void applyDiscount(int percent){
        this.price -= price * percent/100;
    }
    public void applyDiscount(int amount,boolean isPercent){
        if(isPercent == true){
            applyDiscount(amount);
        }else{
            this.price -= amount;
        }
    }
    public void getTitle(){
        System.out.println(this.title);
    }
    public void getAuthor(){
        System.out.println(this.author);
    }
    public void getPrice(){
        System.out.println(this.price);
    }

}
