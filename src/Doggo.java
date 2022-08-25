

public class Doggo extends Player {
    private String doggoName;
    private Boolean hasSchwanz; 


    //set the Dogs Name
    public void setDoggoName(String doggoName) {
        this.doggoName = doggoName;
    }
    // Get the Dogs Name
    public String getDoggoName() {
        return doggoName;
    }

    public Boolean gethasSchwanz(){
        return hasSchwanz; 
    }

    public void sethasSchwanztrue(){
        hasSchwanz=true; 
    }

    public void sethasSchwanzfalsch(){
        hasSchwanz=false; 
    }
    
}
