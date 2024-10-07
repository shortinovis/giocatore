import java.util.Scanner;

public class TestGiocatore {
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        Giocatore [] gt = new Giocatore[3];
        gt [0] = new Giocatore();
        gt [1] = new Giocatore();
        gt [2] = new Giocatore();

        System.out.println("dammi nome");gt[0].setNome(t.nextLine());
        System.out.println("dammi goal");gt[0].setGoal(t.nextInt());
        System.out.println("dammi capitano");gt[0].setCapitano(t.nextBoolean());
        t.nextLine();
        System.out.println("dammi nome");gt[1].setNome(t.nextLine());
        System.out.println("dammi goal");gt[1].setGoal(t.nextInt());
        System.out.println("dammi capitano");gt[1].setCapitano(t.nextBoolean());
        t.nextLine();
        System.out.println("dammi nome");gt[2].setNome(t.nextLine());
        System.out.println("dammi goal");gt[2].setGoal(t.nextInt());
        System.out.println("dammi capitano");gt[2].setCapitano(t.nextBoolean());
        t.nextLine();


    }
}
