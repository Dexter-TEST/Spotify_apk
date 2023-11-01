package p.ho;
import android.media.AudioManager$OnAudioFocusChangeListener;
import java.lang.String;
import p.kg4;
import java.lang.Object;
import p.co5;
import p.en6;
import java.lang.StringBuilder;

public final class ho	// class@001894 from classes.dex
{
    public final int a;
    public final AudioManager$OnAudioFocusChangeListener b;

    public void ho(AudioManager$OnAudioFocusChangeListener p0){
       kg4.t(1, "user");
       super();
       this.a = 1;
       this.b = p0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof ho) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       ho tb;
       int i = en6.A(this.a) * 31;
       int i1 = ((tb = this.b) == null)? 0: tb.hashCode();
       return (i + i1);
    }
    public final String toString(){
       return "AudioFocusCallbacksKey\(user="+en6.C(this.a)+", audioFocusChangeListener="+this.b+')';
    }
}
