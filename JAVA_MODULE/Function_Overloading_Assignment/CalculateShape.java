class Triangle{
         
         double base;
         double height;

       Triangle(){   // default constructor

                this.base=4.5;
                this.height=5.2;
          } 

       Triangle(double base double height ) {  //parameterized constructor
           
                this.base=base;
                 this.height=height;

            } // paraeterized constructor ends here

        

      }// triange class ends here

class Rectangle{
            double length;
            double breadth;

      Rectangle(){ // default constructor
            this.length=4.8;
            this.breadth=5.2;
    
           } 

      Rectangle(double length,double breadth){ // parameterized  constructor
            this.length=length;
            this.breadth=breadth;
    
           } 

}// class reactangle ends here









class CalculateShape{
       
        double shape(double l, double b){ // Triangle
          
            return 0.5*l*b;
        }

         double shape(int l, int b){ // rectangle
          
            return l*b;
        }

       double shape(double r){ // Triangle
          
            return 3.14*r*r;
        }

}//calculateshape ends here


class Testshape{
   
  public static void main(String [] args){
 
           CalculateShape cs=new CalculateShape();
          
           System.out.println("Area of Triangle is: " + cs.shape(4.2 , 3.2));

}

}
     


      