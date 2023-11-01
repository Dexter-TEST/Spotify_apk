package p.jc3;
import p.kc3;
import java.lang.Object;
import java.lang.String;
import java.util.Locale;
import java.lang.Float;

public final class jc3 implements kc3	// class@001aab from classes.dex
{
    public final float a;
    public final float b;
    public final float c;
    public final float t;

    public void jc3(float p0,float p1,float p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = 0;
       super();
    }
    public final float d(float p0,float p1,float p2){
       jc3 tb = this.b;
       jc3 ta = this.a;
       float f = tb - ta;
       float f1 = 0x3f800000;
       if (!(0 - f)) {
          f = f1 / tb;
       }
       p2 = (p2 - ta) / f;
       return ((this.t * p2) + ((f1 - p2) * this.c));
    }
    public final String toString(){
       Object[] objArray = new Object[]{Float.valueOf(this.a),Float.valueOf(this.b),Float.valueOf(this.c),Float.valueOf(this.t)};
       return String.format(Locale.US, "map\(%.2f, %.2f, %.2f, %.2f\)", objArray);
    }
}
