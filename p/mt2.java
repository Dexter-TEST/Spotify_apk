package p.mt2;
import p.wt2;
import java.util.EnumSet;
import p.nk2;
import java.lang.Enum;
import android.view.ViewGroup;
import p.uu2;
import p.ut2;
import p.lt2;

public final class mt2 extends wt2	// class@001efe from classes.dex
{
    public final int a;

    public void mt2(int p0){
       this.a = p0;
       super();
    }
    public final EnumSet d(){
       nk2 v = nk2.v;
       nk2 w = nk2.w;
       nk2 y = nk2.y;
       switch (this.a){
           case 0:
           default:
             return EnumSet.of(y, w, v);
       }
       return EnumSet.of(y, w, v);
    }
    public final ut2 e(ViewGroup p0,uu2 p1){
       switch (this.a){
           case 0:
           default:
             return new lt2(p0, p1, 1);
       }
       return new lt2(p0, p1, 0);
    }
}
