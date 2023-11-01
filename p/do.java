package p.do;
import java.lang.Runnable;
import p.qo5;
import java.lang.Object;
import p.eo;
import p.bo;
import p.ko;
import java.lang.Class;
import p.ho;
import android.media.AudioManager$OnAudioFocusChangeListener;
import java.util.concurrent.ConcurrentHashMap;
import p.go;
import android.media.AudioManager;
import android.os.Build$VERSION;
import p.fo;
import com.spotify.messages.AudioManagerProxyEvent;
import java.lang.String;
import p.io2;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.tu1;
import java.lang.Integer;
import p.ao;
import p.ob2;
import java.lang.Boolean;
import android.os.Handler;

public final class do implements Runnable	// class@00138a from classes.dex
{
    public final int a;
    public final qo5 b;

    public void do(qo5 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void run(){
       qo5 a;
       AudioManager$OnAudioFocusChangeListener onAudioFocus;
       do tb = this.b;
       switch (this.a){
           case 0:
             a = tb.a;
             a.getClass();
             if ((onAudioFocus = a.c.remove(new ho(tb.b))) != null) {
                a.b.a();
                a.a.abandonAudioFocus(onAudioFocus);
             }
             break;
           default:
             a = tb.a;
             qo5 b = tb.b;
             a.getClass();
             int i = 1;
             if (Build$VERSION.SDK_INT < 26) {
                ko b1 = a.b;
                b1.getClass();
                fo uofo = AudioManagerProxyEvent.o();
                uofo.e("android-audio-focus");
                uofo.j("REQUEST_AUDIO_FOCUS");
                uofo.i(io2.d(a.a.requestAudioFocus(a.a(b), 3, i)));
                uofo.h(io2.c(i));
                uofo.k("STREAM_MUSIC");
                b1.a.a(uofo.build());
             }else {
                ao uoao = new ao(Integer.valueOf(2), Integer.valueOf(i));
                if (b == null) {
                   b = 0;
                }
                ob2 b2 = new ob2(1, null, uoao, b, null, null, 0);
                a.b(b);
             }
             return;
       }
       return;
    }
}
