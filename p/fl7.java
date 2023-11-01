package p.fl7;
import p.el7;
import android.view.View;
import android.os.Build$VERSION;
import p.qf2;
import p.jy6;

public class fl7 extends el7	// class@0015f0 from classes.dex
{
    public static boolean i = true;

    public void fl7(){
       super();
    }
    public void f(View p0,int p1){
       if (Build$VERSION.SDK_INT == 28) {
          super.f(p0, p1);
       }else if(fl7.i){
          try{
             jy6.k(p0, p1);
          }catch(java.lang.NoSuchMethodError e0){
             fl7.i = false;
          }
       }
       return;
    }
}
