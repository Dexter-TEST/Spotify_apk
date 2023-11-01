package p.gd6;
import java.lang.Object;
import java.util.ArrayList;
import android.graphics.PointF;
import java.util.List;
import java.util.Collection;
import java.lang.String;
import java.lang.StringBuilder;
import p.kg4;

public final class gd6	// class@0016eb from classes.dex
{
    public final ArrayList a;
    public PointF b;
    public boolean c;

    public void gd6(){
       super();
       this.a = new ArrayList();
    }
    public void gd6(PointF p0,boolean p1,List p2){
       super();
       this.b = p0;
       this.c = p1;
       this.a = new ArrayList(p2);
    }
    public final void a(float p0,float p1){
       if (this.b == null) {
          this.b = new PointF();
       }
       this.b.set(p0, p1);
       return;
    }
    public final String toString(){
       return kg4.p("ShapeData{numCurves="+this.a.size()+"closed=", this.c, '}');
    }
}
