package p.jo;
import java.util.function.Function;
import p.ko;
import android.media.AudioManager$OnAudioFocusChangeListener;
import java.lang.Object;
import p.ho;
import java.lang.String;
import p.co5;
import p.io;

public final class jo implements Function	// class@001b1a from classes.dex
{
    public final ko a;
    public final int b;
    public final AudioManager$OnAudioFocusChangeListener c;

    public void jo(ko p0,AudioManager$OnAudioFocusChangeListener p1){
       this.a = p0;
       this.b = 1;
       this.c = p1;
       super();
    }
    public final Object apply(Object p0){
       co5.o(p0, "it");
       return new io(this.a, this.b, this.c, 0);
    }
}
