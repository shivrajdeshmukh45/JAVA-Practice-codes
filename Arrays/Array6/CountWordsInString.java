package Arrays.Array6;

import java.util.*;

public class CountWordsInString {
    public static void main(String[] args) {
     String str="i love coading";
     
     int count=0;
     boolean inword=false;
     
     
     for(int i=0;i<str.length();i++){
       char ch=str.charAt(i);
       
       if(ch != ' '){
         
         if(!inword){
           count++;
           inword=true;
         }
       }else{
         inword=false;
       }
       
     }
     
     
  System.out.println(count);
     
  }
} 
    

