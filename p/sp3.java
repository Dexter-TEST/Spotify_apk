package p.sp3;
import android.view.View$OnFocusChangeListener;
import com.spotify.litecomponents.widgets.view.LiteSearchView;
import p.lp6;
import java.lang.Object;
import android.view.View;
import android.text.Editable;
import android.widget.EditText;
import java.lang.CharSequence;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public final class sp3 implements View$OnFocusChangeListener	// class@002673 from classes.dex
{
    public final LiteSearchView a;
    public final lp6 b;

    public void sp3(LiteSearchView p0,lp6 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void onFocusChange(View p0,boolean p1){
       sp3 ta = this.a;
       if (!ta.A0.getText().length() && !p1) {
          ta.B0.setImageDrawable(this.b);
       }else {
          ta.B0.setImageDrawable(ta.C0);
       }
       return;
    }
}
