package InterviewPrep;

public class StringArray {
    public static String  stringreplace(String str) {
        
      
        char chArr[]=str.toCharArray();

        for(int i=0;i<chArr.length;i++){
            if(chArr[i]=='a'){
                chArr[i]='b';

            }else if(chArr[i]=='b'){
                chArr[i]='a';
               
            }

        }
        return new String( chArr);
    }
    public static void main(String[] args) {
        String string="aabaabb";
        String replaced=stringreplace(string);
        System.out.println(replaced);
    }
    
}
