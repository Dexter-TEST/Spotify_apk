package p.h37;
import p.k25;
import java.lang.Object;
import android.view.View;
import p.wr0;
import java.lang.String;
import android.util.Log;
import java.util.Objects;
import p.vr0;
import android.content.ClipData;
import android.widget.TextView;
import java.lang.CharSequence;
import android.text.Editable;
import android.content.Context;
import android.content.ClipData$Item;
import android.text.Spanned;
import android.text.Selection;
import java.lang.Math;
import android.text.Spannable;

public final class h37 implements k25	// class@0017d6 from classes.dex
{

    public void h37(){
       super();
    }
    public final wr0 a(View p0,wr0 p1){
       int i2;
       CharSequence uCharSequenc;
       if (Log.isLoggable("ReceiveContent", 3)) {
          Objects.toString(p1);
       }
       if (p1.a.m() == 2) {
          return p1;
       }else {
          p1 = p1.a;
          ClipData uClipData = p1.c();
          TextView flags = p1.getFlags();
          Editable text = p0.getText();
          Context context = p0.getContext();
          int i = 0;
          int i1 = 0;
          while (i < uClipData.getItemCount()) {
             ClipData$Item itemAt = uClipData.getItemAt(i);
             if (i2 = flags & 0x01) {
                uCharSequenc = itemAt.coerceToText(context);
                if (uCharSequenc instanceof Spanned) {
                   uCharSequenc = uCharSequenc.toString();
                }
             }else {
                uCharSequenc = itemAt.coerceToStyledText(context);
             }
             if (uCharSequenc != null) {
                if (!i1) {
                   i1 = Selection.getSelectionStart(text);
                   i2 = Selection.getSelectionEnd(text);
                   i1 = Math.max(0, Math.max(i1, i2));
                   Selection.setSelection(text, i1);
                   text.replace(Math.max(0, Math.min(i1, i2)), i1, uCharSequenc);
                   i1 = 1;
                }else {
                   text.insert(Selection.getSelectionEnd(text), "\n");
                   text.insert(Selection.getSelectionEnd(text), uCharSequenc);
                }
             }
             i = i + 1;
          }
          return null;
       }
    }
}
