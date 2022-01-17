package com.example.projectuas;

import static com.example.projectuas.R.string.germaindetail;;

import android.content.Context;

import com.example.projectuas.model.Copa;
import com.example.projectuas.model.Cup;
import com.example.projectuas.model.Euro;
import com.example.projectuas.model.Afc;
import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    private static List<Cup> cup = new ArrayList<>();

    private static List<Euro> initDataEuro(Context ctx) {
        List<Euro> Euro = new ArrayList<>();
        Euro.add(new Euro(ctx.getString(R.string.belgia), ctx.getString(R.string.kotabelgia),
                ctx.getString(R.string.belgiadetail), R.drawable.belgia));
        Euro.add(new Euro(ctx.getString(R.string.spanyol), ctx.getString(R.string.kotaspanyol),
                ctx.getString(R.string.spanyoldetail), R.drawable.spain));
        Euro.add(new Euro(ctx.getString(R.string.inggris), ctx.getString(R.string.kotainggris),
                ctx.getString(R.string.inggrisdetail), R.drawable.england));
        Euro.add(new Euro(ctx.getString(R.string.prancis), ctx.getString(R.string.kotaprancis),
                ctx.getString(R.string.prancisdetail), R.drawable.france));
        Euro.add(new Euro(ctx.getString(R.string.germain), ctx.getString(R.string.germainkota),
                ctx.getString(germaindetail), R.drawable.germain));
        Euro.add(new Euro(ctx.getString(R.string.swedia), ctx.getString(R.string.kotaswedia),
                ctx.getString(R.string.swediadetail), R.drawable.sweden));
        return Euro;
    }

    private static List<Copa> initDataCopa(Context ctx) {
        List<Copa> copa = new ArrayList<>();
        copa.add(new Copa(ctx.getString(R.string.argentina), ctx.getString(R.string.kotaargentina),
                ctx.getString(R.string.argentinadetail), R.drawable.argentina));
        copa.add(new Copa(ctx.getString(R.string.brazil), ctx.getString(R.string.kotabrazil),
                ctx.getString(R.string.brazildetail), R.drawable.brazil));
        copa.add(new Copa(ctx.getString(R.string.mexico), ctx.getString(R.string.kotamexico),
                ctx.getString(R.string.mexicodetail), R.drawable.mexico));
        copa.add(new Copa(ctx.getString(R.string.amerika), ctx.getString(R.string.kotaamerika),
                ctx.getString(R.string.amerikadetail), R.drawable.amerika));
        copa.add(new Copa(ctx.getString(R.string.kolombia), ctx.getString(R.string.kotakolombia),
                ctx.getString(R.string.kolombiadetail), R.drawable.colombia));
        copa.add(new Copa(ctx.getString(R.string.uruguay), ctx.getString(R.string.kotauruguay),
                ctx.getString(R.string.uruguaydetail), R.drawable.uruguay));
        return copa;
    }

    private static List<Afc> initDataAfc(Context ctx) {
        List<Afc> afc = new ArrayList<>();
        afc.add(new Afc(ctx.getString(R.string.indonesia), ctx.getString(R.string.kotaindonesia),
                ctx.getString(R.string.indonesiadetail), R.drawable.indonesia));
        afc.add(new Afc(ctx.getString(R.string.malay), ctx.getString(R.string.kotamalay),
                ctx.getString(R.string.malaydetail), R.drawable.malay));
        afc.add(new Afc(ctx.getString(R.string.myanmar), ctx.getString(R.string.kotamyanmar),
                ctx.getString(R.string.myanmardetail), R.drawable.myanmar));
        afc.add(new Afc(ctx.getString(R.string.singapura), ctx.getString(R.string.kotasingapura),
                ctx.getString(R.string.singapuradetail), R.drawable.singapura));
        afc.add(new Afc(ctx.getString(R.string.thailand), ctx.getString(R.string.kotathailand),
                ctx.getString(R.string.thailanddetail), R.drawable.thailand));
        afc.add(new Afc(ctx.getString(R.string.vietnam), ctx.getString(R.string.kotavietnam),
                ctx.getString(R.string.vietnamdetal), R.drawable.vietnam));
        return afc;
    }

    private static void initAllNegara(Context ctx) {
        cup.addAll(initDataEuro(ctx));
        cup.addAll(initDataCopa(ctx));
        cup.addAll(initDataAfc(ctx));
    }

    public static List<Cup> getAllHewan(Context ctx) {
        if (cup.size() == 0) {
            initAllNegara(ctx);
        }
        return  cup;
    }

    public static List<Cup> getHewansByTipe(Context ctx, String jenis) {
        List<Cup> hewansByType = new ArrayList<>();
        if (cup.size() == 0) {
            initAllNegara(ctx);
        }
        for (Cup h : cup) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}

