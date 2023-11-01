package p.kd3;
import p.ai7;
import java.lang.Object;
import java.lang.String;
import p.av6;
import p.co5;
import java.lang.CharSequence;
import java.io.File;
import android.database.sqlite.SQLiteDatabase;
import p.zr5;
import p.nf2;
import androidx.recyclerview.widget.RecyclerView;
import android.content.res.Resources;
import android.view.View;
import java.lang.Math;
import p.e67;

public abstract class kd3	// class@001bf0 from classes.dex
{
    public int a;
    public static final ai7 b;
    public static final ai7 c;

    static {
       kd3.b = new ai7(1);
       kd3.c = new ai7(2);
    }
    public void kd3(){
       super();
       this.a = -1;
    }
    public void kd3(int p0){
       this.a = p0;
       super();
    }
    public static void c(String p0){
       try{
          boolean b = true;
          if (!av6.i0(p0, ":memory:", b)) {
             int i = p0.length() - b;
             int i1 = 0;
             int i2 = 0;
             while (true) {
                if (i1 <= i) {
                   int i3 = (!i2)? i1: i;
                   i3 = (co5.r(p0.charAt(i3), 32) <= 0)? 1: 0;
                   if (!i2) {
                      if (!i3) {
                         i2 = 1;
                      }else {
                         i1 = i1 + 1;
                      }
                   }else if(!i3){
                   label_0036 :
                      if ((p0.subSequence(i1, (i + b)).toString()).length()) {
                         b = false;
                      }
                      if (!b) {
                         SQLiteDatabase.deleteDatabase(new File(p0));
                         break ;
                      }
                   }else {
                      i = i - 1;
                   }
                }else {
                   goto label_0036 ;
                }
             }
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public abstract void a(zr5 p0);
    public abstract void b(nf2 p0);
    public int d(RecyclerView p0,int p1,int p2,long p3){
       int i = -1;
       if (this.a == i) {
          this.a = p0.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
       }
       float f = 0x3f800000;
       int i1 = (int)(kd3.c.getInterpolation(Math.min(f, (((float)Math.abs(p2) * f) / (float)p1))) * (float)((int)Math.signum((float)p2) * this.a));
       if ((p3 - 2000) <= 0) {
          f = (float)p3 / 0x44fa0000;
       }
       if (!(i1 = (int)(kd3.b.getInterpolation(f) * (float)i1))) {
          if (p2 > 0) {
             i = 1;
          }
          return i;
       }else {
          return i1;
       }
    }
    public abstract void e(RecyclerView p0,zr5 p1,float p2,float p3,boolean p4);
    public abstract void f(nf2 p0);
    public abstract void g(nf2 p0);
    public abstract void h(nf2 p0,int p1,int p2);
    public abstract void i(nf2 p0);
    public abstract void j(nf2 p0,int p1,int p2);
    public abstract e67 k(nf2 p0);
}
