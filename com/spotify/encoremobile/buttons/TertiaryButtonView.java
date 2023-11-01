package com.spotify.encoremobile.buttons.TertiaryButtonView;
import p.l5;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.s17;
import android.view.View;
import java.lang.Enum;
import android.content.res.ColorStateList;
import p.n6;
import android.widget.TextView;

public final class TertiaryButtonView extends l5	// class@000897 from classes.dex
{
    public final int A;
    public final int B;
    public final int C;
    public final int z;

    public void TertiaryButtonView(Context p0,AttributeSet p1){
       co5.o(p0, "context");
       super(p0, p1, 0, 0x7f130001);
       this.z = -1;
       this.A = 0x7f070606;
       this.B = -1;
       this.C = 0x7f050479;
       this.k();
    }
    public int getActionButtonBackground$src_main_java_com_spotify_encoremobile_buttons_buttons_kt(){
       return this.A;
    }
    public int getBtnTintList$src_main_java_com_spotify_encoremobile_buttons_buttons_kt(){
       return this.z;
    }
    public int getTextColorAttr$src_main_java_com_spotify_encoremobile_buttons_buttons_kt(){
       return this.B;
    }
    public int getTextTintList$src_main_java_com_spotify_encoremobile_buttons_buttons_kt(){
       return this.C;
    }
    public final void setTextColor(s17 p0){
       int i;
       co5.o(p0, "textColor");
       Context context = this.getContext();
       if ((i = p0.ordinal()) != 1) {
          i = (i != 2)? this.getTextTintList$src_main_java_com_spotify_encoremobile_buttons_buttons_kt(): 0x7f050478;
       }else {
          i = 0x7f05047a;
       }
       this.setTextColor(n6.c(context, i));
       return;
    }
}
