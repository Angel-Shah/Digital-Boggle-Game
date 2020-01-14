/*
 Updates the user's score
 */
package finalproject_boggle_ashah;

/**
 *
 * @author angel
 */
public  class scoreKeeper {
     BoggleGame_AShah gui;//associates the gui with this class
    
     public scoreKeeper(){
    
}
    void yourScore(){
        String strEnteredWord =gui.strEnteredWord;// gets value of user ntered word
        int intCurrentScore=gui.intCurrentScore;
        
         int intWordLength= strEnteredWord.length();//gets the length of the array
       
       switch (intWordLength){// uses switch statement to assing points accoring to the length of the word
           case 3: 
               gui.intCurrentScore++;
               break;
           case 4:
               gui.intCurrentScore++;
               break;
           case 5:
               gui.intCurrentScore+=2;
               break;
           case 6:
               gui.intCurrentScore+=3;
               break;
           case 7:
              gui. intCurrentScore+=4;
               break;
       }
       if(intWordLength>=8){
           gui.intCurrentScore+=11;
       }
    }
    
}
