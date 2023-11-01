package p.b13;
import p.f0;
import java.util.EnumSet;
import p.nk2;
import java.lang.Enum;

public final class b13 extends f0	// class@001033 from classes.dex
{
    public final int a;

    public void b13(int p0){
       this.a = p0;
       super();
    }
    public final EnumSet d(){
       nk2 y = nk2.y;
       switch (this.a){
           case 0:
             return EnumSet.of(y);
           case 2:
             return EnumSet.of(y);
           default:
             return EnumSet.of(nk2.w);
       }
    }
}
