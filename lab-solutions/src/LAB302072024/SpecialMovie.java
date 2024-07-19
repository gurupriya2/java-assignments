package LAB302072024;

public class SpecialMovie extends Movie {
    String SoundEffects;
    String visualEffects;

    public SpecialMovie(String movieName, String directedBy, String producedBy, int duration, String category, int year, String visualEffects, String soundEffects) {
        super(movieName, directedBy, producedBy, duration, category, year);
        this.SoundEffects=soundEffects;
        this.visualEffects=soundEffects;

    }
        public void ShowDetails(){
            System.out.println("SoundEffects:" + SoundEffects + ",VisualEffects:" + visualEffects);
        }
    }



