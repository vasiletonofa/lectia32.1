public class Afisare implements Runnable {
    String nume;
    int varsta;

    public Afisare(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public void run() {
        System.out.println("Nume: " + nume + " Varsta: " + varsta);
    }
}
