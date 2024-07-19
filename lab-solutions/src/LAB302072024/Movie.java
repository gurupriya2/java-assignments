package LAB302072024;

public class Movie {
    public static int movieCount=0;
    private String movieID;
     String movieName;
     String directedBy;
     String producedBy;
     int  duration;
     String category;
     int year;
     public void ShowDetails(){
         System.out.println("MovieName:"+ movieName+",ProducedBy:"+ producedBy+",DirectedBy:"+directedBy+",Duration:"+duration+"Mins:"+",Category:"+category);
     }
     private String setMoviesDetails;

    public Movie(String movieName, String directedBy, String producedBy, String category, int year) {
    }

    public String getmovieID() {
         return movieID;
     }

     public  Movie( String movieName,String producedBy){
         this.movieName=movieName;
         this.producedBy=producedBy;
        movieCount++;
         movieID=movieName+"_"+movieCount;

     }
     public  Movie(String movieName,String producedBy,String directedBy,int duration,String category ,int year){
         this(movieName,producedBy);
         this.directedBy=directedBy;
         this.duration=duration;
         this.category=category;
         this.year=year;
     }
     public void MovieInfo(){
         System.out.println("MovieName :"+ movieName);
         System.out.println("ProducedBy :"+ producedBy);

         if(directedBy != null){
             System.out.println("DirectedBy:"+ directedBy);
         }
         if(category != null){
             System.out.println("Category:"+ category);
         }
         if(duration >0){
             System.out.println("Duration:"+ duration);
         }
         if(year>0){
             System.out.println("Year:"+ year);
         }
     }




    public static void main(String[] args){
//       Movie movie1 = new Movie("Conjuring" , "yyyyyy");
//     movie1.MovieInfo();
//       Movie movie2 = new Movie("Eerie", "zzzzzz");
//       movie2.MovieInfo();



        Movie[] movies = new Movie[3];
        Movie movies1 = new Movie("Inception", "Christopher Nolan","Christoper",180,"aaaa",2000);
        //movies1.setMoviesDetails =("Christopher",678,);
        Movie movies2= new SpecialMovie("The Lord of the Rings: The Return of the King", "Peter Jackson", "james" , 345,"uuuuuuu",2345,"3d","Dolby");
       Movie movies3 = new InternationalMovie("Parasite", "Bong Joon-ho", "scfetrc", 111, "yuds",2132,"English","India");
//
        System.out.println(movies1.getmovieID());
        System.out.println(movies2.getmovieID());
        System.out.println(movies3.getmovieID());
  movies1.MovieInfo();
  movies2.MovieInfo();
  movies3.MovieInfo();
  movies2.ShowDetails();
  movies3.ShowDetails();

        }
    }


