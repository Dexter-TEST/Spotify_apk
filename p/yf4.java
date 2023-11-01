package p.yf4;
import p.zf2;
import p.gi3;
import p.lg4;
import p.gg4;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.Integer;
import java.util.Map;

public final class yf4 extends gi3 implements zf2	// class@002da9 from classes.dex
{
    public final int a;
    public final lg4 b;

    public void yf4(lg4 p0,int p1){
       this.a = p1;
       this.b = p0;
       super(1);
    }
    public final Boolean a(gg4 p0){
       yf4 tb = this.b;
       switch (this.a){
           case 0:
           default:
             co5.o(p0, "destination");
             return Boolean.valueOf((tb.k.containsKey(Integer.valueOf(p0.y)) ^ 0x01));
       }
       co5.o(p0, "destination");
       return Boolean.valueOf((tb.k.containsKey(Integer.valueOf(p0.y)) ^ 0x01));
    }
    public final Object invoke(Object p0){
       switch (this.a){
           case 0:
           default:
             return this.a(p0);
       }
       return this.a(p0);
    }
}
