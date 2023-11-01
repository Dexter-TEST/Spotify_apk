package p.zi1;
import android.text.TextWatcher;
import p.hr0;
import java.lang.Object;
import java.lang.CharSequence;
import java.lang.String;
import p.gi1;
import p.z75;
import android.text.Editable;

public final class zi1 implements TextWatcher	// class@002eff from classes.dex
{
    public final int a;
    public final hr0 b;

    public void zi1(hr0 p0){
       this.a = 0;
       this.b = p0;
       super();
    }
    public void zi1(hr0 p0,int p1){
       this.a = 1;
       this.b = p0;
       super();
    }
    public final void a(CharSequence p0){
       zi1 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.accept(new z75(p0.toString()));
             return;
       }
       tb.accept(new gi1(p0.toString()));
       return;
    }
    public final void afterTextChanged(Editable p0){
    }
    public final void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
    public final void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       switch (this.a){
           case 0:
           default:
             this.a(p0);
             return;
       }
       this.a(p0);
       return;
    }
}
