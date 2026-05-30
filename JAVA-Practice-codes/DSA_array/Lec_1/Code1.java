
//Q.1 Given an integer aray of size n.
//count the nmber of elements having atleast 1 element is greater than itself...! 
//{2,5,1,4,8,0,8,1,3,8};
//output==7

package DSA_array.Lec_1;

public class Code1 {
    public static void main(String[] args) {
        int arr[]=new int[]{2,5,1,4,8,0,8,1,3,8};
        int count=0;
        

        for(int i=0;i<arr.length;i++){
            // if(arr[i]>num){
            //     num=arr[i];
            //     count++;
            // }

            for(int j=0;j<arr.length;j++){      //nested forloop 1 element la pakdun sagle element vr operation kru shkato tya sathi use kelay
                if(arr[i]<arr[j]){   //   jevha element shodhtana 1 jri alemet motha bhetla tr apan lagect break krtoy 
                    count++;
                    break;              //imp
                }
            }

             
        }
        System.out.println("OUTPUT  :"+count);



System.out.println("optamise  apporach code Below");

int maxEle=Integer.MIN_VALUE;       //zero chya jagii or arr[0] chya jagi Integer.MIN_VALUE

int num=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxEle){
                maxEle=arr[i];
            }
      

        }
        for(int i=0;i<arr.length;i++){
           if(arr[i]==maxEle){
            num++;
           }
            }
            System.out.println("Count is :"+num);
      

        
        System.out.println("maximum element :"+maxEle);
       
        System.out.println("output of optamize code (arr.length-maxnum_count):"+(arr.length-num));
        




    }

    
}
