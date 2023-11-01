package p.aa4;
import java.util.concurrent.Callable;
import p.fa4;
import com.spotify.webapi.service.models.ShowSimple;
import java.util.Collection;
import java.lang.Object;
import java.lang.Class;
import p.xy5;
import p.ut;
import java.lang.String;
import p.td7;
import p.aq6;
import p.ic;
import java.lang.System;
import p.kv;
import p.xe7;
import java.lang.Long;
import java.lang.Boolean;
import p.lv;
import p.kf6;
import com.spotify.lite.database.room.MetadataRoomDatabase;
import java.util.List;
import p.t63;
import java.util.HashSet;
import com.google.common.collect.d;
import com.google.common.collect.g;
import java.util.AbstractCollection;
import java.lang.IllegalArgumentException;

public final class aa4 implements Callable	// class@000f45 from classes.dex
{
    public final int a;
    public final fa4 b;
    public final ShowSimple c;
    public final Collection t;

    public void aa4(fa4 p0,ShowSimple p1,Collection p2,int p3){
       this.a = p3;
       this.b = p0;
       this.c = p1;
       this.t = p2;
       super();
    }
    public final Object call(){
       aq6 uoaq6;
       ShowSimple explicit;
       ShowSimple images;
       aa4 tt = this.t;
       aa4 tc = this.c;
       int i = 1;
       aa4 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.getClass();
             String str = td7.b(tc.uri);
             if ((uoaq6 = td7.d(str)) == null || tt.contains(uoaq6)) {
                throw new IllegalArgumentException(str);
             }
             tb.c.getClass();
             kv okv = new kv();
             okv.e(str);
             okv.c(xe7.J(tc.name));
             okv.b(xe7.J(tc.description));
             okv.d(xe7.J(tc.publisher));
             okv.f = Long.valueOf(System.currentTimeMillis());
             if ((explicit = tc.explicit) == null || !explicit.booleanValue()) {
                i = false;
             }
             okv.g = Boolean.valueOf(i);
             fa4 a = tb.a;
             a.A().j(okv.a());
             if ((images = tc.images) != null && !images.isEmpty()) {
                fa4.e(a.x(), str, tc.images);
             }
             HashSet str1 = new HashSet(tt);
             str1.add(uoaq6);
             return fa4.a(str1, g.A);
       }
       tb.getClass();
       return tb.a.p(new aa4(tb, tc, tt, i));
    }
}
