package p.sj5;
import android.widget.TextView$OnEditorActionListener;
import java.lang.Object;
import android.widget.TextView;
import android.view.KeyEvent;
import android.view.View$OnClickListener;
import com.spotify.messaging.inappmessagingsdk.preview.views.PreviewSubmissionView;
import android.view.View;
import p.yy;
import java.lang.Class;
import java.util.concurrent.CopyOnWriteArraySet;
import com.spotify.search.view.BackKeyEditText;
import android.text.Editable;
import p.pg;
import java.lang.String;
import java.lang.CharSequence;
import java.util.Iterator;
import p.d76;

public final class sj5 implements TextView$OnEditorActionListener	// class@00263f from classes.dex
{
    public final int a;
    public final Object b;

    public void sj5(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final boolean onEditorAction(TextView p0,int p1,KeyEvent p2){
       Editable text;
       boolean b = false;
       sj5 tb = this.b;
       switch (this.a){
           case 0:
             if (p1 == 2 && tb != null) {
                tb.onClick(p0);
                b = true;
             }
             break;
           default:
             tb.getClass();
             int i = (p1 == 3)? 1: 0;
             p1 = (!p1 && (p2 != null && !p2.getAction()))? 1: 0;
             Iterator iterator = (!i && !p1)? 0: 1;
             if (i) {
                yy a = tb.a;
                if (a.isEmpty()) {
                   a = 0;
                }else if((text = tb.a().getText()) != null){
                   text.toString();
                }
                iterator = a.iterator();
                while (iterator.hasNext()) {
                   iterator.next().d();
                }
                iterator = 1;
                if (a) {
                   b = true;
                }
             }
             return b;
       }
       return b;
    }
}
