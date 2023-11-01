package p.u85;
import p.k95;
import androidx.appcompat.widget.SwitchCompat;
import java.lang.String;
import java.lang.Class;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public final class u85 extends k95	// class@002862 from classes.dex
{

    public void u85(){
       super("SWITCHCOMPAT_VIEW", 12, SwitchCompat.class);
    }
    public final View a(Context p0,AttributeSet p1,int p2){
       return new SwitchCompat(p0, p1, p2);
    }
    public final int b(){
       return 0x7f0304b0;
    }
}
