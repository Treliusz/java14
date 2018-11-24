package a.sda.weekend3.sobota.wyjatki;

public class Samochod {
    public static class MechanicznyException extends Exception{
        public MechanicznyException(String message){
            super(message);
        }
    }
    private double ladownosc;
    public Samochod(double ladownosc){
        this.ladownosc = ladownosc;
    }
    public double getLadownosc() throws MechanicznyException{
        if(ladownosc<1000){
            throw new MechanicznyException("Zbyt niska ładowność");
        }
        return ladownosc;
    }

    public static void main(String[] args) {
        Samochod samochod = new Samochod(500);
        try {
            System.out.println(samochod.getLadownosc());
        } catch (MechanicznyException exp){
            System.out.println(exp.getMessage());
            return;
        }
    }
}
