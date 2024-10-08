package Cognizent;

public class Formal {

    static int calculate(int n,String val){
        boolean found=false;

        char[] str=val.toCharArray();

        for(int i=0;i<n;i++){
            if(str[i]=='I'){
                // str[i]='F';
                // int index=i;
                // break;

                if (found==true) {
                    break;
                    
                }else{
                    found=true;    
                }
            }
        }

        int i=0;
        int j= n-1;

        while (j>=i) {
            if (str[i]=='I') {
                break;
                
            }
            j--;

            
        }
        if (i==n) {
            return 0;
            
        }else
        return j-i+1;



         
        
    }


    public static void main(String[] args) {
        String str="FIFFIIFFFI";
        int  n=10;

        int num=calculate(n,str);
        System.out.println(num);
    }
    
}
