package p.no0;
import p.lj;
import p.d22;
import p.oh5;
import com.spotify.rcs.resolver.grpc.v0.ResolveRequest;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.util.TreeMap;
import java.util.Set;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import p.ge6;
import p.t37;
import java.lang.Class;
import p.kg0;
import p.nh5;
import java.util.ArrayList;
import java.util.Map$Entry;
import com.spotify.rcs.resolver.grpc.v0.i;
import com.spotify.rcs.resolver.grpc.v0.Context$ContextEntry;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.aw5;
import p.y12;
import com.spotify.rcs.resolver.grpc.v0.Fetch;
import java.lang.Enum;
import p.z12;
import p.cd2;
import com.spotify.rcs.resolver.grpc.v0.h;
import com.spotify.rcs.resolver.grpc.v0.Context;

public abstract class no0	// class@002016 from classes.dex
{

    public static ResolveRequest a(lj p0,d22 p1,oh5 p2){
       c uoc1;
       co5.o(p0, "appMetadata");
       co5.o(p2, "policyInputs");
       Set set = p2.b().keySet();
       int i = 0;
       if (!set instanceof Collection || !set.isEmpty()) {
          Iterator iterator = set.iterator();
          while (true) {
             if (iterator.hasNext()) {
                if (co5.c(iterator.next(), "/remote-config/rc-client-version")) {
                   uoc1 = 0;
                   break ;
                }
             }
          }
          if (set) {
             Object[] objArray = new Object[i];
             t37.a().getClass();
             ge6.l(objArray);
             p2.a(new kg0("8.8.80.328"));
          }
          TreeMap treeMap = p2.b();
          ArrayList uArrayList = new ArrayList(treeMap.size());
          iterator = treeMap.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             i oi = Context$ContextEntry.h();
             oi.c(uEntry.getKey());
             oi.d(uEntry.getValue());
             uArrayList.add(oi.build());
          }
          aw5 uoaw5 = ResolveRequest.i();
          uoaw5.e();
          y12 oy12 = Fetch.g();
          z12 a = z12.a;
          switch (p1.ordinal()){
              case 0:
              case 2:
              case 1:
                a = z12.b;
                break;
              case 3:
                a = z12.c;
                break;
              case 4:
                a = z12.t;
                break;
              case 5:
                a = z12.v;
                break;
              case 6:
                a = z12.w;
                break;
              default:
                throw new cd2(10);
          }
          oy12.c(a);
          c uoc = oy12.build();
          co5.l(uoc, "newBuilder\(\).also {\n    …D\n        }\n    }.build\(\)");
          uoaw5.d(uoc);
          h oh = Context.g();
          oh.c(uArrayList);
          uoaw5.c(oh);
          uoc1 = uoaw5.build();
          co5.l(uoc1, "newBuilder\(\)\n           …   \)\n            .build\(\)");
          return uoc1;
       }
       set = 1;
    }
}
