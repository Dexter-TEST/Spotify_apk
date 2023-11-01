package p.ej5;
import java.lang.Object;
import p.eu2;
import p.b33;
import p.xj0;
import p.ru2;
import p.qu2;
import p.vv7;
import p.dt2;
import android.content.Context;
import p.k24;
import java.lang.String;
import java.lang.Class;
import p.ox7;
import p.lv1;
import android.content.res.TypedArray;
import p.ob2;
import android.content.res.ColorStateList;
import p.ry7;
import android.graphics.Paint;
import android.view.ViewGroup;
import android.view.View;
import android.widget.TextView;
import p.j;
import java.lang.Boolean;
import p.jz0;
import p.vr;
import java.lang.Integer;
import p.un0;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import p.z00;
import p.r8;
import p.tn0;
import p.kq6;
import p.uu2;
import p.e13;
import p.d13;
import p.h33;
import p.i33;
import p.vs2;
import p.e33;
import p.ys2;
import p.lq5;
import p.bt2;
import android.support.v4.media.MediaDescriptionCompat;
import java.lang.CharSequence;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import p.kg4;
import p.iz0;
import p.sy0;
import java.lang.IllegalStateException;
import p.qu;
import com.google.common.collect.d;
import p.lw;
import p.vt2;
import p.ou2;
import java.util.List;
import java.util.Iterator;
import p.gh4;
import p.yq5;
import p.zq5;
import java.lang.NullPointerException;
import java.lang.IllegalArgumentException;
import p.tp2;
import p.zr5;
import java.lang.StringBuilder;
import p.xt2;
import p.nu2;

public final class ej5	// class@00149c from classes.dex
{
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public void ej5(){
       super();
    }
    public void ej5(int p0){
       if (p0 != 8) {
          super();
          return;
       }else {
          super();
          this.b = eu2.k;
          this.c = b33.l;
          this.d = xj0.C;
          this.e = qu2.dummy();
          this.a = vv7.t;
          this.f = qu2.dummy();
          this.h = dt2.j;
          return;
       }
    }
    public void ej5(Context p0){
       super();
       TypedArray typedArray = p0.obtainStyledAttributes(ox7.G(R.attr.materialCalendarStyle, p0, k24.class.getCanonicalName()), lv1.v);
       this.b = ob2.c(p0, typedArray.getResourceId(3, 0));
       this.g = ob2.c(p0, typedArray.getResourceId(1, 0));
       this.c = ob2.c(p0, typedArray.getResourceId(2, 0));
       this.d = ob2.c(p0, typedArray.getResourceId(4, 0));
       this.e = ob2.c(p0, typedArray.getResourceId(8, 0));
       this.a = ob2.c(p0, typedArray.getResourceId(7, 0));
       this.f = ob2.c(p0, typedArray.getResourceId(9, 0));
       Paint paint = new Paint();
       this.h = paint;
       paint.setColor(ry7.x(p0, typedArray, 6).getDefaultColor());
       typedArray.recycle();
    }
    public void ej5(ViewGroup p0,View p1,TextView p2,View p3,View p4,View p5,View p6,View p7){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.a = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       super();
    }
    public void ej5(String p0){
       this.a = p0;
    }
    public void ej5(j p0){
       super();
       this.b = p0.a;
       this.c = Boolean.valueOf(p0.b);
       this.d = Boolean.valueOf(p0.c);
       this.e = Boolean.valueOf(p0.t);
       this.a = Boolean.valueOf(p0.v);
       this.f = Boolean.valueOf(p0.w);
       this.g = Boolean.valueOf(p0.x);
       this.h = Boolean.valueOf(p0.y);
    }
    public void ej5(jz0 p0){
       super();
       this.a = p0.b;
       this.b = p0.c;
       this.c = Integer.valueOf(p0.d);
       this.d = p0.e;
       this.e = p0.f;
       this.f = p0.g;
       this.g = p0.h;
       this.h = p0.i;
    }
    public void ej5(un0 p0){
       super();
       this.d = new ArrayList();
       this.e = new IdentityHashMap();
       this.a = new ArrayList();
       this.f = new z00(null);
       this.b = p0;
       this.c = new r8(3);
       this.g = tn0.a;
       this.h = new kq6();
    }
    public void ej5(uu2 p0){
       super();
       this.e = new e13();
       d13 uod13 = new d13(this);
       xy c = xj0.C;
       if (uod13 == c) {
       }else if(uod13 instanceof h33){
          uod13 = new h33(uod13);
       }
       c = uod13;
       this.a = c;
       this.h = new vs2(this);
       p0.getClass();
       e33 uod131 = new e33(p0);
       this.d = uod131;
       ys2 oys2 = new ys2(this, uod131);
       this.c = oys2;
       this.b = new lq5(p0, this.d, oys2);
       return;
    }
    public final MediaDescriptionCompat a(){
       MediaDescriptionCompat v9 = new MediaDescriptionCompat(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
       return v9;
    }
    public final vr b(){
       String str = (this.a == null)? " sdkVersion": "";
       if (this.b == null) {
          str = str.concat(" gmpAppId");
       }
       if (this.c == null) {
          str = kg4.l(str, " platform");
       }
       if (this.d == null) {
          str = kg4.l(str, " installationUuid");
       }
       if (this.e == null) {
          str = kg4.l(str, " buildVersion");
       }
       if (this.f == null) {
          str = kg4.l(str, " displayVersion");
       }
       if (str.isEmpty()) {
          vr str1 = new vr(this.a, this.b, this.c.intValue(), this.d, this.e, this.f, this.g, this.h);
          return str;
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final qu c(){
       String str = (this.a == null)? " featureIdentifier": "";
       if (this.b == null) {
          str = str.concat(" featureVersion");
       }
       if (this.c == null) {
          str = kg4.l(str, " viewUri");
       }
       if (this.d == null) {
          str = kg4.l(str, " externalReferrer");
       }
       if (this.e == null) {
          str = kg4.l(str, " referrerIdentifier");
       }
       if (this.f == null) {
          str = kg4.l(str, " deviceIdentifier");
       }
       if (this.g == null) {
          str = kg4.l(str, " featureClasses");
       }
       if (this.h == null) {
          str = kg4.l(str, " restrictionIdentifier");
       }
       if (str.isEmpty()) {
          qu str1 = new qu(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
          return str;
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final lw d(){
       String str = (this.b == null)? " state": "";
       if (this.c == null) {
          str = str.concat(" canContinueWithPhoneNumber");
       }
       if (this.d == null) {
          str = kg4.l(str, " canUseLanguageOnboarding");
       }
       if (this.e == null) {
          str = kg4.l(str, " needSignupConfiguration");
       }
       if (this.a == null) {
          str = kg4.l(str, " sendWelcomeScreenShown");
       }
       if (this.f == null) {
          str = kg4.l(str, " sendInstallReferrer");
       }
       if (this.g == null) {
          str = kg4.l(str, " requestAutoLogin");
       }
       if (this.h == null) {
          str = kg4.l(str, " hasStartedAllboarding");
       }
       if (str.isEmpty()) {
          lw str1 = new lw(this.b, this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.a.booleanValue(), this.f.booleanValue(), this.g.booleanValue(), this.h.booleanValue());
          return str;
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final uu2 e(){
       ej5 uoej5;
       if ((uoej5 = this.g) == null) {
          throw new IllegalStateException("No fallback binder set!");
       }
       uu2 v0 = new uu2(this.b, this.c, this.a, this.e, this.f, this.d, uoej5, this.h);
       return v0;
    }
    public final void f(){
       int i;
       Iterator iterator = this.a.iterator();
       while (true) {
          if (iterator.hasNext()) {
             gh4 ogh4 = iterator.next();
             yq5 c = ogh4.c.c;
             i = 3;
             if (c != i && (c != 2 || ogh4.e != null)) {
                continue ;
             }
          }else {
             i = 1;
          }
          ej5 tb = this.b;
          if (i != tb.c) {
             tb.c = i;
             tb.a.g();
             break ;
          }
          break ;
       }
       return;
    }
    public final void g(boolean p0){
       this.c = Boolean.valueOf(p0);
    }
    public final void h(boolean p0){
       this.d = Boolean.valueOf(p0);
    }
    public final int i(gh4 p0){
       gh4 ogh4;
       Iterator iterator = this.a.iterator();
       int i = 0;
       while (iterator.hasNext() && (ogh4 = iterator.next()) != p0) {
          i = i + ogh4.e;
       }
       return i;
    }
    public final void j(String p0){
       if (p0 == null) {
          throw new NullPointerException("Null featureVersion");
       }
       this.b = p0;
       return;
    }
    public final z00 k(int p0){
       gh4 e;
       ej5 tf = this.f;
       tf = (tf.b != null)? new z00(null): true;
       Iterator iterator = this.a.iterator();
       int i = p0;
       while (iterator.hasNext()) {
          gh4 ogh4 = iterator.next();
          if ((e = ogh4.e) > i) {
             tf.c = ogh4;
             tf.a = i;
             break ;
          }
          i = i - e;
       }
       if (tf.c != null) {
          return tf;
       }else {
          throw new IllegalArgumentException(tp2.k("Cannot find wrapper for ", p0));
       }
    }
    public final gh4 l(zr5 p0){
       gh4 ogh4;
       if ((ogh4 = this.e.get(p0)) != null) {
          return ogh4;
       }
       throw new IllegalStateException("Cannot find wrapper for "+p0+", seems like it is not bound by this adapter: "+this);
    }
    public final void m(boolean p0){
       this.h = Boolean.valueOf(p0);
    }
    public final void n(boolean p0){
       this.e = Boolean.valueOf(p0);
    }
    public final void o(boolean p0){
       this.g = Boolean.valueOf(p0);
    }
    public final void p(boolean p0){
       this.f = Boolean.valueOf(p0);
    }
    public final void q(boolean p0){
       this.a = Boolean.valueOf(p0);
    }
    public final void r(ry7 p0){
       this.b = p0;
    }
    public final void s(int p0,String p1,xt2 p2){
       ou2[] oou2Array = new ou2[]{new nu2(p0, p2)};
       this.t(oou2Array);
       this.u(qu2.single(p1, p0));
    }
    public final void t(ou2[] p0){
       ou2[] oou2Array = new ou2[]{this.a,vv7.B(p0)};
       this.a = vv7.B(oou2Array);
    }
    public final void u(ru2 p0){
       p0.getClass();
       p0 = qu2.withFallback(p0, this.e);
       p0.getClass();
       this.e = p0;
    }
}
