package com.spotify.eventsender.corebridge.EventSenderCoreBridgeImpl;
import com.spotify.eventsender.api.EventSenderCoreBridge;
import p.su1;
import java.lang.Object;
import java.lang.String;
import java.nio.charset.Charset;
import p.nc2;
import java.lang.Class;
import p.co5;
import p.av6;
import p.ba5;
import p.hs5;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.Scheduler;
import p.kc2;
import p.yf2;
import java.util.concurrent.TimeUnit;
import p.hs0;
import p.lc2;
import p.ir0;

public class EventSenderCoreBridgeImpl implements EventSenderCoreBridge	// class@0008a2 from classes.dex
{
    private boolean isBlockingSendEnabled;
    private final su1 mEventPublisher;

    public void EventSenderCoreBridgeImpl(su1 p0){
       super();
       this.mEventPublisher = p0;
    }
    public boolean send(byte[] p0,byte[] p1,byte[] p2){
       String str = "UTF-8";
       String str1 = new String(p0, Charset.forName(str));
       EventSenderCoreBridgeImpl tmEventPubli = this.mEventPublisher;
       String str2 = (p2 == null)? null: new String(p2, Charset.forName(str));
       tmEventPubli.b(str1, str2, p1);
       return true;
    }
    public boolean sendBlocking(byte[] p0,byte[] p1,byte[] p2){
       ba5 av6.g0(str1, "NonAuth", false);
       if (this.isBlockingSendEnabled == null) {
          return this.send(p0, p1, p2);
       }
       String str = "UTF-8";
       String str1 = new String(p0, Charset.forName(str));
       EventSenderCoreBridgeImpl tmEventPubli = this.mEventPublisher;
       int i = 0;
       int i1 = (p2 == null)? i: new String(p2, Charset.forName(str));
       tmEventPubli.getClass();
       co5.o(p1, "payload");
       int i2 = av6.g0(str1, "NonAuth", false) ^ 0x01;
       String str2 = (i1 != null && i2)? i1: i;
       tmEventPubli.g.getClass();
       av6.g0(str1, "NonAuth", false) = new ba5(str1, p1, str2, i2, null);
       hs5 ohs5 = new hs5();
       Single.just(av6.g0(str1, "NonAuth", false)).observeOn(tmEventPubli.h).flatMap(new kc2(tmEventPubli, av6.g0(str1, "NonAuth", false), 1)).timeout(1, TimeUnit.SECONDS, tmEventPubli.i).blockingSubscribe(new hs0(5, ohs5), new lc2(ohs5, tmEventPubli, str1));
       return ohs5.a;
    }
    public synchronized void setBlockingSendEnabled(boolean p0){
       this.isBlockingSendEnabled = p0;
    }
}
