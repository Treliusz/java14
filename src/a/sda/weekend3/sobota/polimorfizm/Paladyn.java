package a.sda.weekend3.sobota.polimorfizm;

public class Paladyn  extends Charakter{

    public static class PaladynShieldException extends Exception{
        public PaladynShieldException(String message){
            super(message);
        }
    }
    boolean tarcza;

    public Paladyn(String imie, int wiek, double wzrost, String sila, String obrona, int moc, boolean tarcza){
        super(imie,wiek,wzrost,sila,obrona,moc);
        this.tarcza = tarcza;
    }

    public boolean getTarcza() throws PaladynShieldException{
        if(!tarcza){
            throw new PaladynShieldException("Nie możesz walczyć bez tarczy");
        }
        return true;
    }
    @Override
    public String toString() {
        return "Paladyn{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                ", wzrost=" + wzrost +
                ", sila='" + sila + '\'' +
                ", obrona='" + obrona + '\'' +
                ", moc=" + moc +
                '}';
    }

    @Override
    public void walcz() {
        System.out.println("Atakuję młotem");

    }


}
