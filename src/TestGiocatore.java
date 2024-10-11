import java.util.Scanner;

public class TestGiocatore {
    static Giocatore [] gt = new Giocatore [100];
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        int indice = 0;
        int ind=0;
        int goal;
        int sugador;
        String nome;
        Boolean capitano;
        do{
            System.out.println("1 - aggiungere un giocatore alla squadra");
            System.out.println("2 - visualizzare tutti i giocatori della squadra");
            System.out.println("3 - modificare i dati di un giocatore a scelta");
            System.out.println("4 - cancellare un giocatore dalla squadra");
            System.out.println("5 - visualizzare i giocatori che hanno realizzato più di 5 goal.");
            System.out.println("6 - visualizzare il nome del capitano");
            System.out.println("7 - assegnare il ruolo di capitano in modo casuale se non ancora presente");
            System.out.println("8 - ESCI");
            ind=t.nextInt();

            switch(ind) {
                case 1:
                    System.out.println("dammi numero goal");
                    goal = t.nextInt();
                    t.nextLine();
                    System.out.println("dammi nome");
                    nome = t.nextLine();
                    t.nextLine();
                    System.out.println("dimmi se è capitano");
                    capitano = t.nextBoolean();
                    t.nextLine();
                    aggiuntaGiocatore(goal, nome, capitano, indice);
                    indice++;

                    break;
                case 2:
                    for (int i = 0; i < indice; i++) {
                        System.out.println(stampa(i));
                    }

                    break;
                case 3:
                    System.out.println("di quale giocatore vorresti modificare i dati?");
                    sugador = t.nextInt();
                    System.out.println("dammi nuovo numero goal");
                    goal = t.nextInt();
                    t.nextLine();
                    System.out.println("dammi nuovo nome");
                    nome = t.nextLine();
                    t.nextLine();
                    System.out.println("dimmi se è capitano");
                    capitano = t.nextBoolean();
                    t.nextLine();
                    modifica(sugador, goal, nome, capitano);

                    break;
                case 4:

                    break;
                case 5:
                    for (int i = 0; i < indice; i++) {
                    System.out.println(visualizzazioneForte(i));
            }
                    break;
                case 6 :

                    break;
                case 7 :

                    break;
                case 8 :

                    break;

            }
        }while (ind !=8);
    }



    public static void aggiuntaGiocatore(int newGoal, String newNome, Boolean newCapitano, int indice){
        gt [indice] = new Giocatore(newGoal,newNome,newCapitano);

    }
    public static String stampa(int i){
        String giocatore="";
            giocatore=giocatore+gt [i].getNome() + "\t" + gt [i].getGoal() + "\t" +gt [i].getCapitano() + "\t";
        return giocatore;
    }
    public static void modifica(int sugador, int newGoal, String newNome, Boolean newCapitano){
        gt[sugador].setGoal(newGoal);
        gt[sugador].setNome(newNome);
        gt[sugador].setCapitano(newCapitano);
    }
    public void cancellazione(){

    }
    public static String visualizzazioneForte(int giocat){
        String GiocatoreForte="";
        if(gt[giocat].getGoal()<5)
            return "non trovato";
        else
            GiocatoreForte=gt[giocat].getNome();
            return GiocatoreForte;
    }
}
