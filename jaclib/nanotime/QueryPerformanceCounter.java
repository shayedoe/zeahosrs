/*   */ package jaclib.nanotime;
/*   */ 
/*   */ 
/*   */ public class QueryPerformanceCounter
/*   */ {
/*   */   private QueryPerformanceCounter() throws Throwable {
/* 7 */     throw new Error();
/*   */   }
/*   */   
/*   */   public static native boolean init();
/*   */   
/*   */   public static native long nanoTime();
/*   */   
/*   */   public static native void quit();
/*   */ }


/* Location:              C:\Users\brett\OneDrive\Desktop\ihatelife\zeah-client.jar!\jaclib\nanotime\QueryPerformanceCounter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */