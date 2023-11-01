package p.ze2;
import java.lang.Runnable;
import java.util.ArrayList;
import java.lang.Object;
import android.view.View;
import java.lang.String;
import p.wh7;
import p.jh7;

public final class ze2 implements Runnable	// class@002edc from classes.dex
{
    public final int a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList t;
    public final ArrayList v;

    public void ze2(int p0,ArrayList p1,ArrayList p2,ArrayList p3,ArrayList p4){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
       super();
    }
    public final void run(){
       for (int i = 0; i < this.a; i = i + 1) {
          jh7.v(this.b.get(i), this.c.get(i));
          jh7.v(this.t.get(i), this.v.get(i));
       }
       return;
    }
}
