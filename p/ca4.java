package p.ca4;
import java.util.concurrent.Callable;
import p.fa4;
import java.util.List;
import java.util.Collection;
import java.lang.Object;
import java.lang.Class;
import p.xy5;
import p.ut;
import java.util.HashSet;
import java.util.Iterator;
import com.spotify.webapi.service.models.EpisodeSimple;
import com.spotify.webapi.service.models.ShowSimple;
import java.util.Set;
import com.google.common.collect.d;
import com.google.common.collect.g;
import java.util.AbstractCollection;

public final class ca4 implements Callable	// class@0011cb from classes.dex
{
    public final int a;
    public final fa4 b;
    public final List c;
    public final Collection t;

    public void ca4(fa4 p0,List p1,Collection p2,int p3){
       this.a = p3;
       this.b = p0;
       this.c = p1;
       this.t = p2;
       super();
    }
    public final Object call(){
       ca4 tt = this.t;
       ca4 tc = this.c;
       ca4 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.getClass();
             HashSet hashSet = new HashSet(tt);
             Iterator iterator = tc.iterator();
             while (iterator.hasNext()) {
                hashSet.addAll(tb.f(iterator.next(), null, hashSet).a);
             }
             return fa4.a(hashSet, g.A);
       }
       tb.getClass();
       return tb.a.p(new ca4(tb, tc, tt, 1));
    }
}
