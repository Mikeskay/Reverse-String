package reversestring.base;

public class ReverseString {

   public String userInput;


    public ReverseString(String userInput){

        this.userInput = userInput;

    }
      
    public String removeNonLetters() {
       
        return userInput.replaceAll("[^a-zA-Z]", "");
        
    }
   
    public String reverseString() {

        StringBuilder stgBuilder = new StringBuilder(userInput);
        StringBuilder reverseString = stgBuilder.reverse();
      
        
        return reverseString.toString();
        
    }  
  
    public String ChangeCharCase() {
        
        String newUserInput = "";

        for (int i = 0; i < userInput.length(); i++) {
            char chr = userInput.charAt(i);
            
            if (Character.isUpperCase(chr)){
              chr = Character.toLowerCase(chr);
            
            }else
              chr = Character.toUpperCase(chr);{
              
              newUserInput = newUserInput + Character.toString(chr);
            }
        
            }     

        return newUserInput;
        
    }
    
}
