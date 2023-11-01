package com.spotify.mobius.rx3.DiscardAfterDisposeConnectable$1;
import p.ap0;
import com.spotify.mobius.rx3.DiscardAfterDisposeWrapper;
import p.vf;
import java.lang.Object;
import p.vc1;

class DiscardAfterDisposeConnectable$1 implements ap0	// class@000a7a from classes.dex
{
    public final DiscardAfterDisposeWrapper a;
    public final vc1 b;

    public void DiscardAfterDisposeConnectable$1(DiscardAfterDisposeWrapper p0,vf p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void accept(Object p0){
       this.a.accept(p0);
    }
    public final void dispose(){
       this.b.dispose();
    }
}
