package LAB302072024;

public class InternationalMovie extends Movie {
    String language;
    String country;

    public  InternationalMovie(String movieName, String directedBy, String producedBy, int duration,String category,int year, String language, String country) {

        super(movieName, directedBy, producedBy, duration, category, year);
        this.language = language;
        this.country = country;
    }
           public void ShowDetails(){
            System.out.println("Language:"+language+",Country:"+country);
    }
}

