package p.x60;
import p.wt2;
import p.c33;
import p.wd5;
import java.lang.Class;
import java.lang.Object;
import p.p77;
import java.util.EnumSet;
import p.nk2;
import java.lang.Enum;
import android.view.ViewGroup;
import p.uu2;
import p.ut2;
import p.w60;
import android.view.View;
import p.et0;

public final class x60 extends wt2	// class@002c15 from classes.dex
{
    public final int a;
    public final wd5 b;
    public final Object c;

    public void x60(c33 p0,wd5 p1){
       this.a = 0;
       super();
       this.c = p0;
       p1.getClass();
       this.b = p1;
    }
    public void x60(wd5 p0,p77 p1){
       this.a = 1;
       super();
       this.b = p0;
       this.c = p1;
    }
    public final EnumSet d(){
       switch (this.a){
           case 0:
           default:
             return EnumSet.of(nk2.y);
       }
       return EnumSet.of(nk2.b, nk2.t);
    }
    public final ut2 e(ViewGroup p0,uu2 p1){
       x60 tb = this.b;
       x60 tc = this.c;
       switch (this.a){
           case 0:
           default:
             return new w60(et0.n(p0, R.layout.component_small_icon_title, p0, false), tb, tc);
       }
       return new w60(et0.n(p0, R.layout.find_category_card, p0, false), tc, tb);
    }
}
