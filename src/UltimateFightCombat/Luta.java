package UltimateFightCombat;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;
    
    //metodos 
    public void marcarLuta(Lutador fighter1, Lutador fighter2){
        if (fighter1.getCategory() == fighter2.getCategory()){
            if (fighter1 != fighter2){
                aprovado = true;
                desafiado = fighter1;
                desafiante = fighter2;
            } 
        else {
            aprovado = false;
            desafiado = null;
            desafiado = null;
            }
        }
    }
    public void lutar(){
        if (aprovado == true){
            System.out.println("##DESAFIADO##");
            desafiado.apresentar();
            System.out.println("##DESAFIANTE##");
            desafiante.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            if (vencedor == 0){
                desafiado.ganharLuta();
                desafiante.perderLuta();
                System.out.println("\n#####RESULTADO DA LUTA####");
                System.out.println("O desafiado,  " + desafiado.getName() + " venceu!");
            } else if (vencedor == 1){
                desafiado.empatarLuta();
                desafiante.empatarLuta();
                System.out.println("\n#####RESULTADO DA LUTA####");
                System.out.println("Ouve empate entre os lutadores, " + desafiado.getName()+" e "+desafiante.getName());
            } else if (vencedor == 2){
                desafiado.perderLuta();
                desafiante.ganharLuta();
                System.out.println("\n#####RESULTADO DA LUTA####");
                System.out.println("O desafiante, " + desafiante.getName() + " venceu!");
            }
        } else {
            System.out.println("\nA luta não pode acontecer!");
        }
    }
    public Lutador getDesafiado(){
        return desafiado;
    }
    public void setDesafiado(Lutador ll){
        desafiado = ll;
    }
    public Lutador getDesafiante(){
        return desafiante;
    }
    public void setDesafiante (Lutador dd){
        desafiante = dd;
    }
}
//.markdown
//.md