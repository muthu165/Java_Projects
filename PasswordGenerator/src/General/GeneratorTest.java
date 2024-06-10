package General;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratorTest {
	
	@Test
	public void test1() {
		Password password = new Password("skcmygsfdvbg");
		assertNotEquals("skcmygsfdvb", password.toString());
	}
	
	@Test
	public void test2() {
		Alphabet firstAlphabet = new Alphabet(true,false,false,false);
		assertTrue(firstAlphabet.getAlphabet().equals(Alphabet.uppercase));
	}
	
	@Test
	public void test3() {
		Alphabet secondAlphabet = new Alphabet(false,true,true,true);
		assertEquals(secondAlphabet.getAlphabet(), Alphabet.lowercase + Alphabet.numbers + Alphabet.symbols);
	}
	
	@Test
	public void test4() {
		Generator generator = new Generator(true,false,false,false);
		assertEquals(generator.alphabet.getAlphabet(), Alphabet.uppercase);
	}
	
	@Test
	public void test5() {
		Generator generator = new Generator(true,true,false,false);
		Password generatedPassword = generator.generatePassword(4);
		assertEquals(generator.alphabet.getAlphabet().length(), 52);
	}
}
