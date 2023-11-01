package p.sq2;
import p.yf2;
import p.uq2;
import android.content.Context;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import p.tq2;
import p.vi7;
import p.b90;
import io.reactivex.rxjava3.core.Observable;
import p.d90;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.c16;

public final class sq2 implements yf2	// class@00267b from classes.dex
{
    public final uq2 a;
    public final boolean b;
    public final Context c;

    public void sq2(uq2 p0,boolean p1,Context p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final Object apply(Object p0){
       sq2 ta = this.a;
       ta.getClass();
       return d90.a(new tq2(ta, this.b, 0)).compose(ta.v).map(new c16(this.c, 7, p0));
    }
}
