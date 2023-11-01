package p.yz6;
import javax.net.SocketFactory;
import java.net.Socket;
import android.net.TrafficStats;
import java.lang.String;
import java.net.InetAddress;

public final class yz6 extends SocketFactory	// class@002e5a from classes.dex
{
    public final SocketFactory a;
    public final int b;

    public void yz6(){
       super();
       this.a = SocketFactory.getDefault();
       this.b = 0x3039;
    }
    public final Socket createSocket(){
       TrafficStats.setThreadStatsTag(this.b);
       return this.a.createSocket();
    }
    public final Socket createSocket(String p0,int p1){
       TrafficStats.setThreadStatsTag(this.b);
       return this.a.createSocket(p0, p1);
    }
    public final Socket createSocket(String p0,int p1,InetAddress p2,int p3){
       TrafficStats.setThreadStatsTag(this.b);
       return this.a.createSocket(p0, p1, p2, p3);
    }
    public final Socket createSocket(InetAddress p0,int p1){
       TrafficStats.setThreadStatsTag(this.b);
       return this.a.createSocket(p0, p1);
    }
    public final Socket createSocket(InetAddress p0,int p1,InetAddress p2,int p3){
       TrafficStats.setThreadStatsTag(this.b);
       return this.a.createSocket(p0, p1, p2, p3);
    }
}
