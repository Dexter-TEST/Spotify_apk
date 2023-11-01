package p.ej2;
import p.bf7;
import android.os.Bundle;
import p.fj2;
import p.et3;
import java.lang.Object;
import p.ny1;
import p.ht3;
import p.mu3;
import java.lang.String;
import java.lang.Throwable;
import p.gt3;
import p.dt3;
import org.json.JSONObject;
import android.os.BaseBundle;

public final class ej2 implements bf7	// class@001499 from classes.dex
{
    public final Bundle a;
    public final fj2 b;
    public final et3 c;

    public void ej2(Bundle p0,fj2 p1,et3 p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final void f(ny1 p0){
       ej2 tb = this.b;
       ht3 oht3 = tb.d();
       ht3 x = tb.d().x;
       String str = (p0 == null)? null: p0.getMessage();
       oht3.c(dt3.m(x, "Caught exception", str, null));
       return;
    }
    public final void j(JSONObject p0){
       ej2 ta = this.a;
       ej2 tb = this.b;
       int i = 0;
       try{
          String str = (p0 == null)? i: p0.getString("id");
          ta.putString("com.facebook.platform.extra.USER_ID", str);
          tb.D(ta, this.c);
       }catch(org.json.JSONException e6){
          tb.d().c(dt3.m(tb.d().x, "Caught exception", e6.getMessage(), i));
       }
       return;
    }
}
