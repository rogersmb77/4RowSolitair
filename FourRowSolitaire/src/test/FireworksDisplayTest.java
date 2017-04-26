package test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import FourRowSolitaire.FireworksDisplay;

public class FireworksDisplayTest {

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @Test
  public void FireworksDisplay() {
    throw new RuntimeException("Test not implemented");
  }
  
  @Test
	public void test_type() throws Exception {
		
		assertNotNull(FireworksDisplay.class);
	}
  @Test
	public void test_instantiation() throws Exception {
		
		int num = 0;
		int size = 0;
		FireworksDisplay target = new FireworksDisplay(num, size);
		assertNotNull(target);
	}

  @Test
  public void actionPerformedActionEvent() throws Exception {
		
		int num = 0;
		int size = 0;
		FireworksDisplay target = new FireworksDisplay(num, size);
		ActionEvent e = null;
		target.actionPerformed(e);
	
  }

  @Test
  public void paintGraphics() throws Exception {
		
		int num = 0;
		int size = 0;
		FireworksDisplay target = new FireworksDisplay(num, size);
		Graphics g = null;
		target.paint(g);
  }

  @Test
  public void randomColor() throws Exception {
		
		int num = 0;
		int size = 0;
		FireworksDisplay target = new FireworksDisplay(num, size);
		Color actual = target.randomColor();
		Color expected = null;
		assertEquals(expected, actual);
  }

  @Test
  public void restartDisplay() throws Exception {
		
		int num = 0;
		int size = 0;
		FireworksDisplay target = new FireworksDisplay(num, size);
		target.restartDisplay();
  }

}
