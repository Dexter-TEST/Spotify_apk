package com.spotify.legacyglue.gluelib.components.trackcloud.TrackCloudTextView;
import p.hm1;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import p.bc2;
import androidx.appcompat.widget.AppCompatTextView;
import p.vf2;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.text.Layout;
import android.view.View;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import java.lang.Object;
import p.n6;
import android.text.style.ForegroundColorSpan;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.List;

class TrackCloudTextView extends hm1	// class@0008ef from classes.dex
{
    public vf2 y;

    public void TrackCloudTextView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
       bc2.a(this, p0);
    }
    public final void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int i3;
       super.onLayout(p0, p1, p2, p3, p4);
       TrackCloudTextView ty = this.y;
       vf2 h = ty.h;
       vf2 c = ty.c;
       p2 = this.getLineCount();
       p3 = p2 - 1;
       int i = 1;
       int i1 = 0;
       p2 = (!TextUtils.isEmpty(h) && (p2 > 0 && this.getLayout().getEllipsisCount(p3) > 0))? 1: 0;
       if (p2) {
          SpannableString spannableStr = vf2.b(this.getContext());
          SpannableString spannableStr1 = new SpannableString(h);
          int i2 = 33;
          if (c != null) {
             spannableStr1.setSpan(new StyleSpan(i), i1, spannableStr1.length(), i2);
          }else {
             spannableStr1.setSpan(new ForegroundColorSpan(n6.b(this.getContext(), R.color.gray_70)), i1, spannableStr1.length(), i2);
          }
          SpannableStringBuilder spannableStr2 = new SpannableStringBuilder(this.getText());
          if ((i3 = (this.getLayout().getLineEnd(p3) - this.getLayout().getEllipsisCount(p3)) - (h.length() + spannableStr.length())) >= 0) {
             spannableStr2.delete(i3, spannableStr2.length());
             i3 = spannableStr2.length();
             TrackCloudTextView ty1 = this.y;
             i = 0;
             while (true) {
                vf2 a = ty1.a;
                if (i1 < a.size()) {
                   int i4 = (ty1.b == null && i1 <= 0)? i: ty1.g.get(i1).length() + i;
                   if ((i2 = a.get(i1).length() + i4) < i3) {
                      i1 = i1 + 1;
                      i = i2;
                   }else {
                      break ;
                   }
                }else {
                   break ;
                }
             }
             spannableStr2.delete(i, i3);
             spannableStr2.append(spannableStr);
             spannableStr2.append(spannableStr1);
          }
          this.setText(spannableStr2);
       }
       return;
    }
}
