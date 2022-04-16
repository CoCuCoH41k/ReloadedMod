package mpkg.Blocks;

import mindustry.content.Fx;
import mindustry.content.Items;
import mindustry.content.Liquids;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.type.LiquidStack;
import mindustry.world.blocks.production.GenericCrafter;
import mpkg.Items.ItemsClass;

public class BlocksClass {
    public static GenericCrafter TritiumFrunace;

    public static void BlocksClass(){
        TritiumFrunace = new GenericCrafter("tritium-furnace"){{
            Float CraftTime = 3f;
            Float EnergyInSec = 180f;


            this.localizedName = "@block.r-tritium.furnace.name";
            this.description = "@block.r-tritium.furnace.description";

            this.craftTime = CraftTime * 60f;
            this.consumes.power(EnergyInSec/60f);


            this.size = 3;
            this.requirements(Category.crafting, ItemStack.with(new Object[]{
                    Items.copper, 225,
                    Items.lead, 125,
                    Items.titanium, 75,
                    Items.thorium, 25,
                    Items.graphite, 375
            }));

            this.craftEffect = Fx.lightningCharge;
            this.health = this.size * 140;

            this.consumes.items(ItemStack.with(new Object[]{Items.titanium, 3, Items.thorium, 9}));
            this.outputItem = new ItemStack(ItemsClass.Tritium, 6);
        }};
}}