public class Team<T extends Sport> {
    private String nom;
    int played=0;
    int won=0;
    int lost=0;
    int tied=0;
    public Team(String nom) {
        this.nom=nom;
    }

    public String getNom() {
        return nom;
    }
    public void matchResult( Team oppenant, int ourScore, int theirScore){


        if (ourScore>theirScore){
            System.out.println(this.nom+" a gagner "+oppenant.getNom());
           this.won++;
        }
        else if(ourScore<theirScore){
            System.out.println(this.nom+" a perdu contre "+oppenant.getNom());
            this.lost++;
        }
        else {
            System.out.println(this.nom+" egalite avec "+oppenant.getNom());
            this.tied++;
        }
        played++;
        if(oppenant!=null){

            oppenant.matchResult(null,theirScore,ourScore);

        }
    }
    public int ranking(){
        return (won*2)+tied;
    }
}
