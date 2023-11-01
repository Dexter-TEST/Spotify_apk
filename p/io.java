package p.io;
import android.media.AudioManager$OnAudioFocusChangeListener;
import p.ko;
import java.lang.Object;
import p.go;

public final class io implements AudioManager$OnAudioFocusChangeListener	// class@0019d7 from classes.dex
{
    public final int a;
    public final ko b;
    public final int c;
    public final AudioManager$OnAudioFocusChangeListener d;

    public void io(ko p0,int p1,AudioManager$OnAudioFocusChangeListener p2,int p3){
       this.a = p3;
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void onAudioFocusChange(int p0){
       io td = this.d;
       io tc = this.c;
       io tb = this.b;
       switch (this.a){
           case 0:
             tb.b.b(p0, tc);
             if (td != null) {
                td.onAudioFocusChange(p0);
             }
             break;
           default:
             tb.b.b(p0, tc);
             if (td != null) {
                td.onAudioFocusChange(p0);
             }
             return;
       }
       return;
    }
}
