package p.nj1;
import android.widget.EditText;
import java.lang.Object;
import p.mj1;
import java.lang.NullPointerException;
import java.lang.String;

public final class nj1	// class@001fea from classes.dex
{
    public final mj1 a;

    public void nj1(EditText p0){
       super();
       if (p0 == null) {
          throw new NullPointerException("editText cannot be null");
       }
       this.a = new mj1(p0);
       return;
    }
}
