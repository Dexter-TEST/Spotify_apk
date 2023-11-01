package com.spotify.search.view.ToolbarSearchFieldView;
import android.widget.FrameLayout;
import p.h67;
import p.i67;
import android.content.Context;
import android.util.AttributeSet;
import p.j67;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import p.wh7;
import com.spotify.search.view.BackKeyEditText;
import android.widget.ImageButton;
import android.widget.Button;
import p.lp6;
import p.sp6;
import android.content.res.Resources;
import p.n6;
import p.mj5;
import p.oj5;
import java.util.Collection;
import java.lang.Object;
import java.util.Collections;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import p.xj0;
import android.content.res.Resources$Theme;
import p.ry7;
import android.content.res.TypedArray;
import p.p56;
import p.dh7;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.widget.TextView;
import p.v27;
import p.l67;
import p.g67;
import android.view.View$OnClickListener;
import p.up0;
import p.qw;
import p.m67;
import p.n67;

public class ToolbarSearchFieldView extends FrameLayout	// class@000c00 from classes.dex
{
    public n67 A;
    public m67 B;
    public l67 C;
    public int D;
    public int E;
    public int a;
    public int b;
    public final View c;
    public final BackKeyEditText t;
    public final ImageButton v;
    public final ImageButton w;
    public final Button x;
    public final View y;
    public j67 z;
    public static final h67 F;
    public static final i67 G;

    static {
       ToolbarSearchFieldView.F = new h67();
       ToolbarSearchFieldView.G = new i67();
    }
    public void ToolbarSearchFieldView(Context p0,AttributeSet p1){
       Context uContext = p0;
       AttributeSet uAttributeSe = p1;
       super(uContext, uAttributeSe, 0);
       this.z = j67.b;
       this.A = ToolbarSearchFieldView.F;
       this.B = ToolbarSearchFieldView.G;
       LayoutInflater.from(p0).inflate(R.layout.search_toolbar, this, true);
       View view = wh7.m(this, R.id.search_field_root);
       this.c = view;
       BackKeyEditText uBackKeyEdit = wh7.m(this, R.id.query);
       this.t = uBackKeyEdit;
       ImageButton imageButton = wh7.m(this, R.id.search_right_button);
       this.v = imageButton;
       Button uButton = wh7.m(this, R.id.search_placeholder);
       this.x = uButton;
       this.y = wh7.m(this, R.id.search_field);
       new lp6(uContext, sp6.C, (float)p0.getResources().getDimensionPixelSize(R.dimen.actionbar_search_drawables_size)).b(n6.b(uContext, R.color.white));
       lp6 olp6 = new lp6(uContext, sp6.q0, (float)p0.getResources().getDimensionPixelSize(R.dimen.actionbar_search_drawables_size));
       olp6.b(n6.b(uContext, R.color.white));
       ImageButton imageButton1 = wh7.m(this, R.id.cancel_button);
       this.w = imageButton1;
       mj5 omj5 = oj5.a(imageButton1);
       View[] viewArray = new View[true];
       viewArray[0] = imageButton1;
       Collections.addAll(omj5.d, viewArray);
       omj5.a();
       lp6 omj51 = new lp6(uContext, sp6.y, (float)p0.getResources().getDimensionPixelSize(R.dimen.actionbar_search_drawables_size));
       omj51.b(n6.b(uContext, R.color.white));
       imageButton1.setImageDrawable(omj51);
       int i = xj0.e0(8.00f, p0.getResources());
       TypedArray typedArray = p0.getTheme().obtainStyledAttributes(uAttributeSe, ry7.H, 0, 0);
       this.D = i;
       this.E = i;
       this.E = typedArray.getDimensionPixelSize(3, i);
       this.D = typedArray.getDimensionPixelSize(2, i);
       p56 op56 = new p56(this.D, this.E, typedArray.getDimensionPixelOffset(0, xj0.e0(4.00f, p0.getResources())), typedArray.getColor(true, n6.b(uContext, R.color.gray_30)));
       typedArray.recycle();
       dh7.q(view, op56);
       mj5 lp6 omj52 = oj5.a(uButton);
       View[] viewArray1 = new View[true];
       viewArray1[0] = uButton;
       Collections.addAll(omj52.c, viewArray1);
       omj52.a();
       omj52 = new lp6(uContext, sp6.f0, (float)p0.getResources().getDimensionPixelSize(R.dimen.actionbar_search_drawables_size));
       omj52.b(n6.b(uContext, R.color.white));
       this.b = imageButton.getLayoutParams().rightMargin;
       this.z = j67.a;
       imageButton.setImageDrawable(olp6);
       imageButton.setVisibility(8);
       v27.g(uButton, omj52, null, null, null);
       this.C = new l67(this, op56, uButton, this.getSearchField());
       imageButton.setOnClickListener(new g67(this, 0));
       imageButton1.setOnClickListener(new g67(this, true));
       uBackKeyEdit.setBackKeyListener(new up0(18, this));
       g67 og67 = new g67(this, 2);
       view.setOnClickListener(og67);
       uButton.setOnClickListener(og67);
    }
    public View getCancelButton(){
       return this.w;
    }
    public j67 getCurrentDrawableState(){
       return this.z;
    }
    public int getInsetX(){
       return this.D;
    }
    public int getInsetY(){
       return this.E;
    }
    public BackKeyEditText getQueryEditText(){
       return this.t;
    }
    public View getRightButton(){
       return this.v;
    }
    public View getSearchField(){
       return this.y;
    }
    public Button getSearchPlaceHolder(){
       return this.x;
    }
    public void setRightButtonVisible(boolean p0){
       int i = (p0)? 0: 4;
       this.v.setVisibility(i);
       return;
    }
    public void setToolbarSearchFieldCallbacks(m67 p0){
       this.B = ry7.r(p0, ToolbarSearchFieldView.G);
    }
    public void setToolbarSearchFieldRightButtonListener(n67 p0){
       this.A = ry7.r(p0, ToolbarSearchFieldView.F);
    }
}
