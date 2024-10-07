public class Giocatore {
    private int goal;
    private String nome;
    private boolean capitano;

    public Giocatore(int goal, String nome, boolean capitano){
        this.goal=goal;
        this.nome=nome;
        this.capitano=capitano;
    }
    public Giocatore(){
        goal=0;
        nome=null;
        capitano=false;
    }
    public Giocatore(int goal, String nome){
       setGoal(goal);
        this.nome=nome;
        capitano=false;
    }
    public Giocatore(int goal, boolean capitano){
        this.goal=goal;
        this.nome=null;
        this.capitano=capitano;
    }
    public Giocatore(String nome, boolean capitano){
        this.goal=0;
        this.nome=nome;
        this.capitano=capitano;
    }
    public Giocatore(int goal){
        this.goal=goal;
        nome=null;
        capitano=false;
    }
    public Giocatore(String nome){
        goal=0;
        this.nome=nome;
        capitano=false;
    }
    public Giocatore(boolean capitano){
        goal=0;
        nome=null;
        this.capitano=capitano;
    }
    public int getGoal(){
        return goal;
    }
    public String getNome(){
        return nome;
    }
    public Boolean getCapitano(){
        return capitano;
    }
    public void setGoal(int goal){
        this.goal=goal;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setCapitano(boolean capitano){
        this.capitano=capitano;
    }
}
