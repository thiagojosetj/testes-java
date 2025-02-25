package pessoas;
public class Pessoas {

    private double h;
    private char sexo;

    public Pessoas(double h, char sexo) {
        this.h = h;
        this.sexo = sexo;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
