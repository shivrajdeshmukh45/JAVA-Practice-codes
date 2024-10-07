package InterviewPrep;

public class StringPalin {

    static boolean isPalindrom(String str){
        int i=0,j=str.length()-1;

        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str="shiv
        ";
        boolean is=isPalindrom(str);
        System.out.println(is);
        
    }
    
}
