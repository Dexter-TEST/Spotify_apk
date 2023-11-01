package com.spotify.mobius.android.MutableLiveQueue$LifecycleObserverHelper;
import p.dk3;
import com.spotify.mobius.android.a;
import java.lang.Object;
import p.ek3;
import p.kj3;
import java.lang.Class;
import p.oe4;
import java.lang.Enum;

class MutableLiveQueue$LifecycleObserverHelper implements dk3	// class@000a78 from classes.dex
{
    public final a a;

    public void MutableLiveQueue$LifecycleObserverHelper(a p0){
       this.a = p0;
       super();
    }
    public void onAny(ek3 p0,kj3 p1){
       a a;
       MutableLiveQueue$LifecycleObserverHelper ta = this.a;
       ta.getClass();
       int i = oe4.a[p1.ordinal()];
       boolean b = true;
       if (i != b) {
          if (i != 2) {
             if (i == 3) {
                a = ta.a;
                _monitor_enter(a);
                ta.a();
                _monitor_exit(a);
             }
          }else {
             a = ta.a;
             _monitor_enter(a);
             ta.f = b;
             _monitor_exit(a);
          }
       }else {
          a = ta.a;
          _monitor_enter(a);
          ta.f = false;
          ta.b();
          _monitor_exit(a);
       }
       return;
    }
}
