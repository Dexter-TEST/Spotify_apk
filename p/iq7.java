package p.iq7;
import p.qw6;
import android.content.Context;
import java.lang.Object;
import p.pw6;
import p.rw6;
import java.lang.String;
import p.co5;
import java.lang.CharSequence;
import p.kd3;
import p.sf2;
import java.lang.IllegalArgumentException;

public final class iq7 implements qw6	// class@0019e8 from classes.dex
{
    public final Context a;

    public void iq7(Context p0){
       this.a = p0;
    }
    public final rw6 f(pw6 p0){
       iq7 ta = this.a;
       co5.o(ta, "$context");
       pw6 b = p0.b;
       pw6 c = p0.c;
       co5.o(c, "callback");
       int i = 1;
       int i1 = (b != null && b.length())? 0: 1;
       if (i1) {
          i = 0;
       }
       if (i) {
          sf2 pw6 i2 = new pw6(ta, b, c, true, true);
          i2 = new sf2(i.a, i.b, i.c, i.d, i.e);
          return i2;
       }else {
          throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.".toString());
       }
    }
}
