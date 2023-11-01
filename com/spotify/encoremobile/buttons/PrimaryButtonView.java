package com.spotify.encoremobile.buttons.PrimaryButtonView;
import p.l5;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import p.co5;

public final class PrimaryButtonView extends l5	// class@000896 from classes.dex
{
    public final int A;
    public final int B;
    public final int C;
    public final int z;

    public void PrimaryButtonView(Context p0,AttributeSet p1){
       co5.o(p0, "context");
       super(p0, p1, 0, 0x7f130001);
       this.z = 0x7f050473;
       this.A = 0x7f070060;
       this.B = 0x7f03062b;
       this.C = -1;
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
}
