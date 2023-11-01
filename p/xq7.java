package p.xq7;
import p.ly7;
import p.pv6;
import p.d01;
import p.k30;
import java.lang.Object;
import androidx.cardview.widget.CardView;
import p.p25;
import p.es;
import p.si4;
import p.kb7;
import p.jb7;
import p.lb7;
import java.lang.String;
import java.lang.Integer;
import java.util.ArrayList;
import p.xy5;
import p.m91;
import p.zk;
import p.j80;
import p.e70;
import p.kg3;
import p.t45;
import p.ir2;
import java.lang.AssertionError;
import p.g54;
import p.n91;
import java.lang.Class;
import android.content.Context;
import android.content.ContentResolver;
import android.provider.Settings$Global;
import p.hs3;
import java.lang.Throwable;
import p.t63;
import p.ru5;
import p.en6;
import p.x61;
import p.b28;
import p.dx7;
import p.mz7;
import p.vx5;
import android.content.SharedPreferences;
import p.el2;
import p.dt3;
import android.os.Looper;
import android.graphics.Rect;
import p.j07;
import java.lang.Void;
import java.util.concurrent.atomic.AtomicReference;
import p.m07;
import java.lang.StringBuilder;
import p.e67;
import java.util.List;
import java.util.Arrays;

public final class xq7 implements ly7, pv6, d01, k30	// class@002ccd from classes.dex
{
    public final int a;
    public Object b;
    public Object c;

    public void xq7(){
       this.a = 3;
       super();
    }
    public void xq7(int p0){
       this.a = p0;
       super();
    }
    public void xq7(CardView p0){
       this.a = 1;
       this.c = p0;
       super();
    }
    public void xq7(Object p0,int p1,Object p2){
       this.a = p1;
       this.b = p0;
       this.c = p2;
       super();
    }
    public void xq7(p25 p0,es p1){
       this.a = 6;
       this.c = p0;
       this.b = p1;
       super();
    }
    public void xq7(si4 p0){
       this.a = 14;
       this.c = p0;
       super();
       jb7 ojb7 = p0.a.b();
       lb7 v6 = new lb7("cancel_button", null, null, null, null);
       ojb7.i.add(v6);
       ojb7.j = false;
       this.b = ojb7.a();
    }
    public void xq7(xy5 p0){
       this.a = 0;
       super();
       this.b = p0;
       this.c = new m91(this, p0, 3);
    }
    public void xq7(zk p0){
       this.a = 13;
       this.c = p0;
       super();
       jb7 ojb7 = p0.a.b();
       lb7 v6 = new lb7("input_field", null, null, null, null);
       ojb7.i.add(v6);
       ojb7.j = true;
       this.b = ojb7.a();
    }
    public static xq7 f(String[] p0){
       char c;
       object oobject1;
       try{
          j80[] oj80Array = new j80[p0.length];
          e70 uoe70 = new e70();
          for (int i = 0; i < p0.length; i = i + 1) {
             object oobject = p0[i];
             String[] v = kg3.v;
             uoe70.v0(34);
             int i1 = oobject.length();
             int i2 = 0;
             int i3 = 0;
             while (i2 < i1) {
                if ((c = oobject.charAt(i2)) < 128) {
                   if ((oobject1 = v[c]) == null) {
                   label_0042 :
                      i2 = i2 + 1;
                   }
                }else if(c == 8232){
                   oobject1 = "\\u2028";
                }else if(c == 8233){
                   oobject1 = "\\u2029";
                }
                if (i3 < i2) {
                   uoe70.C0(oobject, i3, i2);
                }
                uoe70.B0(oobject1);
                i3 = i2 + 1;
                goto label_0042 ;
             }
             if (i3 < i1) {
                uoe70.C0(oobject, i3, i1);
             }
             uoe70.v0(34);
             uoe70.readByte();
             oj80Array[i] = uoe70.m0();
          }
          return new xq7(p0.clone(), 2, ir2.E(oj80Array));
       }catch(java.io.IOException e12){
          throw new AssertionError(e12);
       }
    }
    public final void a(){
       int intx;
       xq7 tb = this.b;
       xq7 tc = this.c;
       try{
          tc.getClass();
          intx = Settings$Global.getInt(tc.b.getContentResolver(), "boot_count");
       }catch(java.lang.Exception e3){
          intx.c.c("Error in getting boot count.", e3);
          intx = 0;
       }
       tb.t(intx, "boot_count");
       return;
    }
    public final boolean b(t63 p0,boolean p1){
       int i;
       if (i = en6.A(p0.t.b())) {
          if (i != 1) {
             return false;
          }
          this.c.b(p0, p1);
          return true;
       }else {
          this.b.b(p0, p1);
          return true;
       }
    }
    public final Object c(){
       return new dx7(this.b.a(), this.c.c());
    }
    public final boolean d(){
       int i;
       int intx1;
       int intx = this.b.a.c().getInt("boot_count", -1);
       xq7 tc = this.c;
       tc.getClass();
       try{
          i = 0;
          intx1 = Settings$Global.getInt(tc.b.getContentResolver(), "boot_count");
       }catch(java.lang.Exception e5){
          intx1.c.c("Error in getting boot count.", e5);
          intx1 = 0;
       }
       if (intx != -1 && intx >= intx1) {
          return i;
       }
       this.b.t(intx1, "boot_count");
       return true;
    }
    public final el2 e(){
       if (this.b == null) {
          this.b = new dt3(16);
       }
       if (this.c == null) {
          this.c = Looper.getMainLooper();
       }
       return new el2(this.b, this.c);
    }
    public final void g(int p0,int p1,int p2,int p3){
       this.c.t.set(p0, p1, p2, p3);
       xq7 tc = this.c;
       xq7 oxq7 = tc;
       CardView.a(oxq7, (p0 + tc.c.left), (p1 + tc.c.top), (p2 + tc.c.right), (p3 + tc.c.bottom));
    }
    public final j07 i(Object p0){
       return this.b.i.get().a;
    }
    public final String toString(){
       StringBuilder str;
       List list;
       switch (this.a){
           case 8:
             str = "ScalingMatrix{ScalingList4x4=";
             xq7 tb = this.b;
             list = null;
             List list1 = (tb == null)? list: Arrays.asList(tb);
             str = str+list1+"\n, ScalingList8x8=";
             if ((tb = this.c) != null) {
                list = Arrays.asList(tb);
             }
             break;
           default:
             return super.toString();
       }
       return str+list+"\n}";
    }
}
