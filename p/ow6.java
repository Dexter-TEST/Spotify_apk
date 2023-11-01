package p.ow6;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.pw6;
import p.kd3;
import java.lang.IllegalArgumentException;

public final class ow6	// class@0021a5 from classes.dex
{
    public final Context a;
    public String b;
    public kd3 c;

    public void ow6(Context p0){
       co5.o(p0, "context");
       super();
       this.a = p0;
    }
    public final pw6 a(){
       ow6 tc;
       if ((tc = this.c) == null) {
          throw new IllegalArgumentException("Must set a callback to create the configuration.".toString());
       }
       pw6 v6 = new pw6(this.a, this.b, tc, false, false);
       return v6;
    }
}
