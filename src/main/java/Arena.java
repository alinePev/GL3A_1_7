import java.util.Scanner;

public class Arena {

    public static  Robot fight(Robot r1,Robot r2) {
        Robot survivant , perdant = null;
        while(!r1.isDead() && !r2.isDead()){
            r1.fire(r2);
            r2.fire(r1);
        }
        //je check les robots vivant et mort
        survivant = r1.isDead()?r2:r1;
        perdant = r1.isDead()?r1:r2;
        System.out.println("Le robot "+perdant.getNom() + " a ete touche par le robot  "+survivant.getNom());
        return survivant;
    }