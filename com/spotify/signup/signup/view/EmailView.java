package com.spotify.signup.signup.view.EmailView;
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
import p.ri1;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import android.content.res.Resources;
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

public class EmailView extends LinearLayout implements xo0	// class@000c2f from classes.dex
{
    public EditText a;
    public Drawable b;
    public Drawable c;
    public TextView t;
    public vi1 v;
    public static final int w;

    public void EmailView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.setOrientation(1);
       View.inflate(p0, R.layout.email_contents, this);
       this.a = this.findViewById(R.id.sign_up_email);
       this.t = this.findViewById(R.id.sign_up_email_message);
       this.c = os0.b(this.getContext(), R.drawable.bg_signup_text_field_white);
       this.b = os0.b(this.getContext(), R.drawable.bg_signup_text_field_error);
    }
    public static void a(EmailView p0,ri1 p1){
       p0.getClass();
       p0.setEmailError(p1.a);
    }
    public static void b(EmailView p0){
       p0.setEmailError(p0.getEmailErrorStringResource());
    }
    private String getEmailErrorStringResource(){
       return this.getResources().getString(R.string.email_format_error);
    }
    private void setEmailError(String p0){
       TextFormUiUtil.clearAllDrawables(this.a);
       dh7.q(this.a, this.b);
       this.t.setText(p0);
    }
    public final ap0 d(hr0 p0){
       zi1 ozi1 = new zi1(p0);
       this.a.addTextChangedListener(ozi1);
       this.a.setOnFocusChangeListener(new xi1(p0, 0));
       return new in7(this, 7, ozi1);
    }
    public void setNextListener(Runnable p0){
       if (p0 == null) {
          this.a.setOnEditorActionListener(null);
       }else {
          this.a.setOnEditorActionListener(new wi1(0, p0));
       }
       return;
    }
}
