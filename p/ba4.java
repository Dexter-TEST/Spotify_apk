package p.ba4;
import java.util.concurrent.Callable;
import p.fa4;
import com.spotify.webapi.service.models.Playlist;
import java.util.Collection;
import java.lang.Object;
import java.lang.Class;
import p.xy5;
import p.ut;
import com.spotify.webapi.service.models.PlaylistBase;
import java.lang.String;
import p.td7;
import p.aq6;
import p.ic;
import java.lang.System;
import p.o11;
import com.spotify.webapi.service.models.UserPublic;
import p.xe7;
import java.lang.Long;
import p.kw;
import p.oe7;
import com.spotify.lite.database.room.MetadataRoomDatabase;
import p.yu;
import p.zu;
import p.fh5;
import p.t63;
import java.util.List;
import java.util.HashSet;
import com.google.common.collect.d;
import com.google.common.collect.g;
import java.util.AbstractCollection;
import java.lang.NullPointerException;
import java.lang.IllegalArgumentException;

public final class ba4 implements Callable	// class@001087 from classes.dex
{
    public final int a;
    public final fa4 b;
    public final Playlist c;
    public final Collection t;

    public void ba4(fa4 p0,Playlist p1,Collection p2,int p3){
       this.a = p3;
       this.b = p0;
       this.c = p1;
       this.t = p2;
       super();
    }
    public final Object call(){
       aq6 uoaq6;
       UserPublic uri;
       ba4 tt = this.t;
       ba4 tc = this.c;
       ba4 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.getClass();
             if (tc.owner == null) {
                throw new IllegalArgumentException();
             }
             String str = td7.b(tc.uri);
             if ((uoaq6 = td7.d(str)) == null) {
                throw new IllegalArgumentException(str);
             }
             tb.c.getClass();
             long l = System.currentTimeMillis();
             o11 oo11 = new o11(19, 0);
             PlaylistBase owner = tc.owner;
             if ((uri = owner.uri) == null) {
                throw new NullPointerException("Null uri");
             }
             oo11.c = uri;
             if ((uri = owner.id) == null) {
                throw new NullPointerException("Null username");
             }
             oo11.t = uri;
             oo11.v = xe7.J(owner.display_name);
             oo11.w = Long.valueOf(l);
             kw okw = oo11.n();
             fa4 a = tb.a;
             a.C().l(okw);
             yu oyu = new yu();
             if (str == null) {
                throw new NullPointerException("Null uri");
             }
             oyu.b = str;
             oyu.c = xe7.J(tc.name);
             oyu.d = okw.b;
             oyu.e = Long.valueOf(l);
             a.y().g(oyu.a());
             if (tc.images != null) {
                fa4.e(a.x(), str, tc.images);
             }
             HashSet str1 = new HashSet(tt);
             str1.add(uoaq6);
             return fa4.a(str1, g.A);
       }
       tb.getClass();
       return tb.a.p(new ba4(tb, tc, tt, 1));
    }
}
