/*    */ package jaclib.memory.heap;
/*    */ 
/*    */ import jaclib.memory.Buffer;
/*    */ import jaclib.memory.Source;
/*    */ 
/*    */ public final class NativeHeapBuffer
/*    */   implements Buffer, Source
/*    */ {
/*    */   private final int a;
/*    */   public NativeHeap f;
/*    */   private final int b;
/*    */   private boolean p = true;
/*    */   
/*    */   NativeHeapBuffer(NativeHeap nativeheap, int i, int i_0_) {
/* 15 */     this.f = nativeheap;
/* 16 */     this.b = i * 615403225;
/* 17 */     this.a = i_0_ * -2102913487;
/*    */   }
/*    */   
/*    */   private final synchronized boolean s() {
/* 21 */     return (this.f.a() && this.p);
/*    */   }
/*    */   
/*    */   public final long f() {
/* 25 */     return this.f.getBufferAddress(this.b * -1901637271);
/*    */   }
/*    */   
/*    */   public final int a() {
/* 29 */     return 877757137 * this.a;
/*    */   }
/*    */   
/*    */   public final synchronized void b(byte[] is, int i, int i_1_, int i_2_) {
/* 33 */     if (((!s() ? 1 : 0) | ((is == null) ? 1 : 0) | ((i < 0) ? 1 : 0) | ((i_2_ + i > is.length) ? 1 : 0) | ((i_1_ < 0) ? 1 : 0) | ((i_2_ + i_1_ > 877757137 * this.a) ? 1 : 0)) != 0)
/* 34 */       throw new RuntimeException(); 
/* 35 */     this.f.put(-1901637271 * this.b, is, i, i_1_, i_2_);
/*    */   }
/*    */   
/*    */   public final void z(Source source) {
/* 39 */     y(source, 0L, 0L, source.a());
/*    */   }
/*    */   
/*    */   private final synchronized void y(Source source, long l, long l_3_, int i) {
/* 43 */     if (source.f() == 0L || f() == 0L)
/* 44 */       throw new NullPointerException(); 
/* 45 */     this.f.copy(f() + l_3_, source.f() + l, i);
/*    */   }
/*    */   
/*    */   public final synchronized void t() {
/* 49 */     if (s())
/* 50 */       this.f.deallocateBuffer(-1901637271 * this.b); 
/* 51 */     this.p = false;
/*    */   }
/*    */   
/*    */   protected final void finalize() throws Throwable {
/* 55 */     super.finalize();
/* 56 */     t();
/*    */   }
/*    */   
/*    */   public final synchronized void p(byte[] is, int i, int i_4_, int i_5_) {
/* 60 */     if (((!s() ? 1 : 0) | ((is == null) ? 1 : 0) | ((i < 0) ? 1 : 0) | ((i_5_ + i > is.length) ? 1 : 0) | ((i_4_ < 0) ? 1 : 0) | ((i_5_ + i_4_ > 877757137 * this.a) ? 1 : 0)) != 0)
/* 61 */       throw new RuntimeException(); 
/* 62 */     this.f.put(-1901637271 * this.b, is, i, i_4_, i_5_);
/*    */   }
/*    */   
/*    */   public final synchronized void i(byte[] is, int i, int i_6_, int i_7_) {
/* 66 */     if (((!s() ? 1 : 0) | ((is == null) ? 1 : 0) | ((i < 0) ? 1 : 0) | ((i_7_ + i > is.length) ? 1 : 0) | ((i_6_ < 0) ? 1 : 0) | ((i_7_ + i_6_ > 877757137 * this.a) ? 1 : 0)) != 0)
/* 67 */       throw new RuntimeException(); 
/* 68 */     this.f.put(-1901637271 * this.b, is, i, i_6_, i_7_);
/*    */   }
/*    */   
/*    */   public final synchronized void k(byte[] is, int i, int i_8_, int i_9_) {
/* 72 */     if (((!s() ? 1 : 0) | ((is == null) ? 1 : 0) | ((i < 0) ? 1 : 0) | ((i_9_ + i > is.length) ? 1 : 0) | ((i_8_ < 0) ? 1 : 0) | ((i_9_ + i_8_ > 877757137 * this.a) ? 1 : 0)) != 0)
/* 73 */       throw new RuntimeException(); 
/* 74 */     this.f.put(-1901637271 * this.b, is, i, i_8_, i_9_);
/*    */   }
/*    */   
/*    */   public final long d() {
/* 78 */     return this.f.getBufferAddress(this.b * -1901637271);
/*    */   }
/*    */   
/*    */   public final long u() {
/* 82 */     return this.f.getBufferAddress(this.b * -1901637271);
/*    */   }
/*    */   
/*    */   public final int x() {
/* 86 */     return 877757137 * this.a;
/*    */   }
/*    */   
/*    */   public final int r() {
/* 90 */     return 877757137 * this.a;
/*    */   }
/*    */   
/*    */   public final int q() {
/* 94 */     return 877757137 * this.a;
/*    */   }
/*    */   
/*    */   public final int n() {
/* 98 */     return 877757137 * this.a;
/*    */   }
/*    */ }


/* Location:              C:\Users\brett\OneDrive\Desktop\ihatelife\zeah-client.jar!\jaclib\memory\heap\NativeHeapBuffer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */