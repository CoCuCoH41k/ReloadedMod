package mpkg.Dialogs;
import mindustry.ui.dialogs.BaseDialog;

public class ChangeLogDialog {
    public static void ChangeLog(){
        BaseDialog ChangeLog = new BaseDialog("Change Log");
        ChangeLog.cont.add("@ChangeLog").row();
        ChangeLog.cont.add("@Mod.Author").row();
        ChangeLog.cont.button("@button.okay", ChangeLog::hide).size(150f,50f).pad(50f, 0f, 0f, 0f).center();
        ChangeLog.show();
    }
}
