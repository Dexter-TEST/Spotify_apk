package com.spotify.litesignup.phonesignup.view.OtpInputView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.g86;
import android.graphics.Rect;
import android.view.View;
import android.content.ClipboardManager;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.litesignup.phonesignup.view.HiddenOtpEditText;
import p.i86;
import android.view.View$OnFocusChangeListener;
import android.text.TextWatcher;
import android.widget.TextView;
import p.a55;
import p.yp2;
import p.k86;
import android.widget.TextView$OnEditorActionListener;
import android.widget.HorizontalScrollView;
import java.util.regex.Pattern;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.lang.StringBuilder;
import android.widget.EditText;
import p.xe7;
import p.r00;
import p.b55;
import io.reactivex.rxjava3.core.Observable;
import p.c55;
import p.js7;
import android.view.View$OnClickListener;
import android.view.ActionMode$Callback;
import p.n6;

public final class OtpInputView extends FrameLayout	// class@00096f from classes.dex
{
    public final HiddenOtpEditText a;
    public final HorizontalScrollView b;
    public final ViewGroup c;
    public final Rect t;
    public TextView[] v;
    public r00 w;
    public final ClipboardManager x;
    public int y;
    public int z;
    public static final int A;

    public void OtpInputView(Context p0,AttributeSet p1){
       co5.o(p0, "context");
       super(p0, p1);
       g86 og86 = new g86(3, this);
       this.t = new Rect();
       LayoutInflater systemServic = this.getContext().getSystemService("clipboard");
       co5.j(systemServic, "null cannot be cast to non-null type android.content.ClipboardManager");
       this.x = systemServic;
       this.z = -1;
       systemServic = LayoutInflater.from(this.getContext());
       View view = systemServic.inflate(R.layout.otp_input_hidden, this, false);
       co5.j(view, "null cannot be cast to non-null type com.spotify.litesignup.phonesignup.view.HiddenOtpEditText");
       this.a = view;
       view.setOnFocusChangeListener(new i86(3, this));
       view.addTextChangedListener(og86);
       view.setOnDeleteListener(new a55(this));
       view.setOnEditorActionListener(new k86(1, new a55(this)));
       View view1 = systemServic.inflate(R.layout.otp_input_container, this, false);
       co5.j(view1, "null cannot be cast to non-null type android.widget.HorizontalScrollView");
       this.b = view1;
       View view2 = view1.findViewById(R.id.input_container);
       co5.l(view2, "scrollView.findViewById\(R.id.input_container\)");
       this.c = view2;
       this.addView(view);
       this.addView(view1);
    }
    public static boolean d(String p0){
       Pattern pattern = Pattern.compile("\\d");
       co5.l(pattern, "compile\(pattern\)");
       co5.o(p0, "input");
       return pattern.matcher(p0).matches();
    }
    private final int getFirstIncompleteDigit(){
       OtpInputView tv;
       object oobject;
       OtpInputView ty = this.y;
       int i = 0;
       while (true) {
          if (i >= ty) {
             return -1;
          }
          CharSequence text = ((tv = this.v) != null && (oobject = tv[i]) != null)? oobject.getText(): null;
          if (!OtpInputView.d(String.valueOf(text))) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return i;
    }
    private final String getOtpInternal(){
       String str = "";
       OtpInputView ty = this.y;
       for (int i = 0; i < ty; i = i + 1) {
          str = str.append(this.c(i));
       }
       str = str;
       co5.l(str, "s.toString\(\)");
       return str;
    }
    public final void a(int p0){
       OtpInputView tv;
       object oobject;
       object oobject1;
       Rect rect1;
       OtpInputView tz = this.z;
       OtpInputView ta = this.a;
       if (p0 == tz) {
          if (p0 >= 0 && this.isEnabled()) {
             xe7.a0(ta);
          }
          return;
       }else {
          boolean b = true;
          int i = (tz >= null)? 1: 0;
          Rect rect = null;
          if (i) {
             oobject = ((tv = this.v) != null)? tv[tz]: rect;
             if (oobject != null) {
                oobject.setActivated(false);
             }
          }
          if (p0 >= 0) {
             oobject = ((tz = this.v) != null)? tz[p0]: rect;
             if (oobject != null) {
                oobject.setActivated(b);
             }
          }
          this.z = p0;
          if (p0 >= 0) {
             xe7.a0(ta);
             if ((tz = this.v) != null && (oobject1 = tz[p0]) != null) {
                rect = this.t;
                rect.set(oobject1.getLeft(), oobject1.getTop(), oobject1.getRight(), oobject1.getBottom());
             }
             this.b.requestChildRectangleOnScreen(this.c, rect, false);
          }else {
             xe7.B(ta);
          }
          return;
       }
    }
    public final void b(){
       int firstIncompl;
       if (!this.isEnabled()) {
          return;
       }
       if ((firstIncompl = this.getFirstIncompleteDigit()) >= 0) {
          this.a(firstIncompl);
       }
       return;
    }
    public final String c(int p0){
       OtpInputView tv;
       object oobject;
       CharSequence text = ((tv = this.v) != null && (oobject = tv[p0]) != null)? oobject.getText(): null;
       return String.valueOf(text);
    }
    public final void e(int p0,String p1){
       OtpInputView tv;
       OtpInputView tz;
       int i = 1;
       int i1 = (this.y > null && this.getFirstIncompleteDigit() < 0)? 1: 0;
       object oobject = ((tv = this.v) != null)? tv[p0]: null;
       if (oobject != null) {
          oobject.setText(p1);
       }
       oobject = (this.y > null && this.getFirstIncompleteDigit() < 0)? 1: 0;
       if (i1 != oobject && !i1) {
          int i2 = ((tz = this.z) >= null)? 1: 0;
          if (!i2 || tz != (this.y - i)) {
             i = 0;
          }
          if (i) {
             this.a(-1);
          }
       }
       if ((tz = this.w) != null) {
          tz.accept(this.getOtpInternal());
       }
       return;
    }
    public final b55 getListener(){
       return null;
    }
    public final Observable getObservable(){
       OtpInputView tw;
       if (this.w == null) {
          this.w = new r00();
       }
       Observable observable = ((tw = this.w) != null)? tw.hide(): null;
       if (observable == null) {
          observable = Observable.empty();
          co5.l(observable, "empty\(\)");
       }
       return observable;
    }
    public final String getOtp(){
       int i = (this.y > null && this.getFirstIncompleteDigit() < 0)? 1: 0;
       String str = (!i)? null: this.getOtpInternal();
       return str;
    }
    public void setEnabled(boolean p0){
       OtpInputView tv;
       object oobject;
       super.setEnabled(p0);
       this.a.setEnabled(p0);
       if ((tv = this.v) != null) {
          int len = tv.length;
          int i = 0;
          while (i < len) {
             if ((oobject = tv[i]) != null) {
                oobject.setEnabled(p0);
             }
             i = i + 1;
          }
       }
       if (p0) {
          this.b();
       }else {
          this.a(-1);
       }
       return;
    }
    public final void setListener(b55 p0){
    }
    public final void setNumDigits(int p0){
       OtpInputView tv;
       if (this.y == p0) {
          return;
       }
       LayoutInflater layoutInflat = LayoutInflater.from(this.getContext());
       OtpInputView ty = this.y;
       for (int i = 0; i < ty; i = i + 1) {
          this.e(i, " ");
       }
       this.a(-1);
       ty = this.c;
       ty.removeAllViews();
       TextView[] textViewArra = new TextView[p0];
       this.v = textViewArra;
       c55 uoc55 = new c55(this);
       int i1 = 0;
       while (i1 < p0) {
          View view = layoutInflat.inflate(R.layout.otp_input_field, ty, false);
          co5.j(view, "null cannot be cast to non-null type android.widget.TextView");
          view.setActivated(false);
          view.setText(" ");
          view.setOnClickListener(new js7(i1, 1, this));
          view.setTextIsSelectable(1);
          view.setCursorVisible(false);
          view.setCustomSelectionActionModeCallback(uoc55);
          ty.addView(view);
          if ((tv = this.v) != null) {
             tv[i1] = view;
          }
          i1 = i1 + 1;
       }
       this.y = p0;
       return;
    }
    public final void setOtp(String p0){
       co5.o(p0, "code");
       int i = p0.length();
       OtpInputView ty = this.y;
       for (int i1 = 0; i1 < ty; i1 = i1 + 1) {
          String str = (i1 < i)? String.valueOf(p0.charAt(i1)): " ";
          this.e(i1, str);
       }
       return;
    }
    public final void setOtpMismatch(boolean p0){
       int i;
       OtpInputView tv;
       object oobject;
       if (p0) {
          i = 0x7f050933;
       }else {
          int i2 = 0x7f070085;
          i = 0x7f050b4a;
       }
       if ((tv = this.v) != null) {
          int len = tv.length;
          int i1 = 0;
          while (i1 < len) {
             if ((oobject = tv[i1]) != null) {
                oobject.setTextColor(n6.b(this.getContext(), i));
             }
             if (oobject != null) {
                oobject.setBackgroundResource(R.drawable.bg_otp_input_field_mismatch);
             }
             i1 = i1 + 1;
          }
       }
       return;
    }
}
