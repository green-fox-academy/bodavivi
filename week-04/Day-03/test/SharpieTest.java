import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SharpieTest {

  Sharpie sharpie;


  @Test
  public void inkAmount_WidthZero(){
    this.sharpie = new Sharpie("blue", 0);
    float result = sharpie.returnWidth();
    Assert.assertEquals(0, result, 0.0f);
  }

  @Test
  public void inkAmount_WidthFraction(){
    this.sharpie = new Sharpie("blue", 2.34f);
    float result = sharpie.returnWidth();
    Assert.assertEquals(2.34f, result, 0.0f);
  }

  @Test
  public void use(){
    sharpie = new Sharpie("red", 10);
    sharpie.use();
    sharpie.returnInkAmount();
    float result = sharpie.inkAmount;
    Assert.assertEquals(80, result, 0.0f);
  }

}