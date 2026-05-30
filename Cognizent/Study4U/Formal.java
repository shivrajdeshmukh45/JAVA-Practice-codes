package Cognizent.Study4U;

public class Formal {
    public static void main(String[] args) {
        int count=0;
        boolean status=false;
        String str="FIFFIIFFFI";

        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            // if(ch[i]=='I'){
            //     ch[i]='F';
            //    // break;
            // }


            if(ch[i]=='F' ){
            
                count++;
            }
        }
        System.out.println(count);

    }
    
}
