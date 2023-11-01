package p.ic3;
import p.kc3;
import java.lang.Object;
import java.lang.String;
import java.util.Locale;
import java.lang.Float;

public final class ic3 implements kc3	// class@001967 from classes.dex
{
    public final float a;
    public final float b;

    public void ic3(float p0){
       this.a = 0;
       this.b = p0;
       super();
    }
    public final float d(float p0,float p1,float p2){
       return p2;
    }
    public final String toString(){
       Object[] objArray = new Object[]{Float.valueOf(this.a),Float.valueOf(this.b)};
       return String.format(Locale.US, "unit\(%.2f, %.2f\)", objArray);
    }
}
