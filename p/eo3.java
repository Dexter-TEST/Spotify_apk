package p.eo3;
import java.lang.Object;
import java.lang.String;
import p.x33;
import android.os.Bundle;
import android.os.BaseBundle;
import androidx.fragment.app.Fragment;

public final class eo3	// class@0014c7 from classes.dex
{

    public void eo3(){
       super();
    }
    public static x33 a(String p0){
       x33 ox33 = new x33();
       Bundle uBundle = new Bundle();
       uBundle.putString("spotify.fragment.argument.URI", p0);
       ox33.setArguments(uBundle);
       return ox33;
    }
}
