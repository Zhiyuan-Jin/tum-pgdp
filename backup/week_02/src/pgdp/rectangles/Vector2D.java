package pgdp.rectangles;

public class Vector2D {
    private double x;
    private double y;



    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void add(Vector2D neu){
         x+= neu.getX();
         y+= neu.getY();
    }

    @Override
    public String toString() {
        return "["+x+", "+y+"]";
    }



    public static void main(String[] args) {

		Vector2D myVector = new Vector2D(1.0, 2.0);
		if (myVector.toString().equals("[1.0, 2.0]"))
			System.out.println("The String seems to match. Good Job!");
		else {
			System.out.println("This is what you created: " + myVector);
			System.out.println("This is how it should be: [1.0, 2.0]");
			System.out.println("Better luck next time!");
		}


    }

}
