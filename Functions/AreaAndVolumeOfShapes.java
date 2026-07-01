import java.util.*;

public class AreaAndVolumeOfShapes {

    public static void areaOfCircle(int radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + area);
    }

    public static void areaOfRectangle(int length, int width) {
        int area = length * width;
        System.out.println("Area of the rectangle: " + area);
    }

    public static void areaOfSquare(int side) {
        int area = side * side;
        System.out.println("Area of the square: " + area);
    }

    public static void areaOfTriangle(int base, int height) {
        double area = 0.5 * base * height;
        System.out.println("Area of the triangle: " + area);
    }

    public static void volumeOfCuboid(int length, int width, int height) {
        int volume = length * width * height;
        System.out.println("Volume of the cuboid: " + volume);
    }

    public static void volumeOfSphere(int radius) {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("Volume of the sphere: " + volume);
    }

    public static void volumeOfCylinder(int radius, int height) {
        double volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.println("Volume of the cylinder: " + volume);
    }

    public static void volumeOfCone(int radius, int height) {
        double volume = (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
        System.out.println("Volume of the cone: " + volume);
    }
    
    public static void main(String args[]) {
        System.out.println("select the shape to calculate area or volume:");
        System.out.println("1. Circle (Area)");
        System.out.println("2. Rectangle (Area)");
        System.out.println("3. Square (Area)");
        System.out.println("4. Triangle (Area)");
        System.out.println("5. Cuboid (Volume)");
        System.out.println("6. Sphere (Volume)");
        System.out.println("7. Cylinder (Volume)");
        System.out.println("8. Cone (Volume)");
        System.out.println("9. Exit");
        System.out.println("Enter your choice (1-9): ");
        
        if (true) {
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the radius of the circle: ");
                    int radius = sc.nextInt();
                    areaOfCircle(radius);
                    break;
                case 2:
                    System.out.println("Enter the length and width of the rectangle: ");
                    int length = sc.nextInt();
                    int width = sc.nextInt();
                    areaOfRectangle(length, width);
                    break;
                case 3:
                    System.out.println("Enter the side of the square: ");
                    int side = sc.nextInt();
                    areaOfSquare(side);
                    break;
                case 4:
                    System.out.println("Enter the base and height of the triangle: ");
                    int base = sc.nextInt();
                    int height = sc.nextInt();
                    areaOfTriangle(base, height);
                    break;
                case 5:
                    System.out.println("Enter the length, width and height of the cuboid: ");
                    length = sc.nextInt();
                    width = sc.nextInt();
                    height = sc.nextInt();
                    volumeOfCuboid(length, width, height);
                    break;
                case 6:
                    System.out.println("Enter the radius of the sphere: ");
                    radius = sc.nextInt();
                    volumeOfSphere(radius);
                    break;
                case 7:
                    System.out.println("Enter the radius and height of the cylinder: ");
                    radius = sc.nextInt();
                    height = sc.nextInt();
                    volumeOfCylinder(radius, height);
                    break;
                case 8:
                    System.out.println("Enter the radius and height of the cone: ");
                    radius = sc.nextInt();
                    height = sc.nextInt();
                    volumeOfCone(radius, height);
                    break;
                case 9:
                    System.out.println("Thank you for using the program. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice.");
                    
            }
        }
    }
}