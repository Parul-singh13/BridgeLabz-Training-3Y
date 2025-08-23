/**
 * Computes Sam's average marks in PCM.
 */
public class SamAveragePCM {
    public static void main(String[] args) {
         int sam_maths_mark=94;
        int sam_physics_mark= 95;
        int sam_chemistry_mark=96;
        int total_mark= sam_chemistry_mark +sam_maths_mark+ sam_physics_mark;
        double average_mark=(total_mark / 300.0) * 100;
        System.out.print("Sam's average mark in PCM is " + average_mark);
    }
}
