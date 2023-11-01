package p.zg;
import android.view.DragEvent;
import android.widget.TextView;
import android.app.Activity;
import p.v3;
import java.lang.CharSequence;
import android.text.Spannable;
import android.text.Selection;
import p.uv1;
import android.content.ClipData;
import p.tr0;
import p.wr0;
import android.view.View;
import p.wh7;

public abstract class zg	// class@002ef4 from classes.dex
{

    public static boolean a(DragEvent p0,TextView p1,Activity p2){
       p2.n(p2, p0);
       p1.beginBatchEdit();
       Selection.setSelection(p1.getText(), p1.getOffsetForPosition(p0.getX(), p0.getY()));
       wh7.j(p1, new uv1(p0.getClipData(), 3).b.build());
       p1.endBatchEdit();
       return true;
    }
    public static boolean b(DragEvent p0,View p1,Activity p2){
       p2.n(p2, p0);
       wh7.j(p1, new uv1(p0.getClipData(), 3).b.build());
       return true;
    }
}
