package p.hm1;
import com.google.android.material.textview.MaterialTextView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.widget.TextView;
import p.ry7;

public class hm1 extends MaterialTextView	// class@00187b from classes.dex
{

    public void hm1(Context p0,AttributeSet p1,int p2){
       co5.o(p0, "context");
       super(p0, p1, p2);
       ry7.b(this, p1, p2);
    }
    public final void setTextAppearance(Context p0,int p1){
       co5.o(p0, "context");
       super.setTextAppearance(p0, p1);
       ry7.a(this, p1);
    }
}
