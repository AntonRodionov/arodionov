package ru.job4j.testingtask;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Test.
*
* @author Anton Rodionov
* @version $Id$
*/
public class SubStringTest {
/**
* Test подстрока содержится в строке.
*/
	@Test
    public void subStringExist() {
        SubString sbstr = new SubString();
		String origintest = "припять приветствует вас";
		String subtest = "привет";
		Boolean result = sbstr.contains(origintest, subtest);
		Boolean expected = true;
		assertThat(result, is(expected));
    }
/**
* Test подстрока несодержится в строке.
*/
	@Test
    public void subStringNotExist() {
        SubString sbstr = new SubString();
		String origintest = "припять приветствует вас";
		String subtest = "сталкер";
		Boolean result = sbstr.contains(origintest, subtest);
		Boolean expected = false;
		assertThat(result, is(expected));
    }
/**
* Test подстрока частично содержится в строке, кроме последнего символа.
*/
	@Test
    public void subStringIsPartiallyExist() {
        SubString sbstr = new SubString();
		String origintest = "припять приветствует вас";
		String subtest = "приветт";
		Boolean result = sbstr.contains(origintest, subtest);
		Boolean expected = false;
		assertThat(result, is(expected));
    }
}