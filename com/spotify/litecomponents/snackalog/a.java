package com.spotify.litecomponents.snackalog.a;
import java.lang.Object;
import com.spotify.litecomponents.snackalog.SnackalogManager$1;
import android.app.Activity;
import java.lang.ref.Reference;
import p.ek3;
import p.vj3;
import p.dk3;
import p.lm6;

public final class a	// class@000926 from classes.dex
{
    public final dk3 a;
    public lm6 b;

    public void a(){
       super();
       this.a = new SnackalogManager$1(this);
    }
    public final void a(Activity p0){
       ek3 uoek3;
       a tb = this.b;
       a ta = this.a;
       if (tb != null && (uoek3 = tb.get()) != null) {
          uoek3.getLifecycle().c(ta);
       }
       this.b = null;
       this.b = new lm6(p0);
       p0.getLifecycle().a(ta);
       return;
    }
}
