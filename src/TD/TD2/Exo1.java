package TD.TD2;

public class Exo1 {
    public static void main(String[] args) {
        Point P1 = new Point('A',4.0);
        Point P2 = new Point('B',7.0);
        P1.display();
        P1.Translate(2);
        System.out.println("Apres la translation :");
        P1.display();

        P2.display();
        P2.Translate(3);
        System.out.println("Apres la translation :");
        P2.display();
    }
}
class Point {
    private char name;
    private double abscisse;
    public Point(char n , double abs){
        this.name = n;
        this.abscisse = abs;
    }
    public char getName() {
        return name;
    }
    public double getAbscisse() {
        return abscisse;
    }
    public void setName(char name) {
        this.name = name;
    }
    public void setAbscisse(double abscisse) {
        this.abscisse = abscisse;
    }

    public void display() {
        System.out.println("Point{" + "name=" + name + ", abscisse=" + abscisse + '}');
    }
    public void Translate(double absM){
        this.abscisse = this.abscisse + absM;
    }
}
