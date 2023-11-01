package p.nf7;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import p.tp2;

public final class nf7	// class@001fcc from classes.dex
{
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    public void nf7(){
       super();
    }
    public final String toString(){
       return tp2.n("BitstreamRestriction{motion_vectors_over_pic_boundaries_flag="+this.a+", max_bytes_per_pic_denom="+this.b+", max_bits_per_mb_denom="+this.c+", log2_max_mv_length_horizontal="+this.d+", log2_max_mv_length_vertical="+this.e+", num_reorder_frames="+this.f+", max_dec_frame_buffering=", this.g, '}');
    }
}
