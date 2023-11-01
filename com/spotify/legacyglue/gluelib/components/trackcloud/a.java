package com.spotify.legacyglue.gluelib.components.trackcloud.a;
import p.zk2;
import android.content.Context;
import android.view.ViewGroup;
import java.lang.Object;
import p.vf2;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.spotify.legacyglue.gluelib.components.trackcloud.TrackCloudTextView;
import p.mj5;
import p.oj5;
import java.util.Collection;
import java.util.Collections;
import p.b77;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.List;
import java.lang.Math;
import p.n6;
import java.util.Iterator;
import p.a77;
import android.text.SpannableString;
import java.lang.StringBuilder;
import java.lang.String;
import p.hr7;
import java.lang.CharSequence;
import android.text.style.ForegroundColorSpan;
import p.en6;
import p.lp6;
import p.sp6;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import android.text.TextUtils;

public final class a implements zk2	// class@0008f0 from classes.dex
{
    public final TrackCloudTextView a;
    public final TextView b;
    public final ViewGroup c;
    public final vf2 t;

    public void a(Context p0,ViewGroup p1){
       super();
       this.t = new vf2();
       ViewGroup viewGroup = LayoutInflater.from(p0).inflate(R.layout.solar_track_cloud, p1, false);
       this.c = viewGroup;
       TextView textView = viewGroup.findViewById(R.id.title);
       this.b = textView;
       TrackCloudTextView trackCloudTe = viewGroup.findViewById(R.id.track_cloud);
       this.a = trackCloudTe;
       mj5 omj5 = oj5.c(viewGroup);
       View[] viewArray = new View[]{textView,trackCloudTe};
       Collections.addAll(omj5.c, viewArray);
       omj5.a();
    }
    public final void a(b77 p0){
       String str;
       a77 d1;
       int i7;
       int i8;
       String str1;
       SpannableString spannableStr1;
       int i9;
       int i10;
       a uoa = this;
       b77 uob77 = p0;
       a t = uoa.t;
       vf2 e = t.e;
       e.clear();
       e.clearSpans();
       t.b = uob77.g;
       t.h = uob77.b;
       t.c = true;
       t.d = uob77.c;
       int i = (uob77.i != null)? 0x800003: 17;
       a a = uoa.a;
       a.setGravity(i);
       vf2 a1 = t.a;
       a1.clear();
       Context context = a.getContext();
       b77 d = uob77.d;
       int i1 = n6.b(context, R.color.gray_70);
       int i2 = n6.b(context, R.color.white);
       lp6 int i3 = n6.b(context, R.color.gray_30);
       Iterator iterator = d.subList(0, Math.min(uob77.h, d.size())).iterator();
       while (true) {
          str = "  ";
          if (iterator.hasNext()) {
             a77 uoa77 = iterator.next();
             int i4 = ((d1 = uoa77.d) != null)? i1: i3;
             Iterator iterator1 = iterator;
             int i5 = (d1 != null)? i2: i3;
             SpannableStringBuilder spannableStr = new SpannableStringBuilder();
             int i6 = i1;
             if (uob77.e != null) {
                i7 = i2;
                i8 = i3;
                str1 = str;
                spannableStr1 = new SpannableString(hr7.a("", uoa77.b, ' '));
                spannableStr1.setSpan(new ForegroundColorSpan(i5), 0, spannableStr1.length(), 33);
                spannableStr.append(spannableStr1);
             }else {
                i7 = i2;
                i8 = i3;
                str1 = str;
             }
             a77 c = uoa77.c;
             str = (uob77.f != null && c != null)? str1: "";
             spannableStr1 = new SpannableString(en6.r(str).append(uoa77.a).toString());
             if (uob77.f != null && c != null) {
                i2 = (int)a.getTextSize();
                i3 = new lp6(context, sp6.Q, (float)i2);
                i3.b(i4);
                i9 = 0;
                i3.setBounds(i9, i9, i2, i2);
                i10 = 1;
                ImageSpan imageSpan = new ImageSpan(i3, i10);
                spannableStr1.setSpan(imageSpan, i9, i10, 18);
             }else {
                i9 = 0;
             }
             spannableStr1.setSpan(new ForegroundColorSpan(i4), i9, spannableStr1.length(), 33);
             spannableStr.append(spannableStr1);
             a1.add(spannableStr);
             iterator = iterator1;
             i1 = i6;
             i2 = i7;
             i3 = i8;
          }else {
             break ;
          }
       }
       str1 = str;
       int i11 = a1.size();
       vf2 g = t.g;
       g.clear();
       Context context1 = a.getContext();
       i2 = 0;
       while (i2 < i11) {
          if (t.b != null) {
             i3 = n6.b(context1, R.color.white);
             StringBuilder str2 = "";
             str = (!i2)? "": str1;
             i10 = i2 + 1;
             str2 = str2.append(str).append(i10);
             SpannableString spannableStr2 = new SpannableString(str2.append(". ").toString());
             spannableStr2.setSpan(new ForegroundColorSpan(i3), 0, spannableStr2.length(), 17);
             g.add(spannableStr2);
          }else {
             g.add(vf2.b(context1));
          }
          i2 = i2 + 1;
       }
       for (i11 = 0; i11 < a1.size(); i11 = i11 + 1) {
          if (uob77.g != null || i11 > 0) {
             e.append(g.get(i11));
          }
          e.append(a1.get(i11));
       }
       a.y = t;
       a.setMaxLines(t.d);
       a.setText(t.e);
       a b = uoa.b;
       b.setText(uob77.a);
       int i12 = ((TextUtils.isEmpty(uob77.a) ^ 0x01))? 0: 8;
       b.setVisibility(i12);
       int i13 = (uob77.i != null)? 0x800003: 17;
       b.setGravity(i13);
       return;
    }
    public final View getView(){
       return this.c;
    }
}
