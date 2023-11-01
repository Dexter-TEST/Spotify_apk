package p.y95;
import p.zv6;
import java.lang.Object;
import p.wi5;
import java.lang.Class;
import java.util.ArrayList;
import java.lang.Iterable;
import p.aj0;
import java.util.Iterator;
import p.vi5;
import io.reactivex.rxjava3.core.Single;
import p.ir2;
import p.yf2;
import java.lang.String;
import p.co5;
import com.spotify.liteplayer.player.npv.view.PeekScrollView;
import android.view.View;
import java.lang.Boolean;
import p.p82;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import p.zo0;

public final class y95 implements zv6	// class@002d74 from classes.dex
{
    public final int a;
    public final Object b;

    public void y95(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final Object get(){
       y95 tb = this.b;
       switch (this.a){
           case 0:
             break;
           case 1:
             tb.getClass();
             wi5 a = tb.a;
             ArrayList uArrayList = new ArrayList(aj0.b0(a));
             Iterator iterator = a.iterator();
             while (iterator.hasNext()) {
                uArrayList.add(iterator.next().a());
             }
             Single single = Single.zip(uArrayList, ir2.Z);
             co5.l(single, "zip\(preloads.map { it.pr…ta.NotPreloaded\n        }");
             return single;
             break;
           default:
             return tb.replay();
       }
       boolean b = (tb.getScrollY() > 0)? true: false;
       return Flowable.o(Boolean.valueOf(b));
    }
}
