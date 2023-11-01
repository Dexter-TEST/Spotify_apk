package p.xa;
import p.je2;
import p.aw1;
import java.lang.Object;
import android.os.Bundle;
import java.lang.String;
import p.co5;
import android.os.Parcelable;
import p.r46;
import p.lg4;
import p.zf2;

public final class xa implements je2	// class@002c3f from classes.dex
{
    public final aw1 a;

    public void xa(aw1 p0){
       this.a = p0;
       super();
    }
    public final void a(Bundle p0,String p1){
       r46 parcelable;
       co5.o(p1, "requestKey");
       if (p1.hashCode() != -198424014) {
       }else {
          String str = "ALLBOARDING_SCREEN_RESPONSE";
          if (p1.equals(str) && (parcelable = p0.getParcelable(str)) != null) {
             xa ta = this.a;
             ta.a.k();
             ta.c.invoke(parcelable);
          }
       }
       return;
    }
}
