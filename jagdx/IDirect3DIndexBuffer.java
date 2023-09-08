/*   */ package jagdx;
/*   */ 
/*   */ public class IDirect3DIndexBuffer
/*   */   extends IUnknown
/*   */ {
/*   */   private IDirect3DIndexBuffer() throws Throwable {
/* 7 */     throw new Error();
/*   */   }
/*   */   
/*   */   public static native long Lock(long paramLong, int paramInt1, int paramInt2, int paramInt3);
/*   */   
/*   */   public static native void Unlock(long paramLong);
/*   */   
/*   */   public static native int Upload(long paramLong1, int paramInt1, int paramInt2, int paramInt3, long paramLong2);
/*   */   
/*   */   public static native int Download(long paramLong1, int paramInt1, int paramInt2, int paramInt3, long paramLong2);
/*   */ }


/* Location:              C:\Users\brett\OneDrive\Desktop\ihatelife\zeah-client.jar!\jagdx\IDirect3DIndexBuffer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */