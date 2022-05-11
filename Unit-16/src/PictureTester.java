/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("H:\\APCSA\\Crisafulli_Nicholas_apcsa-2022\\Unit-16\\src\\images\\beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("H:\\\\APCSA\\\\Crisafulli_Nicholas_apcsa-2022\\\\Unit-16\\\\src\\\\images\\\\caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("H:\\\\APCSA\\\\Crisafulli_Nicholas_apcsa-2022\\\\Unit-16\\\\src\\\\images\\\\temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms()
  {
    Picture temple = new Picture("H:\\APCSA\\Crisafulli_Nicholas_apcsa-2022\\Unit-16\\src\\images\\snowman.jpg");
    temple.explore();
    temple.mirrorArms();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("H:\\APCSA\\Crisafulli_Nicholas_apcsa-2022\\Unit-16\\src\\images\\640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("H:\\APCSA\\Crisafulli_Nicholas_apcsa-2022\\Unit-16\\src\\images\\swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("H:\\APCSA\\Crisafulli_Nicholas_apcsa-2022\\Unit-16\\src\\images\\swan.jpg");
    swan.edgeDetection2(10);
    swan.explore();
  }
  
  public static void testKeepOnlyBlue() {
	  Picture beach = new Picture("H:\\APCSA\\Crisafulli_Nicholas_apcsa-2022\\Unit-16\\src\\images\\beach.jpg");
	    beach.explore();
	    beach.keepOnlyBlue();
	    beach.explore();
  }
  
  
  public static void testNegate() {
	  Picture beach = new Picture("H:\\APCSA\\Crisafulli_Nicholas_apcsa-2022\\Unit-16\\src\\images\\beach.jpg");
	    beach.explore();
	    beach.negate();
	    beach.explore();
  }
  
  public static void testGrayscale() {
	  Picture beach = new Picture("H:\\APCSA\\Crisafulli_Nicholas_apcsa-2022\\Unit-16\\src\\images\\beach.jpg");
	    beach.explore();
	    beach.grayscale();
	    beach.explore();
  }
  
  public static void testFixUnderwater() {
	  Picture beach = new Picture("H:\\APCSA\\Crisafulli_Nicholas_apcsa-2022\\Unit-16\\src\\images\\water.jpg");
	    beach.explore();
	    beach.fixUnderwater();
	    beach.explore();
  }
  
  public static void testMirrorDiagonal() {
	  Picture beach = new Picture("H:\\APCSA\\Crisafulli_Nicholas_apcsa-2022\\Unit-16\\src\\images\\beach.jpg");
	    beach.explore();
	    beach.mirrorDiagonal();
	    beach.explore();
  }
  
  public static void testMirrorHorizontal() {
	  Picture beach = new Picture("H:\\APCSA\\Crisafulli_Nicholas_apcsa-2022\\Unit-16\\src\\images\\beach.jpg");
	    beach.explore();
	    beach.mirrorHorizontal();
	    beach.explore();
  }
  
  public static void testmirrorVerticalRightToLeft() {
	  Picture beach = new Picture("H:\\APCSA\\Crisafulli_Nicholas_apcsa-2022\\Unit-16\\src\\images\\redMotorcycle.jpg");
	    beach.explore();
	    beach.mirrorVerticalRightToLeft();
	    beach.explore();
  }
  
  public static void testmirrorHorizontalBotToTop() {
	  Picture beach = new Picture("H:\\APCSA\\Crisafulli_Nicholas_apcsa-2022\\Unit-16\\src\\images\\redMotorcycle.jpg");
	    beach.explore();
	    beach.mirrorHorizontalBotToTop();
	    beach.explore();
  }
  
  public static void testMirrorGull() {
	  Picture beach = new Picture("H:\\APCSA\\Crisafulli_Nicholas_apcsa-2022\\Unit-16\\src\\images\\seagull.jpg");
	    beach.explore();
	    beach.mirrorGull();
	    beach.explore();
  }
  
  public static void testCopy() {
	  Picture beach = new Picture("H:\\APCSA\\Crisafulli_Nicholas_apcsa-2022\\Unit-16\\src\\images\\seagull.jpg");
	  Picture cat = new Picture("H:\\APCSA\\Crisafulli_Nicholas_apcsa-2022\\Unit-16\\src\\images\\kitten2.jpg");
	    beach.explore();
	    beach.copy(cat, 90, 120, 215, 350, 330, 410);
	    beach.explore();
  }
  
  public static void testMyCollage()
  {
    Picture canvas = new Picture("H:\\APCSA\\Crisafulli_Nicholas_apcsa-2022\\Unit-16\\src\\images\\seagull.jpg");
    canvas.myCollage();
    canvas.explore();
  }
  
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
	//testMirrorHorizontal();
	//testmirrorVerticalRightToLeft();
	//testmirrorHorizontalBotToTop();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
	//testMyCollage();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}