package Classroom;

public class Seat {
   private int xSeatPosition, ySeatPosition;
    static final int radius = 6;
    public Seat(int xSeatPosition, int ySeatPosition){
      this.xSeatPosition = xSeatPosition;
      this.ySeatPosition = ySeatPosition;
    }

    public int getxSeatPosition() {
        return xSeatPosition;
    }

    public int getySeatPosition() {
        return ySeatPosition;
    }

    public static int getRadius() {
        return radius;
    }


    public int[] gridPosition(){
        return new int[]{this.xSeatPosition, this.ySeatPosition};
    }
}
