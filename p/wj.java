package p.wj;
import android.app.PendingIntent;
import java.lang.Object;
import p.g28;

public final class wj	// class@002b4f from classes.dex
{
    public final int a;
    public final long b;
    public final long c;
    public final PendingIntent d;
    public final PendingIntent e;
    public final PendingIntent f;
    public final PendingIntent g;
    public boolean h;

    public void wj(int p0,long p1,long p2,PendingIntent p3,PendingIntent p4,PendingIntent p5,PendingIntent p6){
       super();
       this.h = false;
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
    }
    public final PendingIntent a(g28 p0){
       wj te;
       wj tc = this.c;
       wj tb = this.b;
       int i = 0;
       g28 b = p0.b;
       if ((p0 = p0.a) == null) {
          if ((te = this.e) != null) {
             return te;
          }else if(b != null && (tb - tc) <= 0){
             i = 1;
          }
          if (i) {
             return this.g;
          }else {
             return null;
          }
       }else if(p0 == 1){
          if ((te = this.d) != null) {
             return te;
          }else if(b != null && (tb - tc) <= 0){
             i = 1;
          }
          if (i) {
             return this.f;
          }
       }
       return null;
    }
}
