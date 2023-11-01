package p.ok7;
import p.wc1;
import android.view.View;
import java.lang.Object;
import p.qk7;
import p.r;

public final class ok7 implements wc1	// class@00213d from classes.dex
{
    public final View a;

    public void ok7(View p0){
       super();
       this.a = p0;
    }
    public final void dispose(){
       qk7 oqk7 = r.c(this.a);
       _monitor_enter(oqk7);
       int i = (this != oqk7.b)? 1: 0;
       _monitor_exit(oqk7);
       if (i) {
          return;
       }else {
          r.c(this.a).a();
          return;
       }
    }
}
