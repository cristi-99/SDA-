package ro.usv;

public class Inginer extends Persoana implements IAngajat {
    int nrOre;
    private static double coeficientSalarial = 1.5;

    Inginer(String _nume, String _prenume, int nrOreLucrate){
        super(_nume, _prenume);
        nrOre = nrOreLucrate;
    }

    public void setNrOreLucrate(int nrOreLucrate){
        nrOre = nrOreLucrate;
    }

    public double salariu() {
        return salariuOrarMinim * coeficientSalarial * nrOre;
    }

    @Override
    public String toString() {
        return "Inginer " + super.toString() + " a lucrat " + nrOre + " ore" +
                " - salariu=" + salariu();
    }
}
