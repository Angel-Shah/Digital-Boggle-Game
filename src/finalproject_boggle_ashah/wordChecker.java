/*
 checks if the user entered word is valid
 */
package finalproject_boggle_ashah;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author angel
 */

public class wordChecker {
    BoggleGame_AShah gui;//associates the gui with this class

 String strEnteredWord;
    public wordChecker(){
        
    }
    


    void isValid() {
        
        
        for(int i=0; i<gui.selectLetterArr.size();i++){
    strEnteredWord+=gui.selectLetterArr.get(i);
}
        
        try{
        FileReader fr= new FileReader("wordlist.txt");//file reader for the txt file contain the english words
        BufferedReader br = new BufferedReader(fr);// buffered reader reads the txt file
        
        String word = br.readLine();// the word is set to the line the bufferedreader reads
        while( !word.equals(strEnteredWord)){//runs while the word is not found
            word=br.readLine();// continues to read line by line
            if(word.equals(strEnteredWord)){//checks if the word enterd by player the line read
             
                  
                   gui.isWord=true;//returns thhe boolean var as true
            }
            
            
        }

           } catch (Exception e){
        
    }  
          gui.isWord=false;//returrns boolean var as false
       
    }

   

   

}
