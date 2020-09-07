package ru.mirea.inbo0519.pr2.ballpack;

public class TestBall {
    public static void main(String[] args)
    {
        Ball ball1 = new Ball(10, 15);
        Ball ball2 = new Ball(45, 35);
        System.out.println("Ball1 x: " + ball1.getX());
        System.out.println("Ball1 y: " + ball1.getY());
        System.out.println("\nBall2 x: " + ball2.getX());
        System.out.println("Ball2 y: " + ball2.getY());

        ball1.move(20, 20);
        System.out.println("\nBall1 after move: ");
        System.out.println("Ball1 x: " + ball1.getX());
        System.out.println("Ball1 y: " + ball1.getY());

        System.out.println("\nFull info about balls: ");
        System.out.println(ball1);
        System.out.println(ball2);
    }
}
