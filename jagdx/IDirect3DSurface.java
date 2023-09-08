/*   */ package jagdx;
/*   */ 
/*   */ public class IDirect3DSurface
/*   */   extends IUnknown
/*   */ {
/*   */   private IDirect3DSurface() throws Throwable {
/* 7 */     throw new Error();
/*   */   }
/*   */   
/*   */   public static native int Upload(long paramLong1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong2);
/*   */   
/*   */   public static native int Download(long paramLong1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong2);
/*   */ }


/* Location:              C:\Users\brett\OneDrive\Desktop\ihatelife\zeah-client.jar!\jagdx\IDirect3DSurface.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */