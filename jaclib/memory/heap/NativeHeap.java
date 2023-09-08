/*    */ package jaclib.memory.heap;
/*    */ 
/*    */ 
/*    */ public final class NativeHeap
/*    */ {
/*    */   long peer;
/*    */   private final int a;
/*    */   private boolean f;
/*    */   
/*    */   public NativeHeap(int i) {
/* 11 */     this.a = i * 1264911109;
/* 12 */     allocateHeap(-368553523 * this.a);
/* 13 */     this.f = true;
/*    */   }
/*    */   
/*    */   final synchronized boolean a() {
/* 17 */     return this.f;
/*    */   }
/*    */   
/*    */   public final NativeHeapBuffer f(int i, boolean bool) {
/* 21 */     if (!this.f)
/* 22 */       throw new IllegalStateException(); 
/* 23 */     return new NativeHeapBuffer(this, allocateBuffer(i, bool), i);
/*    */   }
/*    */   
/*    */   public final synchronized void b() {
/* 27 */     if (this.f)
/* 28 */       deallocateHeap(); 
/* 29 */     this.f = false;
/*    */   }
/*    */   
/*    */   private native void allocateHeap(int paramInt);
/*    */   
/*    */   private native void deallocateHeap();
/*    */   
/*    */   final synchronized native int allocateBuffer(int paramInt, boolean paramBoolean);
/*    */   
/*    */   final synchronized native long getBufferAddress(int paramInt);
/*    */   
/*    */   final synchronized native void get(int paramInt1, byte[] paramArrayOfbyte, int paramInt2, int paramInt3, int paramInt4);
/*    */   
/*    */   final synchronized native void put(int paramInt1, byte[] paramArrayOfbyte, int paramInt2, int paramInt3, int paramInt4);
/*    */   
/*    */   final synchronized native void deallocateBuffer(int paramInt);
/*    */   
/*    */   public final synchronized native void copy(long paramLong1, long paramLong2, int paramInt);
/*    */   
/*    */   protected final void finalize() throws Throwable {
/* 49 */     super.finalize();
/* 50 */     b();
/*    */   }
/*    */ }


/* Location:              C:\Users\brett\OneDrive\Desktop\ihatelife\zeah-client.jar!\jaclib\memory\heap\NativeHeap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */