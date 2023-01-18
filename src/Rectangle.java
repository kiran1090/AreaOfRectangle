public class Rectangle {
    public Double length,breadth,Area;
    public  Rectangle(Double length, Double breadth)
    {
        this.length=length;
        this.breadth=breadth;

    }

    public Double getArea() {
        return Area=length*breadth;
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", breadth=" + breadth +
                ", Area=" + Area +
                '}';
    }

    public static void main(String[] args)
    {
        Rectangle Area1= new Rectangle(4.0,5.0);
        Rectangle Area2= new Rectangle(5.0,8.0);
        Area1.getArea();
        System.out.println(Area1);
        System.out.println(Area2.getArea());




    }
}
