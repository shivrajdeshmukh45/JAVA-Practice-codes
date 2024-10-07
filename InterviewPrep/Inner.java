package InterviewPrep;

class Outer{
    int x=10;

    Outer(int x){

            System.out.println(x);
            System.out.println(Outer.this.x);
    }

    class Inner{
            int y=20;

            Inner(int y){
            System.out.println(y);
            System.out.print(Inner.this.y);

            }
            class Inner1{
                    Inner1(){
                            System.out.println("In the Nested inner Class");

            }


    }




    }
}


class Client{
    public static void main(String []args){

            Outer Obj=new Outer(140);

            Outer.Inner obj2=Obj.new Inner(210);
            Outer.Inner.Inner1 obj3=obj2.new Inner1();
    }
}