package p.v01;
import java.lang.Object;
import android.graphics.PointF;
import java.lang.String;
import java.lang.Float;

public final class v01	// class@002954 from classes.dex
{
    public final PointF a;
    public final PointF b;
    public final PointF c;

    public void v01(){
       super();
       this.a = new PointF();
       this.b = new PointF();
       this.c = new PointF();
    }
    public void v01(PointF p0,PointF p1,PointF p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final String toString(){
       Object[] objArray = new Object[6];
       v01 tc = this.c;
       objArray[0] = Float.valueOf(tc.x);
       objArray[1] = Float.valueOf(tc.y);
       tc = this.a;
       objArray[2] = Float.valueOf(tc.x);
       objArray[3] = Float.valueOf(tc.y);
       tc = this.b;
       objArray[4] = Float.valueOf(tc.x);
       objArray[5] = Float.valueOf(tc.y);
       return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", objArray);
    }
}
