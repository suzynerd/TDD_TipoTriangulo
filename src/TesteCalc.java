import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TesteCalc {

	@Before
	public void setUp() throws Exception {
	}	

	@Test
	public void testTipoTriangulo() {
		System.out.println("TipoTriangulo ");
        TipoTriangulo instance = new TipoTriangulo();
        assertTrue( instance.verificaTriangulo( 2 ,2 ,2 ) );  //teste se �  equil�tero
        assertTrue( instance.verificaTriangulo( 2 ,3 ,2 ) );  // teste se � is�sceles
        assertTrue( instance.verificaTriangulo( 4 ,3 ,5 ) );  //teste se � escaleno
	}

}
