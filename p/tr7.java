package p.tr7;
import p.ly7;
import java.lang.Object;
import android.content.Context;
import p.bo0;
import p.ce7;
import p.ic2;
import androidx.work.impl.WorkDatabase;
import p.jr7;
import java.util.ArrayList;
import p.nq5;
import p.wx7;
import p.nh6;
import p.mv;
import java.lang.Integer;
import java.lang.Boolean;
import p.t10;
import p.e;
import java.lang.String;
import p.ws;
import p.kg4;
import p.hu;
import com.spotify.login.signupapi.services.model.ConfigurationResponse;
import p.c;
import java.lang.IllegalStateException;
import p.hy7;
import p.jy7;
import p.s18;
import p.xv7;
import p.w08;
import p.dx7;
import p.ax7;
import p.xy7;
import p.iy7;
import p.lx7;
import p.lz7;

public final class tr7 implements ly7	// class@0027cc from classes.dex
{
    public Object A;
    public Object a;
    public Object b;
    public Object c;
    public Object t;
    public Object v;
    public Object w;
    public Object x;
    public Object y;
    public Object z;

    public void tr7(){
       super();
    }
    public void tr7(Context p0,bo0 p1,ce7 p2,ic2 p3,WorkDatabase p4,jr7 p5,ArrayList p6){
       super();
       this.A = new nq5(2);
       this.a = p0.getApplicationContext();
       this.t = p2;
       this.c = p3;
       this.v = p1;
       this.w = p4;
       this.x = p5;
       this.z = p6;
    }
    public void tr7(ly7 p0,wx7 p1,wx7 p2,ly7 p3,ly7 p4,ly7 p5,ly7 p6,ly7 p7,ly7 p8,ly7 p9){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
       this.w = p5;
       this.x = p6;
       this.y = p7;
       this.z = p8;
       this.A = p9;
    }
    public void tr7(nh6 p0){
       super();
       this.a = p0.a;
       this.b = p0.b;
       this.c = p0.c;
       this.t = p0.d;
       this.v = Integer.valueOf(p0.e);
       this.w = Boolean.valueOf(p0.f);
       this.x = Boolean.valueOf(p0.g);
       this.y = p0.h;
       this.z = p0.i;
       this.A = p0.j;
    }
    public final mv a(){
       String str = (this.a == null)? " birthday": "";
       if (this.b == null) {
          str = str.concat(" gender");
       }
       if (this.c == null) {
          str = kg4.l(str, " email");
       }
       if (this.t == null) {
          str = kg4.l(str, " password");
       }
       if (this.v == null) {
          str = kg4.l(str, " currentStepIndex");
       }
       if (this.w == null) {
          str = kg4.l(str, " signingUp");
       }
       if (this.x == null) {
          str = kg4.l(str, " acceptedLicenses");
       }
       if (this.y == null) {
          str = kg4.l(str, " signupConfiguration");
       }
       if (str.isEmpty()) {
          mv str1 = new mv(this.a, this.b, this.c, this.t, this.v.intValue(), this.w.booleanValue(), this.x.booleanValue(), this.y, this.z, this.A);
          return str;
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final Object c(){
       s18 os18 = this.t.c();
       this.v.c();
       this.w.c();
       this.x.c();
       xv7 oxv7 = this.z.c();
       this.A.c();
       return new w08(this.a.c(), jy7.a(this.b), this.c.c(), jy7.a(this.y));
    }
}
