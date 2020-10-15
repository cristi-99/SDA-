package ro.usv;

public class Sofer extends Persoana implements IAngajat{
    int nrOre, kmParcursi;

    Sofer(String _nume,String _prenume,int nrOreLucrate,int km){
        super(_nume, _prenume);
        nrOre = nrOreLucrate;
        kmParcursi = km;
    }

    private static double coeficientSalarial = 1;

    public void setNrOreLucrate(int nrOreLucrate){
        nrOre = nrOreLucrate;
    }

    public double salariu() {
        return salariuOrarMinim * coeficientSalarial * nrOre + kmParcursi * 0.1;
    }

    @Override
    public String toString() {
        return "Sofer " + super.toString() + " a lucrat " + nrOre + " ore, a parcurs " + kmParcursi + " km" +
        " - salariu=" + salariu();
    }
}
