package p.go;
import p.tu1;
import java.lang.Object;
import java.lang.String;
import p.kg4;
import p.fo;
import com.spotify.messages.AudioManagerProxyEvent;
import p.en6;
import com.google.protobuf.c;
import com.google.protobuf.b;
import java.lang.StringBuilder;

public final class go	// class@00174e from classes.dex
{
    public final tu1 a;

    public void go(tu1 p0){
       super();
       this.a = p0;
    }
    public final void a(){
       kg4.t(1, "user");
       fo uofo = AudioManagerProxyEvent.o();
       uofo.e(en6.c(1));
       uofo.j("ABANDON_AUDIO_FOCUS");
       this.a.a(uofo.build());
    }
    public final void b(int p0,int p1){
       String str;
       kg4.t(p1, "user");
       fo uofo = AudioManagerProxyEvent.o();
       uofo.e(en6.c(p1));
       uofo.j("FOCUS_CHANGED");
       if (p0 != -3) {
          if (p0 != -2) {
             if (p0 != -1) {
                str = (p0 != 1)? "UNKNOWN\("+p0+')': "AUDIOFOCUS_GAIN";
             }else {
                str = "AUDIOFOCUS_LOSS";
             }
          }else {
             str = "AUDIOFOCUS_LOSS_TRANSIENT";
          }
       }else {
          str = "AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK";
       }
       uofo.g(str);
       this.a.a(uofo.build());
       return;
    }
}
