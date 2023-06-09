package fr.diginamic.enumerations;

import junit.framework.TestCase;
import org.junit.Test;

public class SaisonTest extends TestCase {
    @Test
    public void testValueOfLibelle() {
        Saison s = Saison.valueOfLibelle("abc");
        assertEquals(null,s);

    }

    @Test
    public void testValueOfLibelleSaison() {
        Saison s = Saison.valueOfLibelle("Printemps");
        assertEquals(Saison.PRINTEMPS,s);
    }
}