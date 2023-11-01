package com.spotify.encoreconsumermobile.elements.chipbutton.ChipButtonView;
import com.spotify.legacyglue.widgetstate.StateListAnimatorButton;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import p.n6;
import android.graphics.drawable.Drawable;
import p.os0;
import android.content.res.Resources;
import android.widget.TextView;

public final class ChipButtonView extends StateListAnimatorButton	// class@000894 from classes.dex
{

    public void ChipButtonView(Context p0,AttributeSet p1){
       co5.o(p0, "context");
       super(p0, p1, 0);
       this.setLayoutParams(new ViewGroup$LayoutParams(-2, -2));
       this.setBackground(os0.b(p0, R.drawable.chip_button_background));
       this.setPadding((int)this.getResources().getDimension(R.dimen.chip_button_horizontal_padding), (int)this.getResources().getDimension(R.dimen.chip_button_vertical_padding), (int)this.getResources().getDimension(R.dimen.chip_button_horizontal_padding), (int)this.getResources().getDimension(R.dimen.chip_button_vertical_padding));
       this.setGravity(17);
       this.setTextColor(n6.b(p0, R.color.white));
    }
}
