package com.spotify.signup.signup.view.BirthdayView;
import p.xo0;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.lang.Class;
import java.lang.Object;
import p.n6;
import android.graphics.drawable.Drawable;
import p.os0;
import p.hr0;
import p.ap0;
import p.qd5;
import android.view.View$OnClickListener;
import p.wy3;

public class BirthdayView extends LinearLayout implements xo0	// class@000c2e from classes.dex
{
    public TextView a;
    public TextView b;
    public Drawable c;
    public Drawable t;
    public static final int v;

    public void BirthdayView(Context p0,AttributeSet p1){
       super(p0, p1);
       View.inflate(this.getContext(), R.layout.birthday_contents, this);
       TextView textView = this.findViewById(R.id.sign_up_age_text);
       textView.getClass();
       this.a = textView;
       textView = this.findViewById(R.id.sign_up_age_error_message);
       textView.getClass();
       this.b = textView;
       this.c = os0.b(this.getContext(), R.drawable.bg_signup_text_field_white);
       this.t = os0.b(this.getContext(), R.drawable.bg_signup_text_field_error);
    }
    public final ap0 d(hr0 p0){
       this.a.setOnClickListener(new qd5(p0, 3));
       return new wy3(this, 1);
    }
}
