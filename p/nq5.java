package p.nq5;
import p.ly7;
import p.j65;
import java.lang.Object;
import java.util.List;
import java.util.Collections;
import p.c0;
import com.spotify.legacyglue.gluelib.patterns.header.behavior.HeaderBehavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.View;
import com.spotify.lite.database.room.RecentSearchRoomDatabase;
import p.m91;
import p.xy5;
import p.nr7;
import java.lang.Runnable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.HashMap;
import p.di3;
import p.eb4;
import java.lang.Integer;
import p.jb7;
import p.kb7;
import p.lb7;
import java.lang.String;
import java.util.ArrayList;
import p.ys5;
import com.google.common.collect.c;
import p.w51;
import java.util.Iterator;
import com.spotify.webapi.service.models.PlaylistTrack;
import p.do5;
import java.util.Arrays;
import p.au;
import p.kg4;
import java.lang.IllegalStateException;
import p.wv;
import java.lang.Long;
import p.y57;
import p.b28;
import android.content.Context;
import p.pw7;
import p.iy7;
import p.lz7;
import p.uy;
import p.uw6;
import p.sw6;
import android.view.MenuItem;
import p.d74;
import io.reactivex.rxjava3.core.Single;
import p.aq6;
import java.lang.Enum;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import p.cm7;
import p.up0;
import p.yf2;
import p.rm;
import java.util.Map;
import p.i64;
import p.dk3;
import p.vj3;

public final class nq5 implements ly7, j65	// class@00202d from classes.dex
{
    public Object a;
    public Object b;
    public Object c;

    public void nq5(int p0){
       if (p0 != 6) {
          if (p0 != 13) {
             if (p0 != 9) {
                if (p0 != 10) {
                   super();
                   this.a = Collections.emptyList();
                   this.b = Collections.emptyList();
                   return;
                }else {
                   super();
                   return;
                }
             }else {
                super();
                return;
             }
          }else {
             super();
             c0 a = c0.a;
             this.b = a;
             this.c = a;
             return;
          }
       }else {
          super();
          return;
       }
    }
    public void nq5(HeaderBehavior p0,CoordinatorLayout p1,View p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void nq5(RecentSearchRoomDatabase p0){
       super();
       this.a = p0;
       this.b = new m91(this, p0, 15);
       this.c = new nr7(this, p0, 4);
    }
    public void nq5(Object p0,Object p1,Object p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void nq5(Runnable p0){
       super();
       this.b = new CopyOnWriteArrayList();
       this.c = new HashMap();
       this.a = p0;
    }
    public void nq5(di3 p0){
       this.c = p0;
       this.b = p0;
       super();
       short[] oshortArray = new short[768];
       this.a = oshortArray;
    }
    public void nq5(eb4 p0,Integer p1){
       this.c = p0;
       super();
       lb7 this.a = p1;
       jb7 ojb7 = p0.b.b();
       this.a = new lb7("banner_section", null, null, this.a, null);
       ojb7.i.add(this.a);
       ojb7.j = true;
       this.b = ojb7.a();
    }
    public static ys5 e(List p0){
       PlaylistTrack entity;
       int i = p0.size();
       w51.h(i, "expectedSize");
       w51.h(i, "initialCapacity");
       Object[] objArray = new Object[i];
       Iterator iterator = p0.iterator();
       int i1 = 0;
       int i2 = 0;
       while (iterator.hasNext()) {
          if ((entity = iterator.next().entity) != null) {
             int i3 = i1 + 1;
             if (objArray.length < i3) {
                objArray = Arrays.copyOf(objArray, do5.t(objArray.length, i3));
             }else if(i2){
                objArray = objArray.clone();
             }
             i2 = 0;
             i3 = i1 + 1;
             objArray[i1] = entity;
             i1 = i3;
          }
       }
       return c.m(i1, objArray);
    }
    public final au a(){
       String str = (this.a == null)? " backgroundColor": "";
       if (this.b == null) {
          str = str.concat(" titleColor");
       }
       if (this.c == null) {
          str = kg4.l(str, " textColor");
       }
       if (str.isEmpty()) {
          return new au(this.a.intValue(), this.b.intValue(), this.c.intValue());
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final wv b(){
       String str = (this.b == null)? " tokenExpirationTimestamp": "";
       if (str.isEmpty()) {
          return new wv(this.a, this.b.longValue(), this.c);
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final Object c(){
       return new pw7(this.a.a(), this.b.c(), this.c.c());
    }
    public final void d(String p0){
       this.a.b();
       uw6 ouw6 = this.c.c();
       if (p0 == null) {
          ouw6.z(1);
       }else {
          ouw6.s(1, p0);
       }
       this.a.c();
       ouw6.u();
       this.a.r();
       this.a.m();
       this.c.f(ouw6);
       return;
    }
    public final boolean f(MenuItem p0){
       Iterator iterator = this.b.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          if (iterator.next().a(p0)) {
             break ;
          }
       }
       return true;
    }
    public final Single first(){
       int i;
       if ((i = this.a.b.ordinal()) != 9 && i != 10) {
          return Single.error(new IllegalArgumentException(this.a.toString()));
       }
       return this.b.l(this.a.t).map(new up0(12, this));
    }
    public final Single g(String p0){
       return this.b.w(p0).map(new rm(14));
    }
    public final void h(d74 p0){
       i64 oi64;
       this.b.remove(p0);
       if ((oi64 = this.c.remove(p0)) != null) {
          oi64.a.c(oi64.b);
          oi64.b = null;
       }
       this.a.run();
       return;
    }
}
