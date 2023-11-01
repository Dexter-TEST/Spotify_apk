package com.spotify.clientfoundations.esperanto.esperantoimpl.NativeTransport;
import com.spotify.clientfoundations.esperanto.esperanto.Transport;
import java.lang.Object;
import java.lang.String;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.SingleEmitter;
import p.co5;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import p.hi6;
import java.lang.Throwable;
import io.reactivex.rxjava3.core.Single;
import p.if4;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;

public final class NativeTransport implements Transport	// class@000584 from classes.dex
{
    private boolean isInvalidated;
    private final long nThis;

    public void NativeTransport(){
       super();
    }
    public static void a(NativeTransport p0,String p1,String p2,byte[] p3,ObservableEmitter p4){
       NativeTransport.callStream$lambda-0(p0, p1, p2, p3, p4);
    }
    public static void b(NativeTransport p0,String p1,String p2,byte[] p3,SingleEmitter p4){
       NativeTransport.callSingle$lambda-1(p0, p1, p2, p3, p4);
    }
    private static final void callSingle$lambda-1(NativeTransport p0,String p1,String p2,byte[] p3,SingleEmitter p4){
       co5.o(p0, "this$0");
       co5.o(p1, "$service");
       co5.o(p2, "$method");
       co5.o(p3, "$payload");
       if (p0.isInvalidated != null) {
          p4.onError(new RuntimeException("callStream\(\) subscription scheduled after invalidation: "+p1+'.'+p2));
       }else {
          co5.l(p4, "emitter");
          p0.handleSingleSubscription(p4, p1, p2, p3);
       }
       return;
    }
    private static final void callStream$lambda-0(NativeTransport p0,String p1,String p2,byte[] p3,ObservableEmitter p4){
       co5.o(p0, "this$0");
       co5.o(p1, "$service");
       co5.o(p2, "$method");
       co5.o(p3, "$payload");
       if (p0.isInvalidated != null) {
          p4.onError(new RuntimeException("callStream\(\) subscription scheduled after invalidation: "+p1+'.'+p2));
       }else {
          co5.l(p4, "emitter");
          p0.handleStreamSubscription(p4, p1, p2, p3);
       }
       return;
    }
    private native final void handleSingleSubscription(SingleEmitter p0,String p1,String p2,byte[] p3);
    private native final void handleStreamSubscription(ObservableEmitter p0,String p1,String p2,byte[] p3);
    public Single callSingle(String p0,String p1,byte[] p2){
       co5.o(p0, "service");
       co5.o(p1, "method");
       co5.o(p2, "payload");
       if4 v0 = new if4(this, p0, p1, p2, 0);
       Single single = Single.create(v0);
       co5.l(single, "create\({emitter ->\n     …
                }\n        }\)");
       return single;
    }
    public Observable callStream(String p0,String p1,byte[] p2){
       co5.o(p0, "service");
       co5.o(p1, "method");
       co5.o(p2, "payload");
       if4 v0 = new if4(this, p0, p1, p2, 0);
       Observable observable = Observable.create(v0);
       co5.l(observable, "create\({emitter ->\n     …
                }\n        }\)");
       return observable;
    }
    public native byte[] callSync(String p0,String p1,byte[] p2);
    public native final void destroy();
    public final void invalidate(){
       this.isInvalidated = true;
    }
}
