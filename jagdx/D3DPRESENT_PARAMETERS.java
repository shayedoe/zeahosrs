/*    */ package jagdx;
/*    */ 
/*    */ import java.awt.Component;
/*    */ 
/*    */ 
/*    */ public class D3DPRESENT_PARAMETERS
/*    */ {
/*  8 */   public static int a = Integer.MIN_VALUE;
/*  9 */   public int BackBufferWidth = 0;
/* 10 */   public int BackBufferHeight = 0;
/* 11 */   public int BackBufferFormat = 0;
/* 12 */   public int BackBufferCount = 0;
/* 13 */   public int MultiSampleType = 0;
/* 14 */   public int MultiSampleQuality = 0;
/* 15 */   public int SwapEffect = 1;
/*    */   public Component DeviceWindow;
/*    */   public boolean Windowed;
/*    */   public boolean EnableAutoDepthStencil;
/* 19 */   public int AutoDepthStencilFormat = 0;
/*    */   public int Flags;
/*    */   public int FullScreen_RefreshRateInHz;
/* 22 */   public int PresentationInterval = Integer.MIN_VALUE;
/*    */   
/*    */   public D3DPRESENT_PARAMETERS(Component component) {
/* 25 */     this.DeviceWindow = component;
/*    */   }
/*    */ }


/* Location:              C:\Users\brett\OneDrive\Desktop\ihatelife\zeah-client.jar!\jagdx\D3DPRESENT_PARAMETERS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */