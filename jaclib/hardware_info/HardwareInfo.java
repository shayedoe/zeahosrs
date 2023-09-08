/*   */ package jaclib.hardware_info;
/*   */ 
/*   */ 
/*   */ public class HardwareInfo
/*   */ {
/*   */   private HardwareInfo() throws Throwable {
/* 7 */     throw new Error();
/*   */   }
/*   */   
/*   */   public static final native int[] getCPUInfo();
/*   */   
/*   */   public static final native int[] getRawCPUInfo();
/*   */   
/*   */   public static final native String[] getDXDiagSystemProps();
/*   */   
/*   */   public static final native String[][] getDXDiagDisplayDevicesProps();
/*   */   
/*   */   public static final native String[] getOpenGLProps();
/*   */ }


/* Location:              C:\Users\brett\OneDrive\Desktop\ihatelife\zeah-client.jar!\jaclib\hardware_info\HardwareInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */