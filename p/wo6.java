package p.wo6;
import p.wf2;
import p.gi3;
import p.ap6;
import android.app.Activity;
import p.ep6;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import p.t50;
import java.lang.String;
import p.co5;
import p.s50;
import android.net.Uri;
import p.jc7;

public final class wo6 extends gi3 implements wf2	// class@002b7a from classes.dex
{
    public final ap6 a;
    public final Activity b;
    public final r50 c;
    public final Intent t;

    public void wo6(ap6 p0,Activity p1,ep6 p2,Intent p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       super(0);
    }
    public final Object invoke(){
       wo6 ta = this.a;
       ta.b.getClass();
       ta.a.getClass();
       t50.y = true;
       wo6 tb = this.b;
       co5.o(tb, "activity");
       s50 os50 = new s50(tb);
       if ((tb = this.c) != null) {
          os50.a = tb;
       }
       Uri data = ((tb = this.t) != null)? tb.getData(): null;
       os50.c = data;
       os50.a();
       return jc7.a;
    }
}
