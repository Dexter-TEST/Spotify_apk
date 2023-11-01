package com.spotify.litecomponents.snackalog.SnackalogManager$1;
import p.r71;
import com.spotify.litecomponents.snackalog.a;
import java.lang.Object;
import p.ek3;
import java.lang.String;
import p.co5;
import java.lang.ref.Reference;
import p.vj3;
import p.dk3;

class SnackalogManager$1 implements r71	// class@000925 from classes.dex
{
    public final a a;

    public void SnackalogManager$1(a p0){
       this.a = p0;
       super();
    }
    public final void onCreate(ek3 p0){
       co5.o(p0, "owner");
    }
    public final void onDestroy(ek3 p0){
    }
    public final void onPause(ek3 p0){
    }
    public final void onResume(ek3 p0){
       co5.o(p0, "owner");
    }
    public final void onStart(ek3 p0){
       co5.o(p0, "owner");
    }
    public final void onStop(ek3 p0){
       a b;
       ek3 uoek3;
       SnackalogManager$1 ta = this.a;
       if ((b = ta.b) != null && (uoek3 = b.get()) != null) {
          uoek3.getLifecycle().c(ta.a);
       }
       ta.b = null;
       return;
    }
}
