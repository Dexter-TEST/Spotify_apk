package p.tm6;
import p.wf2;
import p.gh2;
import java.lang.Object;
import com.spotify.messages.EventSenderStats2NonAuth;
import java.lang.Class;
import java.lang.String;
import p.rv;
import java.util.List;
import p.ba0;
import p.ac3;

public final class tm6 extends gh2 implements wf2	// class@00279f from classes.dex
{
    public final int z;

    public void tm6(int p0,Object p1){
       this.z = p0;
       switch (p0){
           case 1:
             super(0, p1, rv.class, "infoText", "infoText\(\)Ljava/lang/String;");
             return;
           case 2:
             super(0, p1, EventSenderStats2NonAuth.class, "getStatesListEnteredCountsTotalList", "getStatesListEnteredCountsTotalList\(\)Ljava/util/List;");
             return;
           case 3:
             super(0, p1, EventSenderStats2NonAuth.class, "getStatesListRejectedClientCountsTotalList", "getStatesListRejectedClientCountsTotalList\(\)Ljava/util/List;");
             return;
           case 4:
             super(0, p1, EventSenderStats2NonAuth.class, "getStatesListDroppedCountsTotalList", "getStatesListDroppedCountsTotalList\(\)Ljava/util/List;");
             return;
           case 5:
             super(0, p1, EventSenderStats2NonAuth.class, "getStatesListPersistedCountsTotalList", "getStatesListPersistedCountsTotalList\(\)Ljava/util/List;");
             return;
           case 6:
             super(0, p1, EventSenderStats2NonAuth.class, "getStatesListRejectedBackendCountsTotalList", "getStatesListRejectedBackendCountsTotalList\(\)Ljava/util/List;");
             return;
           case 7:
             super(0, p1, EventSenderStats2NonAuth.class, "getStatesListDeliveredCountsTotalList", "getStatesListDeliveredCountsTotalList\(\)Ljava/util/List;");
             return;
           case 8:
             super(0, p1, EventSenderStats2NonAuth.class, "getStatesListDeletedCountsTotalList", "getStatesListDeletedCountsTotalList\(\)Ljava/util/List;");
             return;
           default:
             super(0, p1, rv.class, "actionText", "actionText\(\)Ljava/lang/String;");
             return;
       }
    }
    public final List g(){
       ba0 tb = this.b;
       switch (this.z){
           case 2:
             return tb.L();
           case 3:
             return tb.Q();
           case 4:
             return tb.K();
           case 5:
             return tb.O();
           case 6:
             return tb.P();
           case 7:
             return tb.J();
           default:
             return tb.I();
       }
    }
    public final Object invoke(){
       rv c;
       ba0 tb = this.b;
       tm6 tz = this.z;
       switch (tz){
           case 0:
             switch (tz){
                 case 0:
                   c = tb.c;
                   break;
                 default:
                   c = tb.a;
             }
             return c;
             break;
           case 1:
             switch (tz){
                 case 0:
                   c = tb.c;
                   break;
                 default:
                   c = tb.a;
             }
             return c;
             break;
           case 2:
             return this.g();
           case 3:
             return this.g();
           case 4:
             return this.g();
           case 5:
             return this.g();
           case 6:
             return this.g();
           case 7:
             return this.g();
           default:
             return this.g();
       }
    }
}
