package p.au7;
import p.it7;
import android.app.Activity;
import android.content.Intent;
import p.ak3;

public final class au7 extends it7	// class@000ff7 from classes.dex
{
    public final int a;
    public final Intent b;
    public final int c;
    public final Object t;

    public void au7(Activity p0,Intent p1){
       this.a = 0;
       this.b = p1;
       this.t = p0;
       this.c = 2;
       super();
    }
    public void au7(Intent p0,ak3 p1){
       this.a = 1;
       this.b = p0;
       this.t = p1;
       this.c = 2;
       super();
    }
    public final void a(){
       au7 tc = this.c;
       au7 tt = this.t;
       au7 tb = this.b;
       switch (this.a){
           case 0:
             if (tb != null) {
                tt.startActivityForResult(tb, tc);
             }
             break;
           default:
             if (tb != null) {
                tt.startActivityForResult(tb, tc);
             }
             return;
       }
       return;
    }
}
