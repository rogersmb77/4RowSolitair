package test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import java.awt.Graphics;
import java.awt.Point;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FourRowSolitaire.Card;
import FourRowSolitaire.DiscardPile;

public class DiscardPileTest {

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @Test
  public void DiscardPile() {
    throw new RuntimeException("Test not implemented");
  }
  
  @Test
	public void test_type() throws Exception {
		
		assertNotNull(DiscardPile.class);
	}
  @Test
	public void test_instantiation() throws Exception {
		
		int draw = 0;
		DiscardPile target = new DiscardPile(draw);
		assertNotNull(target);
	}

  @Test
  public void addCard() throws Exception {
		
		int draw = 0;
		DiscardPile target = new DiscardPile(draw);
		Object card = null;
		target.addCard(card);
  }		

  @Test
  public void addStack() throws Exception {
		
		int draw = 0;
		DiscardPile target = new DiscardPile(draw);
		Object stack = null;
		target.addStack(stack);
  }

  @Test
  public void getCardAtLocation() throws Exception {
		
		int draw = 0;
		DiscardPile target = new DiscardPile(draw);
		Point p = null;
		Object actual = target.getCardAtLocation(p);
		Object expected = null;
		assertEquals(expected, actual);
  }

  @Test
  public void getNumViewableCards() throws Exception {
		
		int draw = 0;
		DiscardPile target = new DiscardPile(draw);
		int actual = target.getNumViewableCards();
		int expected = 0;
		assertEquals(expected, actual);
	}

  @Test
  public void isValidMove() throws Exception {
		
		int draw = 0;
		DiscardPile target = new DiscardPile(draw);
		Object card = null;
		boolean actual = target.isValidMove(card);
		boolean expected = false;
		assertEquals(expected, actual);
  }

  @Test
  public void isValidMove(Card stack) throws Exception {
		
		int draw = 0;
		DiscardPile target = new DiscardPile(draw);
		Object stack = null;
		boolean actual = target.isValidMove(stack);
		boolean expected = false;
		assertEquals(expected, actual);
  }

  @Test
  public void paintGraphics() throws Exception {
		
		int draw = 0;
		DiscardPile target = new DiscardPile(draw);
		Graphics g = null;
		target.paint(g);
  }

  @Test
  public void pop() throws Exception {
		
		int draw = 0;
		DiscardPile target = new DiscardPile(draw);
		Object actual = target.pop();
		Object expected = null;
		assertEquals(expected, actual);
  }

  @Test
  public void pushCard() throws Exception {
		
		int draw = 0;
		DiscardPile target = new DiscardPile(draw);
		Object card = null;
		Object actual = target.push(card);
		Object expected = null;
		assertEquals(expected, actual);
  }

  @Test
  public void pushCardStack() throws Exception {
		
		int draw = 0;
		DiscardPile target = new DiscardPile(draw);
		Object stack = null;
		Object actual = target.push(stack);
		Object expected = null;
		assertEquals(expected, actual);
  }

  @Test
  public void setDrawCount() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void setView() throws Exception {
		
		int draw = 0;
		DiscardPile target = new DiscardPile(draw);
		int numViewableCards = 0;
		target.setView(numViewableCards);
  }

  @Test
  public void undoPop() throws Exception {
		
		int draw = 0;
		DiscardPile target = new DiscardPile(draw);
		Object actual = target.undoPop();
		Object expected = null;
		assertEquals(expected, actual);

  }

}
