package p.wy3;
import p.ap0;
import p.xo0;
import java.lang.Object;
import p.t10;
import com.spotify.signup.signup.view.BirthdayView;
import java.lang.Class;
import p.a;
import android.content.Context;
import android.view.View;
import java.util.Calendar;
import java.lang.String;
import android.text.format.DateUtils;
import java.lang.CharSequence;
import android.widget.TextView;
import p.wh7;
import android.graphics.drawable.Drawable;
import p.dh7;
import p.vy3;
import p.co5;
import p.xy3;
import p.ay6;
import p.ne4;
import p.e;
import com.spotify.signup.signup.view.GenderView;
import android.view.View$OnClickListener;

public final class wy3 implements ap0	// class@002bce from classes.dex
{
    public final int a;
    public final xo0 b;

    public void wy3(xo0 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       a a;
       int i = 0;
       wy3 tb = this.b;
       switch (this.a){
           case 0:
           case 1:
             tb.getClass();
             if ((a = p0.a) != null) {
                tb.a.setText(DateUtils.formatDateTime(tb.getContext(), a.getTimeInMillis(), 0x20000));
             }
             if (p0.b == null && p0.a != null) {
                dh7.q(tb.a, tb.t);
                tb.b.setText(R.string.choose_username_too_young);
                tb.b.setVisibility(i);
             }else {
                dh7.q(tb.a, tb.c);
                tb.b.setVisibility(4);
             }
             return;
             break;
           default:
             if (!tb.c.getVisibility() && p0.b == null) {
                tb.c.setVisibility(8);
             }else if(tb.c.getVisibility() == 8 && p0.b != null){
                tb.c.setVisibility(i);
             }
             if (!tb.v.getVisibility() && p0.c == null) {
                tb.v.setVisibility(8);
             }else if(tb.v.getVisibility() == 8 && p0.c != null){
                tb.v.setVisibility(i);
             }
             if (!tb.t.getVisibility() && p0.t == null) {
                tb.t.setVisibility(8);
             }else if(tb.t.getVisibility() == 8 && p0.t != null){
                tb.t.setVisibility(i);
             }
             if (p0.v != null) {
                tb.a.setEnabled(i);
                tb.b.setEnabled(i);
                tb.c.setEnabled(i);
                tb.v.setEnabled(i);
                tb.t.setEnabled(i);
                tb.w.setVisibility(i);
             }else {
                tb.a.setEnabled(true);
                tb.b.setEnabled(true);
                tb.c.setEnabled(true);
                tb.v.setEnabled(true);
                tb.t.setEnabled(true);
                tb.w.setVisibility(8);
             }
             return;
       }
       co5.o(p0, "model");
       tb.x.getValue().k(p0);
       return;
    }
    public final void dispose(){
       switch (this.a){
           case 1:
           default:
             return;
       }
       this.b.a.setOnClickListener(null);
       return;
    }
}
