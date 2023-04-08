package auto;

public class Auto {

// --- Attribute --- //

    String hersteller;
    int tank;
    int leistung;
    boolean hatTUEV;
    int kilometerStand;

//  --- --- --- ---  //

// --- Konstruktoren --- //

    public Auto(){}      // parameterloser Standardkonstruktor

    public Auto(String hersteller){
       this.hersteller = hersteller;
    }

    public Auto(String hersteller,int tank,int leistung){
       this.hersteller = hersteller;
       this.tank = tank;
       this.leistung = leistung;
    }

// --- --- --- --- //

// --- Getter/Setter --- //


    public String getHersteller() {
        return this.hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public int getTank() {
        return this.tank;
    }

    public void setTank(int tank) {
        this.tank = tank;
    }

    public int getLeistung() {
        return this.leistung;
    }

    public void setLeistung(int leistung) {
        this.leistung = leistung;
    }

    public boolean hatTUEV() {
        return this.hatTUEV;
    }

    public void setHatTUEV(boolean tuev) {
        this.hatTUEV = tuev;
    }

    public int getKilometerStand() {
        return this.kilometerStand;
    }

    public void setKilometerStand(int kilometerStand) {
        this.kilometerStand = kilometerStand;
    }

// --- --- --- --- --- //

// --- Methoden --- //

    public void fahren(){
        this.kilometerStand ++;
    }
    public void hupen(){
        System.out.println("Beep Beep");
    }
    public void tanken(int liter){
        this.tank = liter;
    }

    @Override
    public String toString() {
        return
                "Hersteller: " + this.hersteller + '\n' +
                "Aktueller Fuellstand: " + this.tank + '\n' +
                "Leistung in PS: " + this.leistung + '\n' +
                "Inspektion: " + this.hatTUEV + '\n' +
                "Kilometerstand: " + this.kilometerStand;
    }


    // --- --- --- --- //
}
