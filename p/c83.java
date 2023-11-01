package p.c83;
import p.ir0;
import com.spotify.litesettings.settings.InAppMessagingDebugActivity;
import androidx.appcompat.widget.SwitchCompat;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.widget.CompoundButton;
import p.d83;
import android.view.KeyEvent$Callback;

public final class c83 implements ir0	// class@0011b7 from classes.dex
{
    public final int a;
    public final InAppMessagingDebugActivity b;
    public final SwitchCompat c;

    public void c83(InAppMessagingDebugActivity p0,SwitchCompat p1,int p2){
       this.a = p2;
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void accept(Object p0){
       c83 tc = this.c;
       c83 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.getClass();
             tc.setOnCheckedChangeListener(null);
             tc.setChecked(p0.booleanValue());
             tc.setOnCheckedChangeListener(new d83(tb, 0));
             return;
       }
       tb.getClass();
       tc.setOnCheckedChangeListener(null);
       tc.setChecked(p0.booleanValue());
       tc.setOnCheckedChangeListener(new d83(tb, 1));
       return;
    }
}
