/*   */ package jagdx;
/*   */ 
/*   */ public class IDirect3DSwapChain
/*   */   extends IUnknown
/*   */ {
/*   */   private IDirect3DSwapChain() throws Throwable {
/* 7 */     throw new Error();
/*   */   }
/*   */   
/*   */   public static native long GetBackBuffer(long paramLong, int paramInt1, int paramInt2);
/*   */   
/*   */   public static native int Present(long paramLong, int paramInt);
/*   */ }


/* Location:              C:\Users\brett\OneDrive\Desktop\ihatelife\zeah-client.jar!\jagdx\IDirect3DSwapChain.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */