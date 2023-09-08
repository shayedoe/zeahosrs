/*   */ package jagdx;
/*   */ 
/*   */ 
/*   */ public class D3DLIGHT
/*   */ {
/*   */   private D3DLIGHT() throws Throwable {
/* 7 */     throw new Error();
/*   */   }
/*   */   
/*   */   public static native long Create();
/*   */   
/*   */   public static native void Destroy(long paramLong);
/*   */   
/*   */   public static native void SetType(long paramLong, int paramInt);
/*   */   
/*   */   public static native void SetAmbient(long paramLong, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4);
/*   */   
/*   */   public static native void SetSpecular(long paramLong, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4);
/*   */   
/*   */   public static native void SetDiffuse(long paramLong, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4);
/*   */   
/*   */   public static native void SetPosition(long paramLong, float paramFloat1, float paramFloat2, float paramFloat3);
/*   */   
/*   */   public static native void SetDirection(long paramLong, float paramFloat1, float paramFloat2, float paramFloat3);
/*   */   
/*   */   public static native void SetAttenuation(long paramLong, float paramFloat1, float paramFloat2, float paramFloat3);
/*   */   
/*   */   public static native void SetSpotParams(long paramLong, float paramFloat1, float paramFloat2, float paramFloat3);
/*   */   
/*   */   public static native void SetRange(long paramLong, float paramFloat);
/*   */ }


/* Location:              C:\Users\brett\OneDrive\Desktop\ihatelife\zeah-client.jar!\jagdx\D3DLIGHT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */