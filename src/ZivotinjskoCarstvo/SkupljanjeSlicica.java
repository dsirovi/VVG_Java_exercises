package ZivotinjskoCarstvo;

import java.util.Scanner;

public class SkupljanjeSlicica {
    public static void main(String[] args) {
        Scanner ucitavanjeSlicica = new Scanner(System.in);

        System.out.println("Unesite broj slicice koju ste dobili u albumu: ");
        Integer brojUneseneSlicice = ucitavanjeSlicica.nextInt();
        ucitavanjeSlicica.nextLine();

        System.out.println("Unesite naziv zivotinje: ");
        String nazivZivotinjeSaSlicice = ucitavanjeSlicica.nextLine();

        Slicica novaSlicica = new Slicica(brojUneseneSlicice, nazivZivotinjeSaSlicice);

        ZivotinjskoCarstvo noviAlbum = new ZivotinjskoCarstvo();

        noviAlbum.getAlbum()[brojUneseneSlicice - 1] = novaSlicica;

        ucitavanjeSlicica.close();

    }
}
