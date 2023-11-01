package p.c55;
import android.view.ActionMode$Callback;
import com.spotify.litesignup.phonesignup.view.OtpInputView;
import java.lang.Object;
import java.lang.String;
import android.content.ClipboardManager;
import android.content.ClipData;
import android.content.ClipData$Item;
import java.lang.CharSequence;
import android.view.ActionMode;
import android.view.MenuItem;
import p.co5;
import android.view.Menu;

public final class c55 implements ActionMode$Callback	// class@00119e from classes.dex
{
    public final OtpInputView a;

    public void c55(OtpInputView p0){
       this.a = p0;
       super();
    }
    public final String a(){
       ClipData$Item itemAt;
       c55 ta = this.a;
       String str = null;
       if (!ta.x.hasPrimaryClip()) {
          return str;
       }
       ClipData primaryClip = ta.x.getPrimaryClip();
       int i = 0;
       CharSequence text = (primaryClip != null && (itemAt = primaryClip.getItemAt(i)) != null)? itemAt.getText(): str;
       String str1 = String.valueOf(text);
       if (str1.length() != ta.y) {
          return str;
       }else {
          int i1 = str1.length();
          int i2 = 1;
          for (; i < i1; i = i + 1) {
             i2 = i2 & OtpInputView.d(String.valueOf(str1.charAt(i)));
          }
          if (i2) {
             str = str1;
          }
          return str;
       }
    }
    public final boolean onActionItemClicked(ActionMode p0,MenuItem p1){
       co5.o(p0, "mode");
       co5.o(p1, "item");
       String str = this.a();
       int i = 0;
       if (str == null) {
          return i;
       }
       c55 ta = this.a;
       ta.a((ta.y - 1));
       OtpInputView y = ta.y;
       for (; i < y; i++) {
          ta.e(i, String.valueOf(str.charAt(i)));
       }
       return 1;
    }
    public final boolean onCreateActionMode(ActionMode p0,Menu p1){
       co5.o(p0, "mode");
       co5.o(p1, "menu");
       if (this.a() == null) {
          return false;
       }
       p1.clear();
       p1.add(0x104000b);
       return true;
    }
    public final void onDestroyActionMode(ActionMode p0){
       co5.o(p0, "mode");
    }
    public final boolean onPrepareActionMode(ActionMode p0,Menu p1){
       co5.o(p0, "mode");
       co5.o(p1, "menu");
       return false;
    }
}
