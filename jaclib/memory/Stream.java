/*     */ package jaclib.memory;
/*     */ 
/*     */ 
/*     */ public final class Stream
/*     */ {
/*     */   private Buffer a;
/*     */   private int f;
/*     */   private int b;
/*     */   private int p;
/*     */   private final byte[] i;
/*  11 */   private static final boolean k = (getLSB(-65536) == -1);
/*     */   
/*     */   public Stream() {
/*  14 */     this(10000);
/*     */   }
/*     */   
/*     */   private Stream(int i) {
/*  18 */     this.i = new byte[i];
/*     */   }
/*     */   
/*     */   public Stream(Buffer buffer) {
/*  22 */     this(buffer, 0, buffer.a());
/*     */   }
/*     */   
/*     */   public Stream(Buffer buffer, int i, int i_0_) {
/*  26 */     this((buffer.a() < 10000) ? buffer.a() : 10000);
/*  27 */     a(buffer, i, i_0_);
/*     */   }
/*     */   
/*     */   private void a(Buffer buffer, int i, int i_1_) {
/*  31 */     x();
/*  32 */     this.a = buffer;
/*  33 */     this.b = i * -1137521459;
/*  34 */     this.f = 193942853 * (i_1_ + i);
/*  35 */     if (-1084754547 * this.f > buffer.a())
/*  36 */       throw new RuntimeException(); 
/*     */   }
/*     */   
/*     */   public final int f() {
/*  40 */     return -846880739 * this.p + -1626734587 * this.b;
/*     */   }
/*     */   
/*     */   public final void b(int i) {
/*  44 */     x();
/*  45 */     this.b = i * -1137521459;
/*     */   }
/*     */   
/*     */   public final void p(int i) {
/*  49 */     if (this.p * -846880739 >= this.i.length)
/*  50 */       x(); 
/*  51 */     this.i[(this.p += -1413864907) * -846880739 - 1] = (byte)i;
/*     */   }
/*     */   
/*     */   public final void i(int i) {
/*  55 */     if (3 + -846880739 * this.p >= this.i.length)
/*  56 */       x(); 
/*  57 */     this.i[(this.p += -1413864907) * -846880739 - 1] = (byte)i;
/*  58 */     this.i[(this.p += -1413864907) * -846880739 - 1] = (byte)(i >> 8);
/*  59 */     this.i[(this.p += -1413864907) * -846880739 - 1] = (byte)(i >> 16);
/*  60 */     this.i[(this.p += -1413864907) * -846880739 - 1] = (byte)(i >> 24);
/*     */   }
/*     */   
/*     */   public final void k(int i) {
/*  64 */     if (3 + this.p * -846880739 >= this.i.length)
/*  65 */       x(); 
/*  66 */     this.i[(this.p += -1413864907) * -846880739 - 1] = (byte)(i >> 16);
/*  67 */     this.i[(this.p += -1413864907) * -846880739 - 1] = (byte)(i >> 8);
/*  68 */     this.i[(this.p += -1413864907) * -846880739 - 1] = (byte)i;
/*  69 */     this.i[(this.p += -1413864907) * -846880739 - 1] = (byte)(i >> 24);
/*     */   }
/*     */   
/*     */   public final void d(float f) {
/*  73 */     if (-846880739 * this.p + 3 >= this.i.length)
/*  74 */       x(); 
/*  75 */     int i = floatToRawIntBits(f);
/*  76 */     this.i[(this.p += -1413864907) * -846880739 - 1] = (byte)(i >> 24);
/*  77 */     this.i[(this.p += -1413864907) * -846880739 - 1] = (byte)(i >> 16);
/*  78 */     this.i[(this.p += -1413864907) * -846880739 - 1] = (byte)(i >> 8);
/*  79 */     this.i[(this.p += -1413864907) * -846880739 - 1] = (byte)i;
/*     */   }
/*     */   
/*     */   public final void u(float f) {
/*  83 */     if (3 + this.p * -846880739 >= this.i.length)
/*  84 */       x(); 
/*  85 */     int i = floatToRawIntBits(f);
/*  86 */     this.i[(this.p += -1413864907) * -846880739 - 1] = (byte)i;
/*  87 */     this.i[(this.p += -1413864907) * -846880739 - 1] = (byte)(i >> 8);
/*  88 */     this.i[(this.p += -1413864907) * -846880739 - 1] = (byte)(i >> 16);
/*  89 */     this.i[(this.p += -1413864907) * -846880739 - 1] = (byte)(i >> 24);
/*     */   }
/*     */   
/*     */   public final void x() {
/*  93 */     if (this.p * -846880739 > 0) {
/*  94 */       if (this.p * -846880739 + -1626734587 * this.b > -1084754547 * this.f)
/*  95 */         throw new RuntimeException(); 
/*  96 */       this.a.b(this.i, 0, -1626734587 * this.b, -846880739 * this.p);
/*  97 */       this.b += this.p * -1589488839;
/*  98 */       this.p = 0;
/*     */     } 
/*     */   }
/*     */   
/*     */   public static final boolean r() {
/* 103 */     return k;
/*     */   }
/*     */   
/*     */   public static native int floatToRawIntBits(float paramFloat);
/*     */   
/*     */   private static final native byte getLSB(int paramInt);
/*     */ }


/* Location:              C:\Users\brett\OneDrive\Desktop\ihatelife\zeah-client.jar!\jaclib\memory\Stream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */