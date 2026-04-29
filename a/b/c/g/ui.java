/*
 * Decompiled with CFR 0.152.
 */
package a.b.c.g;

import java.util.List;

class ui {
    List<String> f;
    int S;
    String K;
    List<ui> B;

    ui(List<String> list, int n2) {
        this.f = list;
        this.S = n2;
    }

    ui(List<String> list, int n2, String string) {
        this(list, n2);
        this.K = string;
    }

    public static ui multi(List<ui> list, int n2) {
        ui ui2 = new ui(null, n2);
        ui2.B = list;
        return ui2;
    }
}

