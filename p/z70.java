package p.z70;
import p.is6;
import java.nio.ByteBuffer;
import java.lang.Class;
import java.util.TimeZone;
import java.lang.String;
import java.net.InetSocketAddress;
import p.vf3;
import java.net.InetAddress;
import java.net.Inet6Address;
import java.lang.StringBuilder;
import p.en6;
import p.tf3;
import p.he3;
import java.lang.Object;
import p.gb6;
import java.nio.Buffer;
import p.sx;
import p.rx;
import p.y70;
import p.ka7;
import p.qg3;
import p.ds7;

public final class z70 extends is6	// class@002e9d from classes.dex
{
    public final int t;

    public void z70(int p0){
       this.t = p0;
       if (p0 != 1) {
          if (p0 != 2) {
             if (p0 != 3) {
                super(0, ByteBuffer.class);
                return;
             }else {
                super(0, TimeZone.class);
                return;
             }
          }else {
             super(String.class);
             return;
          }
       }else {
          super(0, InetSocketAddress.class);
          return;
       }
    }
    public static void e(InetSocketAddress p0,vf3 p1){
       InetAddress address;
       int i;
       String hostName = ((address = p0.getAddress()) == null)? p0.getHostName(): address.toString().trim();
       if ((i = hostName.indexOf(47)) >= 0) {
          if (!i) {
             String str = (address instanceof Inet6Address)? "["+hostName.substring(1)+"]": hostName.substring(1);
             hostName = str;
          }else {
             hostName = hostName.substring(0, i);
          }
       }
       p1.x0(en6.s(hostName, ":")+p0.getPort());
       return;
    }
    public final void acceptJsonFormatVisitor(tf3 p0,he3 p1){
       switch (this.t){
           case 0:
             p0.getClass();
             return;
           case 2:
             p0.getClass();
             return;
           default:
             super.acceptJsonFormatVisitor(p0, p1);
             return;
       }
    }
    public final boolean isEmpty(gb6 p0,Object p1){
       switch (this.t){
           case 2:
           default:
             return super.isEmpty(p0, p1);
       }
       return p1.isEmpty();
    }
    public final void serialize(Object p0,vf3 p1,gb6 p2){
       switch (this.t){
           case 0:
             if (p0.hasArray()) {
                int i = p0.position();
                int i1 = p0.arrayOffset() + i;
                int i2 = p0.limit() - i;
                p1.getClass();
                p1.J(sx.b, p0.array(), i1, i2);
             }else {
                p0 = p0.asReadOnlyBuffer();
                if (p0.position() > 0) {
                   p0.rewind();
                }
                y70 oy70 = new y70(p0);
                p1.getClass();
                p1.y(sx.b, oy70, p0.remaining());
                oy70.close();
             }
             return;
             break;
           case 1:
             z70.e(p0, p1);
             return;
           case 2:
             p1.x0(p0);
             return;
           default:
             p1.x0(p0.getID());
             return;
       }
    }
    public final void serializeWithType(Object p0,vf3 p1,gb6 p2,ka7 p3){
       ds7 uods7;
       switch (this.t){
           case 1:
             uods7 = p3.b(qg3.D, p0);
             uods7.e = InetSocketAddress.class;
             z70.e(p0, p1);
             p3.d(p1, p3.c(p1, uods7));
             return;
           case 2:
             p1.x0(p0);
             return;
           case 3:
             uods7 = p3.b(qg3.D, p0);
             uods7.e = TimeZone.class;
             p1.x0(p0.getID());
             p3.d(p1, p3.c(p1, uods7));
             return;
           default:
             super.serializeWithType(p0, p1, p2, p3);
             return;
       }
    }
}
