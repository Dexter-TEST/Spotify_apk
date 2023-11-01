package p.mz5;
import p.y7;
import java.net.Proxy;
import java.net.InetSocketAddress;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.StringBuilder;

public final class mz5	// class@001f37 from classes.dex
{
    public final y7 a;
    public final Proxy b;
    public final InetSocketAddress c;

    public void mz5(y7 p0,Proxy p1,InetSocketAddress p2){
       co5.o(p0, "address");
       co5.o(p2, "socketAddress");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final boolean equals(Object p0){
       boolean b = (p0 instanceof mz5 && (co5.c(p0.a, this.a) && (co5.c(p0.b, this.b) && co5.c(p0.c, this.c))))? true: false;
       return b;
    }
    public final int hashCode(){
       return (this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31));
    }
    public final String toString(){
       return "Route{"+this.c+'}';
    }
}
