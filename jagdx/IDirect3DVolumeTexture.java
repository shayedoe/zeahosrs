/*   */ package jagdx;
/*   */ 
/*   */ public class IDirect3DVolumeTexture
/*   */   extends IDirect3DBaseTexture
/*   */ {
/*   */   private IDirect3DVolumeTexture() throws Throwable {
/* 7 */     throw new Error();
/*   */   }
/*   */   
/*   */   public static native int Upload(long paramLong1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, long paramLong2);
/*   */   
/*   */   public static native int Download(long paramLong1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, long paramLong2);
/*   */ }


/* Location:              C:\Users\brett\OneDrive\Desktop\ihatelife\zeah-client.jar!\jagdx\IDirect3DVolumeTexture.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */