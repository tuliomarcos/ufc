package UltimateFightCombat;

public class UfcProgram {
    public static void main(String[] args) {
        Lutador l[] = new Lutador [6];
        l[0] = new Lutador("Pretty boy", "França", 31, 1.75, 68.9, 11, 3, 1);
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
        l[2] = new Lutador("Snepshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
        l[3] = new Lutador("Dead Code", "Australia", 28, 1.93, 81.3, 12, 0, 3);
        l[4] = new Lutador("UFOcobol", "Canadá", 37, 1.70, 119.3, 5, 4, 3);
        l[5] = new Lutador("Nerdaart", "Afríca do Sul", 30, 1.81, 105.7, 12, 2, 4);
        
        Luta ufc = new Luta();
        
        l[1].apresentar();
        l[3].apresentar();
        
        l[1].setWeight(l[1].getWeight() + 15);
        ufc.marcarLuta(l[1], l[3]);
        ufc.lutar();
        l[3].status();
    }
    
}
