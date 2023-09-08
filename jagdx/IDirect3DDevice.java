/*    */ package jagdx;
/*    */ 
/*    */ public final class IDirect3DDevice
/*    */   extends IUnknown
/*    */ {
/*    */   private IDirect3DDevice() throws Throwable {
/*  7 */     throw new Error();
/*    */   }
/*    */   
/*    */   public static native void Destroy(long paramLong);
/*    */   
/*    */   public static native long GetRenderTarget(long paramLong, int paramInt);
/*    */   
/*    */   public static native void GetRenderTargetData(long paramLong1, long paramLong2, long paramLong3);
/*    */   
/*    */   public static native int SetRenderTarget(long paramLong1, int paramInt, long paramLong2);
/*    */   
/*    */   public static native long CreateRenderTarget(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean);
/*    */   
/*    */   public static native long GetSwapChain(long paramLong, int paramInt);
/*    */   
/*    */   public static native long CreateAdditionalSwapChain(long paramLong, D3DPRESENT_PARAMETERS paramD3DPRESENT_PARAMETERS);
/*    */   
/*    */   public static native long GetDepthStencilSurface(long paramLong);
/*    */   
/*    */   public static native int SetDepthStencilSurface(long paramLong1, long paramLong2);
/*    */   
/*    */   public static native long CreateDepthStencilSurface(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean);
/*    */   
/*    */   public static native long CreateOffscreenPlainSurface(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/*    */   
/*    */   public static native long GetBackBuffer(long paramLong, int paramInt1, int paramInt2, int paramInt3);
/*    */   
/*    */   public static native int StretchRect(long paramLong1, long paramLong2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong3, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9);
/*    */   
/*    */   public static native long CreateVertexBuffer(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/*    */   
/*    */   public static native long CreateIndexBuffer(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/*    */   
/*    */   public static native long CreateVertexDeclaration(long paramLong1, long paramLong2);
/*    */   
/*    */   public static native int SetStreamSource(long paramLong1, int paramInt1, long paramLong2, int paramInt2, int paramInt3);
/*    */   
/*    */   public static native int SetVertexDeclaration(long paramLong1, long paramLong2);
/*    */   
/*    */   public static native int SetIndices(long paramLong1, long paramLong2);
/*    */   
/*    */   public static native int DrawIndexedPrimitive(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6);
/*    */   
/*    */   public static native int DrawIndexedPrimitiveIB(long paramLong1, long paramLong2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6);
/*    */   
/*    */   public static native int DrawPrimitive(long paramLong, int paramInt1, int paramInt2, int paramInt3);
/*    */   
/*    */   public static native long CreateTexture(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6);
/*    */   
/*    */   public static native long CreateCubeTexture(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
/*    */   
/*    */   public static native long CreateVolumeTexture(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7);
/*    */   
/*    */   public static native int SetTexture(long paramLong1, int paramInt, long paramLong2);
/*    */   
/*    */   public static native int SetTextureStageState(long paramLong, int paramInt1, int paramInt2, int paramInt3);
/*    */   
/*    */   public static native int SetSamplerState(long paramLong, int paramInt1, int paramInt2, int paramInt3);
/*    */   
/*    */   public static native int UpdateTexture(long paramLong1, long paramLong2, long paramLong3);
/*    */   
/*    */   public static native long CreateVertexShader(long paramLong, byte[] paramArrayOfbyte);
/*    */   
/*    */   public static native long CreatePixelShader(long paramLong, byte[] paramArrayOfbyte);
/*    */   
/*    */   public static native int SetPixelShader(long paramLong1, long paramLong2);
/*    */   
/*    */   public static native int SetVertexShader(long paramLong1, long paramLong2);
/*    */   
/*    */   public static native int SetPixelShaderConstantF(long paramLong1, int paramInt1, long paramLong2, int paramInt2);
/*    */   
/*    */   public static native int SetVertexShaderConstantF(long paramLong1, int paramInt1, long paramLong2, int paramInt2);
/*    */   
/*    */   public static native long CreateEventQuery(long paramLong);
/*    */   
/*    */   public static native int Clear(long paramLong, int paramInt1, int paramInt2, float paramFloat, int paramInt3);
/*    */   
/*    */   public static native int BeginScene(long paramLong);
/*    */   
/*    */   public static native int EndScene(long paramLong);
/*    */   
/*    */   public static native int SetTransform(long paramLong, int paramInt, float[] paramArrayOffloat);
/*    */   
/*    */   public static native int SetScissorRect(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/*    */   
/*    */   public static native int SetViewport(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2);
/*    */   
/*    */   public static int a(long l, int i, float f) {
/* 95 */     return SetRenderStatef(l, i, f);
/*    */   }
/*    */   
/*    */   public static int f(long l, int i, boolean bool) {
/* 99 */     return SetRenderStateb(l, i, bool);
/*    */   }
/*    */   
/*    */   public static native int SetRenderState(long paramLong, int paramInt1, int paramInt2);
/*    */   
/*    */   private static native int SetRenderStatef(long paramLong, int paramInt, float paramFloat);
/*    */   
/*    */   private static native int SetRenderStateb(long paramLong, int paramInt, boolean paramBoolean);
/*    */   
/*    */   public static native int SetLight(long paramLong1, int paramInt, long paramLong2);
/*    */   
/*    */   public static native boolean LightEnable(long paramLong, int paramInt, boolean paramBoolean);
/*    */   
/*    */   public static native int Reset(long paramLong, D3DPRESENT_PARAMETERS paramD3DPRESENT_PARAMETERS);
/*    */   
/*    */   public static native int TestCooperativeLevel(long paramLong);
/*    */ }


/* Location:              C:\Users\brett\OneDrive\Desktop\ihatelife\zeah-client.jar!\jagdx\IDirect3DDevice.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */