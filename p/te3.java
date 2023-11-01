package p.te3;
import p.z83;
import p.ij4;
import java.lang.Throwable;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.String;
import p.ox7;
import p.co5;

public final class te3 implements z83	// class@002754 from classes.dex
{
    private Object _exceptionsHolder;
    private int _isCompleting;
    private Object _rootCause;
    public final ij4 a;

    public void te3(ij4 p0,Throwable p1){
       super();
       this.a = p0;
       this._isCompleting = 0;
       this._rootCause = p1;
       this._exceptionsHolder = null;
    }
    public final void a(Throwable p0){
       te3 t_rootCause;
       if ((t_rootCause = this._rootCause) == null) {
          this._rootCause = p0;
          return;
       }else if(p0 == t_rootCause){
          return;
       }else if((t_rootCause = this._exceptionsHolder) == null){
          this._exceptionsHolder = p0;
       }else if(t_rootCause instanceof Throwable){
          if (p0 == t_rootCause) {
             return;
          }else {
             ArrayList uArrayList = new ArrayList(4);
             uArrayList.add(t_rootCause);
             uArrayList.add(p0);
             this._exceptionsHolder = uArrayList;
          }
       }else if(t_rootCause instanceof ArrayList){
          t_rootCause.add(p0);
       }else {
          throw new IllegalStateException("State is "+t_rootCause.toString());
       }
       return;
    }
    public final boolean b(){
       boolean b = (this._rootCause == null)? true: false;
       return b;
    }
    public final ij4 c(){
       return this.a;
    }
    public final Throwable d(){
       return this._rootCause;
    }
    public final boolean e(){
       boolean b = (this._rootCause != null)? true: false;
       return b;
    }
    public final boolean f(){
       return this._isCompleting;
    }
    public final boolean g(){
       boolean b = (this._exceptionsHolder == ox7.z)? true: false;
       return b;
    }
    public final ArrayList h(Throwable p0){
       te3 t_rootCause;
       te3 t_exceptions = this._exceptionsHolder;
       int i = 4;
       if (t_exceptions == null) {
          t_exceptions = new ArrayList(i);
       }else if(t_exceptions instanceof Throwable){
          ArrayList uArrayList = new ArrayList(i);
          uArrayList.add(t_exceptions);
          t_exceptions = uArrayList;
       }else if(t_exceptions instanceof ArrayList){
       }else {
          throw new IllegalStateException("State is "+t_exceptions.toString());
       }
       if ((t_rootCause = this._rootCause) != null) {
          t_exceptions.add(0, t_rootCause);
       }
       if (p0 != null && !co5.c(p0, t_rootCause)) {
          t_exceptions.add(p0);
       }
       this._exceptionsHolder = ox7.z;
       return t_exceptions;
    }
    public final void i(){
       this._isCompleting = 1;
    }
    public final String toString(){
       return "Finishing[cancelling="+this.e()+", completing="+this._isCompleting+", rootCause="+this._rootCause+", exceptions="+this._exceptionsHolder+", list="+this.a+']';
    }
}
