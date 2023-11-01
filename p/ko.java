package p.ko;
import p.eo;
import android.media.AudioManager;
import p.go;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import android.media.AudioManager$OnAudioFocusChangeListener;
import p.ho;
import android.os.Build$VERSION;
import p.jo;
import p.v3;
import java.lang.String;
import p.co5;
import p.io;
import p.ob2;
import p.kg4;
import android.media.AudioFocusRequest;
import p.lo;
import p.p3;
import java.lang.Class;
import p.fo;
import com.spotify.messages.AudioManagerProxyEvent;
import p.en6;
import p.io2;
import p.ao;
import java.lang.Number;
import java.lang.StringBuilder;
import java.lang.Boolean;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.tu1;

public final class ko implements eo	// class@001c56 from classes.dex
{
    public final AudioManager a;
    public final go b;
    public final ConcurrentHashMap c;

    public void ko(AudioManager p0,go p1){
       super();
       this.a = p0;
       this.b = p1;
       ConcurrentHashMap uConcurrentH = new ConcurrentHashMap();
       this.c = new ConcurrentHashMap();
    }
    public final AudioManager$OnAudioFocusChangeListener a(AudioManager$OnAudioFocusChangeListener p0){
       io oio;
       ho oho = new ho(p0);
       ko tc = this.c;
       v3 ov3 = 24;
       if (Build$VERSION.SDK_INT >= ov3) {
          p0 = ov3.l(tc, oho, new jo(this, p0));
          co5.l(p0, "private fun getOrCreateO…        }\n        }\n    }");
          return p0;
       }else if((oio = tc.get(oho)) == null){
          oio = new io(this, 1, p0, 1);
          if ((p0 = tc.putIfAbsent(oho, oio)) != null) {
             oio = p0;
          }
       }
       return oio;
    }
    public final int b(ob2 p0){
       ob2 t;
       ao a;
       int i2;
       String str;
       String str1;
       co5.o(p0, "audioFocusRequest");
       int i = 1;
       kg4.t(i, "user");
       int i1 = p3.B(this.a, lo.a(p0, this.a(p0.v)));
       ko tb = this.b;
       tb.getClass();
       fo uofo = AudioManagerProxyEvent.o();
       uofo.e(en6.c(i));
       uofo.j("REQUEST_AUDIO_FOCUS");
       uofo.i(io2.d(i1));
       uofo.h(io2.c(p0.b));
       if ((t = p0.t) != null && (a = t.a) != null) {
          if ((i2 = a.intValue()) != i) {
             str = (i2 != 2)? "UNKNOWN\("+i2+')': "CONTENT_TYPE_MUSIC";
          }else {
             str = "CONTENT_TYPE_SPEECH";
          }
          uofo.f(str);
       }
       if ((t = p0.t) != null && (a = t.b) != null) {
          if ((i2 = a.intValue()) != i) {
             str1 = (i2 != 4)? "UNKNOWN\("+i2+')': "USAGE_ALARM";
          }else {
             str1 = "USAGE_MEDIA";
          }
          uofo.d(str1);
       }
       if ((p0 = p0.c) != null) {
          uofo.c(p0.booleanValue());
       }
       tb.a.a(uofo.build());
       return i1;
    }
}
