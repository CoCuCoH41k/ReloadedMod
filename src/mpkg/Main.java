package mpkg;

import arc.*;
import arc.util.*;
import mindustry.game.EventType.*;
import mindustry.mod.*;
import mpkg.Blocks.BlocksClass;
import mpkg.Dialogs.ChangeLogDialog;
import mpkg.Dialogs.OnCampaingDialog;
import mpkg.Entitis.EntitisClass;
import mpkg.Items.ItemsClass;
import mpkg.Liquids.LiquidsClass;

public class Main extends Mod{
    public static final boolean ModCanBeUsedInCampaing = false;
        public Main(){
            Events.on(ClientLoadEvent.class, e -> {
                Time.runTask(10f, () -> {
                    OnCampaingDialog.OnCampaing();
                });
            });
        }
    @Override
    public void loadContent(){
        ItemsClass.ItemsClass();
        LiquidsClass.LiquidsClass();
        BlocksClass.BlocksClass();
        EntitisClass.EntitisClass();
    }
}
