package mpkg.Dialogs;

import arc.Core;
import mindustry.ui.dialogs.BaseDialog;

public class BeginDialog {


    public static void Begin(){
        BaseDialog Begin = new BaseDialog("Reloaded");
        Begin.cont.add("@BeginScreen.Begin").row();
        Begin.cont.button("@BeginScreen.BeginButtonPlay", Begin::hide).size(300f,50f).pad(3f, 0f, 0f, 0f).row();
        Begin.cont.button("@BeginScreen.BeginButtonClose",() -> Core.app.exit()).size(300f,50f).pad(3f, 0f, 0f, 0f).row();
        Begin.cont.button("@BeginScreen.BeginButtonCL",
                ()->{
                    Begin.hide();
                    //Core.audio.play(Core.atlas.find("r-mod-sound-001.mp3"), 1f,1f,1f,false );
                    ChangeLogDialog.ChangeLog();
                }).size(300f,50f).pad(3f, 0f, 0f, 0f).row();
        Begin.show();
    }
}
