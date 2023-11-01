package p.nf1;
import p.b5;
import p.of1;
import java.lang.Object;
import java.lang.String;
import p.hs3;
import p.lf1;
import java.util.Map;
import java.util.LinkedHashMap;
import java.io.FileOutputStream;
import android.content.Context;
import com.spotify.eventsender.droppedevents.proto.EventCounters;
import java.io.OutputStream;
import com.google.protobuf.a;
import java.io.Closeable;
import java.lang.Throwable;
import p.eb3;

public final class nf1 implements b5	// class@001fc6 from classes.dex
{
    public final int a;
    public final of1 b;

    public void nf1(of1 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void run(){
       nf1 tb = this.b;
       switch (this.a){
           case 0:
           default:
             of1 a = tb.a;
             LinkedHashMap linkedHashMa = a.g(a.f);
             if ((linkedHashMa.isEmpty() ^ 0x01)) {
                FileOutputStream uFileOutputS = a.a.openFileOutput("ESDrop", 0);
                lf1.c(linkedHashMa).writeTo(uFileOutputS);
                eb3.d(uFileOutputS, null);
             }
             return;
       }
       tb.b.a("Dropped events sync completed");
       return;
    }
}
