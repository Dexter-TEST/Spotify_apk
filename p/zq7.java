package p.zq7;
import p.ly7;
import p.sj2;
import java.lang.Object;
import p.c0;
import p.th5;
import p.wh6;
import java.util.ArrayList;
import java.util.HashSet;
import com.google.common.collect.d;
import com.google.common.collect.g;
import java.lang.NullPointerException;
import java.lang.String;
import android.content.Context;
import p.ce7;
import p.co5;
import p.i00;
import p.mi4;
import android.os.Build$VERSION;
import p.li4;
import p.ni4;
import java.lang.Throwable;
import p.nq6;
import java.lang.Class;
import java.lang.StackTraceElement;
import p.bv;
import java.lang.Boolean;
import p.hs;
import java.lang.Integer;
import p.n91;
import p.kb7;
import p.jb7;
import p.lb7;
import p.rt;
import p.tm5;
import io.reactivex.rxjava3.core.Scheduler;
import p.ap5;
import p.ty0;
import p.xy5;
import p.m91;
import p.yq7;
import p.bz0;
import p.i73;
import java.lang.IllegalStateException;
import p.ft;
import p.kg4;
import p.r45;
import p.b28;
import p.yw7;
import p.dx7;
import p.w08;
import p.cy7;
import android.view.LayoutInflater;
import android.widget.ScrollView;
import android.view.ViewGroup;
import android.view.View;
import android.widget.TextView;
import p.do5;
import java.lang.CharSequence;
import android.widget.TextView$BufferType;
import android.text.method.MovementMethod;
import android.text.method.LinkMovementMethod;
import android.text.TextPaint;
import android.graphics.Paint$FontMetrics;
import android.graphics.Paint;
import java.lang.Math;
import p.uu;
import p.lv1;
import p.m73;
import p.uy;
import p.uw6;
import p.sw6;
import java.lang.RuntimeException;

public final class zq7 implements ly7, sj2	// class@002f4b from classes.dex
{
    public Object a;
    public Object b;
    public Object c;
    public Object t;

