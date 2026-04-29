/*
 * Decompiled with CFR 0.152.
 */
package a.b.c.g;

import a.b.c.g.air;
import a.b.c.g.g;
import a.b.c.g.s5;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.CountDownLatch;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;

class ug
extends WebSocketListener {
    final JsonArray[] n;
    final String[] k;
    final CountDownLatch S;
    final air I;
    private static final String[] O;
    private static final String[] A;
    private static final long Y;
    private static final long a;

    ug(air air2, JsonArray[] jsonArrayArray, String[] stringArray, CountDownLatch countDownLatch) {
        this.I = air2;
        this.n = jsonArrayArray;
        this.k = stringArray;
        this.S = countDownLatch;
    }

    @Override
    public void onOpen(WebSocket webSocket, Response response) {
        webSocket.send(ug.B(20521, 522));
        webSocket.send(ug.B(20516, 28727));
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void onMessage(WebSocket var1_1, String var2_2) {
        block43: {
            var3_3 = ug.a ^ 126179269002432L;
            var6_4 = g.i();
            var5_5 = g.R();
            try {
                block46: {
                    block47: {
                        block45: {
                            block50: {
                                block44: {
                                    block42: {
                                        var7_6 = JsonParser.parseString(var2_2).getAsJsonObject();
                                        try {
                                            v0 = var7_6.has(ug.B(20524, 11927));
                                            v1 = var6_4;
                                            if (var5_5 != null) {
                                                if (v1 != null) break block42;
                                            }
                                            ** GOTO lbl29
                                        }
                                        catch (Exception v2) {
                                            throw ug.b(v2);
                                        }
                                        try {
                                            block48: {
                                                if (v0 == 0) break block43;
                                                break block48;
                                                catch (Exception v3) {
                                                    throw ug.G(v3);
                                                }
                                            }
                                            v0 = var7_6.get(ug.B(20522, -28748)).getAsInt();
                                        }
                                        catch (Exception v4) {
                                            throw ug.G(v4);
                                        }
                                    }
                                    v1 = var6_4;
lbl29:
                                    // 2 sources

                                    try {
                                        if (var5_5 != null) {
                                            if (v1 != null) break block44;
                                        }
                                        ** GOTO lbl49
                                    }
                                    catch (Exception v5) {
                                        throw ug.b(v5);
                                    }
                                    try {
                                        block49: {
                                            if (v0 != 1) break block43;
                                            break block49;
                                            catch (Exception v6) {
                                                throw ug.G(v6);
                                            }
                                        }
                                        v0 = (int)var7_6.has(ug.B(20520, -8272));
                                    }
                                    catch (Exception v7) {
                                        throw ug.G(v7);
                                    }
                                }
                                v1 = var6_4;
lbl49:
                                // 2 sources

                                if (v1 != null) break block45;
                                if (v0 == 0) ** GOTO lbl88
                                break block50;
                                catch (Exception v8) {
                                    throw ug.G(v8);
                                }
                            }
                            try {
                                v0 = (int)var7_6.getAsJsonObject(ug.B(20529, -25356)).has(ug.B(20525, -12656));
                                if (var5_5 != null && var6_4 == null) {
                                }
                                break block45;
                            }
                            catch (Exception v9) {
                                throw ug.b(v9);
                            }
                            catch (Exception v10) {
                                throw ug.G(v10);
                            }
                            try {
                                if (var5_5 == null) break block45;
                                if (v0 != 0) {
                                }
                                ** GOTO lbl88
                            }
                            catch (Exception v11) {
                                throw ug.b(v11);
                            }
                            catch (Exception v12) {
                                throw ug.G(v12);
                            }
                            try {
                                try {
                                    v13 = this;
                                    if (var5_5 == null) break block46;
                                    v13.n[0] = var7_6.getAsJsonObject(ug.B(20529, -25356)).getAsJsonArray(ug.B(20514, -31047));
                                    if (var6_4 != null) {
                                    }
                                    break block47;
                                }
                                catch (Exception v14) {
                                    throw ug.b(v14);
                                }
                                catch (Exception v15) {
                                    throw ug.G(v15);
                                }
lbl88:
                                // 3 sources

                                v0 = (int)var7_6.has(ug.B(20513, 22878));
                            }
                            catch (Exception v16) {
                                throw ug.G(v16);
                            }
                        }
                        if (v0 == 0) ** GOTO lbl107
                        try {
                            try {
                                v13 = this;
                                if (var5_5 == null) break block46;
                                v13.k[0] = ug.B(20518, 8439) + var7_6.getAsJsonObject(ug.B(20527, 5545)).get(ug.B(20517, 17835)).getAsString();
                                if (var6_4 != null) {
                                }
                                break block47;
                            }
                            catch (Exception v17) {
                                throw ug.b(v17);
                            }
                            catch (Exception v18) {
                                throw ug.G(v18);
                            }
lbl107:
                            // 2 sources

                            this.k[0] = ug.B(20519, 27658);
                        }
                        catch (Exception v19) {
                            throw ug.G(v19);
                        }
                    }
                    v13 = this;
                }
                v13.S.countDown();
            }
            catch (Exception var7_7) {
                this.k[0] = ug.B(20515, -17541) + var7_7.getMessage();
                this.S.countDown();
            }
        }
    }

    @Override
    public void onFailure(WebSocket webSocket, Throwable throwable, Response response) {
        String string;
        StringBuilder stringBuilder;
        block7: {
            block8: {
                long l2 = a ^ 0x5C3EF88E9BEEL;
                String[] stringArray = g.i();
                String[] stringArray2 = g.R();
                try {
                    try {
                        block6: {
                            try {
                                String[] stringArray3 = this.k;
                                int n2 = 0;
                                stringBuilder = new StringBuilder().append(ug.B(20526, -2626));
                                if (stringArray2 == null) break block6;
                                string = throwable.getMessage();
                                if (stringArray != null) break block7;
                            }
                            catch (RuntimeException runtimeException) {
                                throw ug.b(runtimeException);
                            }
                            stringBuilder = stringBuilder.append(string);
                        }
                        if (response == null) break block8;
                    }
                    catch (RuntimeException runtimeException) {
                        throw ug.G(runtimeException);
                    }
                    string = ug.B(20512, 24804) + response.code() + ")";
                    break block7;
                }
                catch (RuntimeException runtimeException) {
                    throw ug.G(runtimeException);
                }
            }
            string = "";
        }
        stringArray3[n2] = stringBuilder.append(string).toString();
        this.S.countDown();
    }

    @Override
    public void onClosing(WebSocket webSocket, int n2, String string) {
        webSocket.close((int)Y, ug.B(20528, 15884));
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void onClosed(WebSocket var1_1, int var2_2, String var3_3) {
        block12: {
            block13: {
                block14: {
                    block11: {
                        var4_4 = ug.a ^ 122739653152071L;
                        var7_5 = g.i();
                        var6_6 = g.R();
                        try {
                            try {
                                try {
                                    v0 = this;
                                    v1 = var7_5;
                                    if (var6_6 != null) {
                                        if (v1 != null) break block11;
                                    }
                                    ** GOTO lbl27
                                }
                                catch (RuntimeException v2) {
                                    throw ug.b(v2);
                                }
                                if (v0.S.getCount() <= 0L) break block12;
                            }
                            catch (RuntimeException v3) {
                                throw ug.G(v3);
                            }
                            v0 = this;
                        }
                        catch (RuntimeException v4) {
                            throw ug.G(v4);
                        }
                    }
                    try {
                        try {
                            v1 = var7_5;
lbl27:
                            // 2 sources

                            if (v1 != null) break block13;
                            if (v0.k[0] != null) break block14;
                        }
                        catch (RuntimeException v5) {
                            throw ug.G(v5);
                        }
                        this.k[0] = ug.B(20523, -13448) + var2_2 + ")";
                    }
                    catch (RuntimeException v6) {
                        throw ug.G(v6);
                    }
                }
                v0 = this;
            }
            v0.S.countDown();
        }
    }

    private static Exception G(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block27: {
            block25: {
                block26: {
                    block24: {
                        ug.a = s5.a(-623876925349013096L, 5239694858311248015L, MethodHandles.lookup().lookupClass()).a(229593380204142L);
                        var7 = new String[18];
                        var5_1 = 0;
                        var4_2 = ")\u00ea\u00d9j\u00d3\u00ec\u00c7x\u00b0CN\u0002\u0005D\u001b\u00b9O\u00fa\u0007\u0084\u008az\u00c7'\u0083\u001c!\u00d3\u00eboQ \u0090\u0087\u00a2E\u00e0\u0082\u00eck\u00d1D\u00c2\u00dd\u00bdy\u00f5\t!\u00eaG\u00b5*\u001d0*\u00c5\u00e7v\u0096)\u00d7\u008e\r\u00acD_\u0010O\u008e\u00a7\u00ad\u00c3\f\"u]\u00f6\u0090n\t\u00f1j\u0012,\u00d4\u0014\u00e3\u00c3vI\u00d2S{\u00fc\u00e4\u0083\u00ce\u0099\u0091[J\u0007{\u00a6V\u00115@A\"\u00f9\u00be*\u00fb\u0088\u00c5\u0084\u001b\u00ec\u00b8@\u0017pV\u0017O#NE\u008a&[\u00f5w\u00c4\u00cf\u000er\u00dd\u001cR\u00cb:\\,Z\u008c[5Q\u00ac\u00f8\u00dd\u00cc\u00af\u000f\u00ec\u00b8\u001d[h\u00f1\u0083{U\u000f\u0014\u0080\u00e72\u00cb3*\u00d8$3\u00a0\u00a4\u00f3\u00d3\u001d\u00c6\u008b)\u00b6\u00d4\u00f2\f\u00d0\u0006\u0097\u001c7@\u0014\u00bf\"wi\u0019P\u00c6\u00c0A\u00bc\u0085\u00d9\u00cc\f \u00db\u00f0bFwx\u00f53\u00f5J\u00df\u00dfj\u0080\u0007M\u0098\u0002'\u0000H\u0002\u0090\u00b50|r\u00da\u00ab\u00997\u0015yiL\u00cbB\u0001\u00152b%\u00b9fg\u00a5\u00c1\u00ea\u00ae\u0088\u001di\u00853j\u00db\u00db\u0097\"b\u001d\u0093\u0096,\u008dt\u00be\u001c,F\u001d\u0099R\u0002\u00c81\u0007\u0011\u0094\u00c8\u0004q\u00fb\u00d6\u0013\u00c9\u00fdlZO\t\u00cf\u00be2\u00b4\u00a5Po\u00e4)\u00b6\u0011\u00afH\u0005\u007f\u0093\u00de^\u0016";
                        var6_3 = ")\u00ea\u00d9j\u00d3\u00ec\u00c7x\u00b0CN\u0002\u0005D\u001b\u00b9O\u00fa\u0007\u0084\u008az\u00c7'\u0083\u001c!\u00d3\u00eboQ \u0090\u0087\u00a2E\u00e0\u0082\u00eck\u00d1D\u00c2\u00dd\u00bdy\u00f5\t!\u00eaG\u00b5*\u001d0*\u00c5\u00e7v\u0096)\u00d7\u008e\r\u00acD_\u0010O\u008e\u00a7\u00ad\u00c3\f\"u]\u00f6\u0090n\t\u00f1j\u0012,\u00d4\u0014\u00e3\u00c3vI\u00d2S{\u00fc\u00e4\u0083\u00ce\u0099\u0091[J\u0007{\u00a6V\u00115@A\"\u00f9\u00be*\u00fb\u0088\u00c5\u0084\u001b\u00ec\u00b8@\u0017pV\u0017O#NE\u008a&[\u00f5w\u00c4\u00cf\u000er\u00dd\u001cR\u00cb:\\,Z\u008c[5Q\u00ac\u00f8\u00dd\u00cc\u00af\u000f\u00ec\u00b8\u001d[h\u00f1\u0083{U\u000f\u0014\u0080\u00e72\u00cb3*\u00d8$3\u00a0\u00a4\u00f3\u00d3\u001d\u00c6\u008b)\u00b6\u00d4\u00f2\f\u00d0\u0006\u0097\u001c7@\u0014\u00bf\"wi\u0019P\u00c6\u00c0A\u00bc\u0085\u00d9\u00cc\f \u00db\u00f0bFwx\u00f53\u00f5J\u00df\u00dfj\u0080\u0007M\u0098\u0002'\u0000H\u0002\u0090\u00b50|r\u00da\u00ab\u00997\u0015yiL\u00cbB\u0001\u00152b%\u00b9fg\u00a5\u00c1\u00ea\u00ae\u0088\u001di\u00853j\u00db\u00db\u0097\"b\u001d\u0093\u0096,\u008dt\u00be\u001c,F\u001d\u0099R\u0002\u00c81\u0007\u0011\u0094\u00c8\u0004q\u00fb\u00d6\u0013\u00c9\u00fdlZO\t\u00cf\u00be2\u00b4\u00a5Po\u00e4)\u00b6\u0011\u00afH\u0005\u007f\u0093\u00de^\u0016".length();
                        var3_4 = 12;
                        var2_5 = -1;
lbl8:
                        // 2 sources

                        while (true) {
                            v0 = 26;
                            v1 = ++var2_5;
                            v2 = var4_2.substring(v1, v1 + var3_4);
                            v3 = -1;
                            break block24;
                            break;
                        }
lbl14:
                        // 1 sources

                        while (true) {
                            var7[var5_1++] = v4.intern();
                            if ((var2_5 += var3_4) < var6_3) {
                                var3_4 = var4_2.charAt(var2_5);
                                ** continue;
                            }
                            var4_2 = "?\u0001\u00d9-d\u00f66U\u00c8\u009b,<\u00c3\u0003\u0003\u00b1\u00f54\u0083\b\u00db\u00e5\u0006]\u00ad\u0098\u0080\u0017Q";
                            var6_3 = "?\u0001\u00d9-d\u00f66U\u00c8\u009b,<\u00c3\u0003\u0003\u00b1\u00f54\u0083\b\u00db\u00e5\u0006]\u00ad\u0098\u0080\u0017Q".length();
                            var3_4 = 22;
                            var2_5 = -1;
lbl23:
                            // 2 sources

                            while (true) {
                                v0 = 71;
                                v5 = ++var2_5;
                                v2 = var4_2.substring(v5, v5 + var3_4);
                                v3 = 0;
                                break block24;
                                break;
                            }
                            break;
                        }
lbl29:
                        // 1 sources

                        while (true) {
                            var7[var5_1++] = v4.intern();
                            if ((var2_5 += var3_4) < var6_3) {
                                var3_4 = var4_2.charAt(var2_5);
                                ** continue;
                            }
                            break block25;
                            break;
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var8_6 = 0;
                    try {
                        v8 = v0;
                        v9 = v6;
                        v10 = v7;
                        if (v7 > 1) break block26;
lbl47:
                        // 2 sources

                        while (true) {
                            v11 = v8;
                            v9 = v9;
                            v12 = v9;
                            v13 = v8;
                            v14 = var8_6;
                            break;
                        }
                    }
                    catch (RuntimeException v15) {
                        throw ug.b(v15);
                    }
                    while (true) {
                        switch (var8_6 % 7) {
                            case 0: {
                                v16 = 45;
                                break;
                            }
                            case 1: {
                                v16 = 98;
                                break;
                            }
                            case 2: {
                                v16 = 118;
                                break;
                            }
                            case 3: {
                                v16 = 106;
                                break;
                            }
                            case 4: {
                                v16 = 20;
                                break;
                            }
                            case 5: {
                                v16 = 12;
                                break;
                            }
                            default: {
                                v16 = 20;
                            }
                        }
                        try {
                            v12[v14] = (char)(v12[v14] ^ (v13 ^ v16));
                            ++var8_6;
                            v8 = v11;
                            if (v11 != 0) break;
                            v11 = v8;
                            v9 = v9;
                            v14 = v8;
                            v12 = v9;
                            v13 = v8;
                        }
                        catch (RuntimeException v17) {
                            throw ug.b(v17);
                        }
                    }
                }
                v18 = v9;
                v10 = v10;
                ** while (v10 > var8_6)
lbl98:
                // 1 sources

                v4 = new String(v18);
                switch (v3) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl105:
                    // 1 sources

                    ** continue;
                }
            }
            ug.O = var7;
            ug.A = new String[18];
            break block27;
lbl110:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 230385024151330537L;
        ** while (true)
        ug.Y = -9009666698586088191L ^ var0_7;
    }

    /*
     * Unable to fully structure code
     */
    private static String B(int var0, int var1_1) {
        block268: {
            block269: {
                block273: {
                    block274: {
                        block271: {
                            block272: {
                                block270: {
                                    var2_2 = g.R();
                                    var3_3 = (var0 ^ 20512) & 65535;
                                    try {
                                        v0 = ug.A[var3_3];
                                        if (var2_2 == null) break block268;
                                        if (v0 != null) break block269;
                                    }
                                    catch (RuntimeException v1) {
                                        throw ug.b(v1);
                                    }
                                    var4_4 = ug.O[var3_3].toCharArray();
                                    try {
                                        v2 = var4_4[0] & 255;
                                        if (var2_2 == null) break block270;
                                    }
                                    catch (RuntimeException v3) {
                                        throw ug.b(v3);
                                    }
                                    {
                                        ** switch (v2)
                                    }
lbl-1000:
                                    // 1 sources

                                    {
                                        case 0: {
                                            v2 = 189;
                                            break;
                                        }
lbl21:
                                        // 1 sources

                                        case 1: {
                                            v2 = 251;
                                            break;
                                        }
lbl24:
                                        // 1 sources

                                        case 2: {
                                            v2 = 214;
                                            break;
                                        }
lbl27:
                                        // 1 sources

                                        case 3: {
                                            v2 = 10;
                                            break;
                                        }
lbl30:
                                        // 1 sources

                                        case 4: {
                                            v2 = 253;
                                            break;
                                        }
lbl33:
                                        // 1 sources

                                        case 5: {
                                            v2 = 56;
                                            break;
                                        }
lbl36:
                                        // 1 sources

                                        case 6: {
                                            v2 = 111;
                                            break;
                                        }
lbl39:
                                        // 1 sources

                                        case 7: {
                                            v2 = 105;
                                            break;
                                        }
lbl42:
                                        // 1 sources

                                        case 8: {
                                            v2 = 33;
                                            break;
                                        }
lbl45:
                                        // 1 sources

                                        case 9: {
                                            v2 = 121;
                                            break;
                                        }
lbl48:
                                        // 1 sources

                                        case 10: {
                                            v2 = 239;
                                            break;
                                        }
lbl51:
                                        // 1 sources

                                        case 11: {
                                            v2 = 69;
                                            break;
                                        }
lbl54:
                                        // 1 sources

                                        case 12: {
                                            v2 = 164;
                                            break;
                                        }
lbl57:
                                        // 1 sources

                                        case 13: {
                                            v2 = 209;
                                            break;
                                        }
lbl60:
                                        // 1 sources

                                        case 14: {
                                            v2 = 240;
                                            break;
                                        }
lbl63:
                                        // 1 sources

                                        case 15: {
                                            v2 = 74;
                                            break;
                                        }
lbl66:
                                        // 1 sources

                                        case 16: {
                                            v2 = 188;
                                            break;
                                        }
lbl69:
                                        // 1 sources

                                        case 17: {
                                            v2 = 102;
                                            break;
                                        }
lbl72:
                                        // 1 sources

                                        case 18: {
                                            v2 = 89;
                                            break;
                                        }
lbl75:
                                        // 1 sources

                                        case 19: {
                                            v2 = 2;
                                            break;
                                        }
lbl78:
                                        // 1 sources

                                        case 20: {
                                            v2 = 236;
                                            break;
                                        }
lbl81:
                                        // 1 sources

                                        case 21: {
                                            v2 = 104;
                                            break;
                                        }
lbl84:
                                        // 1 sources

                                        case 22: {
                                            v2 = 142;
                                            break;
                                        }
lbl87:
                                        // 1 sources

                                        case 23: {
                                            v2 = 177;
                                            break;
                                        }
lbl90:
                                        // 1 sources

                                        case 24: {
                                            v2 = 52;
                                            break;
                                        }
lbl93:
                                        // 1 sources

                                        case 25: {
                                            v2 = 0;
                                            break;
                                        }
lbl96:
                                        // 1 sources

                                        case 26: {
                                            v2 = 49;
                                            break;
                                        }
lbl99:
                                        // 1 sources

                                        case 27: {
                                            v2 = 196;
                                            break;
                                        }
lbl102:
                                        // 1 sources

                                        case 28: {
                                            v2 = 228;
                                            break;
                                        }
lbl105:
                                        // 1 sources

                                        case 29: {
                                            v2 = 212;
                                            break;
                                        }
lbl108:
                                        // 1 sources

                                        case 30: {
                                            v2 = 166;
                                            break;
                                        }
lbl111:
                                        // 1 sources

                                        case 31: {
                                            v2 = 55;
                                            break;
                                        }
lbl114:
                                        // 1 sources

                                        case 32: {
                                            v2 = 7;
                                            break;
                                        }
lbl117:
                                        // 1 sources

                                        case 33: {
                                            v2 = 161;
                                            break;
                                        }
lbl120:
                                        // 1 sources

                                        case 34: {
                                            v2 = 37;
                                            break;
                                        }
lbl123:
                                        // 1 sources

                                        case 35: {
                                            v2 = 50;
                                            break;
                                        }
lbl126:
                                        // 1 sources

                                        case 36: {
                                            v2 = 91;
                                            break;
                                        }
lbl129:
                                        // 1 sources

                                        case 37: {
                                            v2 = 179;
                                            break;
                                        }
lbl132:
                                        // 1 sources

                                        case 38: {
                                            v2 = 75;
                                            break;
                                        }
lbl135:
                                        // 1 sources

                                        case 39: {
                                            v2 = 23;
                                            break;
                                        }
lbl138:
                                        // 1 sources

                                        case 40: {
                                            v2 = 173;
                                            break;
                                        }
lbl141:
                                        // 1 sources

                                        case 41: {
                                            v2 = 232;
                                            break;
                                        }
lbl144:
                                        // 1 sources

                                        case 42: {
                                            v2 = 51;
                                            break;
                                        }
lbl147:
                                        // 1 sources

                                        case 43: {
                                            v2 = 137;
                                            break;
                                        }
lbl150:
                                        // 1 sources

                                        case 44: {
                                            v2 = 58;
                                            break;
                                        }
lbl153:
                                        // 1 sources

                                        case 45: {
                                            v2 = 86;
                                            break;
                                        }
lbl156:
                                        // 1 sources

                                        case 46: {
                                            v2 = 154;
                                            break;
                                        }
lbl159:
                                        // 1 sources

                                        case 47: {
                                            v2 = 229;
                                            break;
                                        }
lbl162:
                                        // 1 sources

                                        case 48: {
                                            v2 = 235;
                                            break;
                                        }
lbl165:
                                        // 1 sources

                                        case 49: {
                                            v2 = 122;
                                            break;
                                        }
lbl168:
                                        // 1 sources

                                        case 50: {
                                            v2 = 140;
                                            break;
                                        }
lbl171:
                                        // 1 sources

                                        case 51: {
                                            v2 = 200;
                                            break;
                                        }
lbl174:
                                        // 1 sources

                                        case 52: {
                                            v2 = 255;
                                            break;
                                        }
lbl177:
                                        // 1 sources

                                        case 53: {
                                            v2 = 94;
                                            break;
                                        }
lbl180:
                                        // 1 sources

                                        case 54: {
                                            v2 = 59;
                                            break;
                                        }
lbl183:
                                        // 1 sources

                                        case 55: {
                                            v2 = 175;
                                            break;
                                        }
lbl186:
                                        // 1 sources

                                        case 56: {
                                            v2 = 199;
                                            break;
                                        }
lbl189:
                                        // 1 sources

                                        case 57: {
                                            v2 = 57;
                                            break;
                                        }
lbl192:
                                        // 1 sources

                                        case 58: {
                                            v2 = 26;
                                            break;
                                        }
lbl195:
                                        // 1 sources

                                        case 59: {
                                            v2 = 197;
                                            break;
                                        }
lbl198:
                                        // 1 sources

                                        case 60: {
                                            v2 = 183;
                                            break;
                                        }
lbl201:
                                        // 1 sources

                                        case 61: {
                                            v2 = 5;
                                            break;
                                        }
lbl204:
                                        // 1 sources

                                        case 62: {
                                            v2 = 130;
                                            break;
                                        }
lbl207:
                                        // 1 sources

                                        case 63: {
                                            v2 = 44;
                                            break;
                                        }
lbl210:
                                        // 1 sources

                                        case 64: {
                                            v2 = 207;
                                            break;
                                        }
lbl213:
                                        // 1 sources

                                        case 65: {
                                            v2 = 202;
                                            break;
                                        }
lbl216:
                                        // 1 sources

                                        case 66: {
                                            v2 = 19;
                                            break;
                                        }
lbl219:
                                        // 1 sources

                                        case 67: {
                                            v2 = 176;
                                            break;
                                        }
lbl222:
                                        // 1 sources

                                        case 68: {
                                            v2 = 171;
                                            break;
                                        }
lbl225:
                                        // 1 sources

                                        case 69: {
                                            v2 = 203;
                                            break;
                                        }
lbl228:
                                        // 1 sources

                                        case 70: {
                                            v2 = 221;
                                            break;
                                        }
lbl231:
                                        // 1 sources

                                        case 71: {
                                            v2 = 27;
                                            break;
                                        }
lbl234:
                                        // 1 sources

                                        case 72: {
                                            v2 = 124;
                                            break;
                                        }
lbl237:
                                        // 1 sources

                                        case 73: {
                                            v2 = 167;
                                            break;
                                        }
lbl240:
                                        // 1 sources

                                        case 74: {
                                            v2 = 83;
                                            break;
                                        }
lbl243:
                                        // 1 sources

                                        case 75: {
                                            v2 = 92;
                                            break;
                                        }
lbl246:
                                        // 1 sources

                                        case 76: {
                                            v2 = 138;
                                            break;
                                        }
lbl249:
                                        // 1 sources

                                        case 77: {
                                            v2 = 250;
                                            break;
                                        }
lbl252:
                                        // 1 sources

                                        case 78: {
                                            v2 = 101;
                                            break;
                                        }
lbl255:
                                        // 1 sources

                                        case 79: {
                                            v2 = 129;
                                            break;
                                        }
lbl258:
                                        // 1 sources

                                        case 80: {
                                            v2 = 25;
                                            break;
                                        }
lbl261:
                                        // 1 sources

                                        case 81: {
                                            v2 = 6;
                                            break;
                                        }
lbl264:
                                        // 1 sources

                                        case 82: {
                                            v2 = 63;
                                            break;
                                        }
lbl267:
                                        // 1 sources

                                        case 83: {
                                            v2 = 244;
                                            break;
                                        }
lbl270:
                                        // 1 sources

                                        case 84: {
                                            v2 = 136;
                                            break;
                                        }
lbl273:
                                        // 1 sources

                                        case 85: {
                                            v2 = 246;
                                            break;
                                        }
lbl276:
                                        // 1 sources

                                        case 86: {
                                            v2 = 106;
                                            break;
                                        }
lbl279:
                                        // 1 sources

                                        case 87: {
                                            v2 = 99;
                                            break;
                                        }
lbl282:
                                        // 1 sources

                                        case 88: {
                                            v2 = 215;
                                            break;
                                        }
lbl285:
                                        // 1 sources

                                        case 89: {
                                            v2 = 135;
                                            break;
                                        }
lbl288:
                                        // 1 sources

                                        case 90: {
                                            v2 = 60;
                                            break;
                                        }
lbl291:
                                        // 1 sources

                                        case 91: {
                                            v2 = 16;
                                            break;
                                        }
lbl294:
                                        // 1 sources

                                        case 92: {
                                            v2 = 61;
                                            break;
                                        }
lbl297:
                                        // 1 sources

                                        case 93: {
                                            v2 = 133;
                                            break;
                                        }
lbl300:
                                        // 1 sources

                                        case 94: {
                                            v2 = 172;
                                            break;
                                        }
lbl303:
                                        // 1 sources

                                        case 95: {
                                            v2 = 147;
                                            break;
                                        }
lbl306:
                                        // 1 sources

                                        case 96: {
                                            v2 = 181;
                                            break;
                                        }
lbl309:
                                        // 1 sources

                                        case 97: {
                                            v2 = 151;
                                            break;
                                        }
lbl312:
                                        // 1 sources

                                        case 98: {
                                            v2 = 18;
                                            break;
                                        }
lbl315:
                                        // 1 sources

                                        case 99: {
                                            v2 = 76;
                                            break;
                                        }
lbl318:
                                        // 1 sources

                                        case 100: {
                                            v2 = 186;
                                            break;
                                        }
lbl321:
                                        // 1 sources

                                        case 101: {
                                            v2 = 165;
                                            break;
                                        }
lbl324:
                                        // 1 sources

                                        case 102: {
                                            v2 = 242;
                                            break;
                                        }
lbl327:
                                        // 1 sources

                                        case 103: {
                                            v2 = 42;
                                            break;
                                        }
lbl330:
                                        // 1 sources

                                        case 104: {
                                            v2 = 148;
                                            break;
                                        }
lbl333:
                                        // 1 sources

                                        case 105: {
                                            v2 = 217;
                                            break;
                                        }
lbl336:
                                        // 1 sources

                                        case 106: {
                                            v2 = 38;
                                            break;
                                        }
lbl339:
                                        // 1 sources

                                        case 107: {
                                            v2 = 139;
                                            break;
                                        }
lbl342:
                                        // 1 sources

                                        case 108: {
                                            v2 = 123;
                                            break;
                                        }
lbl345:
                                        // 1 sources

                                        case 109: {
                                            v2 = 210;
                                            break;
                                        }
lbl348:
                                        // 1 sources

                                        case 110: {
                                            v2 = 162;
                                            break;
                                        }
lbl351:
                                        // 1 sources

                                        case 111: {
                                            v2 = 224;
                                            break;
                                        }
lbl354:
                                        // 1 sources

                                        case 112: {
                                            v2 = 243;
                                            break;
                                        }
lbl357:
                                        // 1 sources

                                        case 113: {
                                            v2 = 47;
                                            break;
                                        }
lbl360:
                                        // 1 sources

                                        case 114: {
                                            v2 = 3;
                                            break;
                                        }
lbl363:
                                        // 1 sources

                                        case 115: {
                                            v2 = 72;
                                            break;
                                        }
lbl366:
                                        // 1 sources

                                        case 116: {
                                            v2 = 39;
                                            break;
                                        }
lbl369:
                                        // 1 sources

                                        case 117: {
                                            v2 = 150;
                                            break;
                                        }
lbl372:
                                        // 1 sources

                                        case 118: {
                                            v2 = 128;
                                            break;
                                        }
lbl375:
                                        // 1 sources

                                        case 119: {
                                            v2 = 194;
                                            break;
                                        }
lbl378:
                                        // 1 sources

                                        case 120: {
                                            v2 = 223;
                                            break;
                                        }
lbl381:
                                        // 1 sources

                                        case 121: {
                                            v2 = 67;
                                            break;
                                        }
lbl384:
                                        // 1 sources

                                        case 122: {
                                            v2 = 191;
                                            break;
                                        }
lbl387:
                                        // 1 sources

                                        case 123: {
                                            v2 = 110;
                                            break;
                                        }
lbl390:
                                        // 1 sources

                                        case 124: {
                                            v2 = 78;
                                            break;
                                        }
lbl393:
                                        // 1 sources

                                        case 125: {
                                            v2 = 159;
                                            break;
                                        }
lbl396:
                                        // 1 sources

                                        case 126: {
                                            v2 = 70;
                                            break;
                                        }
lbl399:
                                        // 1 sources

                                        case 127: {
                                            v2 = 9;
                                            break;
                                        }
lbl402:
                                        // 1 sources

                                        case 128: {
                                            v2 = 227;
                                            break;
                                        }
lbl405:
                                        // 1 sources

                                        case 129: {
                                            v2 = 234;
                                            break;
                                        }
lbl408:
                                        // 1 sources

                                        case 130: {
                                            v2 = 206;
                                            break;
                                        }
lbl411:
                                        // 1 sources

                                        case 131: {
                                            v2 = 134;
                                            break;
                                        }
lbl414:
                                        // 1 sources

                                        case 132: {
                                            v2 = 113;
                                            break;
                                        }
lbl417:
                                        // 1 sources

                                        case 133: {
                                            v2 = 46;
                                            break;
                                        }
lbl420:
                                        // 1 sources

                                        case 134: {
                                            v2 = 103;
                                            break;
                                        }
lbl423:
                                        // 1 sources

                                        case 135: {
                                            v2 = 115;
                                            break;
                                        }
lbl426:
                                        // 1 sources

                                        case 136: {
                                            v2 = 145;
                                            break;
                                        }
lbl429:
                                        // 1 sources

                                        case 137: {
                                            v2 = 131;
                                            break;
                                        }
lbl432:
                                        // 1 sources

                                        case 138: {
                                            v2 = 100;
                                            break;
                                        }
lbl435:
                                        // 1 sources

                                        case 139: {
                                            v2 = 195;
                                            break;
                                        }
lbl438:
                                        // 1 sources

                                        case 140: {
                                            v2 = 48;
                                            break;
                                        }
lbl441:
                                        // 1 sources

                                        case 141: {
                                            v2 = 8;
                                            break;
                                        }
lbl444:
                                        // 1 sources

                                        case 142: {
                                            v2 = 20;
                                            break;
                                        }
lbl447:
                                        // 1 sources

                                        case 143: {
                                            v2 = 208;
                                            break;
                                        }
lbl450:
                                        // 1 sources

                                        case 144: {
                                            v2 = 28;
                                            break;
                                        }
lbl453:
                                        // 1 sources

                                        case 145: {
                                            v2 = 190;
                                            break;
                                        }
lbl456:
                                        // 1 sources

                                        case 146: {
                                            v2 = 35;
                                            break;
                                        }
lbl459:
                                        // 1 sources

                                        case 147: {
                                            v2 = 118;
                                            break;
                                        }
lbl462:
                                        // 1 sources

                                        case 148: {
                                            v2 = 11;
                                            break;
                                        }
lbl465:
                                        // 1 sources

                                        case 149: {
                                            v2 = 34;
                                            break;
                                        }
lbl468:
                                        // 1 sources

                                        case 150: {
                                            v2 = 247;
                                            break;
                                        }
lbl471:
                                        // 1 sources

                                        case 151: {
                                            v2 = 79;
                                            break;
                                        }
lbl474:
                                        // 1 sources

                                        case 152: {
                                            v2 = 29;
                                            break;
                                        }
lbl477:
                                        // 1 sources

                                        case 153: {
                                            v2 = 109;
                                            break;
                                        }
lbl480:
                                        // 1 sources

                                        case 154: {
                                            v2 = 80;
                                            break;
                                        }
lbl483:
                                        // 1 sources

                                        case 155: {
                                            v2 = 170;
                                            break;
                                        }
lbl486:
                                        // 1 sources

                                        case 156: {
                                            v2 = 117;
                                            break;
                                        }
lbl489:
                                        // 1 sources

                                        case 157: {
                                            v2 = 153;
                                            break;
                                        }
lbl492:
                                        // 1 sources

                                        case 158: {
                                            v2 = 237;
                                            break;
                                        }
lbl495:
                                        // 1 sources

                                        case 159: {
                                            v2 = 204;
                                            break;
                                        }
lbl498:
                                        // 1 sources

                                        case 160: {
                                            v2 = 222;
                                            break;
                                        }
lbl501:
                                        // 1 sources

                                        case 161: {
                                            v2 = 66;
                                            break;
                                        }
lbl504:
                                        // 1 sources

                                        case 162: {
                                            v2 = 252;
                                            break;
                                        }
lbl507:
                                        // 1 sources

                                        case 163: {
                                            v2 = 238;
                                            break;
                                        }
lbl510:
                                        // 1 sources

                                        case 164: {
                                            v2 = 4;
                                            break;
                                        }
lbl513:
                                        // 1 sources

                                        case 165: {
                                            v2 = 116;
                                            break;
                                        }
lbl516:
                                        // 1 sources

                                        case 166: {
                                            v2 = 15;
                                            break;
                                        }
lbl519:
                                        // 1 sources

                                        case 167: {
                                            v2 = 230;
                                            break;
                                        }
lbl522:
                                        // 1 sources

                                        case 168: {
                                            v2 = 213;
                                            break;
                                        }
lbl525:
                                        // 1 sources

                                        case 169: {
                                            v2 = 216;
                                            break;
                                        }
lbl528:
                                        // 1 sources

                                        case 170: {
                                            v2 = 158;
                                            break;
                                        }
lbl531:
                                        // 1 sources

                                        case 171: {
                                            v2 = 36;
                                            break;
                                        }
lbl534:
                                        // 1 sources

                                        case 172: {
                                            v2 = 180;
                                            break;
                                        }
lbl537:
                                        // 1 sources

                                        case 173: {
                                            v2 = 192;
                                            break;
                                        }
lbl540:
                                        // 1 sources

                                        case 174: {
                                            v2 = 73;
                                            break;
                                        }
lbl543:
                                        // 1 sources

                                        case 175: {
                                            v2 = 125;
                                            break;
                                        }
lbl546:
                                        // 1 sources

                                        case 176: {
                                            v2 = 146;
                                            break;
                                        }
lbl549:
                                        // 1 sources

                                        case 177: {
                                            v2 = 93;
                                            break;
                                        }
lbl552:
                                        // 1 sources

                                        case 178: {
                                            v2 = 168;
                                            break;
                                        }
lbl555:
                                        // 1 sources

                                        case 179: {
                                            v2 = 233;
                                            break;
                                        }
lbl558:
                                        // 1 sources

                                        case 180: {
                                            v2 = 12;
                                            break;
                                        }
lbl561:
                                        // 1 sources

                                        case 181: {
                                            v2 = 127;
                                            break;
                                        }
lbl564:
                                        // 1 sources

                                        case 182: {
                                            v2 = 31;
                                            break;
                                        }
lbl567:
                                        // 1 sources

                                        case 183: {
                                            v2 = 41;
                                            break;
                                        }
lbl570:
                                        // 1 sources

                                        case 184: {
                                            v2 = 14;
                                            break;
                                        }
lbl573:
                                        // 1 sources

                                        case 185: {
                                            v2 = 112;
                                            break;
                                        }
lbl576:
                                        // 1 sources

                                        case 186: {
                                            v2 = 24;
                                            break;
                                        }
lbl579:
                                        // 1 sources

                                        case 187: {
                                            v2 = 187;
                                            break;
                                        }
lbl582:
                                        // 1 sources

                                        case 188: {
                                            v2 = 226;
                                            break;
                                        }
lbl585:
                                        // 1 sources

                                        case 189: {
                                            v2 = 185;
                                            break;
                                        }
lbl588:
                                        // 1 sources

                                        case 190: {
                                            v2 = 32;
                                            break;
                                        }
lbl591:
                                        // 1 sources

                                        case 191: {
                                            v2 = 174;
                                            break;
                                        }
lbl594:
                                        // 1 sources

                                        case 192: {
                                            v2 = 248;
                                            break;
                                        }
lbl597:
                                        // 1 sources

                                        case 193: {
                                            v2 = 114;
                                            break;
                                        }
lbl600:
                                        // 1 sources

                                        case 194: {
                                            v2 = 45;
                                            break;
                                        }
lbl603:
                                        // 1 sources

                                        case 195: {
                                            v2 = 30;
                                            break;
                                        }
lbl606:
                                        // 1 sources

                                        case 196: {
                                            v2 = 62;
                                            break;
                                        }
lbl609:
                                        // 1 sources

                                        case 197: {
                                            v2 = 119;
                                            break;
                                        }
lbl612:
                                        // 1 sources

                                        case 198: {
                                            v2 = 231;
                                            break;
                                        }
lbl615:
                                        // 1 sources

                                        case 199: {
                                            v2 = 43;
                                            break;
                                        }
lbl618:
                                        // 1 sources

                                        case 200: {
                                            v2 = 219;
                                            break;
                                        }
lbl621:
                                        // 1 sources

                                        case 201: {
                                            v2 = 87;
                                            break;
                                        }
lbl624:
                                        // 1 sources

                                        case 202: {
                                            v2 = 184;
                                            break;
                                        }
lbl627:
                                        // 1 sources

                                        case 203: {
                                            v2 = 144;
                                            break;
                                        }
lbl630:
                                        // 1 sources

                                        case 204: {
                                            v2 = 84;
                                            break;
                                        }
lbl633:
                                        // 1 sources

                                        case 205: {
                                            v2 = 132;
                                            break;
                                        }
lbl636:
                                        // 1 sources

                                        case 206: {
                                            v2 = 108;
                                            break;
                                        }
lbl639:
                                        // 1 sources

                                        case 207: {
                                            v2 = 98;
                                            break;
                                        }
lbl642:
                                        // 1 sources

                                        case 208: {
                                            v2 = 88;
                                            break;
                                        }
lbl645:
                                        // 1 sources

                                        case 209: {
                                            v2 = 220;
                                            break;
                                        }
lbl648:
                                        // 1 sources

                                        case 210: {
                                            v2 = 157;
                                            break;
                                        }
lbl651:
                                        // 1 sources

                                        case 211: {
                                            v2 = 81;
                                            break;
                                        }
lbl654:
                                        // 1 sources

                                        case 212: {
                                            v2 = 17;
                                            break;
                                        }
lbl657:
                                        // 1 sources

                                        case 213: {
                                            v2 = 13;
                                            break;
                                        }
lbl660:
                                        // 1 sources

                                        case 214: {
                                            v2 = 126;
                                            break;
                                        }
lbl663:
                                        // 1 sources

                                        case 215: {
                                            v2 = 155;
                                            break;
                                        }
lbl666:
                                        // 1 sources

                                        case 216: {
                                            v2 = 254;
                                            break;
                                        }
lbl669:
                                        // 1 sources

                                        case 217: {
                                            v2 = 90;
                                            break;
                                        }
lbl672:
                                        // 1 sources

                                        case 218: {
                                            v2 = 96;
                                            break;
                                        }
lbl675:
                                        // 1 sources

                                        case 219: {
                                            v2 = 160;
                                            break;
                                        }
lbl678:
                                        // 1 sources

                                        case 220: {
                                            v2 = 152;
                                            break;
                                        }
lbl681:
                                        // 1 sources

                                        case 221: {
                                            v2 = 241;
                                            break;
                                        }
lbl684:
                                        // 1 sources

                                        case 222: {
                                            v2 = 85;
                                            break;
                                        }
lbl687:
                                        // 1 sources

                                        case 223: {
                                            v2 = 193;
                                            break;
                                        }
lbl690:
                                        // 1 sources

                                        case 224: {
                                            v2 = 156;
                                            break;
                                        }
lbl693:
                                        // 1 sources

                                        case 225: {
                                            v2 = 225;
                                            break;
                                        }
lbl696:
                                        // 1 sources

                                        case 226: {
                                            v2 = 54;
                                            break;
                                        }
lbl699:
                                        // 1 sources

                                        case 227: {
                                            v2 = 77;
                                            break;
                                        }
lbl702:
                                        // 1 sources

                                        case 228: {
                                            v2 = 218;
                                            break;
                                        }
lbl705:
                                        // 1 sources

                                        case 229: {
                                            v2 = 68;
                                            break;
                                        }
lbl708:
                                        // 1 sources

                                        case 230: {
                                            v2 = 82;
                                            break;
                                        }
lbl711:
                                        // 1 sources

                                        case 231: {
                                            v2 = 245;
                                            break;
                                        }
lbl714:
                                        // 1 sources

                                        case 232: {
                                            v2 = 64;
                                            break;
                                        }
lbl717:
                                        // 1 sources

                                        case 233: {
                                            v2 = 143;
                                            break;
                                        }
lbl720:
                                        // 1 sources

                                        case 234: {
                                            v2 = 40;
                                            break;
                                        }
lbl723:
                                        // 1 sources

                                        case 235: {
                                            v2 = 205;
                                            break;
                                        }
lbl726:
                                        // 1 sources

                                        case 236: {
                                            v2 = 120;
                                            break;
                                        }
lbl729:
                                        // 1 sources

                                        case 237: {
                                            v2 = 95;
                                            break;
                                        }
lbl732:
                                        // 1 sources

                                        case 238: {
                                            v2 = 22;
                                            break;
                                        }
lbl735:
                                        // 1 sources

                                        case 239: {
                                            v2 = 65;
                                            break;
                                        }
lbl738:
                                        // 1 sources

                                        case 240: {
                                            v2 = 249;
                                            break;
                                        }
lbl741:
                                        // 1 sources

                                        case 241: {
                                            v2 = 71;
                                            break;
                                        }
lbl744:
                                        // 1 sources

                                        case 242: {
                                            v2 = 163;
                                            break;
                                        }
lbl747:
                                        // 1 sources

                                        case 243: {
                                            v2 = 169;
                                            break;
                                        }
lbl750:
                                        // 1 sources

                                        case 244: {
                                            v2 = 97;
                                            break;
                                        }
lbl753:
                                        // 1 sources

                                        case 245: {
                                            v2 = 198;
                                            break;
                                        }
lbl756:
                                        // 1 sources

                                        case 246: {
                                            v2 = 141;
                                            break;
                                        }
lbl759:
                                        // 1 sources

                                        case 247: {
                                            v2 = 53;
                                            break;
                                        }
lbl762:
                                        // 1 sources

                                        case 248: {
                                            v2 = 149;
                                            break;
                                        }
lbl765:
                                        // 1 sources

                                        case 249: {
                                            v2 = 211;
                                            break;
                                        }
lbl768:
                                        // 1 sources

                                        case 250: {
                                            v2 = 201;
                                            break;
                                        }
lbl771:
                                        // 1 sources

                                        case 251: {
                                            v2 = 107;
                                            break;
                                        }
lbl774:
                                        // 1 sources

                                        case 252: {
                                            v2 = 182;
                                            break;
                                        }
lbl777:
                                        // 1 sources

                                        case 253: {
                                            v2 = 178;
                                            break;
                                        }
lbl780:
                                        // 1 sources

                                        case 254: {
                                            v2 = 21;
                                            break;
                                        }
lbl783:
                                        // 1 sources

                                        default: {
                                            v2 = 1;
                                        }
                                    }
                                }
                                var5_5 = v2;
                                var6_6 = (var1_1 & 255) - var5_5;
                                try {
                                    v4 = var6_6;
                                    if (var2_2 == null) break block271;
                                    if (v4 >= 0) break block272;
                                }
                                catch (RuntimeException v5) {
                                    throw ug.b(v5);
                                }
                                var6_6 += 256;
                            }
                            v4 = ((var1_1 & 65535) >>> 8) - var5_5;
                        }
                        var7_7 = v4;
                        try {
                            v6 = var7_7;
                            if (var2_2 == null) break block273;
                            if (v6 >= 0) break block274;
                        }
                        catch (RuntimeException v7) {
                            throw ug.b(v7);
                        }
                        var7_7 += 256;
                    }
                    v6 = var8_8 = 0;
                }
                if (var2_2 != null) ** GOTO lbl827
                do {
                    var9_9 = var8_8 % 2;
                    v8 = var8_8;
                    v9 = var4_4;
                    v10 = var4_4[v8];
                    v11 = var9_9;
                    if (var2_2 == null) ** GOTO lbl824
                    if (v11 == 0) {
                        v9[v8] = (char)(v10 ^ var6_6);
                        var6_6 = ((var6_6 >>> 3 | var6_6 << 5) ^ var4_4[var8_8]) & 255;
                    } else {
                        v11 = var7_7;
lbl824:
                        // 2 sources

                        v9[v8] = (char)(v10 ^ v11);
                        var7_7 = ((var7_7 >>> 3 | var7_7 << 5) ^ var4_4[var8_8]) & 255;
                    }
                    ++var8_8;
lbl827:
                    // 2 sources

                } while (var8_8 < var4_4.length);
                ug.A[var3_3] = new String(var4_4).intern();
            }
            v0 = ug.A[var3_3];
        }
        return v0;
    }

    private static Exception b(Exception exception) {
        return exception;
    }
}

