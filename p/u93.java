package p.u93;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputConnection;
import p.up0;
import java.lang.String;
import android.os.Bundle;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.net.Uri;
import android.content.ClipDescription;
import android.os.BaseBundle;
import p.g54;

public final class u93 extends InputConnectionWrapper	// class@002869 from classes.dex
{
    public final up0 a;

    public void u93(InputConnection p0,up0 p1){
       this.a = p1;
       super(p0, false);
    }
    public final boolean performPrivateCommand(String p0,Bundle p1){
       Bundle parcelable4;
       u93 ta = this.a;
       int i = 0;
       if (p1 == null) {
       }else if(TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", p0)){
          int i1 = 0;
       }else if(TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", p0)){
          parcelable4 = 1;
       }
       String str = (i1)? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER": "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
       ResultReceiver parcelable = p1.getParcelable(str);
       String str1 = (i1)? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI": "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
       Uri parcelable1 = p1.getParcelable(str1);
       String str2 = (i1)? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION": "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
       ClipDescription parcelable2 = p1.getParcelable(str2);
       String str3 = (i1)? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI": "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
       Uri parcelable3 = p1.getParcelable(str3);
       String str4 = (i1)? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS": "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
       int intx = p1.getInt(str4);
       String str5 = (i1)? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS": "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
       parcelable4 = p1.getParcelable(str5);
       if (parcelable1 != null && parcelable2 != null) {
          i = ta.d(new g54(parcelable1, parcelable2, parcelable3), intx, parcelable4);
       }
       if (parcelable != null) {
          parcelable.send(i, null);
       }
       if (i) {
          return true;
       }else {
          return super.performPrivateCommand(p0, p1);
       }
    }
}
