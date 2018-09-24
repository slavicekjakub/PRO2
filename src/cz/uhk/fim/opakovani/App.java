package cz.uhk.fim.opakovani;

public class App {
    public static void main(String[] args) {
        App app = new App();
        app.printStars();
        app.printStart(8);

        String[] seznamSlov = new String[]{"Ahoj", "Petr", "Konec"};

        //2 instance tridy slovo a naplnit daty ze seznamu (pres parametricky konstruktor a druhy pres setry)
        // vypsat obe instance s jejich obsahem
        Slovo slovo1 = new Slovo();
        Slovo slovo2 = new Slovo(seznamSlov[1],seznamSlov[1].length());

        slovo1.setObsah(seznamSlov[2]);
        slovo1.setPocetPismen(seznamSlov[2].length());

        System.out.println(slovo1.getObsah() + " " + slovo1.getPocetPismen());
        System.out.println(slovo2.toString());
    }
    private void printStars(){
        System.out.println("*");
    }

    private void printStart(int number){

        for (int i = 0; i < number; i++) {
            System.out.println("*");
        }
    }

}
