package p.oy6;
import p.a6;
import p.pv6;
import p.id4;
import java.lang.Object;
import p.th5;
import p.fn6;
import p.c0;
import p.tk0;
import p.pk;
import android.util.SparseArray;
import p.qv3;
import android.content.Context;
import android.view.ActionMode$Callback;
import java.util.ArrayList;
import p.wh6;
import android.view.ViewGroup;
import android.view.View;
import p.or7;
import java.lang.Integer;
import java.lang.String;
import p.kb7;
import p.jb7;
import p.lb7;
import p.uv1;
import p.xy5;
import p.m91;
import p.ny6;
import com.spotify.legacyglue.contextmenu.glue.StretchingGradientDrawable;
import p.rk2;
import p.fe;
import android.graphics.Paint;
import p.od3;
import p.xw;
import p.x3;
import java.lang.Float;
import android.view.animation.PathInterpolator;
import p.ww;
import p.yw;
import p.b6;
import p.gw6;
import android.view.ActionMode;
import p.e64;
import android.view.Menu;
import android.view.MenuItem;
import p.r64;
import p.mw6;
import p.pr;
import p.r45;
import p.j07;
import p.vj;
import p.p25;
import p.es;
import java.util.concurrent.Executor;
import java.lang.Throwable;
import android.util.Log;
import p.qs;
import p.kg4;
import java.lang.Boolean;
import java.lang.IllegalStateException;
import p.mt;
import p.g74;
import p.iw6;
import p.qq7;
import p.my6;
import p.co5;
import p.zy5;
import android.database.Cursor;
import p.vv7;
import p.ej4;
import p.nb7;
import p.mb7;
import p.fb7;
import p.eb4;
import p.gb7;
import p.rn1;
import p.we3;
import p.dm5;

public final class oy6 implements a6, pv6, id4	// class@0021b7 from classes.dex
{
    public final int a;
    public Object b;
    public Object c;
    public Object t;
    public Object v;

