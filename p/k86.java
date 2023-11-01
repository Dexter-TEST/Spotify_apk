package p.k86;
import android.widget.TextView$OnEditorActionListener;
import java.lang.Object;
import android.widget.TextView;
import android.view.KeyEvent;
import androidx.appcompat.widget.SearchView;
import p.a55;
import p.b55;
import com.spotify.litesignup.phonesignup.view.OtpInputView;

public final class k86 implements TextView$OnEditorActionListener	// class@001bc7 from classes.dex
{
    public final int a;
    public final Object b;

    public void k86(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final boolean onEditorAction(TextView p0,int p1,KeyEvent p2){
       k86 tb = this.b;
       boolean b = true;
       switch (this.a){
           case 0:
           default:
             int i = (p2 != null && p2.getKeyCode() == 66)? 1: 0;
             p1 = (p1 == 6)? 1: 0;
             if (!i && !p1) {
                b = false;
             }else {
                tb.a.getListener();
             }
             return b;
       }
       tb.q();
       return b;
    }
}
