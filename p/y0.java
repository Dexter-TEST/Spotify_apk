package p.y0;
import java.lang.Object;
import java.lang.CharSequence;
import p.fo2;
import p.w51;
import java.lang.Class;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.String;
import p.xe7;

public abstract class y0	// class@002d28 from classes.dex
{

    public void y0(){
       super();
    }
    public final fo2 a(CharSequence p0){
       int i = p0.length() * 2;
       int i1 = 0;
       int i2 = 1;
       int i3 = (i >= 0)? 1: 0;
       if (i3) {
          w51 ow51 = this.b();
          ow51.getClass();
          i2 = p0.length();
          for (; i1 < i2; i1 = i1 + 1) {
             ow51.J(p0.charAt(i1));
          }
          return ow51.B();
       }else {
          Object[] objArray = new Object[i2];
          objArray[i1] = Integer.valueOf(i);
          throw new IllegalArgumentException(xe7.E("expectedInputSize must be >= 0 but was %s", objArray));
       }
    }
    public abstract w51 b();
}
