package p.te1;
import android.widget.AbsListView;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.Class;
import java.lang.reflect.AccessibleObject;
import java.lang.Throwable;

public abstract class te1	// class@002752 from classes.dex
{
    public static final Field a;

    static {
       Field declaredFiel;
       int i = 0;
       try{
          declaredFiel = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
          declaredFiel.setAccessible(true);
       }catch(java.lang.NoSuchFieldException e1){
          e1.printStackTrace();
       }
       te1.a = declaredFiel;
    }
}
