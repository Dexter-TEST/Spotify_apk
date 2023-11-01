package p.r24;
import p.ce5;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.lang.String;
import android.os.BaseBundle;
import android.os.Parcelable;
import p.tp2;
import p.o90;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.view.ContextThemeWrapper;
import android.content.Context;

public final class r24 extends ce5	// class@002462 from classes.dex
{
    public int b;
    public o90 c;

    public void r24(){
       super();
    }
    public final void onCreate(Bundle p0){
       super.onCreate(p0);
       if (p0 == null) {
          p0 = this.getArguments();
       }
       this.b = p0.getInt("THEME_RES_ID_KEY");
       tp2.r(p0.getParcelable("DATE_SELECTOR_KEY"));
       this.c = p0.getParcelable("CALENDAR_CONSTRAINTS_KEY");
       return;
    }
    public final View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p0.cloneInContext(new ContextThemeWrapper(this.getContext(), this.b));
       throw null;
    }
    public final void onSaveInstanceState(Bundle p0){
       p0.putInt("THEME_RES_ID_KEY", this.b);
       p0.putParcelable("DATE_SELECTOR_KEY", null);
       p0.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.c);
    }
}
