package p.hc3;
import p.kc3;
import java.lang.Object;
import java.lang.String;
import java.util.Locale;
import java.lang.Float;

public final class hc3 implements kc3	// class@001823 from classes.dex
{
    public final float a;

    public void hc3(float p0){
       this.a = p0;
       super();
    }
    public final float d(float p0,float p1,float p2){
       return this.a;
    }
    public final String toString(){
       Object[] objArray = new Object[]{Float.valueOf(this.a)};
       return String.format(Locale.US, "point\(%.2f\)", objArray);
    }
}
