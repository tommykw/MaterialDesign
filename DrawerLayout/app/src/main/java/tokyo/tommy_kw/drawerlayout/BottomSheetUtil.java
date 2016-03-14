package tokyo.tommy_kw.drawerlayout;

import android.support.design.widget.BottomSheetBehavior;
import android.view.View;

/**
 * Created by tommy on 2016/03/14.
 */
public class BottomSheetUtil {
    public static void setState(View bottomSheet, int state) {
        BottomSheetBehavior sheetBehavior = BottomSheetBehavior.from(bottomSheet);
        sheetBehavior.setState(state);
    }

    public static void setBottomSheetCallback(View bottomSheet,
                                              BottomSheetBehavior.BottomSheetCallback callback) {
        BottomSheetBehavior sheetBehavior = BottomSheetBehavior.from(bottomSheet);
        sheetBehavior.setBottomSheetCallback(callback);
    }
}
