package p.oz5;
import p.y7;
import p.hj2;
import p.lp5;
import p.i70;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.ll1;
import java.util.ArrayList;
import java.util.List;
import p.ye7;
import java.net.URI;
import p.ps2;
import java.net.Proxy;
import p.we7;
import java.net.ProxySelector;
import java.util.Collection;
import p.q52;
import java.net.Proxy$Type;
import java.net.SocketAddress;
import java.net.InetSocketAddress;
import java.net.InetAddress;
import java.lang.Class;
import java.lang.IllegalArgumentException;
import p.fv1;
import java.util.Iterator;
import p.mz5;
import java.util.Set;
import java.net.UnknownHostException;
import java.lang.StringBuilder;
import java.net.SocketException;
import java.lang.Iterable;
import java.util.AbstractCollection;
import p.cj0;
import java.util.NoSuchElementException;

public final class oz5	// class@0002f3 from classes2.dex
{
    public final y7 a;
    public final hj2 b;
    public final t90 c;
    public final i70 d;
    public List e;
    public int f;
    public List g;
    public final ArrayList h;

    public void oz5(y7 p0,hj2 p1,lp5 p2,i70 p3){
       y7 g;
       List list;
       Proxy[] proxyArray;
       co5.o(p0, "address");
       co5.o(p1, "routeDatabase");
       co5.o(p2, "call");
       co5.o(p3, "eventListener");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       ll1 a = ll1.a;
       this.e = a;
       this.g = a;
       this.h = new ArrayList();
       y7 i = p0.i;
       co5.o(i, "url");
       if ((g = p0.g) != null) {
          list = ye7.J(g);
       }else {
          URI uRI = i.h();
          if (uRI.getHost() == null) {
             proxyArray = new Proxy[]{Proxy.NO_PROXY};
             list = we7.l(proxyArray);
          }else if((list = p0.h.select(uRI)) != null && !list.isEmpty()){
             uRI = 0;
          }else {
             uRI = 1;
          }
          if (uRI) {
             proxyArray = new Proxy[]{Proxy.NO_PROXY};
             list = we7.l(proxyArray);
          }else {
             co5.l(list, "proxiesOrNull");
             list = we7.x(list);
          }
       }
       this.e = list;
       this.f = 0;
       return;
    }
    public final boolean a(){
       int i = 1;
       int i1 = (this.f < this.e.size())? 1: 0;
       if (!i1 && !((this.h.isEmpty() ^ i))) {
          i = false;
       }
       return i;
    }
    public final q52 b(){
       Proxy proxy;
       ps2 d;
       ps2 e;
       Iterator iterator;
       InetAddress address;
       if (!this.a()) {
          throw new NoSuchElementException();
       }
       ArrayList uArrayList = new ArrayList();
       while (true) {
          int i = 0;
          int i1 = (this.f < this.e.size())? 1: 0;
          if (i1) {
             i1 = (this.f < this.e.size())? 1: 0;
             String str = "No route to ";
             oz5 ta = this.a;
             if (i1) {
                oz5 tf = this.f;
                int i2 = tf + 1;
                this.f = i2;
                proxy = this.e.get(tf);
                ArrayList uArrayList1 = new ArrayList();
                this.g = uArrayList1;
                if (proxy.type() != Proxy$Type.DIRECT && proxy.type() != Proxy$Type.SOCKS) {
                   SocketAddress socketAddres = proxy.address();
                   if (socketAddres instanceof InetSocketAddress) {
                      co5.l(socketAddres, "proxyAddress");
                      if ((address = socketAddres.getAddress()) == null) {
                         d = socketAddres.getHostName();
                         co5.l(d, "hostName");
                      }else {
                         d = address.getHostAddress();
                         co5.l(d, "address.hostAddress");
                      }
                      e = socketAddres.getPort();
                   }else {
                      throw new IllegalArgumentException(co5.K(socketAddres.getClass(), "Proxy.address\(\) is not an InetSocketAddress: ").toString());
                   }
                }else {
                   y7 i3 = ta.i;
                   d = i3.d;
                   e = i3.e;
                }
                if (1 <= e && e < 0x10000) {
                   i = 1;
                }
                if (i) {
                   if (proxy.type() == Proxy$Type.SOCKS) {
                      uArrayList1.add(InetSocketAddress.createUnresolved(d, e));
                   }else {
                      this.d.getClass();
                      co5.o(this.c, "call");
                      co5.o(d, "domainName");
                      List list = ta.a.y(d);
                      if (!list.isEmpty()) {
                         iterator = list.iterator();
                         while (iterator.hasNext()) {
                            uArrayList1.add(new InetSocketAddress(iterator.next(), e));
                         }
                      }else {
                         throw new UnknownHostException(ta.a+" returned no addresses for "+d);
                      }
                   }
                   iterator = this.g.iterator();
                   while (iterator.hasNext()) {
                      mz5 omz5 = new mz5(this.a, proxy, iterator.next());
                      oz5 tb = this.b;
                      _monitor_enter(tb);
                      _monitor_exit(tb);
                      if (tb.a.contains(omz5)) {
                         this.h.add(omz5);
                      }else {
                         uArrayList.add(omz5);
                      }
                   }
                   if (!(i1 = uArrayList.isEmpty() ^ 1)) {
                      continue ;
                   }
                }else {
                   throw new SocketException(str+d+':'+e+"; port is out of range");
                }
             }else {
                throw new SocketException(str+ta.i.d+"; exhausted proxy configurations: "+this.e);
             }
          }
          if (uArrayList.isEmpty()) {
             cj0.c0(this.h, uArrayList);
             this.h.clear();
             break ;
          }
          break ;
       }
       return new q52(uArrayList);
    }
}
