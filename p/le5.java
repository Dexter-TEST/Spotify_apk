package p.le5;
import p.uw5;
import java.io.ByteArrayInputStream;
import p.r80;
import java.io.InputStream;
import java.lang.String;
import java.lang.StringBuilder;
import p.k07;
import p.xq7;
import p.e67;
import java.lang.Object;
import java.lang.Class;
import java.util.Arrays;

public final class le5 extends uw5	// class@001d3a from classes.dex
{
    public boolean A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public int H;
    public int I;
    public boolean J;
    public int K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public int[] R;
    public int[] S;
    public int[] T;
    public boolean U;
    public int[] V;
    public k07 W;

    public void le5(){
       super();
    }
    public static le5 v(ByteArrayInputStream p0){
       int i4;
       int[] ointArray;
       r80 b;
       r80 or80 = new r80(p0);
       le5 ole5 = new le5();
       ole5.E = or80.f("PPS: pic_parameter_set_id");
       ole5.F = or80.f("PPS: seq_parameter_set_id");
       ole5.A = or80.b("PPS: entropy_coding_mode_flag");
       ole5.G = or80.b("PPS: pic_order_present_flag");
       int i = or80.f("PPS: num_slice_groups_minus1");
       ole5.H = i;
       int i1 = 6;
       int i2 = 0;
       int i3 = 1;
       if (i > 0) {
          i = or80.f("PPS: slice_group_map_type");
          ole5.I = i;
          i4 = ole5.H + i3;
          ointArray = new int[i4];
          ole5.R = ointArray;
          ointArray = new int[i4];
          ole5.S = ointArray;
          ointArray = new int[i4];
          ole5.T = ointArray;
          if (!i) {
             i = 0;
             while (i <= ole5.H) {
                ole5.T[i] = or80.f("PPS: run_length_minus1");
                i = i + 1;
             }
          }else if(i == 2){
             for (i = 0; i < ole5.H; i = i + 1) {
                ole5.R[i] = or80.f("PPS: top_left");
                ole5.S[i] = or80.f("PPS: bottom_right");
             }
          }else {
             int i6 = 3;
             if (i != i6) {
                b = 4;
                if (i != b && i != 5) {
                   if (i == i1) {
                      if (i4 <= b) {
                         i6 = (i4 > 2)? 2: 1;
                      }
                      i = or80.f("PPS: pic_size_in_map_units_minus1");
                      int[] ointArray1 = new int[(i + 1)];
                      ole5.V = ointArray1;
                      i4 = 0;
                      while (i4 <= i) {
                         ole5.V[i4] = (int)or80.d(i6, "PPS: slice_group_id [".append(i4).append("]f").toString());
                         i4 = i4 + 1;
                      }
                   }
                }
             }
             ole5.U = or80.b("PPS: slice_group_change_direction_flag");
             ole5.D = or80.f("PPS: slice_group_change_rate_minus1");
          }
       }
       ole5.B = or80.f("PPS: num_ref_idx_l0_active_minus1");
       ole5.C = or80.f("PPS: num_ref_idx_l1_active_minus1");
       ole5.J = or80.b("PPS: weighted_pred_flag");
       ole5.K = (int)or80.d(2, "PPS: weighted_bipred_idc");
       ole5.L = or80.e("PPS: pic_init_qp_minus26");
       ole5.M = or80.e("PPS: pic_init_qs_minus26");
       ole5.N = or80.e("PPS: chroma_qp_index_offset");
       ole5.O = or80.b("PPS: deblocking_filter_control_present_flag");
       ole5.P = or80.b("PPS: constrained_intra_pred_flag");
       ole5.Q = or80.b("PPS: redundant_pic_cnt_present_flag");
       i4 = 8;
       if (or80.d == i4) {
          or80.b = or80.c;
          or80.c = or80.a.read();
          or80.d = i2;
       }
       i = i3 << ((or80.d - 8) - i3);
       b = or80.b;
       i = (((((i << 1) - i3) & b)) == i)? 1: 0;
       ointArray = -1;
       if (b == ointArray || (or80.c == ointArray || !i)) {
          i3 = 0;
       }
       if (i3) {
          k07 i5 = new k07(2);
          ole5.W = i5;
          if (i5.b = or80.b("PPS: transform_8x8_mode_flag")) {
             while (true) {
                i = ole5.W.b * 2;
                i = i + i1;
                if (i2 < i) {
                   if (or80.b("PPS: pic_scaling_list_present_flag")) {
                      i5 = ole5.W.d;
                      e67[] uoe67Array = new e67[i4];
                      i5.b = uoe67Array;
                      e67[] uoe67Array1 = new e67[i4];
                      i5.c = uoe67Array1;
                      if (i2 < i1) {
                         uoe67Array[i2] = e67.d(or80, 16);
                      }else {
                         i = i2 - 6;
                         uoe67Array1[i] = e67.d(or80, 64);
                      }
                   }
                   i2 = i2 + 1;
                }
             }
          }
          ole5.W.c = or80.e("PPS: second_chroma_qp_index_offset");
       }
       or80.a();
       or80.c((i4 - or80.d));
       return ole5;
    }
    public final boolean equals(Object p0){
       le5 tW;
       if (this == p0) {
          return true;
       }
       if (p0 == null) {
          return false;
       }
       if (le5.class != p0.getClass()) {
          return false;
       }
       if (!Arrays.equals(this.S, p0.S)) {
          return false;
       }
       if (this.N != p0.N) {
          return false;
       }
       if (this.P != p0.P) {
          return false;
       }
       if (this.O != p0.O) {
          return false;
       }
       if (this.A != p0.A) {
          return false;
       }
       if ((tW = this.W) == null) {
          if (p0.W != null) {
             return false;
          }
       }else if(!tW.equals(p0.W)){
          return false;
       }
       if (this.B != p0.B) {
          return false;
       }else if(this.C != p0.C){
          return false;
       }else if(this.H != p0.H){
          return false;
       }else if(this.L != p0.L){
          return false;
       }else if(this.M != p0.M){
          return false;
       }else if(this.G != p0.G){
          return false;
       }else if(this.E != p0.E){
          return false;
       }else if(this.Q != p0.Q){
          return false;
       }else if(!Arrays.equals(this.T, p0.T)){
          return false;
       }else if(this.F != p0.F){
          return false;
       }else if(this.U != p0.U){
          return false;
       }else if(this.D != p0.D){
          return false;
       }else if(!Arrays.equals(this.V, p0.V)){
          return false;
       }else if(this.I != p0.I){
          return false;
       }else if(!Arrays.equals(this.R, p0.R)){
          return false;
       }else if(this.K != p0.K){
          return false;
       }else if(this.J != p0.J){
          return false;
       }else {
          return true;
       }
    }
    public final int hashCode(){
       le5 tW;
       int i = (((Arrays.hashCode(this.S) + 31) * 31) + this.N) * 31;
       int i1 = 1231;
       int i2 = (this.P != null)? 1231: 1237;
       i = (i + i2) * 31;
       i2 = (this.O != null)? 1231: 1237;
       i = (i + i2) * 31;
       i2 = (this.A != null)? 1231: 1237;
       i = (i + i2) * 31;
       i2 = ((tW = this.W) == null)? 0: tW.hashCode();
       i = (((((((((((i + i2) * 31) + this.B) * 31) + this.C) * 31) + this.H) * 31) + this.L) * 31) + this.M) * 31;
       i2 = (this.G != null)? 1231: 1237;
       i = (((i + i2) * 31) + this.E) * 31;
       i2 = (this.Q != null)? 1231: 1237;
       i2 = (((Arrays.hashCode(this.T) + ((i + i2) * 31)) * 31) + this.F) * 31;
       i = (this.U != null)? 1231: 1237;
       i2 = (((Arrays.hashCode(this.R) + ((((Arrays.hashCode(this.V) + ((((i2 + i) * 31) + this.D) * 31)) * 31) + this.I) * 31)) * 31) + this.K) * 31;
       if (this.J == null) {
          i1 = 1237;
       }
       return (i2 + i1);
    }
    public final String toString(){
       return "PictureParameterSet{\n       entropy_coding_mode_flag="+this.A+",\n       num_ref_idx_l0_active_minus1="+this.B+",\n       num_ref_idx_l1_active_minus1="+this.C+",\n       slice_group_change_rate_minus1="+this.D+",\n       pic_parameter_set_id="+this.E+",\n       seq_parameter_set_id="+this.F+",\n       pic_order_present_flag="+this.G+",\n       num_slice_groups_minus1="+this.H+",\n       slice_group_map_type="+this.I+",\n       weighted_pred_flag="+this.J+",\n       weighted_bipred_idc="+this.K+",\n       pic_init_qp_minus26="+this.L+",\n       pic_init_qs_minus26="+this.M+",\n       chroma_qp_index_offset="+this.N+",\n       deblocking_filter_control_present_flag="+this.O+",\n       constrained_intra_pred_flag="+this.P+",\n       redundant_pic_cnt_present_flag="+this.Q+",\n       top_left="+this.R+",\n       bottom_right="+this.S+",\n       run_length_minus1="+this.T+",\n       slice_group_change_direction_flag="+this.U+",\n       slice_group_id="+this.V+",\n       extended="+this.W+'}';
    }
}
