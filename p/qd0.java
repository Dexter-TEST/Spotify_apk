package p.qd0;
import android.util.Property;
import android.graphics.PointF;
import java.lang.Class;
import java.lang.String;
import android.graphics.Rect;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import java.lang.Math;

public final class qd0 extends Property	// class@002379 from classes.dex
{
    public final Rect a;

    public void qd0(){
       super(PointF.class, "boundsOrigin");
       this.a = new Rect();
    }
    public final Object get(Object p0){
       qd0 ta = this.a;
       p0.copyBounds(ta);
       return new PointF((float)ta.left, (float)ta.top);
    }
    public final void set(Object p0,Object p1){
       qd0 ta = this.a;
       p0.copyBounds(ta);
       ta.offsetTo(Math.round(p1.x), Math.round(p1.y));
       p0.setBounds(ta);
    }
}
