package no1;

public class DemoClub {
    public static void main(String[] args){
        Club club1 = new Club();
        Club club2 = new Club("Persija Jakarta");
        Club club3 = new Club("Persija Jakarta", "Persija Jakarta merupakan klub sepakbola asal jakarta yang awalnya didirika oleh Soeri dan Alie");
        Club club4 = new Club("Persija Jakarta", 1928, "Gelora Bung Karno");
        Club club5 = new Club("Persija Jakarta", 1928, "Gelora BUng Karno", 2, "Persija Jakarta merupakan klub sepakbola asal jakarta yang awalnya didirika oleh Soeri dan Alie");

        // Untuk Memanggil Method getTeam
        club1.getTeam();
        System.out.println();

        club2.getTeam();
        System.out.println();

        club3.getTeam();
        System.out.println();

        club4.getTeam();
        System.out.println();

        club5.getTeam();
    }
}
