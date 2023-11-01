package p.cl7;
import p.qf2;
import android.view.View;
import p.jy6;

public abstract class cl7 extends qf2	// class@001230 from classes.dex
{
    public static boolean e = true;

    public void cl7(){
       super();
    }
    public float g(View p0){
       if (cl7.e) {
          return jy6.a(p0);
       }
    }
    public void h(View p0,float p1){
       if (cl7.e) {
          try{
             jy6.j(p0, p1);
             return;
          }catch(java.lang.NoSuchMethodError e0){
             cl7.e = false;
          }
          p0.setAlpha(p1);
          return;
       }else {
       }
    }
}
