package com.spotify.liteinstrumentation.instrumentation.eventsender.EventSenderAppForegroundState;
import p.zj3;
import java.lang.Object;
import p.t00;
import p.ek3;
import p.kj3;
import p.xu1;
import java.lang.Enum;
import java.lang.Boolean;

public final class EventSenderAppForegroundState implements zj3	// class@000935 from classes.dex
{
    public final t00 a;

    public void EventSenderAppForegroundState(){
       super();
       this.a = t00.a();
    }
    public final void a(ek3 p0,kj3 p1){
       int i = xu1.a[p1.ordinal()];
       EventSenderAppForegroundState ta = this.a;
       if (i != 1) {
          if (i == 2) {
             ta.onNext(Boolean.FALSE);
          }
       }else {
          ta.onNext(Boolean.TRUE);
       }
       return;
    }
}
