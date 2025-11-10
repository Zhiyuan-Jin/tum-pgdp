package pgdp.rectangles;

public class Rectangle {
    private Vector2D topLeft;
    private Vector2D bottomRight;

    public Rectangle(Vector2D topLeft, Vector2D bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    @Override
    public String toString() {
        return "Rectangle spanned by points " + topLeft + " and " + bottomRight+".";
    }

    public double calculateArea() {
        return Math.abs(topLeft.getX() - bottomRight.getX()) * Math.abs(topLeft.getY() - bottomRight.getY());
    }

    public void shiftBy(Vector2D shift){
        topLeft.add(shift);
        bottomRight.add(shift);
    }

    public static void main(String[] args) {
        /*
         * You can use the main-method to test your code.
         * It is irrelevant to the grading as long as it compiles.
         */
		Vector2D tl = new Vector2D(0.0, 2.0), br = new Vector2D(2.0, 0.5);
		Rectangle myRectangle = new Rectangle(tl, br);
		if (myRectangle.toString().equals("Rectangle spanned by points [0.0, 2.0] and [2.0, 0.5]."))
			System.out.println("The String seems to match. Good Job!");
		else {
			System.out.println("This is what you created: " + myRectangle);
			System.out.println("This is how it should be: Rectangle spanned by points [0.0, 2.0] and [2.0, 0.5].");
			System.out.println("Better luck next time!");
		}
    }

}
