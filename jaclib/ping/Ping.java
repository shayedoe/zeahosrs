/*    */ package jaclib.ping;
/*    */ 
/*    */ 
/*    */ public class Ping
/*    */ {
/*    */   private Ping() throws Throwable {
/*  7 */     throw new Error();
/*    */   }
/*    */   
/*    */   public static native boolean init();
/*    */   
/*    */   public static int a(byte i, byte i_0_, byte i_1_, byte i_2_, long l) throws Throwable {
/*    */     int i_3_;
/* 14 */     if ((i_3_ = ping0(i, i_0_, i_1_, i_2_, l)) < 0)
/* 15 */       throw new Exception(String.valueOf(i_3_)); 
/* 16 */     return i_3_;
/*    */   }
/*    */   
/*    */   private static native int ping0(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, long paramLong);
/*    */   
/*    */   public static native void quit();
/*    */ }


/* Location:              C:\Users\brett\OneDrive\Desktop\ihatelife\zeah-client.jar!\jaclib\ping\Ping.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */