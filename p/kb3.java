package p.kb3;
import java.lang.Object;
import p.fp2;
import android.content.Context;
import android.content.res.XmlResourceParser;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import android.util.AttributeSet;
import android.util.Xml;
import p.oi;
import android.content.res.TypedArray;
import android.content.res.Resources;
import java.lang.String;
import p.sq0;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.IntentSender;
import p.co5;
import android.text.TextPaint;
import android.os.Build$VERSION;
import android.text.TextDirectionHeuristics;
import java.util.Arrays;
import p.jd2;
import p.ae2;
import p.iv6;
import p.ak4;
import p.yj4;
import java.lang.Throwable;
import p.zj4;
import p.kv6;
import p.gk2;
import p.bk2;
import p.lb3;
import android.content.Intent;
import p.xj;
import androidx.fragment.app.o;
import androidx.fragment.app.Fragment;
import com.spotify.lite.appmain.MainActivity;
import p.k15;
import java.lang.CharSequence;
import java.lang.Class;
import p.io2;
import android.os.Bundle;
import p.ry7;
import androidx.fragment.app.a;
import java.lang.IllegalArgumentException;
import p.tp2;
import p.kd2;
import java.lang.StringBuilder;

public final class kb3	// class@001bdf from classes.dex
{
    public int a;
    public int b;
    public Object c;
    public Object d;

