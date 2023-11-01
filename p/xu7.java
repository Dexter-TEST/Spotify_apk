package p.xu7;
import android.os.IInterface;
import android.os.Binder;
import java.lang.String;
import android.os.IBinder;
import android.os.Parcel;

public abstract class xu7 extends Binder implements IInterface	// class@002cf0 from classes.dex
{
    public final int a;

    public void xu7(String p0,int p1){
       this.a = p1;
       if (p1 != 1) {
          super();
          this.attachInterface(this, p0);
          return;
       }else {
          super();
          this.attachInterface(this, p0);
          return;
       }
    }
    public final IBinder asBinder(){
       return this;
    }
    public abstract boolean g(int p0,Parcel p1,Parcel p2);
    public abstract boolean k(int p0,Parcel p1);
    public final boolean onTransact(int p0,Parcel p1,Parcel p2,int p3){
       boolean b = true;
       switch (this.a){
           case 0:
             if (p0 > 0xffffff) {
                if (!super.onTransact(p0, p1, p2, p3)) {
                }
             }else {
                p1.enforceInterface(this.getInterfaceDescriptor());
             }
             break;
           default:
             if (p0 > 0xffffff) {
                if (super.onTransact(p0, p1, p2, p3)) {
                label_0033 :
                   return b;
                }
             }else {
                p1.enforceInterface(this.getInterfaceDescriptor());
             }
             b = this.k(p0, p1);
             goto label_0033 ;
       }
       return b;
    }
}
