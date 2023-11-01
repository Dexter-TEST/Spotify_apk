package p.mr6;
import p.lr6;
import p.io2;
import java.lang.Object;
import p.eo5;
import p.co5;

public final class mr6 extends io2 implements lr6	// class@001ef0 from classes.dex
{
    public int G;
    private Object _state;

    public void mr6(Object p0){
       super();
       this._state = p0;
    }
    public final void E(Object p0){
       mr6 tG;
       if (p0 == null) {
          p0 = eo5.t;
       }
       _monitor_enter(this);
       if (co5.c(this._state, p0)) {
          _monitor_exit(this);
       }else {
          this._state = p0;
          p0 = this.G;
          if (!((p0 & 0x01))) {
             p0++;
             this.G = p0;
             _monitor_exit(this);
             while (true) {
                _monitor_enter(this);
                if ((tG = this.G) == p0) {
                   break ;
                }else {
                   _monitor_exit(this);
                   p0 = tG;
                }
             }
             p0++;
             this.G = p0;
             _monitor_exit(this);
          }else {
             this.G = p0 + 2;
             _monitor_exit(this);
          }
       }
       return;
    }
    public final Object getValue(){
       mr6 t_state;
       if ((t_state = this._state) == eo5.t) {
          t_state = null;
       }
       return t_state;
    }
}
