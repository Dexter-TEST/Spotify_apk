package p.hh4;
import p.zf2;
import p.gi3;
import java.lang.Object;
import p.kh4;
import java.lang.String;
import p.co5;
import java.lang.Boolean;

public final class hh4 extends gi3 implements zf2	// class@001851 from classes.dex
{
    public final float a;
    public final float b;

    public void hh4(float p0,float p1){
       this.a = p0;
       this.b = p1;
       super(1);
    }
    public final Object invoke(Object p0){
       co5.o(p0, "it");
       return Boolean.valueOf(p0.dispatchNestedPreFling(this.a, this.b));
    }
}
