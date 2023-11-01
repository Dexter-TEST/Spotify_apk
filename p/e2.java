package p.e2;
import p.wt2;
import java.util.EnumSet;
import p.nk2;
import java.lang.Enum;

public abstract class e2 extends wt2	// class@00140a from classes.dex
{
    public final int a;

    public void e2(int p0){
       this.a = p0;
       super();
    }
    public final EnumSet d(){
       nk2 y = nk2.y;
       switch (this.a){
           case 0:
           default:
             return EnumSet.of(y, nk2.v);
       }
       return EnumSet.of(y);
    }
}
