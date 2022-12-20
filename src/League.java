import java.util.ArrayList;

public class League <T extends  Sport>{
    String nom;
    ArrayList<Team<T>> teams=new ArrayList<>();
    public League(String nom){
        this.nom=nom;
    }

    public boolean addteam(Team<T> oneTeam){
        if (teams.contains(oneTeam)){
            System.out.println(oneTeam.getNom() +"deja existant");
            return false;
        }else {
            teams.add(oneTeam);
            System.out.println(oneTeam.getNom()+ " ajouté ");
            return true;
        }

    }





}
