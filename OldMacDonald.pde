public void setup() {     
    Cow marisa = new Cow("cow", "moo");   
    System.out.println(marisa.getType() + " goes " + marisa.getSound());
    Chick rita = new Chick ("chick", "cheep");
    System.out.println(rita.getType() + " goes " + rita.getSound());
    Pig michelle = new Pig ("pig", "oink");
    System.out.println(michelle.getType() + " goes " + michelle.getSound());
}
