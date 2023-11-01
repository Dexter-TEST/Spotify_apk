package p.dl7;
import p.cl7;
import android.view.View;
import android.graphics.Matrix;
import p.jy6;

public class dl7 extends cl7	// class@00136f from classes.dex
{
    public static boolean f = true;
    public static boolean g;

    public void dl7(){
       super();
    }
    public void i(View p0,Matrix p1){
       if (dl7.f) {
          try{
             jy6.v(p0, p1);
          }catch(java.lang.NoSuchMethodError e0){
             dl7.f = false;
          }
       }
       return;
    }
    public void j(View p0,Matrix p1){
       if (dl7.g) {
          try{
             jy6.n(p0, p1);
          }catch(java.lang.NoSuchMethodError e0){
             dl7.g = false;
          }
       }
       return;
    }
}
