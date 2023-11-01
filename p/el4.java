package p.el4;
import p.yf2;
import android.app.Activity;
import java.lang.Object;
import p.rl4;
import p.ja3;
import java.lang.Runnable;
import p.ok0;
import io.reactivex.rxjava3.core.Completable;
import p.jk0;
import p.pl4;
import p.g6;
import p.ul4;
import p.ql4;

public final class el4 implements yf2	// class@0014ad from classes.dex
{
    public final int a;
    public final Activity b;

    public void el4(Activity p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       el4 tb = this.b;
       switch (this.a){
           case 0:
             return Completable.j(new g6(tb, 1)).m();
           case 1:
             return Completable.j(new g6(tb, 2)).m();
           case 2:
             return Completable.j(new ja3(tb, 3, p0)).m();
           default:
             return Completable.j(new ja3(tb, 4, p0)).m();
       }
    }
}
