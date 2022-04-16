package mpkg.Dialogs;

import arc.util.Log;
import mindustry.ui.dialogs.BaseDialog;

import static mpkg.Main.ModCanBeUsedInCampaing;

public class OnCampaingDialog {
    public static void OnCampaing(){
        Log.info("Mod comlete for campaing? " + ModCanBeUsedInCampaing);
        if (ModCanBeUsedInCampaing == false){
            BaseDialog WarningDialogCampaing = new BaseDialog("Warning Of Campain");
            WarningDialogCampaing.cont.add("@CampaingWarning.IsNotFinished").row();
            WarningDialogCampaing.cont.button("@button.okay", ()->{WarningDialogCampaing.hide(); BeginDialog.Begin();}).size(150f,50f).pad(50f);
            WarningDialogCampaing.show();
        }else{BeginDialog.Begin();}
    }
}
