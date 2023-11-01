package p.ad6;
import java.lang.Object;
import p.fz5;
import p.d0;
import p.gg1;
import p.ye7;
import p.c0;
import android.view.ViewGroup;
import android.view.View;
import android.widget.FrameLayout;
import p.bd6;
import p.nd5;
import p.i;
import java.lang.Integer;
import java.lang.Boolean;
import p.vv;
import p.lv1;
import p.u11;
import p.nu;
import p.b;
import p.g;
import java.lang.String;
import p.t10;
import p.kg4;
import p.e;
import com.spotify.login.signupapi.services.model.ConfigurationResponse;
import java.lang.IllegalStateException;
import p.aq6;
import java.util.Set;
import p.r45;
import java.lang.NullPointerException;

public final class ad6	// class@000f61 from classes.dex
{
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;

    public void ad6(int p0){
       if (p0 != 2) {
          if (p0 != 4) {
             super();
             this.a = new fz5();
             this.b = new fz5();
             this.c = new fz5();
             this.d = new fz5();
             this.e = new d0(0);
             this.f = new d0(0);
             this.g = new d0(0);
             this.h = new d0(0);
             this.i = ye7.q();
             this.j = ye7.q();
             this.k = ye7.q();
             this.l = ye7.q();
             return;
          }else {
             super();
             return;
          }
       }else {
          super();
          c0 a = c0.a;
          this.e = a;
          this.f = a;
          this.g = a;
          this.h = a;
          return;
       }
    }
    public void ad6(ViewGroup p0,View p1,ViewGroup p2,FrameLayout p3,View p4,View p5,Object p6,View p7,View p8,View p9,View p10,View p11){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       this.i = p8;
       this.j = p9;
       this.k = p10;
       this.l = p11;
       super();
    }
    public void ad6(bd6 p0){
       super();
       this.a = new fz5();
       this.b = new fz5();
       this.c = new fz5();
       this.d = new fz5();
       this.e = new d0(0);
       this.f = new d0(0);
       this.g = new d0(0);
       this.h = new d0(0);
       this.i = ye7.q();
       this.j = ye7.q();
       this.k = ye7.q();
       this.l = ye7.q();
       this.a = p0.a;
       this.b = p0.b;
       this.c = p0.c;
       this.d = p0.d;
       this.e = p0.e;
       this.f = p0.f;
       this.g = p0.g;
       this.h = p0.h;
       this.i = p0.i;
       this.j = p0.j;
       this.k = p0.k;
       this.l = p0.l;
    }
    public void ad6(nd5 p0){
       super();
       this.a = p0.a;
       this.b = p0.b;
       this.c = p0.c;
       this.d = p0.t;
       this.e = p0.v;
       this.f = p0.w;
       this.g = Integer.valueOf(p0.x);
       this.h = Boolean.valueOf(p0.y);
       this.i = Boolean.valueOf(p0.z);
       this.j = Boolean.valueOf(p0.A);
       this.k = Boolean.valueOf(p0.B);
       this.l = Boolean.valueOf(p0.C);
    }
    public void ad6(vv p0){
       super();
       c0 a = c0.a;
       this.e = a;
       this.f = a;
       this.g = a;
       this.h = a;
       this.a = p0.a;
       this.b = p0.b;
       this.c = p0.c;
       this.d = p0.d;
       this.e = p0.e;
       this.f = p0.f;
       this.g = p0.g;
       this.h = p0.h;
       this.i = Boolean.valueOf(p0.i);
       this.j = Boolean.valueOf(p0.j);
       this.k = Boolean.valueOf(p0.k);
       this.l = Boolean.valueOf(p0.l);
    }
    public static void d(lv1 p0){
       if (p0 instanceof fz5) {
          return;
       }
       if (p0 instanceof u11) {
       }
       return;
    }
    public final nu a(){
       String str = (this.a == null)? " callingCodePhoneNumber": "";
       if (this.b == null) {
          str = str.concat(" oneTimePass");
       }
       if (this.c == null) {
          str = kg4.l(str, " birthday");
       }
       if (this.d == null) {
          str = kg4.l(str, " gender");
       }
       if (this.e == null) {
          str = kg4.l(str, " signupConfiguration");
       }
       if (this.g == null) {
          str = kg4.l(str, " currentStepIndex");
       }
       if (this.h == null) {
          str = kg4.l(str, " signingUp");
       }
       if (this.i == null) {
          str = kg4.l(str, " acceptedLicenses");
       }
       if (this.j == null) {
          str = kg4.l(str, " hintRequested");
       }
       if (this.k == null) {
          str = kg4.l(str, " loginFlow");
       }
       if (this.l == null) {
          str = kg4.l(str, " isOffline");
       }
       if (str.isEmpty()) {
          nu str1 = new nu(this.a, this.b, this.c, this.d, this.e, this.f, this.g.intValue(), this.h.booleanValue(), this.i.booleanValue(), this.j.booleanValue(), this.k.booleanValue(), this.l.booleanValue());
          return str;
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final vv b(){
       String str = (this.a == null)? " contextUri": "";
       if (this.b == null) {
          str = str.concat(" clientId");
       }
       if (this.c == null) {
          str = kg4.l(str, " requestedMetadata");
       }
       if (this.d == null) {
          str = kg4.l(str, " loadedMetadata");
       }
       if (this.i == null) {
          str = kg4.l(str, " playerContextCompared");
       }
       if (this.j == null) {
          str = kg4.l(str, " networkFailure");
       }
       if (this.k == null) {
          str = kg4.l(str, " metadataFailure");
       }
       if (this.l == null) {
          str = kg4.l(str, " done");
       }
       if (str.isEmpty()) {
          vv str1 = new vv(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i.booleanValue(), this.j.booleanValue(), this.k.booleanValue(), this.l.booleanValue());
          return str;
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final bd6 c(){
       return new bd6(this);
    }
    public final void e(boolean p0){
       this.l = Boolean.valueOf(p0);
    }
    public final void f(g p0){
       if (p0 == null) {
          throw new NullPointerException("Null oneTimePass");
       }
       this.b = p0;
       return;
    }
}
