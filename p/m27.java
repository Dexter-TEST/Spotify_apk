package p.m27;
import android.graphics.Paint;
import android.graphics.Paint$Style;

public final class m27 extends Paint	// class@001e13 from classes.dex
{

    public void m27(int p0){
       if (p0 != 1) {
          super(1);
          this.setStyle(Paint$Style.FILL);
          return;
       }else {
          super(1);
          this.setStyle(Paint$Style.STROKE);
          return;
       }
    }
}
