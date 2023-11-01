package p.ko1;
import p.id4;
import p.c0;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.ref.ReferenceQueue;
import android.content.Intent;
import android.net.Uri;
import java.lang.String;
import java.lang.Class;
import p.sv7;
import p.dt3;
import p.b;
import p.mk5;
import p.t10;
import p.a;
import java.lang.Boolean;
import java.lang.Integer;
import p.uv1;
import p.fe;
import p.sw;
import p.x3;
import java.lang.Float;
import android.view.animation.PathInterpolator;
import p.xy5;
import p.io1;
import p.yf2;
import p.up0;
import p.an5;
import p.rn6;
import p.nu4;
import p.mu4;
import p.a94;
import com.spotify.legacyglue.contextmenu.glue.StretchingGradientDrawable;
import android.graphics.Paint;
import p.tw;
import p.pk;
import java.util.Set;
import p.mk;
import p.wh6;
import java.util.Map;
import java.lang.StringBuilder;
import p.en6;
import p.mi;
import p.zy5;
import java.util.Iterator;
import p.b93;
import android.database.Cursor;
import p.vv7;
import p.ej4;
import p.at;
import java.util.ArrayList;
import p.lt;
import p.lv;
import p.nr;
import java.util.Calendar;
import java.lang.IllegalStateException;
import p.or;
import java.util.List;
import com.spotify.login.signupapi.services.model.CallingCode;
import p.ms;
import p.i73;
import p.kg4;
import p.fu;
import p.r45;
import p.mu;
import p.i80;
import com.spotify.login5.v3.proto.Challenges;
import com.spotify.login5.v3.identifiers.proto.PhoneNumber;
import p.zs;
import p.rn1;
import p.jj5;
import p.tn6;
import io.reactivex.rxjava3.core.Observable;
import p.ou4;
import p.zv6;
import io.reactivex.rxjava3.core.ObservableSource;
import p.ok0;
import p.wm7;
import p.b5;
import io.reactivex.rxjava3.core.Completable;
import p.co5;
import p.fn6;

public final class ko1 implements id4	// class@001c4f from classes.dex
{
    public final int a;
    public Object b;
    public Object c;
    public Object t;

