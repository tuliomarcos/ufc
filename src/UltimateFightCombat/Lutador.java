package UltimateFightCombat;

public class Lutador implements Encapsulamento{
    private String name;
    private String nacionality;
    private int age;
    private double height;
    private double weight;
    private String category;
    private int win, lose, empate;
    
    //metodo construtor
    public Lutador(String name, String na, int ag, double he, double we, int win, int lose, int em){
        setName(name);
        setNacionality(na);
        setAge(ag);
        setHeight(he);
        setWeight(we);
        setWin(win);
        setLose(lose);
        setEmpate(em);
    }
    
    //metodos encapsulados
    @Override
    public void apresentar(){
        System.out.println("------------------------------------");
        System.out.println("CHEGOU A HORA! Senhora e senhores, aprensentamos o lutador: " + getName());
        System.out.println("Origem: " + getNacionality());
        System.out.println(age + " anos " + getHeight() + "metros.");
        System.out.println("Pesando " + weight + " Kg.");
        System.out.println("Da categoria " + getCategory());
        System.out.println("Ganhou: " + getWin());
        System.out.println("Perdeu: " + getLose());
        System.out.println("Empatou: " + getEmpate());
    }
    @Override
    public void status(){
        System.out.println("\n"+getName()+" é um peso "+getCategory()+" com "+getWin()+" vitórias, "+getLose()+" derrotas e "+getEmpate()+"empates.");
    }
    @Override
    public void ganharLuta(){
        setWin(getWin()+1);
    }
    @Override
    public void perderLuta(){
        setLose(getLose()+1);
    }
    @Override
    public void empatarLuta(){
        setEmpate(getEmpate()+1);
    }

    //metodo especiais (acessores e modificadores)
    public String getName() {
        return name;
    }
    public void setName(String n) {
        this.name = n;
    }
    public String getNacionality() {
        return nacionality;
    }
    public void setNacionality(String n) {
        this.nacionality = n;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int a) {
        this.age = a;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double h) {
        this.height = h;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double w) {
        this.weight = w;
        setCategory(w);
    }
    public String getCategory() {
        return category;
    }
    private void setCategory(double peso) {
        if (52.2 > peso){
            category = "Inválido";
        } else if (70.3 >= peso){
            category = "Peso leve";
        } else if (83.9 >= peso){
            category = "Peso médio";
        } else if (120.2 >= peso){
            category = "Peso pesado";
        } else {
            category = "Inválido";
        }
    }
    public int getWin() {
        return win;
    }
    public void setWin(int w) {
        this.win = w;
    }
    public int getLose() {
        return lose;
    }
    public void setLose(int l) {
        this.lose = l;
    }
    public int getEmpate() {
        return empate;
    }
    public void setEmpate(int e) {
        this.empate = e;
    }
}
