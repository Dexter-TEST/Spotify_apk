package p.c95;
import p.k95;
import android.widget.Button;
import java.lang.String;
import java.lang.Class;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.spotify.legacyglue.widgetstate.StateListAnimatorButton;

public final class c95 extends k95	// class@0011c2 from classes.dex
{

    public void c95(){
       super("BUTTON", 1, Button.class);
    }
    public final View a(Context p0,AttributeSet p1,int p2){
       return new StateListAnimatorButton(p0, p1, p2);
    }
    public final int b(){
       return 0x7f0304a8;
    }
}
