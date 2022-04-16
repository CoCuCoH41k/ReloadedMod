package mpkg.Items;

import mindustry.type.Item;

public class ItemsClass {
    public static Item Tritium;
    public static Item Forendium;





    public static void ItemsClass(){
        Tritium = new Item("tritium"){{
            this.localizedName = "@item.r-tritium.name";
            this.description = "@item.r-tritium.description";
            this.explosiveness = 0f; this.flammability = 0f; this.radioactivity = 1.375f; this.charge = 10f;
        }};

        Forendium = new Item("forendium"){{
            this.localizedName = "@item.r-forendium.name";
            this.description = "@item.r-forendium.description";
            this.explosiveness = 0f; this.flammability = 0f; this.radioactivity = 0f;
        }};





}}