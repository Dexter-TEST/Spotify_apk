package com.spotify.signup.signup.view.PasswordView;
import p.xo0;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import p.n6;
import android.graphics.drawable.Drawable;
import p.os0;
import p.f85;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import com.spotify.signup.signup.util.TextFormUiUtil;
import p.wh7;
import p.dh7;
import java.lang.CharSequence;
import p.hr0;
import p.ap0;
import p.zi1;
import android.text.TextWatcher;
import p.xi1;
import android.view.View$OnFocusChangeListener;
import p.in7;
import java.lang.Runnable;
import android.widget.TextView$OnEditorActionListener;
import p.wi1;

public class PasswordView extends LinearLayout implements xo0	// class@000c31 from classes.dex
{
    public EditText a;
    public Drawable b;
    public Drawable c;
    public TextView t;
    public k85 v;
    public static final int w;

    public void PasswordView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.setOrientation(1);
       View.inflate(p0, R.layout.password_contents, this);
       this.a = this.findViewById(R.id.sign_up_password);
       this.t = this.findViewById(R.id.sign_up_password_message);
       this.c = os0.b(this.getContext(), R.drawable.bg_signup_text_field_white);
       this.b = os0.b(this.getContext(), R.drawable.bg_signup_text_field_error);
    }
    public static void a(PasswordView p0){
       p0.setPasswordError(R.string.password_error_short);
    }
    public static void b(PasswordView p0,f85 p1){
       p0.getClass();
       p0.setPasswordError(p1.a);
    }
    private void setPasswordError(int p0){
       TextFormUiUtil.clearAllDrawables(this.a);
       dh7.q(this.a, this.b);
       this.t.setVisibility(0);
       this.t.setText(p0);
    }
    private void setPasswordError(String p0){
       TextFormUiUtil.clearAllDrawables(this.a);
       dh7.q(this.a, this.b);
       this.t.setVisibility(0);
       this.t.setText(p0);
    }
    public final ap0 d(hr0 p0){
       zi1 ozi1 = new zi1(p0, 0);
       this.a.addTextChangedListener(ozi1);
       this.a.setOnFocusChangeListener(new xi1(p0, 1));
       return new in7(this, 8, ozi1);
    }
    public void setNextListener(Runnable p0){
       if (p0 == null) {
          this.a.setOnEditorActionListener(null);
       }else {
          this.a.setOnEditorActionListener(new wi1(1, p0));
       }
       return;
    }
}
