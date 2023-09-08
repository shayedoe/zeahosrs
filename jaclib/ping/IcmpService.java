package jaclib.ping;

public abstract class IcmpService implements Runnable {
  protected abstract void notify(int paramInt);
  
  protected abstract void notify(int paramInt1, int paramInt2, int paramInt3);
  
  public native void run();
  
  public native void quit();
  
  public static native boolean available();
  
  public native void q();
  
  public native void n();
  
  protected abstract void a(int paramInt);
  
  protected abstract void f(int paramInt);
  
  protected abstract void b(int paramInt1, int paramInt2, int paramInt3);
  
  protected abstract void p(int paramInt1, int paramInt2, int paramInt3);
}


/* Location:              C:\Users\brett\OneDrive\Desktop\ihatelife\zeah-client.jar!\jaclib\ping\IcmpService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */