package OOPs;

import java.util.Scanner;

public class rectangleCheck {
	static class Rectangle{
		int x, y, width, height;
		Rectangle(int x, int y, int width, int height){
			this.x = x;
			this.y = y;
			this.width = width;
			this.height = height;
		}
		
		public String toString() {
			return "Rectangle{" +
				"x=" + x +
				", y=" + y +
				", width=" + width +
				", height=" + height +
				'}';
		}
		
		void translate(int deltaX, int deltaY){
			this.x += deltaX;
			this.y += deltaY;
		}
		
		boolean contains(int xCoord, int yCoord){
			return xCoord > x && xCoord < (x + width) && yCoord > y && yCoord < (y + height);
		}
		
		Rectangle intersection(Rectangle rect){
			int newX, newY, newWidth, newHeight;
			int fullWidth, fullHeight;
			if(rect.x > this.x){
				fullWidth = rect.x - this.x + rect.width;
				newX = rect.x;
			}
			else{
				fullWidth = this.x - rect.x + this.width;
				newX = this.x;
			}
			if(rect.y > this.y){
				fullHeight = this.y - rect.y + this.height;
				newY = rect.y;
			}
			else{
				fullHeight = this.y - rect.y + this.height;
				newY = this.y;
			}
			
			newWidth = this.width + rect.width - fullWidth;
			newHeight = this.height + rect.height - fullHeight;
			return new Rectangle(newX, newY, newWidth, newHeight);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the parameters for the creation of the first rectangle (x, y, width, height): ");
		Rectangle A = new Rectangle(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		System.out.println("Enter the parameters for the creation of the second rectangle (x, y, width, height): ");
		Rectangle B = new Rectangle(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		Rectangle C = A.intersection(B);
		System.out.println("Rectangle A : " + A.toString());
		System.out.println("Rectangle B : " + B.toString());
		System.out.println("| Translation |");
		System.out.println("Enter the translation x and y : ");
		A.translate(sc.nextInt(), sc.nextInt());
		System.out.println("Rectangle A after translation : " + A.toString());
		System.out.println("| Contains |");
		System.out.println("Enter the co-ordinates to check if point is present inside the rectangle : ");
		System.out.println(A.contains(sc.nextInt(), sc.nextInt()));
		System.out.println("| Intersection |");
		System.out.println("New rectangle formed when two rectangles are intersected : " + C.toString());
	}
}
