
import java.util.*;
class Point{

    int x;
    int y;

    public Point(int x,int y) {

        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {

        return "(" + x + ", " + y + ")";
    }

    
}

class Triangle 
{
    Point p1,p2,p3;

    public Triangle() {

       this.p1 = new Point(0, 0);
       this.p2 = new Point(0, 1);
       this.p3 = new Point(1,0);

    }

    public Triangle(Point p1, Point p2, Point p3) {

        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Triangle(int x ,int y ,int z ,int a, int b ,int c){

        this.p1= new Point(x, y);

        this.p2 = new Point(z, a);

        this.p3 = new Point(b ,c);

    }

    public Triangle(int side){

        this.p1 = new Point(0,0);

        this.p2 = new Point(0, side);

        this.p3 = new Point(side, side);
    }

    public double perimeter(){

        return perimeter(p1,p2,p3);

    }

    public double perimeter(Point p1,Point p2,Point p3){

        return Math.hypot(p1.x-p2.x, p1.y-p2.y) + Math.hypot(p2.x-p3.x, p2.y-p3.y) + Math.hypot(p3.x-p1.x, p3.y-p1.y);

    }

    public double area(){

        return area(p1,p2,p3);
    }

    public double area(Point a,Point b,Point c){

          return Math.abs((a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y)) / 2.0 );
    }

    public void display(boolean per,boolean area){

        System.out.println("Triangle Points: "+ p1 +" "+ p2 +" "+ p3);
        if(per){

            System.out.println("Displaying perimeter:");
            System.out.println( perimeter());
            

        }
           
        if(area){
            
            System.out.println("Displaying AREA");
            System.out.println(area());
            

        }
            
    }
}

public class TriangleSet{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

          List<Triangle> triangles = new ArrayList<>();
          triangles.add(new Triangle());
          triangles.add(new Triangle(new Point(0,2),new Point(2,3),new Point(3,5)));
          triangles.add(new Triangle(1,2,3,4,5,6));
          triangles.add(new Triangle(6));
          System.out.println("4 Traingles added");

          int ch;

          for (Triangle t : triangles  ) {

            System.out.println("1- only display points 2-points+area 3-points+area+perimeter others-INVALID");
            ch=sc.nextInt();

            switch(ch){

                case 1:
                    t.display(false,false);
                    break;
                
                case 2:
                    t.display(false, true);
                    break;

                case 3:
                    t.display(true ,true);
                    break;

                default:
                    System.out.println("INVALID CHOICE");

            }


              
          }
        
    }

  

}
