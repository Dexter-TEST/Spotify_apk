package p.a5;
import p.wd5;
import java.lang.Object;
import p.cv5;
import android.graphics.drawable.Drawable;
import java.lang.String;
import p.v4;
import java.lang.ref.ReferenceQueue;
import android.graphics.Bitmap;
import p.ud5;
import java.lang.Exception;
import java.lang.ref.Reference;

public abstract class a5	// class@000f1b from classes.dex
{
    public final wd5 a;
    public final cv5 b;
    public final v4 c;
    public final boolean d;
    public final int e;
    public final int f;
    public final int g;
    public final Drawable h;
    public final String i;
    public final Object j;
    public boolean k;
    public boolean l;

    public void a5(wd5 p0,Object p1,cv5 p2,int p3,Drawable p4,String p5,Object p6){
       super();
       this.a = p0;
       this.b = p2;
       v4 ov4 = (p1 == null)? null: new v4(this, p1, p0.i);
       this.c = ov4;
       this.e = 0;
       this.f = 0;
       this.d = false;
       this.g = p3;
       this.h = p4;
       this.i = p5;
       if (p6 == null) {
          p6 = this;
       }
       this.j = p6;
       return;
    }
    public void a(){
       this.l = true;
    }
    public abstract void b(Bitmap p0,ud5 p1);
    public abstract void c(Exception p0);
    public final Object d(){
       a5 tc;
       Object obj = ((tc = this.c) == null)? null: tc.get();
       return obj;
    }
}
