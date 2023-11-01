package p.sj4;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import android.app.Notification;
import java.lang.System;
import java.lang.CharSequence;
import android.app.PendingIntent;
import p.pj4;
import p.vj4;
import p.uj4;
import android.os.Build$VERSION;
import android.app.Notification$Builder;
import android.os.Bundle;
import java.lang.Class;

public final class sj4	// class@00263e from classes.dex
{
    public final Context a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public Bitmap h;
    public int i;
    public boolean j;
    public uj4 k;
    public CharSequence l;
    public int m;
    public int n;
    public boolean o;
    public boolean p;
    public String q;
    public Bundle r;
    public int s;
    public int t;
    public String u;
    public final boolean v;
    public final Notification w;
    public final ArrayList x;

    public void sj4(Context p0,String p1){
       super();
       this.b = new ArrayList();
       this.c = new ArrayList();
       this.d = new ArrayList();
       this.j = true;
       this.p = false;
       this.s = 0;
       this.t = 0;
       Notification notification = new Notification();
       this.w = notification;
       this.a = p0;
       this.u = p1;
       notification.when = System.currentTimeMillis();
       notification.audioStreamType = -1;
       this.i = 0;
       this.x = new ArrayList();
       this.v = true;
    }
    public static CharSequence c(CharSequence p0){
       if (p0 == null) {
          return p0;
       }
       if (p0.length() > 5120) {
          p0 = p0.subSequence(0, 5120);
       }
       return p0;
    }
    public final void a(int p0,String p1,PendingIntent p2){
       this.b.add(new pj4(p0, p1, p2));
    }
    public final Notification b(){
       sj4 k;
       Notification notification;
       Notification extras;
       vj4 ovj4 = new vj4(this);
       vj4 b = ovj4.b;
       if ((k = b.k) != null) {
          k.b(ovj4);
       }
       if (k != null) {
          k.e();
       }
       int sDK_INT = Build$VERSION.SDK_INT;
       vj4 a = ovj4.a;
       if (sDK_INT >= 26) {
          notification = a.build();
       }else if(sDK_INT >= 24){
          notification = a.build();
       }else {
          a.setExtras(ovj4.c);
          notification = a.build();
       }
       if (k != null) {
          k.d();
       }
       if (k != null) {
          b.k.getClass();
       }
       if (k != null && (extras = notification.extras) != null) {
          k.a(extras);
       }
       return notification;
    }
    public final void d(CharSequence p0){
       this.f = sj4.c(p0);
    }
    public final void e(CharSequence p0){
       this.e = sj4.c(p0);
    }
    public final void f(int p0,boolean p1){
       sj4 tw = this.w;
       tw.flags = (p1)? p0 | tw.flags: (~ p0) & tw.flags;
       return;
    }
    public final void g(uj4 p0){
       if (this.k != p0) {
          this.k = p0;
          if (p0 != null) {
             p0.f(this);
          }
       }
       return;
    }
}
