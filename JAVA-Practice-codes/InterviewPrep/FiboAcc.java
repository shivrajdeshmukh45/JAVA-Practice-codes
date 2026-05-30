package InterviewPrep;

public class FiboAcc {

    static int specialFibonacy(int N){

        if(N==0) return 1;
        if(N==1) return 1;

        int f0=1;
        int f1=1;
        int fN=0;

        for(int i=2;i<N;i++){
            fN=(f1*f1+f0*f0)%47;

            f0=f1;
            f1=fN;
        }
        return fN;

    }


    public static void main(String[] args) {
        int N=5;
        System.out.println(specialFibonacy(N));

    }
    
}
