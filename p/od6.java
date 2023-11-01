package p.od6;
import p.ud6;
import java.util.ArrayList;
import android.graphics.Matrix;
import p.zc6;
import android.graphics.Canvas;
import java.util.Iterator;
import java.util.List;
import java.lang.Object;

public final class od6 extends ud6	// class@0020fd from classes.dex
{
    public final List b;
    public final Matrix c;

    public void od6(ArrayList p0,Matrix p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void a(Matrix p0,zc6 p1,int p2,Canvas p3){
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(this.c, p1, p2, p3);
       }
       return;
    }
}
