package p.i61;
import android.content.DialogInterface$OnClickListener;
import org.json.JSONObject;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.String;
import p.is7;

public final class i61 implements DialogInterface$OnClickListener	// class@001930 from classes.dex
{
    public final int a;
    public final JSONObject b;

    public void i61(JSONObject p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void onClick(DialogInterface p0,int p1){
       i61 tb = this.b;
       switch (this.a){
           case 0:
           default:
             is7.b(is7.a("g", tb));
             return;
       }
       is7.b(is7.a("r", tb));
       return;
    }
}
