import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("=================FOOT BALL LEAGUE==================");
        // football league opject
        League<Foot> footLeague=new League<>("chompions leaque");

        // foot ball team objects
        Team<Foot> realMadrid=new Team<>("Real di Madrid");
        Team<Foot> barca=new Team<>("Barca Malaga");
        Team<Foot>interMilan=new Team<>("Inter Milan ");
        Team<Foot>valencia=new Team<>("Valencia ");
       //adding teams to league
        footLeague.addteam(realMadrid);
        footLeague.addteam(barca);
        footLeague.addteam(interMilan);
        footLeague.addteam(valencia);
        System.out.println();
        // foot ball match results
        realMadrid.matchResult(barca,1,0);
        barca.matchResult(interMilan,2,0);
        realMadrid.matchResult(interMilan,3,1);
        barca.matchResult(valencia,0,3);
        System.out.println();
        //ranking method
        System.out.println(""+realMadrid.getNom()+" ranking is :" +realMadrid.ranking());
        System.out.println(""+barca.getNom()+" ranking is :" +barca.ranking());
        System.out.println(""+interMilan.getNom()+" ranking is :" +interMilan.ranking());
        System.out.println(""+valencia.getNom()+" ranking is :" +valencia.ranking());



        System.out.println();
        System.out.println("=================BASKET BALL LEAGUE==================");
        System.out.println();

      /*  // basket ball league
        League<Basket> basketLeague=new League<>("NBA");

        //basket ball teams objects
        Team<Basket> lakers=new Team<>("Lakers");
        Team<Basket> bulls=new Team<>("Chicago Bulls");
        Team<Basket> phoenix=new Team<>("Phonix Suns");
        Team<Basket> miami=new Team<>("Miami Heats");
        //adding teams to league
        basketLeague.addteam(lakers);
        basketLeague.addteam(bulls);
        basketLeague.addteam(phoenix);
        basketLeague.addteam(miami);

        System.out.println();
        //basket ball match result
        lakers.matchResult(bulls,10,5);
        lakers.matchResult(phoenix,12,7);
        bulls.matchResult(phoenix,3,5);
        miami.matchResult(lakers,16,9);
        System.out.println();
        //ranking method
        System.out.println(""+lakers.getNom()+" ranking is :" +lakers.ranking());
        System.out.println(""+bulls.getNom()+" ranking is :" +bulls.ranking());
        System.out.println(""+phoenix.getNom()+" ranking is :" +phoenix.ranking());
        System.out.println(""+miami.getNom()+" ranking is :" +miami.ranking());
        */



    }
}