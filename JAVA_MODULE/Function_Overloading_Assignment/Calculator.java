class Calculator{

     void addition(int a,int b){
       System.out.println("fun1");
        System.out.println("Addition is : "+ (a+b));
     } 


     void addition(float x,float y){
        System.out.println("fun2");
        System.out.println("Addition is : "+ (x+y));

     } 
     
   void addition(float a,int b){
        System.out.println("fun3");
        System.out.println("Addition is : "+ (a+b));
     } 


     void addition(double a,double b){
        System.out.println("fun4");
        System.out.println("Addition is : "+ (a+b));
     } 

//  subtraction functions start
   void sub(int a, int b){
     System.out.println("sub1");
     System.out.println(a-b);
    }
    
   void sub(double a, double b){
      System.out.println("sub2");
     System.out.println(a-b);
    }
   
    void sub(double a, int b){
     System.out.println("sub3");
     System.out.println(a-b);
    }

  void sub(int a, double b){
      System.out.println("sub4");
     System.out.println(a-b);
    }

// subtraction functins End 

//multiplication functions start

   void mul(int a, int b){
     System.out.println("mul1");
     System.out.println(a*b);
    }

   void mul(double a, double b){
     System.out.println("mul2");
     System.out.println(a*b);
    }

   void mul(double a, int b){
     System.out.println("mul3");
     System.out.println(a*b);
    }

  void mul(int a, double b){
     System.out.println("mul4");
     System.out.println(a*b);
    }

 // multiplication functins ends here

// divisions functions start
  void div(int a, int b){
     System.out.println("div1");
     System.out.println(a/b);
   }
    
  void div(double a, double b){
      System.out.println("div2");
     System.out.println(a/b);
   }    
 
   void div(double a, int b){
     System.out.println("div3");
     System.out.println(a/b);
   } 

  void div(int a, double b){
     System.out.println("div4");
     System.out.println(a/b);
   }

// division functins ends here


}//class calculator ends here


 class Test{

    public static void main ( String [] args){

        Calculator c=new Calculator (); // object created
       int a=10; 
      float f=10.5f;
       double d=5.50;
        c.addition(a,a);
        c.addition(f,f);
        c.addition (f,a);
        c.addition(d,d);
   System.out.println();
       c.sub(a,a);
       c.sub(d,d);
       c.sub(d,a);
       c.sub (a,d);
      System.out.println();
       c.mul(a,a);
        c.mul(d,d);
         c.mul(d,a);
          c.mul(a,d);
System.out.println();
          c.div(a,a);
          c.div(d,d);
          c.div(d,a);
          c.div(a,d);


}
}//class Test Ends here