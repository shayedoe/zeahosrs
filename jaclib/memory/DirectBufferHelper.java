/*   */ package jaclib.memory;
/*   */ 
/*   */ 
/*   */ public class DirectBufferHelper
/*   */ {
/*   */   private DirectBufferHelper() throws Throwable {
/* 7 */     throw new Error();
/*   */   }
/*   */   
/*   */   public static native long getDirectBufferAddress(Object paramObject);
/*   */ }


/* Location:              C:\Users\brett\OneDrive\Desktop\ihatelife\zeah-client.jar!\jaclib\memory\DirectBufferHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */