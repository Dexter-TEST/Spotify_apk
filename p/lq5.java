package p.lq5;
import p.rk7;
import p.ly7;
import java.lang.Object;
import p.c0;
import com.spotify.lite.database.room.RecentPlayRoomDatabase;
import p.m91;
import p.xy5;
import p.kq5;
import p.hu;
import java.lang.Boolean;
import p.li5;
import java.lang.Integer;
import java.lang.String;
import p.kb7;
import p.jb7;
import p.lb7;
import java.util.ArrayList;
import p.n11;
import p.q43;
import android.content.ComponentName;
import android.content.Context;
import p.n91;
import p.r8;
import p.gh4;
import android.util.SparseIntArray;
import p.ur;
import p.uu2;
import p.e33;
import p.bt2;
import android.util.SparseArray;
import java.lang.Class;
import android.content.Intent;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.ServiceConnection;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import p.kg4;
import p.xv7;
import p.zy7;
import p.xy7;
import p.dx7;
import p.jx7;
import p.m73;
import p.js;
import java.lang.Long;
import p.k85;
import java.util.Map;
import p.y33;
import p.ju2;
import android.view.ViewGroup;
import p.m33;
import p.f33;
import android.view.View;
import p.vt2;
import p.nb7;
import p.mb7;
import p.fb7;
import p.eb4;
import p.gb7;
import p.fb4;
import java.lang.NullPointerException;

public final class lq5 implements rk7, ly7	// class@001da4 from classes.dex
{
    public final int a;
    public Object b;
    public Object c;
    public Object t;
    public Object v;

    public void lq5(int p0){
       this.a = p0;
       if (p0 != 12) {
          super();
          return;
       }else {
          super();
          c0 a = c0.a;
          this.c = a;
          this.t = a;
          this.v = a;
          return;
       }
    }
    public void lq5(RecentPlayRoomDatabase p0){
       this.a = 0;
       super();
       this.b = p0;
       this.c = new m91(this, p0, 14);
       this.t = new kq5(p0, 0);
       this.v = new kq5(p0, 1);
    }
    public void lq5(Object p0,Object p1,Object p2,Object p3,int p4){
       this.a = p4;
       this.b = p0;
       this.c = p1;
       this.t = p2;
       this.v = p3;
       super();
    }
    public void lq5(hu p0){
       this.a = 13;
       super();
       this.b = p0.a;
       this.c = p0.b;
       this.t = Boolean.valueOf(p0.c);
       this.v = p0.t;
    }
    public void lq5(hu p0,int p1){
       this.a = 13;
       super(p0);
    }
    public void lq5(li5 p0,Integer p1,String p2){
       this.a = 14;
       this.v = p0;
       super();
       this.b = p1;
       lb7 this.c = p2;
       jb7 ojb7 = p0.b.b();
       this.c = new lb7("filter_chip", null, this.c, this.b, null);
       ojb7.i.add(this.c);
       ojb7.j = true;
       this.t = ojb7.a();
    }
    public void lq5(n11 p0,q43 p1,ComponentName p2,Context p3){
       this.a = 1;
       this.v = p0;
       super();
       this.b = p1;
       this.c = p2;
       this.t = p3;
    }
    public void lq5(n91 p0,Integer p1,String p2){
       this.a = 15;
       this.v = p0;
       super();
       this.b = p1;
       lb7 this.c = p2;
       jb7 ojb7 = p0.b.b();
       this.c = new lb7("show_item", null, this.c, this.b, null);
       ojb7.i.add(this.c);
       ojb7.j = true;
       this.t = ojb7.a();
    }
    public void lq5(r8 p0,gh4 p1){
       this.a = 2;
       this.v = p0;
       super();
       this.b = new SparseIntArray(1);
       this.c = new SparseIntArray(1);
       this.t = p1;
    }
    public void lq5(ur p0){
       this.a = 11;
       super(p0, 0);
    }
    public void lq5(ur p0,int p1){
       this.a = 11;
       super();
       this.b = p0.a;
       this.c = p0.b;
       this.t = p0.c;
       this.v = p0.d;
    }
    public void lq5(uu2 p0){
       this.a = 8;
       super(p0, new e33(p0));
    }
    public void lq5(uu2 p0,e33 p1){
       this.a = 8;
       super(p0, p1, new bt2(p1));
    }
    public void lq5(uu2 p0,e33 p1,bt2 p2){
       this.a = 8;
       super();
       this.b = new SparseArray();
       p0.getClass();
       this.c = p0;
       p1.getClass();
       this.t = p1;
       this.v = p2;
    }
    public static boolean a(Context p0,String p1,n11 p2){
       p2.a = p0.getApplicationContext();
       Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
       if (!TextUtils.isEmpty(p1)) {
          intent.setPackage(p1);
       }
       return p0.bindService(intent, p2, 33);
    }
    public final int b(int p0){
       int i;
       if ((i = this.c.indexOfKey(p0)) >= 0) {
          return this.c.valueAt(i);
       }
       throw new IllegalStateException(kg4.r("requested global type ", p0, " does not belong to the adapter:")+this.t.c);
    }
    public final Object c(){
       return new zy7(this.b.c(), this.c.c(), this.t.c(), this.v.c());
    }
    public final int d(int p0){
       int i;
       if ((i = this.b.indexOfKey(p0)) > -1) {
          return this.b.valueAt(i);
       }
       lq5 tv = this.v;
       r8 b = tv.b;
       tv.b = b + 1;
       tv.c.put(b, this.t);
       this.b.put(p0, b);
       this.c.put(b, p0);
       return b;
    }
    public final ur e(){
       String str = (this.b == null)? " uri": "";
       if (this.c == null) {
          str = str.concat(" uid");
       }
       if (this.t == null) {
          str = kg4.l(str, " metadata");
       }
       if (this.v == null) {
          str = kg4.l(str, " provider");
       }
       if (str.isEmpty()) {
          return new ur(this.b, this.c, this.t, this.v);
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final js f(){
       String str = (this.b == null)? " baseAddress": "";
       if (this.c == null) {
          str = str.concat(" size");
       }
       if (this.t == null) {
          str = kg4.l(str, " name");
       }
       if (str.isEmpty()) {
          js str1 = new js(this.b.longValue(), this.c.longValue(), this.t, this.v);
          return str;
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final hu g(){
       String str = (this.b == null)? " password": "";
       if (this.c == null) {
          str = str.concat(" passwordState");
       }
       if (this.t == null) {
          str = kg4.l(str, " passwordHasFocus");
       }
       if (this.v == null) {
          str = kg4.l(str, " validatedPasswordStates");
       }
       if (str.isEmpty()) {
          return new hu(this.b, this.c, this.t.booleanValue(), this.v);
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final y33 h(y33 p0,ju2 p1,ViewGroup p2,int p3){
       m33 b;
       f33 uof33;
       int i = 0;
       if (p0 != null) {
          if (this.t.a(p1).b == p0.a) {
          label_0016 :
             if (p0 == null) {
                b = this.t.a(p1).b;
                if ((uof33 = this.b.get(b)) == null) {
                   uof33 = new f33();
                   this.b.put(b, uof33);
                }
                uof33 = uof33.a;
                if (!uof33.isEmpty()) {
                   i = uof33.remove((uof33.size() - 1));
                }
                if (i != null) {
                   b = i;
                }else {
                   b = y33.a(b, p2, this.c);
                }
             }
             m33 a = this.t.a(p1).a;
             b.e = new r8(a, p3, 0);
             y33 d = b.d;
             d.j.getClass();
             b.c.b(b.b, a, d, this.v);
             d.j.getClass();
             return b;
          }else {
             this.k(p0);
          }
       }
       p0 = i;
       goto label_0016 ;
    }
    public final nb7 i(){
       mb7 omb7;
       switch (this.a){
           case 14:
           default:
             omb7 = new mb7();
             omb7.c(this.t);
             omb7.b = this.v.c.c.a;
             return omb7.a();
       }
       omb7 = new mb7();
       omb7.c(this.t);
       omb7.b = this.v.c.a;
       return omb7.a();
    }
    public final void j(k85 p0){
       if (p0 == null) {
          throw new NullPointerException("Null passwordState");
       }
       this.c = p0;
       return;
    }
    public final void k(y33 p0){
       f33 uof33 = this.b.get(p0.a);
       uof33.getClass();
       f33 a = uof33.a;
       if (a.size() < uof33.b) {
          a.add(p0);
       }
       return;
    }
    public final void l(String p0){
       if (p0 == null) {
          throw new NullPointerException("Null uid");
       }
       this.c = p0;
       return;
    }
}
