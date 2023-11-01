package p.qn2;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.Arrays;
import p.tp2;

public final class qn2	// class@0023d8 from classes.dex
{
    public int a;
    public int b;
    public int c;
    public int[] d;
    public int[] e;
    public boolean[] f;
    public int g;
    public int h;
    public int i;
    public int j;

    public void qn2(){
       super();
    }
    public final String toString(){
       return tp2.n("HRDParameters{cpb_cnt_minus1="+this.a+", bit_rate_scale="+this.b+", cpb_size_scale="+this.c+", bit_rate_value_minus1="+Arrays.toString(this.d)+", cpb_size_value_minus1="+Arrays.toString(this.e)+", cbr_flag="+Arrays.toString(this.f)+", initial_cpb_removal_delay_length_minus1="+this.g+", cpb_removal_delay_length_minus1="+this.h+", dpb_output_delay_length_minus1="+this.i+", time_offset_length=", this.j, '}');
    }
}
