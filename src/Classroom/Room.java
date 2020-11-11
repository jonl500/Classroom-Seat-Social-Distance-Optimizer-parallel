package Classroom;

import java.lang.Math;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
import java.util.HashSet;

public class Room implements Comparable{
    int xBounds;
    int yBounds;
    private final int ID;
    private int score;
    private final ReentrantLock lock;
    private boolean isSwapped;
    ArrayList<Seat> seats = new ArrayList<Seat>();
    int[][] grid;
    public Room(ArrayList<Seat> seats, int xBounds, int yBounds){
        this.seats = seats;
        this.xBounds = xBounds;
        this.yBounds = yBounds;
        this.ID = ID_Generator.nextID();
        lock = new ReentrantLock();
        isSwapped = false;
        grid = new int[xBounds][yBounds];
    }

    //using pythagorean distance to check the safety metric for social distance
    public boolean distanceIsSafe(int x1, int x2, int y1, int y2){
        double ac = Math.abs(y2 - y1);
        double cb = Math.abs(x2 - x1);
        double distance = Math.hypot(ac, cb);

        if(distance > 6){
            return true;
        }

    return false;
    }

    //re-read look for logical error
    public void generateSeats(int x, int y){

        for (int i = 0; i < seats.size()-1; ++i){
            //check the if the seat doesn't exist already before generating
            //when running look out for no such element exception, might break
            if((seats.get(i).gridPosition() != seats.get(i+1).gridPosition()) || (seats.get(i+1) == null)){
                //check if radius is safe, if yes, generate seat
                Seat student = new Seat(x,y);
                if(distanceIsSafe(seats.get(i).getxSeatPosition(),seats.get(i+1).getxSeatPosition(),
                seats.get(i).getySeatPosition(),seats.get(i+1).getySeatPosition()) == false){
                    //safely generate seat
                    seats.remove(i);

                }
            }
        }
    }

    public int getScore(){
        return seats.size();
    }

    public void resetSwapped() {
        isSwapped = false;
    }

//    private void generateTiles() {
//        for (int j = 0; j < grid.length; ++j) {
//            for (int i = 0; i < grid[0].length; ++i) {
//
//            }
//        }
//        populate(32, 8);
//    }

   //circular functionality
   public Seat circleApproximation(int x, int y, int radius){
    
        return null;
        //list of grid squares were the
   }


//read up on circle packing
    @Override
    public int compareTo(Object o) {
        Room other = (Room) o;
        return other.score - this.score;
    }

}
