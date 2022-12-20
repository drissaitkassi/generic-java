public class Main {
    public static void main(String[] args) {

        League<Sport> footLeague=new League<>("chompions leaque");
        Team<Foot> realMadrid=new Team<>("Real di Madrid");
        Team<Foot> barca=new Team<>("Barca Malaga");
        footLeague.addteam(realMadrid);
        footLeague.addteam(barca);
        realMadrid.matchResult(barca,1,0);
       /* for (Team<Sport> e:footLeague.teams) {
            System.out.println(e.getNom());
        }*/

    }
}