    public void ko1(int p0){
       this.a = p0;
       if (p0 != 6) {
          c0 a = c0.a;
          if (p0 != 11) {
             if (p0 != 13) {
                if (p0 != 14) {
                   super();
                   this.b = new Object();
                   this.c = new ConcurrentHashMap();
                   this.t = new ReferenceQueue();
                   return;
                }else {
                   super();
                   return;
                }
             }else {
                super();
                this.b = a;
                this.c = a;
                this.t = a;
                return;
             }
          }else {
             super();
             this.b = a;
             this.c = a;
             return;
          }
       }else {
          super();
          return;
       }
    }
    public void ko1(int p0,int p1){
       this.a = p0;
       super();
    }
    public void ko1(Intent p0){
       this.a = 2;
       super(p0.getData(), p0.getAction(), p0.getType(), 2);
    }
    public void ko1(Class p0){
       this.a = 4;
       super(null, p0);
    }
    public void ko1(Object p0,Object p1,Object p2,int p3){
       this.a = p3;
       this.b = p0;
       this.c = p1;
       this.t = p2;
       super();
    }
    public void ko1(String p0,sv7 p1,dt3 p2){
       this.a = 5;
       super();
       this.t = p0;
       this.b = p1;
       this.c = p2;
    }
    public void ko1(b p0){
       this.a = 12;
       super();
       this.b = p0.a;
       this.c = p0.b;
       this.t = p0.c;
    }
    public void ko1(b p0,int p1){
       this.a = 12;
       super(p0);
    }
    public void ko1(ko1 p0,Class p1){
       this.a = 4;
       super();
       this.b = p0;
       this.c = p1;
    }
    public void ko1(mk5 p0,mk5 p1){
       this.a = 1;
       this.t = p0;
       super();
       this.c = p1;
    }
    public void ko1(t10 p0){
       this.a = 14;
       super();
       this.b = p0.a;
       this.c = Boolean.valueOf(p0.b);
       this.t = Integer.valueOf(p0.c);
    }
    public void ko1(t10 p0,int p1){
       this.a = 14;
       super(p0);
    }
    public void ko1(uv1 p0){
       this.a = 8;
       super();
       this.t = p0;
       float f = (float)this.d();
       float f1 = (float)sw.a.a.intValue() / f;
       float f2 = (float)sw.b.a.intValue() / f;
       fe v6 = new fe(f1, f2, sw.c.a.floatValue(), sw.d.a.floatValue(), sw.e);
       this.c = v6;
    }
    public void ko1(xy5 p0){
       this.a = 0;
       super();
       this.b = p0;
       this.c = new io1(p0, 0);
       this.t = new io1(p0, 1);
    }
    public void ko1(yf2 p0,up0 p1){
       this.a = 10;
       super();
       this.t = new an5();
       this.b = p0;
       this.c = p1;
    }
    public static ko1 l(rn6 p0){
       return new ko1(new nu4(0, p0, 0), new up0(2, p0));
    }
    public static ko1 m(rn6 p0,int p1){
       return new ko1(new mu4(p0, p1), new up0(0, p0));
    }
    public static ko1 n(rn6 p0,long p1){
       return new ko1(new a94(1, p1, p0), new up0(1, p0));
    }
    public final void a(float p0){
       StretchingGradientDrawable stretchingGr = this.t.h();
       stretchingGr.d.setAlpha((int)(this.c.a(p0) * 0x437f0000));
       stretchingGr.g = this.b.a(p0) * this.t.n();
       this.t.o();
    }
    public final void b(){
       float f = (float)this.d();
       float f1 = (float)tw.a.a.intValue() / f;
       float f2 = (float)tw.b.a.intValue() / f;
       fe v7 = new fe(f1, f2, tw.c.a.floatValue(), tw.d.a.floatValue(), tw.e);
       this.b = v7;
    }
    public final void c(pk p0){
       int i2;
       String str1;
       int i3;
       mk omk = p0.keySet();
       if (omk.isEmpty()) {
          return;
       }
       int i = 0;
       int i1 = 999;
       if (p0.c > i1) {
          pk opk = new pk(i1);
          wh6 c = p0.c;
          i = 0;
          while (true) {
             i2 = 0;
             break ;
          }
          while (true) {
             if (i < c) {
                opk.put(p0.h(i), null);
                i = i + 1;
                if ((i2 = i2 + 1) == i1) {
                   this.c(opk);
                   p0.putAll(opk);
                   opk = new pk(i1);
                }
             }else if(i2 > 0){
                this.c(opk);
                p0.putAll(opk);
                break ;
             }
             break ;
          }
          return;
       }else {
          StringBuilder str = en6.r("SELECT `episode_uri`,`position`,`fully_played` FROM `episode_progress` WHERE `episode_uri` IN \(");
          wh6 c1 = omk.a.c;
          mi.c(c1, str);
          zy5 ozy5 = zy5.x((c1 + i), str+"\)");
          Iterator iterator = omk.iterator();
          i2 = 1;
          while (true) {
             Iterator iterator1 = iterator;
             if (iterator1.hasNext()) {
                if ((str1 = iterator1.next()) == null) {
                   ozy5.z(i2);
                }else {
                   ozy5.s(i2, str1);
                }
                i2 = i2 + 1;
             }else {
                break ;
             }
          }
          Cursor uCursor = vv7.J(this.b, ozy5, i);
          if ((i3 = ej4.y(uCursor, "episode_uri")) == -1) {
             uCursor.close();
             return;
          }else {
             while (uCursor.moveToNext()) {
                if (!uCursor.isNull(i3)) {
                   String str2 = uCursor.getString(i3);
                   if (p0.containsKey(str2)) {
                      str1 = (uCursor.isNull(i))? null: uCursor.getString(i);
                      int intx = uCursor.getInt(1);
                      boolean b = (uCursor.getInt(2))? true: false;
                      p0.put(str2, at.b(intx, str1, b));
                   }
                }
             }
             uCursor.close();
             return;
          }
       }
    }
    public final int d(){
       return (sw.b.a.intValue() + sw.a.a.intValue());
    }
    public final void e(pk p0){
       int i2;
       String str1;
       int i3;
       ArrayList orDefault;
       mk omk = p0.keySet();
       if (omk.isEmpty()) {
          return;
       }
       int i = 0;
       int i1 = 999;
       if (p0.c > i1) {
          pk opk = new pk(i1);
          wh6 c = p0.c;
          i = 0;
          while (true) {
             i2 = 0;
             break ;
          }
          while (true) {
             if (i < c) {
                opk.put(p0.h(i), p0.j(i));
                i = i + 1;
                if ((i2 = i2 + 1) == i1) {
                   this.e(opk);
                   opk = new pk(i1);
                }
             }else if(i2 > 0){
                this.e(opk);
                break ;
             }
             break ;
          }
          return;
       }else {
          StringBuilder str = en6.r("SELECT `url`,`width`,`height`,`parent_uri` FROM `images` WHERE `parent_uri` IN \(");
          wh6 c1 = omk.a.c;
          mi.c(c1, str);
          zy5 ozy5 = zy5.x((c1 + i), str+"\)");
          Iterator iterator = omk.iterator();
          i2 = 1;
          while (true) {
             Iterator iterator1 = iterator;
             if (iterator1.hasNext()) {
                if ((str1 = iterator1.next()) == null) {
                   ozy5.z(i2);
                }else {
                   ozy5.s(i2, str1);
                }
                i2 = i2 + 1;
             }else {
                break ;
             }
          }
          Cursor uCursor = vv7.J(this.b, ozy5, i);
          if ((i3 = ej4.y(uCursor, "parent_uri")) == -1) {
             uCursor.close();
             return;
          }else {
             while (uCursor.moveToNext()) {
                if (!uCursor.isNull(i3)) {
                   Integer integer = null;
                   if ((orDefault = p0.getOrDefault(uCursor.getString(i3), integer)) != null) {
                      String str2 = (uCursor.isNull(i))? integer: uCursor.getString(i);
                      Integer integer1 = (uCursor.isNull(1))? integer: Integer.valueOf(uCursor.getInt(1));
                      if (!uCursor.isNull(2)) {
                         integer = Integer.valueOf(uCursor.getInt(2));
                      }
                      orDefault.add(lt.a(integer1, integer, str2));
                   }
                }
             }
             uCursor.close();
             return;
          }
       }
    }
    public final void f(pk p0){
       int i2;
       String str1;
       int i3;
       ko1 oko1 = this;
       wh6 owh6 = p0;
       mk omk = p0.keySet();
       if (omk.isEmpty()) {
          return;
       }
       int i = 0;
       int i1 = 999;
       if (owh6.c > i1) {
          pk opk = new pk(i1);
          wh6 c = owh6.c;
          i = 0;
          while (true) {
             i2 = 0;
             break ;
          }
          while (true) {
             if (i < c) {
                opk.put(owh6.h(i), null);
                i = i + 1;
                if ((i2 = i2 + 1) == i1) {
                   oko1.f(opk);
                   owh6.putAll(opk);
                   opk = new pk(i1);
                }
             }else if(i2 > 0){
                oko1.f(opk);
                owh6.putAll(opk);
                break ;
             }
             break ;
          }
          return;
       }else {
          StringBuilder str = en6.r("SELECT `tag`,`uri`,`name`,`description`,`publisher`,`created`,`explicit` FROM `shows` WHERE `uri` IN \(");
          wh6 c1 = omk.a.c;
          mi.c(c1, str);
          zy5 ozy5 = zy5.x((c1 + i), str+"\)");
          Iterator iterator = omk.iterator();
          i2 = 1;
          while (true) {
             Iterator iterator1 = iterator;
             if (iterator1.hasNext()) {
                if ((str1 = iterator1.next()) == null) {
                   ozy5.z(i2);
                }else {
                   ozy5.s(i2, str1);
                }
                i2 = i2 + 1;
             }else {
                break ;
             }
          }
          Cursor uCursor = vv7.J(oko1.b, ozy5, i);
          if ((i3 = ej4.y(uCursor, "uri")) == -1) {
             uCursor.close();
             return;
          }else {
             while (uCursor.moveToNext()) {
                if (!uCursor.isNull(i3)) {
                   String str2 = uCursor.getString(i3);
                   if (owh6.containsKey(str2)) {
                      String str3 = (uCursor.isNull(i))? null: uCursor.getString(i);
                      String str4 = (uCursor.isNull(1))? null: uCursor.getString(1);
                      int i4 = 2;
                      String str5 = (uCursor.isNull(i4))? null: uCursor.getString(i4);
                      i4 = 3;
                      String str6 = (uCursor.isNull(i4))? null: uCursor.getString(i4);
                      i4 = 4;
                      String str7 = (uCursor.isNull(i4))? null: uCursor.getString(i4);
                      long longx = uCursor.getLong(5);
                      boolean b = (uCursor.getInt(6))? true: false;
                      owh6.put(str2, lv.a(longx, str4, str5, str6, str7, str3, b));
                   }
                }
             }
             uCursor.close();
             return;
          }
       }
    }
    public final nr g(){
       String str = (this.c == null)? " dateOfBirthValid": "";
       if (this.t == null) {
          str = str.concat(" minimumAge");
       }
       if (str.isEmpty()) {
          return new nr(this.b, this.c.booleanValue(), this.t.intValue());
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final or h(){
       String str = (this.t == null)? " callingCodes": "";
       if (str.isEmpty()) {
          return new or(this.b, this.c, this.t);
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final ms i(){
       String str = (this.b == null)? " name": "";
       if (this.c == null) {
          str = str.concat(" importance");
       }
       if (this.t == null) {
          str = kg4.l(str, " frames");
       }
       if (str.isEmpty()) {
          return new ms(this.b, this.c.intValue(), this.t);
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final fu j(){
       return new fu(this.b, this.c, this.t);
    }
    public final mu k(){
       String str = (this.b == null)? " loginContext": "";
       if (this.c == null) {
          str = str.concat(" challenges");
       }
       if (this.t == null) {
          str = kg4.l(str, " phoneNumber");
       }
       if (str.isEmpty()) {
          return new mu(this.b, this.c, this.t);
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final void o(zs p0){
       this.b.b();
       this.b.c();
       this.c.h(p0);
       this.b.r();
       this.b.m();
    }
    public final void p(at p0){
       this.b.b();
       this.b.c();
       this.t.h(p0);
       this.b.r();
       this.b.m();
    }
    public final void q(List p0){
       p0.getClass();
       this.c = new jj5(p0);
    }
    public final Observable r(tn6 p0){
       return this.t.startWith(Observable.fromSupplier(new ou4(this, p0, 0)));
    }
    public final ok0 s(tn6 p0,Object p1){
       return Completable.i(new wm7(this, p0, p1, 2));
    }
    public final String toString(){
       String str;
       StringBuilder str1;
       ko1 tt;
       switch (this.a){
           case 1:
             str = "[ ";
             if (this.b != null) {
                for (int i = 0; i < 9; i = i + 1) {
                   str = en6.r(str).append(this.b.y[i]).append(" ").toString();
                }
             }
             break;
           case 2:
             str1 = "NavDeepLinkRequest{";
             if (this.b != null) {
                str1 = str1+" uri="+String.valueOf(this.b);
             }
             if (this.c != null) {
                str1 = str1+" action="+this.c;
             }
             if (this.t != null) {
                str1 = str1+" mimetype="+this.t;
             }
             str1 = str1+" }";
             co5.l(str1, "sb.toString\(\)");
             return str1;
             break;
           case 4:
             str1 = "[ClassStack \(self-refs: ";
             str = ((tt = this.t) == null)? "0": String.valueOf(tt.size());
             str1 = str1+str+')';
             tt = this;
             while (tt != null) {
                str1 = str1.append(' ').append(tt.c.getName());
                tt = tt.b;
             }
             return str1+']';
             break;
           default:
             return super.toString();
       }
       return en6.s(str, "] ")+this.b;
    }
}
