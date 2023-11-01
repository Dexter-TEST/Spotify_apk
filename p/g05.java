package p.g05;
import androidx.fragment.app.f;
import android.os.Bundle;
import android.app.Dialog;
import androidx.fragment.app.Fragment;
import android.content.Context;
import java.lang.String;
import android.os.BaseBundle;
import java.lang.Class;
import java.lang.Object;
import java.lang.CharSequence;
import p.tj2;
import p.xe7;
import p.d05;
import p.kf6;
import p.lj2;

public class g05 extends f	// class@001674 from classes.dex
{
    public static final int H;

    public void g05(){
       super();
    }
    public final Dialog x(Bundle p0){
       p0 = this.requireArguments();
       String str = p0.getString("title");
       str.getClass();
       String str1 = p0.getString("body");
       str1.getClass();
       tj2 otj2 = xe7.k0(this.requireContext(), str, str1);
       otj2.a = p0.getString("positiveButton");
       otj2.c = new d05(this, p0, 0);
       otj2.b = p0.getString("negativeButton");
       otj2.d = new d05(this, p0, 1);
       return otj2.a().c;
    }
}
