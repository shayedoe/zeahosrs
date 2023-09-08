/*    */ package jaclib.memory;
/*    */ 
/*    */ public class NativeBuffer
/*    */   implements Buffer, Source
/*    */ {
/*  6 */   private final int a = 345719739;
/*    */ 
/*    */   
/*    */   private long f;
/*    */ 
/*    */ 
/*    */   
/*    */   public final int a() {
/* 14 */     return -1;
/*    */   }
/*    */   
/*    */   public final long f() {
/* 18 */     return this.f * -4061232971384459903L;
/*    */   }
/*    */   
/*    */   public void b(byte[] is, int i, int i_0_, int i_1_) {
/* 22 */     if ((((0L == this.f * -4061232971384459903L) ? 1 : 0) | ((is == null) ? 1 : 0) | ((i < 0) ? 1 : 0) | ((i + i_1_ > is.length) ? 1 : 0) | ((i_0_ < 0) ? 1 : 0) | ((i_1_ + i_0_ >= 0) ? 1 : 0)) != 0)
/* 23 */       throw new RuntimeException(); 
/* 24 */     put(this.f * -4061232971384459903L, is, i, i_0_, i_1_);
/*    */   }
/*    */   
/*    */   private final native void get(long paramLong, byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3);
/*    */   
/*    */   private final native void put(long paramLong, byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3);
/*    */   
/*    */   public void p(byte[] is, int i, int i_6_, int i_7_) {
/* 32 */     if ((((0L == this.f * -4061232971384459903L) ? 1 : 0) | ((is == null) ? 1 : 0) | ((i < 0) ? 1 : 0) | ((i + i_7_ > is.length) ? 1 : 0) | ((i_6_ < 0) ? 1 : 0) | ((i_7_ + i_6_ >= 0) ? 1 : 0)) != 0)
/* 33 */       throw new RuntimeException(); 
/* 34 */     put(this.f * -4061232971384459903L, is, i, i_6_, i_7_);
/*    */   }
/*    */   
/*    */   public void i(byte[] is, int i, int i_8_, int i_9_) {
/* 38 */     if ((((0L == this.f * -4061232971384459903L) ? 1 : 0) | ((is == null) ? 1 : 0) | ((i < 0) ? 1 : 0) | ((i + i_9_ > is.length) ? 1 : 0) | ((i_8_ < 0) ? 1 : 0) | ((i_9_ + i_8_ >= 0) ? 1 : 0)) != 0)
/* 39 */       throw new RuntimeException(); 
/* 40 */     put(this.f * -4061232971384459903L, is, i, i_8_, i_9_);
/*    */   }
/*    */   
/*    */   public void k(byte[] is, int i, int i_10_, int i_11_) {
/* 44 */     if ((((0L == this.f * -4061232971384459903L) ? 1 : 0) | ((is == null) ? 1 : 0) | ((i < 0) ? 1 : 0) | ((i + i_11_ > is.length) ? 1 : 0) | ((i_10_ < 0) ? 1 : 0) | ((i_11_ + i_10_ >= 0) ? 1 : 0)) != 0)
/* 45 */       throw new RuntimeException(); 
/* 46 */     put(this.f * -4061232971384459903L, is, i, i_10_, i_11_);
/*    */   }
/*    */   
/*    */   public final long d() {
/* 50 */     return this.f * -4061232971384459903L;
/*    */   }
/*    */   
/*    */   public final long u() {
/* 54 */     return this.f * -4061232971384459903L;
/*    */   }
/*    */   
/*    */   public final int x() {
/* 58 */     return -1;
/*    */   }
/*    */   
/*    */   public final int r() {
/* 62 */     return -1;
/*    */   }
/*    */   
/*    */   public final int q() {
/* 66 */     return -1;
/*    */   }
/*    */   
/*    */   public final int n() {
/* 70 */     return -1;
/*    */   }
/*    */ }


/* Location:              C:\Users\brett\OneDrive\Desktop\ihatelife\zeah-client.jar!\jaclib\memory\NativeBuffer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */