import java.util.Scanner;
class ResponseGenerator {
  
  int respectLevel = 0;
  int optionInput = 0;
  boolean canChoose = false;
  String input = "";
  String[] options = new String[4];
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    ResponseGenerator resGen = new ResponseGenerator();
    
    
    System.out.println("You are travelling with your saintly companion to a nearby town to rent a room for the night." +
                         "\nOn your way there, you come across a wounded man belonging to an enemy faction lying on the side" +
                         "\nof the road. What do you do?");
    resGen.options[0] = "(1): Keep walking.";
    resGen.options[1] = "(2): Stop and offer him medical attention.";
    resGen.options[2] = "(3): Tell him that you'll seek help for him when you arrive at town.";
    resGen.options[3] = "(4): Carry him to town.";
    resGen.PrintOptions();
    resGen.canChoose = true;
    
    resGen.optionInput = scan.nextInt();
    
    if (resGen.optionInput == 1)
    {
      System.out.println("You decide to leave the man to the mercy of nature.");
    }
    
    
  }
  
  public void PrintOptions() {
    for (int i = 0; i < options.length; i++)
    {
      System.out.println(options[i]);
    }
  }
}