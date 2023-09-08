/*   */ package jagdx;
/*   */ 
/*   */ import java.awt.Component;
/*   */ 
/*   */ public class IDirect3D
/*   */   extends IUnknown
/*   */ {
/*   */   private IDirect3D() throws Throwable {
/* 9 */     throw new Error();
/*   */   }
/*   */   
/*   */   public static native long Direct3DCreate();
/*   */   
/*   */   public static native int GetAdapterCount(long paramLong);
/*   */   
/*   */   public static native int GetAdapterIdentifier(long paramLong, int paramInt1, int paramInt2, D3DADAPTER_IDENTIFIER paramD3DADAPTER_IDENTIFIER);
/*   */   
/*   */   public static native int GetDeviceCaps(long paramLong, int paramInt1, int paramInt2, D3DCAPS paramD3DCAPS);
/*   */   
/*   */   public static native int GetAdapterDisplayMode(long paramLong, int paramInt, D3DDISPLAYMODE paramD3DDISPLAYMODE);
/*   */   
/*   */   public static native long CreateDeviceContext(long paramLong, int paramInt1, int paramInt2, Component paramComponent, int paramInt3, D3DPRESENT_PARAMETERS paramD3DPRESENT_PARAMETERS);
/*   */   
/*   */   public static native int CheckDeviceType(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean);
/*   */   
/*   */   public static native int CheckDeviceFormat(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6);
/*   */   
/*   */   public static native int CheckDepthStencilMatch(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
/*   */   
/*   */   public static native int CheckDeviceMultiSampleType(long paramLong, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4);
/*   */ }


/* Location:              C:\Users\brett\OneDrive\Desktop\ihatelife\zeah-client.jar!\jagdx\IDirect3D.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */