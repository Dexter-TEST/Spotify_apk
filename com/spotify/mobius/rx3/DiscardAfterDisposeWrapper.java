package com.spotify.mobius.rx3.DiscardAfterDisposeWrapper;
import p.hr0;
import p.vc1;
import p.ap0;
import java.lang.Object;

class DiscardAfterDisposeWrapper implements hr0, vc1	// class@000a7c from classes.dex
{
    public final hr0 a;
    public final vc1 b;
    public boolean c;

    public void DiscardAfterDisposeWrapper(hr0 p0,ap0 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void accept(Object p0){
       if (this.c != null) {
          return;
       }
       this.a.accept(p0);
       return;
    }
    public final void dispose(){
       DiscardAfterDisposeWrapper tb;
       this.c = true;
       if ((tb = this.b) != null) {
          tb.dispose();
       }
       return;
    }
}
