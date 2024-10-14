public class Giocatore {
    private int goal;
    private String nome;
    private boolean capitano;

    public Giocatore(int goal, String nome, boolean capitano){
        setGoal(goal);
        setNome(nome);
        setCapitano(capitano);
    }
    public Giocatore(){
        setGoal(0);
        setNome(null);
        setCapitano(false);
    }
    public Giocatore(int goal, String nome){
        setGoal(goal);
        setNome(nome);
        setCapitano(false);
    }
    public Giocatore(int goal, boolean capitano){
        setGoal(goal);
        setNome(null);
        setCapitano(capitano);
    }
    public Giocatore(String nome, boolean capitano){
        setGoal(0);
        setNome(nome);
        setCapitano(capitano);
    }
    public Giocatore(int goal){
        setGoal(goal);
        setNome(null);
        setCapitano(false);
    }
    public Giocatore(String nome){
        setGoal(0);
        setNome(nome);
        setCapitano(false);
    }
    public Giocatore(boolean capitano){
        setGoal(0);
        setNome(null);
        setCapitano(capitano);
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
