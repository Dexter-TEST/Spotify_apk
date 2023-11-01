package com.spotify.clientfoundations.esperanto.esperantoimpl.SchedulingTransport;
import com.spotify.clientfoundations.esperanto.esperanto.Transport;
import io.reactivex.rxjava3.core.Scheduler;
import java.lang.Object;
import java.lang.String;
import p.co5;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.Observable;

public final class SchedulingTransport implements Transport	// class@000585 from classes.dex
{
    private final Scheduler scheduler;
    private final Transport transport;

    public void SchedulingTransport(Scheduler p0,Transport p1){
       co5.o(p0, "scheduler");
       co5.o(p1, "transport");
       super();
       this.scheduler = p0;
       this.transport = p1;
    }
    public Single callSingle(String p0,String p1,byte[] p2){
       co5.o(p0, "service");
       co5.o(p1, "method");
       co5.o(p2, "payload");
       Single single = this.transport.callSingle(p0, p1, p2).subscribeOn(this.scheduler).unsubscribeOn(this.scheduler);
       co5.l(single, "transport.callSingle\(ser….unsubscribeOn\(scheduler\)");
       return single;
    }
    public Observable callStream(String p0,String p1,byte[] p2){
       co5.o(p0, "service");
       co5.o(p1, "method");
       co5.o(p2, "payload");
       Observable observable = this.transport.callStream(p0, p1, p2).subscribeOn(this.scheduler).unsubscribeOn(this.scheduler);
       co5.l(observable, "transport.callStream\(ser….unsubscribeOn\(scheduler\)");
       return observable;
    }
    public byte[] callSync(String p0,String p1,byte[] p2){
       co5.o(p0, "service");
       co5.o(p1, "method");
       co5.o(p2, "payload");
       return this.transport.callSync(p0, p1, p2);
    }
}
