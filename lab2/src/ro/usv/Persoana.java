package ro.usv;

public class Persoana {
    String nume, prenume;
    Persoana(String _nume,String _prenume){
        nume = _nume;
        prenume = _prenume;
    }

    public String getNume(){
        return nume;
    }

    public String getPrenume()
    {
        return prenume;
    }

    @Override
    public String toString() {
        return nume + " " + prenume;
    }
}