    public void oy6(int p0){
       this.a = p0;
       if (p0 != 3) {
          if (p0 != 6) {
             if (p0 != 8) {
                if (p0 != 10) {
                   switch (p0){
                       case 12:
                         super();
                         return;
                       case 13:
                         super();
                         c0 a = c0.a;
                         this.b = a;
                         this.c = a;
                         this.t = a;
                         this.v = a;
                         return;
                       case 14:
                         super();
                         return;
                       default:
                         super();
                         this.b = new th5(256, 0);
                         this.c = new th5(256, 0);
                         this.t = new th5(256, 0);
                         fn6[] uofn6Array = new fn6[32];
                         this.v = uofn6Array;
                         return;
                   }
                }else {
                   super();
                   return;
                }
             }else {
                super();
                this.v = tk0.a;
                return;
             }
          }else {
             super();
             return;
          }
       }else {
          super();
          this.b = new pk();
          this.c = new SparseArray();
          this.t = new qv3();
          this.v = new pk();
          return;
       }
    }
    public void oy6(Context p0,ActionMode$Callback p1){
       this.a = 1;
       super();
       this.c = p0;
       this.b = p1;
       this.t = new ArrayList();
       this.v = new wh6();
    }
    public void oy6(ViewGroup p0,View p1,Object p2,View p3,int p4){
       this.a = p4;
       this.b = p0;
       this.c = p1;
       this.t = p2;
       this.v = p3;
       super();
    }
    public void oy6(Object p0,Object p1,Object p2,Object p3,int p4){
       this.a = p4;
       this.v = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       super();
    }
    public void oy6(or7 p0,Integer p1,String p2){
       this.a = 15;
       this.v = p0;
       super();
       this.b = p1;
       lb7 this.c = p2;
       jb7 ojb7 = p0.b.b();
       this.c = new lb7("squircle_button", null, this.c, this.b, null);
       ojb7.i.add(this.c);
       ojb7.j = true;
       this.t = ojb7.a();
    }
    public void oy6(uv1 p0){
       this.a = 9;
       super();
       this.v = p0;
    }
    public void oy6(xy5 p0){
       this.a = 0;
       super();
       this.b = p0;
       this.c = new m91(this, p0, 2);
       this.t = new ny6(p0, 0);
       this.v = new ny6(p0, 1);
    }
    public final void a(float p0){
       StretchingGradientDrawable stretchingGr = this.v.h();
       stretchingGr.g = this.b.a(p0);
       stretchingGr.d.setAlpha((int)(this.c.a(p0) * 0x437f0000));
       this.v.b.u.setAlpha(this.t.a(p0));
       this.v.o();
    }
    public final void b(){
       oy6 ooy6 = this;
       int i = ooy6.v.b.m.d();
       float f = (float)this.d();
       StretchingGradientDrawable stretchingGr = ooy6.v.h();
       oy6 v = ooy6.v;
       fe v12 = new fe(((float)xw.a.a.intValue() / f), ((float)(xw.b.a.intValue() + i) / f), stretchingGr.g, (xw.c.a.floatValue() * v.n()), xw.d);
       ooy6.b = v12;
       fe v1 = new fe(((float)ww.a.a.intValue() / f), ((float)(ww.b.a.intValue() + i) / f), ((float)stretchingGr.d.getAlpha() / 0x437f0000), ww.c.a.floatValue(), ww.d);
       ooy6.c = v;
       v12 = new fe(((float)yw.a.a.intValue() / f), ((float)(yw.b.a.intValue() + i) / f), v.b.u.getAlpha(), yw.c.a.floatValue(), yw.d);
       ooy6.t = stretchingGr;
    }
    public final void c(b6 p0){
       this.b.onDestroyActionMode(this.l(p0));
    }
    public final int d(){
       return (xw.b.a.intValue() + this.v.b.m.d());
    }
    public final boolean e(b6 p0,e64 p1){
       return this.b.onCreateActionMode(this.l(p0), this.m(p1));
    }
    public final boolean f(b6 p0,MenuItem p1){
       return this.b.onActionItemClicked(this.l(p0), new r64(this.c, p1));
    }
    public final boolean g(b6 p0,e64 p1){
       return this.b.onPrepareActionMode(this.l(p0), this.m(p1));
    }
    public final pr h(){
       return new pr(this.b, this.c, this.t, this.v);
    }
    public final j07 i(Object p0){
       try{
          p25.a(this.v, p0, this.b, this.c, this.t);
          return null;
       }catch(java.lang.Exception e5){
          Log.e("FirebaseCrashlytics", "Error performing auto configuration.", e5);
          throw e5;
       }
    }
    public final qs j(){
       String str = (this.b == null)? " platform": "";
       if (this.c == null) {
          str = str.concat(" version");
       }
       if (this.t == null) {
          str = kg4.l(str, " buildVersion");
       }
       if (this.v == null) {
          str = kg4.l(str, " jailbroken");
       }
       if (str.isEmpty()) {
          return new qs(this.b.intValue(), this.c, this.t, this.v.booleanValue());
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final mt k(){
       String str = (this.b == null)? " parentUri": "";
       if (this.c == null) {
          str = str.concat(" url");
       }
       if (str.isEmpty()) {
          return new mt(this.b, this.c, this.t, this.v);
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final gw6 l(b6 p0){
       gw6 ogw6;
       int i = this.t.size();
       int i1 = 0;
       while (true) {
          if (i1 < i) {
             if ((ogw6 = this.t.get(i1)) != null && ogw6.b == p0) {
                break ;
             }else {
                i1 = i1 + 1;
             }
          }else {
             gw6 ogw61 = new gw6(this.c, p0);
             this.t.add(ogw61);
             return ogw61;
          }
       }
       return ogw6;
    }
    public final Menu m(e64 p0){
       Menu orDefault;
       if ((orDefault = this.v.getOrDefault(p0, null)) == null) {
          orDefault = new g74(this.c, p0);
          this.v.put(p0, orDefault);
       }
       return orDefault;
    }
    public final my6 n(qq7 p0){
       co5.o(p0, "id");
       int i = 2;
       zy5 ozy5 = zy5.x(i, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
       qq7 a = p0.a;
       int i1 = 1;
       if (a == null) {
          ozy5.z(i1);
       }else {
          ozy5.s(i1, a);
       }
       ozy5.P(i, (long)p0.b);
       this.b.b();
       Cursor uCursor = vv7.J(this.b, ozy5, false);
       i = ej4.z(uCursor, "work_spec_id");
       int i2 = ej4.z(uCursor, "generation");
       i1 = ej4.z(uCursor, "system_id");
       String str = null;
       if (uCursor.moveToFirst()) {
          if (!uCursor.isNull(i)) {
             str = uCursor.getString(i);
          }
          str = new my6(str, uCursor.getInt(i2), uCursor.getInt(i1));
       }
       uCursor.close();
       ozy5.y();
       return str;
    }
    public final nb7 o(){
       mb7 omb7 = new mb7();
       omb7.c(this.t);
       omb7.b = this.v.c.a;
       return omb7.a();
    }
    public final void p(my6 p0){
       this.b.b();
       this.b.c();
       this.c.h(p0);
       this.b.r();
       this.b.m();
    }
    public final String toString(){
       switch (this.a){
           case 16:
           default:
             return super.toString();
       }
       return this.v.toString();
    }
}
