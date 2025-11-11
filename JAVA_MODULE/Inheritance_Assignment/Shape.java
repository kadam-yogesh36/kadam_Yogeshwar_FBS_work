class Shape{
    String color;
    boolean isFilled;
    double borderThickness;

    Shape(){// Default constructor
        this.color="Red";
        this.isFilled=true;
        this.borderThickness=2.5;
    }

    Shape(String color,boolean isFilled,double borderThickness){// parameterized constructor
        this.color=color;
        this.isFilled=isFilled;
        this.borderThickness=borderThickness;
    }

    String getColor(){
        return color;
    }

    void setColor(String color){
        this.color=color;
    }

    boolean isFilled(){
        return isFilled;
    }

    void setFilled(boolean isFilled){
        this.isFilled=isFilled;
    }

    double getBorderThickness(){
        return borderThickness;
    }

    void setBorderThickness(double borderThickness){
        this.borderThickness=borderThickness;
    }

    void display(){
        System.out.println("Color:"+this.color);
        System.out.println("Is Filled:"+this.isFilled);
        System.out.println("Border Thickness:"+this.borderThickness);
    }
}//class shape ends here


class Circle extends Shape{
    double radius;

    Circle(){// Default constructor
        super();
        this.radius=5.5;
    }

    Circle(String color,boolean isFilled,double borderThickness,double radius){// parameterized constructor
        super(color,isFilled,borderThickness);
        this.radius=radius;
    }

    double getRadius(){
        return radius;
    }

    void setRadius(double radius){
        this.radius=radius;
    }

    void display(){
        super.display();
        System.out.println("Radius:"+this.radius);
    }
} // class circle ends here


class Rectangle extends Shape{
    double length;
    double width;

    Rectangle(){// Default constructor
        super();
        this.length=10.0;
        this.width=5.0;
    }

    Rectangle(String color,boolean isFilled,double borderThickness,double length,double width){// parameterized constructor
        super(color,isFilled,borderThickness);
        this.length=length;
        this.width=width;
    }

    double getLength(){
        return length;
    }

    void setLength(double length){
        this.length=length;
    }

    double getWidth(){
        return width;
    }

    void setWidth(double width){
        this.width=width;
    }

    void display(){
        super.display();
        System.out.println("Length:"+this.length);
        System.out.println("Width:"+this.width);
    }
} // class rectangle ends here


class Triangle extends Shape{// Default constructor
    double base;
    double height;

    Triangle(){
        super();
        this.base=6.0;
        this.height=4.0;
    }

    Triangle(String color,boolean isFilled,double borderThickness,double base,double height){ // parameterized constructor
        super(color,isFilled,borderThickness);
        this.base=base;
        this.height=height;
    }

    double getBase(){
        return base;
    }

    void setBase(double base){
        this.base=base;
    }

    double getHeight(){
        return height;
    }

    void setHeight(double height){
        this.height=height;
    }

    void display(){
        super.display();
        System.out.println("Base:"+this.base);
        System.out.println("Height:"+this.height);
    }
}//class triangle ends here

class RegisterShape{
    public static void main(String[] args){
        Circle c1=new Circle();
        c1.display();
        System.out.println("\n\n");
        
        Circle c2=new Circle("Blue",true,3.0,7.5);
        c2.display();
        System.out.println("\n\n");
        
        
        Rectangle r1=new Rectangle();
        r1.display();
        System.out.println("\n\n");
        
        Rectangle r2=new Rectangle("Green",false,4.0,12.0,8.0);
        r2.display();
        System.out.println("\n\n");
        
        
        Triangle t1=new Triangle();
        t1.display();
        System.out.println("\n\n");
        Triangle t2=new Triangle("Yellow",true,2.0,10.0,6.0);
        t2.display();
    }
}

