package d.inheritance.Practice2;
class Movie{
    String title;
    double rating;

    public Movie(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }
    public void displayInfo(){
        System.out.print(title+"(" +rating + ") -");
    }
}
class ActionMovie extends Movie{
    String specialEffacts;

    public ActionMovie(String title, double rating, String specialEffacts) {
        super(title, rating);
        this.specialEffacts = specialEffacts;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println(" 특수효과: "+specialEffacts );
    }
}
class Comedy extends Movie{
    String humorStyle;
    public Comedy(String title, double rating, String humorStyle) {
        super(title, rating);
        this.humorStyle = humorStyle;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println(" 유머: "+humorStyle );
    }
}
class Drama extends Movie{
    String theme;
    public Drama(String title, double rating, String theme) {
        super(title, rating);
        this.theme = theme;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println(" 주제: "+theme );
    }
}

public class MovieMain {
    public static void main(String[] args) {
        Movie[] movies = {
                new ActionMovie("어벤져스", 4.5, "최고급 CG"),
                new Comedy("극한직업", 4.7, "상황 코미디"),
                new Drama("기생충", 4.9, "계급 갈등")
        };

        for (Movie movie : movies) {
            displayInfo(movie);
        }
    }
    public static void displayInfo(Movie movie) {
        if (movie instanceof ActionMovie) {
            System.out.print("[액션] ");
        } else if (movie instanceof Comedy) {
            System.out.print("[코미디] ");
        } else if (movie instanceof Drama) {
            System.out.print("[드라마] ");
        }
        movie.displayInfo();
    }
}
