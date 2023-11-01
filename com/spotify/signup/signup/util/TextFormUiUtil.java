package com.spotify.signup.signup.util.TextFormUiUtil;
import java.lang.Object;
import android.content.Context;
import android.widget.TextView;
import java.lang.CharSequence;
import java.lang.String;
import android.graphics.drawable.Drawable;
import p.eb3;
import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import java.lang.Character;

public final class TextFormUiUtil	// class@000c2d from classes.dex
{

    private void TextFormUiUtil(){
       super();
    }
    public static void addCheckboxTextDrawableRight(Context p0,TextView p1){
       boolean b;
       boolean b1 = (b = TextFormUiUtil.rtl(p1.getText().toString()))? TextFormUiUtil.isTextViewDrawableLeftVisible(p1): TextFormUiUtil.isTextViewDrawableRightVisible(p1);
       if (!b1) {
          Drawable uDrawable = eb3.m(p0, R.drawable.avd_show_checkmark);
          if (b) {
             p1.setCompoundDrawablesWithIntrinsicBounds(uDrawable, null, null, null);
          }else {
             p1.setCompoundDrawablesWithIntrinsicBounds(null, null, uDrawable, null);
          }
          if (uDrawable instanceof Animatable) {
             uDrawable.start();
          }
       }
       return;
    }
    public static void clearAllDrawables(TextView p0){
       p0.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
    }
    private static boolean isTextViewDrawableLeftVisible(TextView p0){
       int i = 0;
       if (p0.getCompoundDrawables()[i] != null) {
          i = true;
       }
       return i;
    }
    private static boolean isTextViewDrawableRightVisible(TextView p0){
       boolean b = (p0.getCompoundDrawables()[2] != null)? true: false;
       return b;
    }
    public static boolean rtl(String p0){
       byte directionali;
       boolean b = false;
       if (TextUtils.isEmpty(p0)) {
          return b;
       }
       if ((directionali = Character.getDirectionality(p0.charAt(b))) == 6 || (directionali == 2 || directionali == 1)) {
          b = true;
       }
       return b;
    }
}