    public void kb3(){
       super();
       this.a = 0x7f0302a8;
       this.c = fp2.v;
    }
    public void kb3(int p0){
       super();
       this.a = 4;
       Object[] objArray = new Object[5];
       this.c = objArray;
       this.d = objArray;
    }
    public void kb3(Context p0,XmlResourceParser p1){
       int index;
       super();
       this.c = new ArrayList();
       this.b = -1;
       TypedArray typedArray = p0.obtainStyledAttributes(Xml.asAttributeSet(p1), oi.C);
       int indexCount = typedArray.getIndexCount();
       int i = 0;
       while (i < indexCount) {
          if (!(index = typedArray.getIndex(i))) {
             this.a = typedArray.getResourceId(index, this.a);
          }else if(index == 1){
             this.b = typedArray.getResourceId(index, this.b);
             p0.getResources().getResourceName(this.b);
             if ("layout".equals(p0.getResources().getResourceTypeName(this.b))) {
                sq0 osq0 = new sq0();
                this.d = osq0;
                osq0.b(LayoutInflater.from(p0).inflate(this.b, null));
             }
          }
          i = i + 1;
       }
       typedArray.recycle();
       return;
    }
    public void kb3(IntentSender p0){
       co5.o(p0, "intentSender");
       super();
       this.c = p0;
    }
    public void kb3(TextPaint p0){
       int i;
       super();
       this.c = p0;
       if (Build$VERSION.SDK_INT >= 23) {
          i = 1;
          this.a = i;
          this.b = i;
       }else {
          i = 0;
          this.b = i;
          this.a = i;
       }
       this.d = TextDirectionHeuristics.FIRSTSTRONG_LTR;
       return;
    }
    public void kb3(String p0,int p1,int p2){
       super();
       this.c = p0;
       this.b = p1;
       this.a = p2;
       byte[] uobyteArray = new byte[(p1 * p2)];
       this.d = uobyteArray;
       Arrays.fill(uobyteArray, -1);
    }
    public void kb3(jd2 p0,ae2 p1){
       super();
       this.b = -1;
       this.c = p0;
       this.d = p1;
       this.a = 0x7f0a0133;
    }
    public final boolean a(iv6 p0){
       object oobject;
       kb3 tc = this.c;
       kb3 ta = this.a;
       while (true) {
          if (tc != null) {
             int i = 0;
             while (true) {
                if (i < ta && (oobject = tc[i]) != null) {
                   if (oobject == ak4.a) {
                      p0.onComplete();
                   }else if(oobject instanceof yj4){
                      p0.onError(oobject.a);
                   }else if(oobject instanceof zj4){
                      p0.onSubscribe(oobject.a);
                   }else {
                      p0.onNext(oobject);
                   }
                   oobject = 0;
                label_0037 :
                   if (oobject) {
                   }else {
                      i = i + 1;
                   }
                   oobject = 1;
                   goto label_0037 ;
                }else {
                   tc = tc[ta];
                }
             }
             return false;
          }else {
          }
       }
       return true;
    }
    public final void b(Object p0){
       kb3 tb;
       kb3 ta = this.a;
       if ((tb = this.b) == ta) {
          Object[] objArray = new Object[(ta + 1)];
          this.d[ta] = objArray;
          this.d = objArray;
          tb = 0;
       }
       this.d[tb] = p0;
       this.b = tb + 1;
       return;
    }
    public final gk2 c(Context p0){
       gk2 v6 = new gk2(p0, this.a, this.b, this.c, this.d);
       return v6;
    }
    public final lb3 d(){
       return new lb3(this.c, this.d, this.a, this.b);
    }
    public final void e(xj p0){
       object oobject;
       kb3 tc = this.c;
       kb3 ta = this.a;
       while (true) {
          if (tc != null) {
             int i = 0;
             while (true) {
                if (i < ta && (oobject = tc[i]) != null) {
                   if (p0.test(oobject)) {
                      return;
                   }
                   i = i + 1;
                }else {
                   tc = tc[ta];
                }
             }
             return;
          }else {
          }
       }
    }
    public final boolean f(){
       kb3 tb;
       if ((tb = this.b) == -1) {
          return false;
       }
       o oo = this.l(tb);
       boolean b = oo.O();
       Fragment uFragment = oo.C(R.id.tab_fragment_container);
       if (b && uFragment != null) {
          kb3 tc = this.c;
          tc.i0.b((tc.F(uFragment) ^ 0x01));
       }
       return b;
    }
    public final boolean g(int p0,int p1){
       if (this.d[((p1 * this.b) + p0)] >= 0) {
          return true;
       }
       return false;
    }
    public final void h(int p0,int p1,int p2,int p3){
       kb3 ta;
       if (p0 < 0) {
          ta = this.a;
          p0 = p0 + ta;
          p1 = p1 + (((ta + 4) % 8) - 4);
       }
       if (p1 < 0) {
          ta = this.b;
          p1 = p1 + ta;
          p0 = p0 + (((ta + 4) % 8) - 4);
       }
       int i = 1;
       if (!((this.c.charAt(p2) & (i << (p3 - 8))))) {
          i = false;
       }
       this.i(p1, i, p0);
       return;
    }
    public final void i(int p0,boolean p1,int p2){
       kb3 td = this.d;
       p2 = (p2 * this.b) + p0;
       p0 = (p1)? 1: 0;
       td[p2] = (byte)p0;
       return;
    }
    public final void j(Fragment p0,int p1){
       boolean b1;
       int i1;
       o d;
       a s;
       kb3 tb = this.b;
       o oo = this.l(p1);
       boolean b = true;
       oo.x(b);
       oo.E();
       Fragment uFragment = oo.C(R.id.tab_fragment_container);
       if ((b1 = this.c.F(p0)) && (p1 == tb && uFragment != null)) {
          return;
       }
       int i = 0;
       if (uFragment != null) {
          if (uFragment == p0) {
             i1 = 1;
          }else if(io2.j(uFragment.getClass(), p0.getClass())){
             i1 = ry7.p(uFragment.getArguments(), p0.getArguments());
          }else {
          label_0047 :
             i1 = false;
          }
       }else {
          goto label_0047 ;
       }
       if (i1) {
          return;
       }else if(b1 && uFragment != null){
          int i2 = ((d = oo.d) != null)? d.size(): 0;
          if (i2 > 0) {
             if ((s = oo.d.get(i).s) >= null) {
                oo.P(null, s, b);
             }else {
                throw new IllegalArgumentException(tp2.k("Bad id: ", s));
             }
          }
          return;
       }else {
          a uoa = new a(oo);
          if (uFragment == null) {
             uoa.g(R.id.tab_fragment_container, p0, null, b);
          }else {
             uoa.k(R.id.tab_fragment_container, p0, null);
             uoa.c("stack:".concat(p0.getClass().getName()));
          }
          uoa.e(i);
          this.c.G(p0, p1);
          return;
       }
    }
    public final void k(int p0,int p1,int p2){
       int i = p0 - 2;
       int i1 = p1 - 2;
       this.h(i, i1, p2, 1);
       int i2 = p1 - 1;
       this.h(i, i2, p2, 2);
       i = p0 - 1;
       this.h(i, i1, p2, 3);
       this.h(i, i2, p2, 4);
       this.h(i, p1, p2, 5);
       this.h(p0, i1, p2, 6);
       this.h(p0, i2, p2, 7);
       this.h(p0, p1, p2, 8);
    }
    public final o l(int p0){
       Fragment uFragment1;
       String str = "position#";
       String str1 = tp2.k(str, p0);
       Fragment uFragment = this.d.D(str1);
       kb3 td = this.d;
       td.getClass();
       a uoa = new a(td);
       if (uFragment == null) {
          uFragment = new kd2();
          uoa.g(this.a, uFragment, str1, 1);
       }
       kb3 tb = this.b;
       if (p0 != tb && (tb != -1 && (uFragment1 = this.d.D(str+tb)) != null)) {
          uoa.i(uFragment1);
       }
       this.b = p0;
       if (!uFragment.isVisible()) {
          uoa.n(uFragment);
       }
       if (!uoa.a.isEmpty()) {
          uoa.f();
       }
       return uFragment.getChildFragmentManager();
    }
}