    public void zq7(){
       super();
    }
    public void zq7(int p0){
       g a1;
       if (p0 != 5) {
          int i = 10;
          if (p0 != i) {
             c0 a = c0.a;
             switch (p0){
                 case 12:
                   super();
                   this.t = a;
                   return;
                 case 13:
                   super();
                   if ((a1 = g.A) == null) {
                      throw new NullPointerException("Null pageInstanceIds");
                   }
                   this.c = a1;
                   this.t = a1;
                   this.a = a;
                   this.b = a;
                   return;
                   break;
                 case 14:
                   super();
                   this.t = a;
                   return;
                 default:
                   super();
                   this.a = new th5(i, 1);
                   this.b = new wh6();
                   this.c = new ArrayList();
                   this.t = new HashSet();
                   return;
             }
          }else {
             super();
             return;
          }
       }else {
          super();
          return;
       }
    }
    public void zq7(Context p0,ce7 p1){
       co5.o(p0, "context");
       Context applicationC = p0.getApplicationContext();
       String str = "context.applicationContext";
       co5.l(applicationC, str);
       i00 oi00 = new i00(applicationC, p1, 0);
       Context applicationC1 = p0.getApplicationContext();
       co5.l(applicationC1, str);
       i00 oi001 = new i00(applicationC1, p1, 1);
       applicationC1 = p0.getApplicationContext();
       co5.l(applicationC1, str);
       li4 oli4 = (Build$VERSION.SDK_INT >= 24)? new li4(applicationC1, p1): new ni4(applicationC1, p1);
       p0 = p0.getApplicationContext();
       co5.l(p0, str);
       super();
       this.a = oi00;
       this.b = oi001;
       this.c = oli4;
       this.t = new i00(p0, p1, 2);
       return;
    }
    public void zq7(Object p0,Object p1,Object p2,Object p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       super();
    }
    public void zq7(Throwable p0,nq6 p1){
       super();
       this.a = p0.getLocalizedMessage();
       this.b = p0.getClass().getName();
       this.c = p1.c(p0.getStackTrace());
       zq7 ozq7 = ((p0 = p0.getCause()) != null)? new zq7(p0, p1): null;
       this.t = ozq7;
       return;
    }
    public void zq7(bv p0){
       super();
       this.a = Boolean.valueOf(p0.a);
       this.b = p0.b;
       this.c = p0.c;
       this.t = p0.d;
    }
    public void zq7(hs p0){
       super();
       this.a = p0.a;
       this.b = p0.b;
       this.c = p0.c;
       this.t = Integer.valueOf(p0.d);
    }
    public void zq7(n91 p0,Integer p1,String p2){
       this.t = p0;
       super();
       this.a = p1;
       lb7 this.b = p2;
       jb7 ojb7 = p0.b.b();
       this.b = new lb7("artist_item", null, this.b, this.a, null);
       ojb7.i.add(this.b);
       ojb7.j = true;
       this.c = ojb7.a();
    }
    public void zq7(rt p0){
       g a;
       super();
       if ((a = g.A) == null) {
          throw new NullPointerException("Null pageInstanceIds");
       }
       this.c = a;
       this.t = a;
       c0 a1 = c0.a;
       this.a = a1;
       this.b = a1;
       this.a = p0.a;
       this.b = p0.b;
       this.c = p0.c;
       this.t = p0.d;
       return;
    }
    public void zq7(tm5 p0,Scheduler p1){
       co5.o(p0, "spotifyBranchProvider");
       super();
       this.a = ap5.b;
       this.b = p0;
       this.c = ty0.d;
       this.t = p1;
    }
    public void zq7(xy5 p0){
       super();
       this.a = p0;
       this.b = new m91(this, p0, 4);
       this.c = new yq7(p0, 0);
       this.t = new yq7(p0, 1);
    }
    public final hs a(){
       String str = (this.a == null)? " execution": "";
       if (this.t == null) {
          str = str.concat(" uiOrientation");
       }
       if (str.isEmpty()) {
          return new hs(this.a, this.b, this.c, this.t.intValue());
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final ft b(){
       String str = (this.a == null)? " userId": "";
       if (this.b == null) {
          str = str.concat(" token");
       }
       if (this.c == null) {
          str = kg4.l(str, " userName");
       }
       if (str.isEmpty()) {
          return new ft(this.t, this.a, this.b, this.c);
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final Object c(){
       return new yw7(this.a.a(), this.b.c(), this.c.c(), this.t.c());
    }
    public final void d(LayoutInflater p0,ScrollView p1){
       View view = p0.inflate(R.layout.glue_dialog_content_title_body, p1, true);
       this.a = view.findViewById(R.id.title);
       this.b = view.findViewById(R.id.body);
       if (!view.isInEditMode()) {
          TextView[] textViewArra = new TextView[true];
          textViewArra[0] = this.a;
          do5.y0(textViewArra);
          textViewArra = new TextView[true];
          textViewArra[0] = this.b;
          do5.z0(textViewArra);
          do5.x0(view);
       }
       this.a.setText(this.c);
       this.b.setText(this.t, TextView$BufferType.SPANNABLE);
       this.b.setMovementMethod(LinkMovementMethod.getInstance());
       return;
    }
    public final rt e(){
       String str = (this.c == null)? " pageInstanceIds": "";
       if (this.t == null) {
          str = str.concat(" interactionIds");
       }
       if (str.isEmpty()) {
          return new rt(this.a, this.b, this.c, this.t);
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final void f(){
    }
    public final int g(){
       return (int)Math.ceil((double)Math.abs(this.b.getPaint().getFontMetrics().descent));
    }
    public final uu h(){
       String str = (this.a == null)? " shufflingContext": "";
       if (this.b == null) {
          str = str.concat(" repeatingContext");
       }
       if (this.c == null) {
          str = kg4.l(str, " repeatingTrack");
       }
       if (str.isEmpty()) {
          return new uu(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.t);
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final bv i(){
       String str = (this.a == null)? " devEnabled": "";
       if (this.b == null) {
          str = str.concat(" displayMode");
       }
       if (this.c == null) {
          str = kg4.l(str, " events");
       }
       if (str.isEmpty()) {
          return new bv(this.a.booleanValue(), this.b, this.c, this.t);
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final void j(String p0){
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
    public final void k(){
       this.a.b();
       uw6 ouw6 = this.t.c();
       this.a.c();
       ouw6.u();
       this.a.r();
       this.a.m();
       this.t.f(ouw6);
    }
    public final void l(Object p0,ArrayList p1,HashSet p2){
       ArrayList orDefault;
       if (p1.contains(p0)) {
          return;
       }
       if (p2.contains(p0)) {
          throw new RuntimeException("This graph contains cyclic dependencies");
       }
       p2.add(p0);
       if ((orDefault = this.b.getOrDefault(p0, null)) != null) {
          int i = orDefault.size();
          for (int i1 = 0; i1 < i; i1 = i1 + 1) {
             this.l(orDefault.get(i1), p1, p2);
          }
       }
       p2.remove(p0);
       p1.add(p0);
       return;
    }
}
