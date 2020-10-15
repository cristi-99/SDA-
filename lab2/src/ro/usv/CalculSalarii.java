package ro.usv;

public class CalculSalarii {

    public static void main(String[] args) {
	    Inginer i1 = new Inginer("Barbulescu", "Barbu", 100);
	    Inginer i2 = new Inginer("Trestie", "Tudor", 200);
	    Sofer sofer = new Sofer("Repede", "Raul", 250, 1000);
	    System.out.println(i1.toString());
	    System.out.println(i2.toString());
	    System.out.println(sofer.toString());
	    double salarii = i1.salariu()+i2.salariu()+sofer.salariu();
	    System.out.println("Total salarii="+ salarii);
    }
}
