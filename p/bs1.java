package p.bs1;
import p.b05;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.bc3;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.Iterable;
import p.aj0;
import java.util.Iterator;
import com.spotify.offline_esperanto.proto.EsOffline$ContextInfo;
import com.spotify.playerlimited.player.models.OfflineTracksResource;
import com.spotify.offline_esperanto.proto.EsOffline$Context;
import com.spotify.playerlimited.player.models.OfflineResource;
import p.iq1;
import java.lang.Enum;
import p.cd2;
import com.spotify.offline_esperanto.proto.EsOffline$Item;
import p.mq1;
import p.yr1;

public final class bs1	// class@001124 from classes.dex
{
    public final b05 a;

    public void bs1(b05 p0){
       co5.o(p0, "client");
       super();
       this.a = p0;
    }
    public static final ArrayList a(bs1 p0,bc3 p1){
       String str;
       ArrayList uArrayList1;
       String str1;
       p0.getClass();
       ArrayList uArrayList = new ArrayList(aj0.b0(p1));
       Iterator iterator = p1.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return uArrayList;
          }
          EsOffline$ContextInfo uContextInfo = iterator.next();
          OfflineTracksResource offlineTrack = new OfflineTracksResource();
          offlineTrack.a = uContextInfo.f().h();
          switch (uContextInfo.f().g().ordinal()){
              case 0:
              case 2:
              case 5:
                str = "waiting";
             label_0051 :
                offlineTrack.b = str;
                bc3 uobc3 = uContextInfo.g();
                co5.l(uobc3, "contextInfo.itemsList");
                uArrayList1 = new ArrayList(aj0.b0(uobc3));
                Iterator iterator1 = uobc3.iterator();
                while (true) {
                   if (iterator1.hasNext()) {
                      EsOffline$Item item = iterator1.next();
                      co5.l(item, "it");
                      OfflineResource offlineResou = new OfflineResource();
                      switch (yr1.a[item.f().ordinal()]){
                          case 0xffffffff:
                          case 1:
                          case 2:
                          case 3:
                            str1 = "no";
                            break;
                          case 4:
                            str1 = "yes";
                            break;
                          case 5:
                            str1 = "downloading";
                            break;
                          case 6:
                          case 8:
                          case 7:
                            str1 = "waiting";
                            break;
                          case 9:
                            str1 = "yes_expired";
                            break;
                          default:
                            throw new cd2(10);
                      }
                      offlineResou.b = str1;
                      offlineResou.a = item.g();
                      uArrayList1.add(offlineResou);
                   }
                }
                break;
              case 1:
              case 6:
                str = "no";
                goto label_0051 ;
                break;
              case 3:
                str = "yes";
                goto label_0051 ;
                break;
              case 4:
                str = "downloading";
                goto label_0051 ;
                break;
              default:
                throw new cd2(10);
          }
          offlineTrack.c = uArrayList1;
          uArrayList.add(offlineTrack);
       }
    }
}
