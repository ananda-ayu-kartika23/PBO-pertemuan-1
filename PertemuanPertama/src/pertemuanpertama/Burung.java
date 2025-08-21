package pertemuanpertama;

public class Burung extends Hewan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Burung nemo = new Burung();
        nemo.setJumlahKaki(2);
        nemo.setWarnaBulu("Kuning");
        nemo.setJumlahMata(2);
        System.out.println("jumlah kaki burung (protected): " + nemo.getJumlahKaki());
        System.out.println("jumla warna bulu burung (protected): " + nemo.getWarnaBulu());
        System.out.println("warna jumlah mata (protected): " + nemo.getJumlahMata());

    }

}
