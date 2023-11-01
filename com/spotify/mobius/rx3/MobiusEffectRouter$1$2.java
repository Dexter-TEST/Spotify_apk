package com.spotify.mobius.rx3.MobiusEffectRouter$1$2;
import p.bi5;
import com.spotify.mobius.rx3.MobiusEffectRouter$1;
import java.lang.Object;
import java.util.Iterator;
import java.util.Set;
import java.lang.Class;

class MobiusEffectRouter$1$2 implements bi5	// class@000a81 from classes.dex
{
    public final MobiusEffectRouter$1 a;

    public void MobiusEffectRouter$1$2(MobiusEffectRouter$1 p0){
       this.a = p0;
       super();
    }
    public final boolean test(Object p0){
       Iterator iterator = this.a.a.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return true;
          }
          if (iterator.next().isAssignableFrom(p0.getClass())) {
             break ;
          }
       }
       return false;
    }
}
