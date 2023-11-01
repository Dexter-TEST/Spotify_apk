package p.t93;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputConnection;
import p.up0;
import android.view.inputmethod.InputContentInfo;
import android.os.Bundle;
import android.os.Build$VERSION;
import p.g54;
import p.v93;
import java.lang.Object;

public final class t93 extends InputConnectionWrapper	// class@002726 from classes.dex
{
    public final up0 a;

    public void t93(InputConnection p0,up0 p1){
       this.a = p1;
       super(p0, false);
    }
    public final boolean commitContent(InputContentInfo p0,int p1,Bundle p2){
       g54 og54 = null;
       if (p0 == null) {
       }else if(Build$VERSION.SDK_INT < 25){
          og54 = new g54(new v93(p0));
       }
       if (this.a.d(og54, p1, p2)) {
          return true;
       }else {
          return super.commitContent(p0, p1, p2);
       }
    }
}
