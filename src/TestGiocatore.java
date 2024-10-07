import java.util.Scanner;

public class TestGiocatore {
    static Giocatore [] gt = new Giocatore [100];
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        int indice = 0;
        int ind=0;
        int goal;
        String nome;
        Boolean capitano;
        do{
            System.out.println("1 - aggiungere un giocatore alla squadra");
            System.out.println("1 - visualizzare tutti i giocatori della squadra");
            System.out.println("1 - modificare i dati di un giocatore a scelta");
            System.out.println("1 - cancellare un giocatore dalla squadra");
            System.out.println("1 - visualizzare i giocatori che hanno realizzato più di 5 goal.");
            System.out.println("1 - visualizzare il nome del capitano");
            System.out.println("1 - assegnare il ruolo di capitano in modo casuale se non ancora presente");
            System.out.println("8 - ESCI");
            ind=t.nextInt();

            switch(ind){
                case 1 :
                    System.out.println("dammi numero goal");goal=t.nextInt();
                    t.nextLine();
                    System.out.println("dammi nome");nome=t.nextLine();
                    t.nextLine();
                    System.out.println("dimmi se è capitano");capitano=t.nextBoolean();
                    t.nextLine();
                    aggiuntaGiocatore(goal, nome, capitano, indice);
                    indice++;
                    break;
                case 2 :

                    break;
                case 3 :

                    break;
                case 4 :

                    break;
                case 5 :

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
    public static String stampa(int ind){
        String giocatore="";
        for(int i=0; i<ind; i++){
            giocatore=giocatore+gt [i].getNome() + "\t" + gt [i].getGoal() + "\t" +gt [i].getCapitano() + "\t";
        }
        return giocatore;
    }
    public void modifica(){

    }
    public void cancellazione(){

    }

}
