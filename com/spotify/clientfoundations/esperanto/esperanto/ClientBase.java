package com.spotify.clientfoundations.esperanto.esperanto.ClientBase;
import com.spotify.clientfoundations.esperanto.esperanto.Transport;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.s74;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.Observable;

public class ClientBase	// class@000577 from classes.dex
{
    private final Transport transport;

    public void ClientBase(Transport p0){
       co5.o(p0, "transport");
       super();
       this.transport = p0;
    }
    public final Single callSingle(String p0,String p1,s74 p2){
       co5.o(p0, "service");
       co5.o(p1, "method");
       co5.o(p2, "payload");
       byte[] uobyteArray = p2.toByteArray();
       co5.l(uobyteArray, "payload.toByteArray\(\)");
       return this.transport.callSingle(p0, p1, uobyteArray);
    }
    public final Observable callStream(String p0,String p1,s74 p2){
       co5.o(p0, "service");
       co5.o(p1, "method");
       co5.o(p2, "payload");
       byte[] uobyteArray = p2.toByteArray();
       co5.l(uobyteArray, "payload.toByteArray\(\)");
       return this.transport.callStream(p0, p1, uobyteArray);
    }
    public final byte[] callSync(String p0,String p1,s74 p2){
       co5.o(p0, "service");
       co5.o(p1, "method");
       co5.o(p2, "payload");
       byte[] uobyteArray = p2.toByteArray();
       co5.l(uobyteArray, "payload.toByteArray\(\)");
       return this.transport.callSync(p0, p1, uobyteArray);
    }
}
