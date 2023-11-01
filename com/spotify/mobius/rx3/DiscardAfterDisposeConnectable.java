package com.spotify.mobius.rx3.DiscardAfterDisposeConnectable;
import p.xo0;
import java.lang.Object;
import p.hr0;
import p.ap0;
import com.spotify.mobius.rx3.DiscardAfterDisposeWrapper;
import java.lang.Class;
import p.vc1;
import p.vf;
import com.spotify.mobius.rx3.DiscardAfterDisposeConnectable$1;

class DiscardAfterDisposeConnectable implements xo0	// class@000a7b from classes.dex
{
    public final xo0 a;

    public void DiscardAfterDisposeConnectable(xo0 p0){
       super();
       this.a = p0;
    }
    public final ap0 d(hr0 p0){
       DiscardAfterDisposeWrapper uDiscardAfte = new DiscardAfterDisposeWrapper(p0, null);
       ap0 uoap0 = this.a.d(uDiscardAfte);
       uoap0.getClass();
       DiscardAfterDisposeWrapper uDiscardAfte1 = new DiscardAfterDisposeWrapper(uoap0, uoap0);
       vc1[] ovc1Array = new vc1[]{uDiscardAfte1,uDiscardAfte};
       vf ovf = new vf(ovc1Array);
       return new DiscardAfterDisposeConnectable$1(uDiscardAfte1, ovf);
    }
}
