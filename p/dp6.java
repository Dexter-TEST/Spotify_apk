package p.dp6;
import java.lang.Runnable;
import p.fp6;
import android.content.Intent;
import org.json.JSONObject;
import p.r8;
import p.wf2;
import java.lang.Object;

public final class dp6 implements Runnable	// class@001391 from classes.dex
{
    public final fp6 a;
    public final Intent b;
    public final boolean c;
    public final JSONObject t;
    public final r8 v;
    public final wf2 w;

    public void dp6(fp6 p0,Intent p1,boolean p2,JSONObject p3,r8 p4,wf2 p5){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
       this.w = p5;
       super();
    }
    public final void run(){
       if (!this.a.d(this.b, this.c, this.t, this.v)) {
          this.w.invoke();
       }
       return;
    }
}
