class Demo{
  public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7,8,9};

    int fL=0;
    int sL=0;
    int tL=0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i]>fL) {
        fL=arr[i];
      }
    }

    System.out.println("First Largest Element :"+fL);

    for (int i = 0; i < arr.length; i++) {
      if (arr[i]!=fL && arr[i]>sL) {
        sL=arr[i];
      }
      
    }
    System.out.println("Second largest Ele:"+sL);

     for (int i = 0; i < arr.length; i++) {
      if (arr[i]!=sL && arr[i]>tL && arr[i]!=fL
      ) {
        tL=arr[i];
      }

  }
   System.out.println("Third largest Ele:"+tL);
}
}