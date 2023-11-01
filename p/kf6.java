package p.kf6;
import p.ly7;
import p.lo4;
import p.xh6;
import java.lang.Object;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import p.vd4;
import android.app.Activity;
import p.r61;
import android.content.Context;
import p.w51;
import android.content.res.Resources;
import java.lang.String;
import p.tj2;
import p.lj2;
import p.sj2;
import p.t63;
import android.app.Dialog;
import android.content.DialogInterface$OnCancelListener;
import android.content.DialogInterface$OnDismissListener;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Class;
import android.view.View;
import p.uj2;
import android.widget.TextView;
import android.view.View$OnClickListener;
import io.reactivex.rxjava3.core.Observable;
import p.hj4;
import p.db4;
import p.jb7;
import p.kb7;
import p.lb7;
import java.lang.Integer;
import java.util.ArrayList;
import p.eb4;
import p.vx5;
import java.lang.reflect.Constructor;
import p.xy5;
import p.m91;
import p.co5;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collections;
import p.pk;
import p.mk;
import p.wh6;
import java.lang.StringBuilder;
import p.en6;
import p.mi;
import p.zy5;
import java.util.Iterator;
import p.b93;
import android.database.Cursor;
import p.vv7;
import p.ej4;
import p.lt;
import p.hy7;
import p.jy7;
import p.pz7;
import p.dx7;
import java.io.File;
import java.lang.Throwable;
import android.util.Log;
import p.jk0;
import p.jc6;
import p.yf2;
import io.reactivex.rxjava3.core.Completable;
import p.a70;
import p.pb7;
import p.ob7;
import p.fb7;
import p.ib7;
import p.gb7;
import p.nb7;
import p.mb7;
import p.lv;
import p.rn1;
import java.lang.AssertionError;
import java.lang.RuntimeException;
import java.lang.reflect.InvocationTargetException;
import java.lang.NullPointerException;

public final class kf6 implements ly7, lo4, xh6	// class@001c03 from classes.dex
{
    public final int a;
    public Object b;
    public Object c;

