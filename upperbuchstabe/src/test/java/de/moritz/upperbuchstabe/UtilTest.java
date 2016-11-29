package de.moritz.upperbuchstabe;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class UtilTest {

	private int para;
	private boolean soll;

	public UtilTest(int soll, int para) {
			this.para = para;
			
		if(soll == 0){
			this.soll = false;
			
		}else{this.soll = true;}
		
		
		}

	@Parameters
	public static Collection<Integer[]> daten() {
		return Arrays.asList(new Integer[][] 
				
				{
			{ 1, 1 }, 
			{ 1, 2 }, 
			{ 1, 3 }, 
			{ 1, 4 }, 
			{ 1, 5 },
			{ 1, 6 }, 
			{ 1, 7 },
			{ 0, 8 }, 
			{ 0, 9 }, 
			{ 0, 10 }, 
			{ 0, 11 }, 
			{ 0, 12 }, 
			});
	}

	@Test
	public void test() {
		Util neuHalbjahr = new Util();
	assertEquals(soll , neuHalbjahr.istErstesHalbjahr(para));
	}

	 @Test(expected=IllegalArgumentException.class, timeout=1000)
	 public void testistErstesHalbjahrMontat1() {
	 Util.istErstesHalbjahr(0);
	
	 }
	
	 @Test(expected=IllegalArgumentException.class, timeout=1000)
	 public void testistErstesHalbjahrMontat2() {
	 Util.istErstesHalbjahr(13);
	 }

}
