/*   */ package jagdx;
/*   */ 
/*   */ public class IDirect3DEventQuery
/*   */   extends IUnknown
/*   */ {
/*   */   private IDirect3DEventQuery() throws Throwable {
/* 7 */     throw new Error();
/*   */   }
/*   */   
/*   */   public static native int Issue(long paramLong);
/*   */   
/*   */   public static native int IsSignaled(long paramLong);
/*   */ }


/* Location:              C:\Users\brett\OneDrive\Desktop\ihatelife\zeah-client.jar!\jagdx\IDirect3DEventQuery.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */