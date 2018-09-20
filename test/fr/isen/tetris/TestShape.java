package fr.isen.tetris;
import fr.ubo.tetris.Shape;
import fr.ubo.tetris.Tetrominoes;


import org.junit.*;



public class TestShape {

	private static Shape shape;

	@BeforeClass
	public static void setup() {
		shape = new Shape();
	}
	
	@Test
	public void setRandomShape() {
		Assert.assertEquals(fr.ubo.tetris.Tetrominoes.NoShape, shape.getShape());
		shape.setRandomShape();
		Assert.assertNotEquals(Tetrominoes.NoShape, shape.getShape());
	}
}
