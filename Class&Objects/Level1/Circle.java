class Circle{
    double radius;
    public Circle(double radius){
        this.radius= radius;


    }
    public void areaCircle(){
        System.out.printf("Area of Circle: % 4f", (Math.PI*radius*radius));
    }
    public void circumferenceCircle(){
        System.out.printf("Circumference of circle : %4f",(2*Math.PI*radius));
    }
    public static void main(String[] args) {
        Circle circle= new Circle(2.5);
        Circle circle2= new Circle(5);
        circle.areaCircle();
        circle.circumferenceCircle();
        circle2.areaCircle();
        circle2.circumferenceCircle();


    }

}