class Chick implements Animal 
{     
  private String myType;     
  private String mySound;
  public Chick (String type, String sound)
  {
    myType = type;         
    mySound = sound;
  }
   public Chick()     {         
         myType = "unknown";         
         mySound = "unknown";     
     }  
   public Chick (String type, String sound1, String sound2) {
     myType = type; 
     if ( (int) (Math.random()*2)+1 == 1)
     mySound = sound1 = "cheep";
     else
     mySound = sound2 = "cluck";
   }
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 
}