    public void kf6(int p0){
       this.a = p0;
       if (p0 != 14) {
          super();
          this.c = new HashMap();
          return;
       }else {
          super();
          this.b = new AtomicReference();
          this.c = new AtomicReference();
          vd4 ovd4 = new vd4();
          this.c.lazySet(ovd4);
          this.b.getAndSet(ovd4);
          return;
       }
    }
    public void kf6(Activity p0,r61 p1){
       this.a = 9;
       super();
       this.b = p0;
       this.c = p1;
    }
    public void kf6(Context p0){
       this.a = 4;
       super();
       w51.k(p0);
       Resources resources = p0.getResources();
       this.b = resources;
       this.c = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }
    public void kf6(Context p0,tj2 p1){
       t63 b;
       this.a = 10;
       super();
       lj2 olj2 = new lj2(p0, p1.i);
       this.c = olj2;
       t63 ot63 = new t63(olj2);
       this.b = ot63;
       ot63.b.setCancelable(p1.e);
       ot63.b.setOnCancelListener(p1.f);
       ot63.b.setOnDismissListener(p1.g);
       if (!TextUtils.isEmpty(p1.a)) {
          ot63.c = p1.c;
          b = ot63.b;
          b.getClass();
          b.b.setVisibility(0);
       }else {
          b = ot63.b;
          b.getClass();
          b.b.setVisibility(8);
       }
       if (!TextUtils.isEmpty(p1.b)) {
          ot63.t = p1.d;
          ot63.b.a(true);
       }else {
          ot63.b.a(0);
       }
       ot63 = ot63.b;
       ot63.getClass();
       ot63.t = lj2.w;
       tj2 a = p1.a;
       lj2 b1 = this.c.b;
       b1.setText(a);
       b1.setOnClickListener(new uj2(this, 0));
       if (!TextUtils.isEmpty(a)) {
          b1.setVisibility(0);
       }
       p1 = p1.b;
       b1 = this.c.c;
       b1.setText(p1);
       b1.setOnClickListener(new uj2(this, true));
       if (!TextUtils.isEmpty(p1)) {
          b1.setVisibility(0);
       }
       return;
    }
    public void kf6(Observable p0,hj4 p1){
       this.a = 8;
       super();
       this.b = p0;
       this.c = p1;
    }
    public void kf6(Object p0,int p1,Object p2){
       this.a = p1;
       this.b = p0;
       this.c = p2;
       super();
    }
    public void kf6(db4 p0){
       this.a = 13;
       this.c = p0;
       super();
       jb7 ojb7 = p0.a.b();
       lb7 v6 = new lb7("confirm_skip_button", null, null, null, null);
       ojb7.i.add(v6);
       ojb7.j = true;
       this.b = ojb7.a();
    }
    public void kf6(eb4 p0){
       this.a = 12;
       this.c = p0;
       super();
       jb7 ojb7 = p0.b.b();
       lb7 v6 = new lb7("action_button", null, null, null, null);
       ojb7.i.add(v6);
       ojb7.j = true;
       this.b = ojb7.a();
    }
    public void kf6(vx5 p0,Constructor p1){
       this.a = 7;
       this.c = p0;
       this.b = p1;
       super();
    }
    public void kf6(xy5 p0,int p1){
       this.a = p1;
       if (p1 != 1) {
          super();
          this.b = p0;
          this.c = new m91(this, p0, 16);
          return;
       }else {
          co5.o(p0, "database");
          super();
          this.b = p0;
          Set set = Collections.newSetFromMap(new IdentityHashMap());
          co5.l(set, "newSetFromMap\(IdentityHashMap\(\)\)");
          this.c = set;
          return;
       }
    }
    public final void a(pk p0){
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
                   this.a(opk);
                   opk = new pk(i1);
                }
             }else if(i2 > 0){
                this.a(opk);
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
    public final Object c(){
       return new pz7(this.b.c(), jy7.a(this.c));
    }
    public final void clear(){
       do {
       } while (this.poll() != null && !this.isEmpty());
       return;
    }
    public final void d(){
       try{
          this.f().createNewFile();
       }catch(java.io.IOException e0){
          Log.e("FirebaseCrashlytics", "Error creating marker: "+this.b, e0);
       }
       return;
    }
    public final jk0 e(String p0,String p1,boolean p2){
       co5.o(p1, "interactionId");
       return this.b.map(new jc6(this, p0, p2, p1)).ignoreElements().m();
    }
    public final File f(){
       return new File(this.c.b(), this.b);
    }
    public final String g(String p0){
       int identifier;
       if (!(identifier = this.b.getIdentifier(p0, "string", this.c))) {
          return null;
       }
       return this.b.getString(identifier);
    }
    public final pb7 h(){
       ob7 oob7;
       HashMap hashMap;
       String str1;
       String str = "";
       switch (this.a){
           case 12:
             oob7 = new ob7();
             oob7.c(this.b);
             oob7.b = this.c.a;
             hashMap = new HashMap();
             if ((str1 = str.toString()) != null) {
                str = str1;
             }
             break;
           default:
             oob7 = new ob7();
             oob7.c(this.b);
             oob7.b = this.c.b.a;
             hashMap = new HashMap();
             if ((str1 = str.toString()) != null) {
                str = str1;
             }
             hashMap.put("destination", str);
             oob7.d = new ib7(1, "ui_navigate", "hit", hashMap);
             return oob7.a();
       }
       hashMap.put("destination", str);
       oob7.d = new ib7(1, "ui_navigate", "hit", hashMap);
       return oob7.a();
    }
    public final nb7 i(){
       mb7 omb7;
       switch (this.a){
           case 12:
           default:
             omb7 = new mb7();
             omb7.c(this.b);
             omb7.b = this.c.b.a;
             return omb7.a();
       }
       omb7 = new mb7();
       omb7.c(this.b);
       omb7.b = this.c.a;
       return omb7.a();
    }
    public final boolean isEmpty(){
       boolean b = (this.c.get() == this.b.get())? true: false;
       return b;
    }
    public final void j(lv p0){
       this.b.b();
       this.b.c();
       this.c.h(p0);
       this.b.r();
       this.b.m();
    }
    public final Object k(){
       String str = "Failed to invoke ";
       try{
          return this.b.newInstance(null);
       }catch(java.lang.InstantiationException e2){
          throw new RuntimeException(str+this.b+v0, e2);
       }catch(java.lang.reflect.InvocationTargetException e2){
          throw new RuntimeException(str+this.b+v0, e2.getTargetException());
       }catch(java.lang.IllegalAccessException e0){
          throw new AssertionError(e0);
       }
    }
    public final void l(){
       this.b.b.show();
    }
    public final boolean offer(Object p0){
       if (p0 == null) {
          throw new NullPointerException("Null is not a valid element");
       }
       vd4 ovd4 = new vd4(p0);
       this.b.getAndSet(ovd4).lazySet(ovd4);
       return true;
    }
    public final Object poll(){
       vd4 ovd4 = this.c.get();
       vd4 ovd41 = ovd4.get();
       Object obj = null;
       if (ovd41 != null) {
          ovd4 = ovd41.a;
          ovd41.a = obj;
          this.c.lazySet(ovd41);
          return ovd4;
       }else if(ovd4 != this.b.get()){
          do {
          } while ((ovd41 = ovd4.get()) == null);
          ovd4 = ovd41.a;
          ovd41.a = obj;
          this.c.lazySet(ovd41);
          return ovd4;
       }else {
          return obj;
       }
    }
}
