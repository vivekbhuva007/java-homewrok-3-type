package progamme;

public class TaskFifteen {
    // Instance variables
    double width;
    double height;

    // Default Constructor
    public TaskFifteen() {

    }

    // Parameterized Constructor
    public TaskFifteen(double width, double height) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // Get Width Method
    public double getWidth() {
        return width;
    }

    // Get Height Method
    public double getHeight() {
        return height;
    }

    // Set Width Method
    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    // Set Height Method
    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // Get Area Method
    public double getArea() {
        return (getHeight() * getWidth());
    }

    //Main Method
    public static void main(String[] args) {
        TaskFifteen wall = new TaskFifteen(5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }

}
