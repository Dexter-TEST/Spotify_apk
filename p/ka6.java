package p.ka6;
import p.uw5;
import p.cg0;
import p.r80;
import java.io.InputStream;
import java.lang.String;
import p.jf0;
import p.xq7;
import p.e67;
import java.lang.StringBuilder;
import p.of7;
import p.fl;
import p.qn2;
import p.nf7;
import java.lang.Object;
import p.tp2;

public final class ka6 extends uw5	// class@001bd9 from classes.dex
{
    public int A;
    public boolean B;
    public boolean C;
    public boolean D;
    public jf0 E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public int M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public int T;
    public int U;
    public boolean V;
    public int W;
    public int X;
    public int Y;
    public boolean Z;
    public boolean a0;
    public boolean b0;
    public int c0;
    public int d0;
    public int e0;
    public int f0;
    public int[] g0;
    public of7 h0;
    public xq7 i0;
    public int j0;

    public void ka6(){
       super();
    }
    public static ka6 v(cg0 p0){
       int i3;
       boolean i4;
       nf7 i3;
       r80 or80 = new r80(p0);
       ka6 oka6 = new ka6();
       int i = 8;
       oka6.M = (int)or80.d(i, "SPS: profile_idc");
       oka6.N = or80.b("SPS: constraint_set_0_flag");
       oka6.O = or80.b("SPS: constraint_set_1_flag");
       oka6.P = or80.b("SPS: constraint_set_2_flag");
       oka6.Q = or80.b("SPS: constraint_set_3_flag");
       oka6.R = or80.b("SPS: constraint_set_4_flag");
       oka6.S = or80.b("SPS: constraint_set_5_flag");
       int i1 = 2;
       or80.d(i1, "SPS: reserved_zero_2bits");
       oka6.T = (int)or80.d(i, "SPS: level_idc");
       oka6.U = or80.f("SPS: seq_parameter_set_id");
       ka6 m = oka6.M;
       jf0 e = jf0.e;
       int i2 = 0;
       if (m != 100 && (m != 110 && (m != 122 && m != 144))) {
          oka6.E = e;
       }else {
          i3 = or80.f("SPS: chroma_format_idc");
          jf0 g = jf0.g;
          if (!i3) {
             e = jf0.d;
          }else if(i3 == 1){
             if (i3 == i1) {
                e = jf0.f;
             }else if(i3 == 3){
                e = g;
             }else {
                e = null;
             }
          }
          oka6.E = e;
          if (e == g) {
             oka6.V = or80.b("SPS: residual_color_transform_flag");
          }
          oka6.J = or80.f("SPS: bit_depth_luma_minus8");
          oka6.K = or80.f("SPS: bit_depth_chroma_minus8");
          oka6.L = or80.b("SPS: qpprime_y_zero_transform_bypass_flag");
          if (or80.b("SPS: seq_scaling_matrix_present_lag")) {
             oka6.i0 = new xq7(i);
             i1 = 0;
             while (i1 < i) {
                if (or80.b("SPS: seqScalingListPresentFlag")) {
                   m = oka6.i0;
                   e67[] uoe67Array = new e67[i];
                   m.b = uoe67Array;
                   e67[] uoe67Array1 = new e67[i];
                   m.c = uoe67Array1;
                   if (i1 < 6) {
                      uoe67Array[i1] = e67.d(or80, 16);
                   }else {
                      i3 = i1 - 6;
                      uoe67Array1[i3] = e67.d(or80, 64);
                   }
                }
                i1 = i1 + 1;
             }
          }
       }
       oka6.F = or80.f("SPS: log2_max_frame_num_minus4");
       i1 = or80.f("SPS: pic_order_cnt_type");
       oka6.A = i1;
       if (!i1) {
          oka6.G = or80.f("SPS: log2_max_pic_order_cnt_lsb_minus4");
       }else if(i1 == 1){
          oka6.B = or80.b("SPS: delta_pic_order_always_zero_flag");
          oka6.W = or80.e("SPS: offset_for_non_ref_pic");
          oka6.X = or80.e("SPS: offset_for_top_to_bottom_field");
          i1 = or80.f("SPS: num_ref_frames_in_pic_order_cnt_cycle");
          oka6.j0 = i1;
          int[] ointArray = new int[i1];
          oka6.g0 = ointArray;
          for (; i2 < oka6.j0; i2 = i2 + 1) {
             oka6.g0[i2] = or80.e("SPS: offsetForRefFrame [".append(i2).append("]").toString());
          }
       }
       oka6.Y = or80.f("SPS: num_ref_frames");
       oka6.Z = or80.b("SPS: gaps_in_frame_num_value_allowed_flag");
       oka6.I = or80.f("SPS: pic_width_in_mbs_minus1");
       oka6.H = or80.f("SPS: pic_height_in_map_units_minus1");
       i1 = or80.b("SPS: frame_mbs_only_flag");
       oka6.a0 = i1;
       if (!i1) {
          oka6.C = or80.b("SPS: mb_adaptive_frame_field_flag");
       }
       oka6.D = or80.b("SPS: direct_8x8_inference_flag");
       i1 = or80.b("SPS: frame_cropping_flag");
       oka6.b0 = i1;
       if (i1) {
          oka6.c0 = or80.f("SPS: frame_crop_left_offset");
          oka6.d0 = or80.f("SPS: frame_crop_right_offset");
          oka6.e0 = or80.f("SPS: frame_crop_top_offset");
          oka6.f0 = or80.f("SPS: frame_crop_bottom_offset");
       }
       if (or80.b("SPS: vui_parameters_present_flag")) {
          of7 oof7 = new of7();
          i3 = or80.b("VUI: aspect_ratio_info_present_flag");
          oof7.a = i3;
          if (i3) {
             i4 = (int)or80.d(i, "VUI: aspect_ratio");
             fl b = fl.b;
             fl uofl = (i4 == 255)? b: new fl(i4);
             oof7.y = uofl;
             if (uofl == b) {
                oof7.b = (int)or80.d(16, "VUI: sar_width");
                oof7.c = (int)or80.d(16, "VUI: sar_height");
             }
          }
          i3 = or80.b("VUI: overscan_info_present_flag");
          oof7.d = i3;
          if (i3) {
             oof7.e = or80.b("VUI: overscan_appropriate_flag");
          }
          i3 = or80.b("VUI: video_signal_type_present_flag");
          oof7.f = i3;
          if (i3) {
             oof7.g = (int)or80.d(3, "VUI: video_format");
             oof7.h = or80.b("VUI: video_full_range_flag");
             i3 = or80.b("VUI: colour_description_present_flag");
             oof7.i = i3;
             if (i3) {
                oof7.j = (int)or80.d(i, "VUI: colour_primaries");
                oof7.k = (int)or80.d(i, "VUI: transfer_characteristics");
                oof7.l = (int)or80.d(i, "VUI: matrix_coefficients");
             }
          }
          i3 = or80.b("VUI: chroma_loc_info_present_flag");
          oof7.m = i3;
          if (i3) {
             oof7.n = or80.f("VUI chroma_sample_loc_type_top_field");
             oof7.o = or80.f("VUI chroma_sample_loc_type_bottom_field");
          }
          i3 = or80.b("VUI: timing_info_present_flag");
          oof7.p = i3;
          if (i3) {
             oof7.q = (int)or80.d(32, "VUI: num_units_in_tick");
             oof7.r = (int)or80.d(32, "VUI: time_scale");
             oof7.s = or80.b("VUI: fixed_frame_rate_flag");
          }
          if (i3 = or80.b("VUI: nal_hrd_parameters_present_flag")) {
             oof7.v = ka6.w(or80);
          }
          if (i4 = or80.b("VUI: vcl_hrd_parameters_present_flag")) {
             oof7.w = ka6.w(or80);
          }
          if (i3 || i4) {
             oof7.t = or80.b("VUI: low_delay_hrd_flag");
          }
          oof7.u = or80.b("VUI: pic_struct_present_flag");
          if (or80.b("VUI: bitstream_restriction_flag")) {
             i3 = new nf7();
             oof7.x = i3;
             i3.a = or80.b("VUI: motion_vectors_over_pic_boundaries_flag");
             oof7.x.b = or80.f("VUI max_bytes_per_pic_denom");
             oof7.x.c = or80.f("VUI max_bits_per_mb_denom");
             oof7.x.d = or80.f("VUI log2_max_mv_length_horizontal");
             oof7.x.e = or80.f("VUI log2_max_mv_length_vertical");
             oof7.x.f = or80.f("VUI num_reorder_frames");
             oof7.x.g = or80.f("VUI max_dec_frame_buffering");
          }
          oka6.h0 = oof7;
       }
       or80.a();
       or80.c((i - or80.d));
       return oka6;
    }
    public static qn2 w(r80 p0){
       qn2 oqn2 = new qn2();
       oqn2.a = p0.f("SPS: cpb_cnt_minus1");
       oqn2.b = (int)p0.d(4, "HRD: bit_rate_scale");
       oqn2.c = (int)p0.d(4, "HRD: cpb_size_scale");
       int i = oqn2.a + 1;
       int[] ointArray = new int[i];
       oqn2.d = ointArray;
       ointArray = new int[i];
       oqn2.e = ointArray;
       boolean[] uobooleanArr = new boolean[i];
       oqn2.f = uobooleanArr;
       i = 0;
       while (i <= oqn2.a) {
          oqn2.d[i] = p0.f("HRD: bit_rate_value_minus1");
          oqn2.e[i] = p0.f("HRD: cpb_size_value_minus1");
          oqn2.f[i] = p0.b("HRD: cbr_flag");
          i = i + 1;
       }
       oqn2.g = (int)p0.d(5, "HRD: initial_cpb_removal_delay_length_minus1");
       oqn2.h = (int)p0.d(5, "HRD: cpb_removal_delay_length_minus1");
       oqn2.i = (int)p0.d(5, "HRD: dpb_output_delay_length_minus1");
       oqn2.j = (int)p0.d(5, "HRD: time_offset_length");
       return oqn2;
    }
    public final String toString(){
       return tp2.n("SeqParameterSet{ \n        pic_order_cnt_type="+this.A+", \n        field_pic_flag=false, \n        delta_pic_order_always_zero_flag="+this.B+", \n        weighted_pred_flag=false, \n        weighted_bipred_idc=0, \n        entropy_coding_mode_flag=false, \n        mb_adaptive_frame_field_flag="+this.C+", \n        direct_8x8_inference_flag="+this.D+", \n        chroma_format_idc="+this.E+", \n        log2_max_frame_num_minus4="+this.F+", \n        log2_max_pic_order_cnt_lsb_minus4="+this.G+", \n        pic_height_in_map_units_minus1="+this.H+", \n        pic_width_in_mbs_minus1="+this.I+", \n        bit_depth_luma_minus8="+this.J+", \n        bit_depth_chroma_minus8="+this.K+", \n        qpprime_y_zero_transform_bypass_flag="+this.L+", \n        profile_idc="+this.M+", \n        constraint_set_0_flag="+this.N+", \n        constraint_set_1_flag="+this.O+", \n        constraint_set_2_flag="+this.P+", \n        constraint_set_3_flag="+this.Q+", \n        constraint_set_4_flag="+this.R+", \n        constraint_set_5_flag="+this.S+", \n        level_idc="+this.T+", \n        seq_parameter_set_id="+this.U+", \n        residual_color_transform_flag="+this.V+", \n        offset_for_non_ref_pic="+this.W+", \n        offset_for_top_to_bottom_field="+this.X+", \n        num_ref_frames="+this.Y+", \n        gaps_in_frame_num_value_allowed_flag="+this.Z+", \n        frame_mbs_only_flag="+this.a0+", \n        frame_cropping_flag="+this.b0+", \n        frame_crop_left_offset="+this.c0+", \n        frame_crop_right_offset="+this.d0+", \n        frame_crop_top_offset="+this.e0+", \n        frame_crop_bottom_offset="+this.f0+", \n        offsetForRefFrame="+this.g0+", \n        vuiParams="+this.h0+", \n        scalingMatrix="+this.i0+", \n        num_ref_frames_in_pic_order_cnt_cycle=", this.j0, '}');
    }
}
