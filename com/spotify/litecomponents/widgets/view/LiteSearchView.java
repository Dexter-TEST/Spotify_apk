package com.spotify.litecomponents.widgets.view.LiteSearchView;
import androidx.appcompat.widget.SearchView;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import android.view.View;
import android.view.ViewGroup;
import p.wh7;
import android.widget.EditText;
import android.widget.ImageView;
import android.content.res.ColorStateList;
import p.n6;
import p.lp6;
import p.sp6;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import p.uw5;
import p.eb3;
import p.ce1;
import p.sp3;
import android.view.View$OnFocusChangeListener;
import p.mj5;
import p.oj5;
import java.util.Collection;
import java.lang.Object;
import java.util.Collections;

public class LiteSearchView extends SearchView	// class@000928 from classes.dex
{
    public EditText A0;
    public ImageView B0;
    public Drawable C0;

    public void LiteSearchView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public TextView getSearchEditText(){
       return this.A0;
    }
    public View getSearchIconView(){
       return this.B0;
    }
    public final void onFinishInflate(){
       super.onFinishInflate();
       this.A0 = wh7.m(this, R.id.search_src_text);
       this.B0 = wh7.m(this, R.id.search_mag_icon);
       ImageView imageView = wh7.m(this, R.id.search_close_btn);
       wh7.m(this, R.id.search_plate).setBackgroundColor(0);
       ColorStateList uColorStateL = n6.c(this.getContext(), R.color.action_white);
       lp6 olp6 = new lp6(this.getContext(), sp6.g0, (float)this.getResources().getDimensionPixelSize(R.dimen.toolbar_icon_size));
       olp6.c(uColorStateL);
       lp6 olp61 = new lp6(this.getContext(), sp6.q0, (float)this.getResources().getDimensionPixelSize(R.dimen.toolbar_icon_size));
       olp61.c(uColorStateL);
       Drawable uDrawable = eb3.L(uw5.m(this.getContext(), 0x101030b));
       this.C0 = uDrawable;
       ce1.h(uDrawable, uColorStateL);
       imageView.setImageDrawable(olp61);
       imageView.setBackgroundResource(0x106000d);
       this.B0.setImageDrawable(olp6);
       this.A0.setOnFocusChangeListener(new sp3(this, olp6));
       mj5 omj5 = oj5.a(this.B0);
       View[] viewArray = new View[]{this.B0};
       Collections.addAll(omj5.d, viewArray);
       omj5.a();
       omj5 = oj5.a(imageView);
       View[] viewArray1 = new View[]{imageView};
       Collections.addAll(omj5.d, viewArray1);
       omj5.a();
    }
}
