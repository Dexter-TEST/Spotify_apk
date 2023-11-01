package p.y94;
import java.util.concurrent.Callable;
import java.lang.Object;
import p.fa4;
import com.spotify.webapi.service.models.Episode;
import java.util.Collection;
import java.lang.Class;
import com.spotify.webapi.service.models.EpisodeSimple;
import com.spotify.webapi.service.models.ShowSimple;
import p.ut;
import p.xy5;
import p.wk5;
import java.util.ArrayList;
import java.lang.String;
import p.or7;
import androidx.work.impl.WorkDatabase;
import p.lr7;
import p.jr7;

public final class y94 implements Callable	// class@002d73 from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;
    public final Object t;

    public void y94(Object p0,Object p1,Object p2,int p3){
       this.a = p3;
       this.b = p0;
       this.c = p1;
       this.t = p2;
       super();
    }
    public final Object call(){
       y94 tt = this.t;
       y94 tc = this.c;
       y94 tb = this.b;
       switch (this.a){
           case 0:
             tb.getClass();
             return tb.a.p(new y94(tb, tc, tt, 1));
           case 1:
             tb.getClass();
             return tb.f(tc, tc.show, tt);
           default:
             wk5 v = tb.v;
             tc.addAll(v.z().i(tt));
             return v.y().l(tt);
       }
    }
}
