package p.ep6;
import p.r50;
import p.fp6;
import android.content.Intent;
import p.wf2;
import java.lang.Object;
import org.json.JSONObject;
import p.r8;
import p.ay6;
import android.os.Handler;
import p.dp6;
import java.lang.Runnable;

public final class ep6 implements r50	// class@0014d3 from classes.dex
{
    public final fp6 a;
    public final Intent b;
    public final boolean c;
    public final wf2 d;

    public void ep6(fp6 p0,Intent p1,wf2 p2){
       this.a = p0;
       this.b = p1;
       this.c = true;
       this.d = p2;
       super();
    }
    public final void a(JSONObject p0,r8 p1){
       dp6 v8 = new dp6(this.a, this.b, this.c, p0, p1, this.d);
       this.a.g.getValue().post(v8);
    }
}
