class Rectangle {
    double length,breadth;

    void accept(double l,double b){
        length = l;
        breadth = b;
    }

    public double area(){
        return  length*breadth;
    }

    public double perimeter(){
        return 2 * (length + breadth);
    }

    public static void main(String args[]){
        Rectangle r1 = new Rectangle();
        r1.accept(2,5);
        System.out.println("area =" + r1.area());
        System.out.println("perimeter =" + r1.perimeter());
    }
}