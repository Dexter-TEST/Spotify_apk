package p.k8;
import android.view.View$OnClickListener;
import java.lang.Object;
import android.view.View;
import p.vm3;
import p.ab3;
import p.wo3;
import com.spotify.liteinstrumentation.instrumentation.events.proto.LiteInteraction;
import java.lang.String;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.tu1;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import p.co5;
import p.ae4;
import android.widget.TextView;
import p.zj6;
import p.wf2;
import android.os.Bundle;
import p.p46;
import android.os.Parcelable;
import com.spotify.allboarding.allboardingimpl.presentation.error.ErrorFragment;
import p.eb3;
import p.l85;
import p.im1;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import android.text.method.TransformationMethod;
import android.text.method.PasswordTransformationMethod;
import com.google.android.material.internal.CheckableImageButton;
import android.content.res.ColorStateList;
import p.df1;
import android.widget.AutoCompleteTextView;
import p.ig0;
import android.text.Editable;
import p.k24;
import p.h50;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.e;
import p.l64;
import p.q8;
import android.os.Message;
import android.os.Handler;
import com.spotify.litelyrics.lyrics.widget.LyricsWidgetPresenter;
import p.ad6;
import android.widget.LinearLayout;
import java.lang.Class;

public final class k8 implements View$OnClickListener	// class@001bc9 from classes.dex
{
    public final int a;
    public final Object b;

    public void k8(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void onClick(View p0){
       Toolbar g0;
       k24 v;
       Editable text;
       im1 a;
       EditText editText;
       vm3 a1;
       wo3 owo3;
       Intent intent;
       LyricsWidgetPresenter l;
       int i = 0;
       String str = "android.intent.action.VIEW";
       l64 ol64 = null;
       k8 tb = this.b;
       switch (this.a){
           case 0:
             tb.w.obtainMessage(1, tb.b).sendToTarget();
             return;
           case 1:
             if ((g0 = tb.g0) != null) {
                ol64 = g0.b;
             }
             if (ol64 != null) {
                ol64.collapseActionView();
             }
             return;
             break;
           case 2:
             if (tb.A != null && tb.isShowing()) {
                if (tb.C == null) {
                   int[] ointArray = new int[]{0x101035b};
                   TypedArray typedArray = tb.getContext().obtainStyledAttributes(ointArray);
                   tb.B = typedArray.getBoolean(i, 1);
                   typedArray.recycle();
                   tb.C = true;
                }
                if (tb.B != null) {
                   tb.cancel();
                }
             }
             return;
             break;
           case 3:
             if ((v = tb.v) == 2) {
                tb.v(1);
             }else if(v == 1){
                tb.v(2);
             }
             return;
             break;
           case 4:
             if ((text = tb.a.getEditText().getText()) != null) {
                text.clear();
             }
             a = tb.a;
             a.k(a.z0, a.B0);
             return;
             break;
           case 5:
             df1.d(tb, tb.a.getEditText());
             return;
           case 6:
             if ((editText = tb.a.getEditText()) != null) {
                i = editText.getSelectionEnd();
                if (l85.d(tb)) {
                   editText.setTransformationMethod(ol64);
                }else {
                   editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (i >= 0) {
                   editText.setSelection(i);
                }
                a = tb.a;
                a.k(a.z0, a.B0);
             }
             return;
             break;
           case 7:
             Bundle uBundle = new Bundle();
             uBundle.putParcelable("ALLBOARDING_SCREEN_RESPONSE", new p46(i, 3));
             eb3.y(uBundle, tb);
             return;
           case 8:
             tb.a.invoke();
             return;
           case 9:
             tb.i.setMaxLines(Integer.MAX_VALUE);
             tb.j.setVisibility(8);
             return;
           case 10:
             if ((a1 = tb.a) != null) {
                owo3 = LiteInteraction.l();
                owo3.f("lite/blocking-dialog");
                owo3.h("spotify:blocking-dialog");
                owo3.g("market://details?id=com.spotify.music");
                owo3.d("hit");
                owo3.c("navigate-forward");
                owo3.e("spotify_music_button");
                a1.a.a(owo3.build());
                intent = new Intent(str);
                intent.setData(Uri.parse("https://spotify-web.app.link/e/4aT9TwJBJvb"));
                tb.startActivity(intent);
                return;
             }else {
                co5.N("mEventSender");
                throw ol64;
             }
             break;
           default:
             if ((l = tb.L) != null) {
                Intent i1 = new Intent(str);
                i1.setData(Uri.parse("https://spotify-web.app.link/e/vFBvhUlkrCb"));
                l.a.getContext().startActivity(i1);
                l = tb.B;
                l.getClass();
                owo3 = LiteInteraction.l();
                owo3.f("lite/now-playing-view");
                owo3.h("spotify:now-playing-view");
                owo3.g("market://details?id=com.spotify.music");
                owo3.d("hit");
                owo3.c("navigate-forward");
                owo3.e("spotify_music_button");
                l.a.a(owo3.build());
                return;
             }else {
                co5.N("views");
                throw ol64;
             }
       }
    }
}
