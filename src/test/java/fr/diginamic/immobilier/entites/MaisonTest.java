package fr.diginamic.immobilier.entites;

import junit.framework.TestCase;

public class MaisonTest extends TestCase {

    public void testAjouterPiece() {
     Chambre c = new Chambre(1,100);
     Cuisine cui = new Cuisine(2,200);
     SalleDeBain salleDB = new SalleDeBain(3,300);
     Salon saln = new Salon(1,100);
     WC wc = new WC(1,100);

     Maison m = new Maison();
     m.ajouterPiece(c);
     m.ajouterPiece(cui);
     m.ajouterPiece(salleDB);
     m.ajouterPiece(saln);
     m.ajouterPiece(wc);
     m.ajouterPiece(null);

     Piece[] psm = m.getPieces();

     assertEquals(3,psm.length);

    }

//    public void testNbPieces() {
//    }
//
//    public void testSuperficieEtage() {
//    }
//
//    public void testSuperficieTypePiece() {
//    }
//
//    public void testCalculerSurface() {
//    }
}