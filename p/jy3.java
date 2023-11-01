package p.jy3;
import p.ng2;
import p.gh2;
import java.lang.Object;
import com.spotify.lyrics.core.ui.LyricsRecyclerView;
import java.lang.Class;
import java.lang.String;
import java.lang.Number;
import p.ba0;
import java.lang.Long;
import java.lang.Integer;
import p.jc7;

public final class jy3 extends gh2 implements ng2	// class@001b6b from classes.dex
{

    public void jy3(Object p0){
       super(2, p0, LyricsRecyclerView.class, "onLineClick", "onLineClick\(JI\)V");
    }
    public final Object b(Object p0,Object p1){
       Number number = p0.longValue();
       int i = p1.intValue();
       if ((p1 = this.b.a1) != null) {
          p1.b(Long.valueOf(number), Integer.valueOf(i));
       }
       return jc7.a;
    }
}
