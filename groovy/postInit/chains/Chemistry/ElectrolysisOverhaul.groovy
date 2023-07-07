import static globals.Globals.*

import static gregtech.api.unification.material.Materials.*;
import gregtech.api.unification.material.MarkerMaterials;
import static gregtech.api.unification.ore.OrePrefix.dye;

ELECTROLYZER = recipemap('electrolyzer')
ELECTROLYTIC_CELL = recipemap('electrolytic_cell')
DISTILLATION_TOWER = recipemap('distillation_tower')
DISTILLERY = recipemap('distillery')

ELECTROLYZER.recipeBuilder()
        .notConsumable(metaitem('graphite_electrode'))
        .notConsumable(metaitem('stickIron'))
        .fluidInputs(fluid('potassium_bisulfate') * 2016)
        .fluidOutputs(fluid('hydrogen') * 2000)
        .outputs(metaitem('dustPotassiumPersulfate') * 12)
        .EUt(30)
        .duration(200)
        .buildAndRegister()

ELECTROLYZER.recipeBuilder()
        .notConsumable(metaitem('graphite_electrode'))
        .notConsumable(metaitem('stickIron'))
        .fluidInputs(fluid('water') * 4000)
        .inputs(metaitem('dustSalt') * 2)
        .fluidOutputs(fluid('hydrogen') * 6000)
        .fluidOutputs(fluid('sodium_chlorate_solution') * 1000)
        .EUt(30)
        .duration(200)
        .buildAndRegister()

DISTILLERY.recipeBuilder()
        .fluidInputs(fluid('sodium_chlorate_solution') * 1000)
        .fluidOutputs(fluid('water') * 1000)
        .outputs(metaitem('sodium_chlorate_dust') * 5)
        .EUt(16)
        .duration(100)
        .buildAndRegister()

ELECTROLYZER.recipeBuilder()
        .notConsumable(metaitem('stickNickel'))
        .notConsumable(metaitem('stickIron'))
        .fluidInputs(fluid('water') * 1000)
        .fluidOutputs(fluid('hydrogen') * 2000)
        .fluidOutputs(fluid('oxygen') * 1000)
        .EUt(30)
        .duration(1500)
        .buildAndRegister()

ELECTROLYTIC_CELL.recipeBuilder()
        .notConsumable(metaitem('stickNickel'))
        .notConsumable(metaitem('stickIron'))
        .notConsumable(fluid('sodium_hydroxide_solution') * 50)
        .fluidInputs(fluid('water') * 1000)
        .fluidOutputs(fluid('hydrogen') * 2000)
        .fluidOutputs(fluid('oxygen') * 1000)
        .EUt(30)
        .duration(200)
        .buildAndRegister()

//CHLOROALKALI PROCESS
ELECTROLYTIC_CELL.recipeBuilder()
        .notConsumable(metaitem('stickNickel'))
        .notConsumable(metaitem('graphite_electrode'))
        .fluidInputs(fluid('salt_water') * 2000)
        .fluidInputs(fluid('water') * 2000)
        .fluidOutputs(fluid('chlorine') * 1000)
        .fluidOutputs(fluid('hydrogen') * 1000)
        .fluidOutputs(fluid('diluted_saltwater') * 2000)
        .fluidOutputs(fluid('sodium_hydroxide_solution') * 1000)
        .EUt(30)
        .duration(720)
        .buildAndRegister()

ELECTROLYTIC_CELL.recipeBuilder()
        .notConsumable(metaitem('stickNickel'))
        .notConsumable(metaitem('graphite_electrode'))
        .fluidInputs(fluid('potassium_chloride_solution') * 2000)
        .fluidInputs(fluid('water') * 2000)
        .fluidOutputs(fluid('chlorine') * 1000)
        .fluidOutputs(fluid('hydrogen') * 1000)
        .fluidOutputs(fluid('diluted_rock_salt_solution') * 2000)
        .fluidOutputs(fluid('potassium_hydroxide_solution') * 1000)
        .EUt(30)
        .duration(720)
        .buildAndRegister()

DISTILLATION_TOWER.recipeBuilder()
        .fluidInputs(fluid('diluted_saltwater') * 2000)
        .fluidOutputs(fluid('salt_water') * 1000)
        .fluidOutputs(fluid('water') * 1000)
        .EUt(16)
        .duration(60)
        .buildAndRegister()

DISTILLERY.recipeBuilder()
        .fluidInputs(fluid('sodium_hydroxide_solution') * 1000)
        .fluidOutputs(fluid('water') * 1000)
        .outputs(metaitem('dustSodiumHydroxide') * 3)
        .EUt(16)
        .duration(60)
        .buildAndRegister()

DISTILLERY.recipeBuilder()
        .fluidInputs(fluid('potassium_hydroxide_solution') * 1000)
        .fluidOutputs(fluid('water') * 1000)
        .outputs(metaitem('dustPotassiumHydroxide') * 3)
        .EUt(16)
        .duration(60)
        .buildAndRegister()

//CASTNER PROCESS
ELECTROLYTIC_CELL.recipeBuilder()
        .fluidInputs(fluid('sodium_hydroxide') * 432)
        .notConsumable(metaitem('stickNickel'))
        .notConsumable(metaitem('stickIron'))
        .outputs(metaitem('dustSodium'))
        .fluidOutputs(fluid('oxygen') * 1000)
        .fluidOutputs(fluid('hydrogen') * 1000)
        .duration(200)
        .EUt(Globals.voltAmps[1] * 2)
        .buildAndRegister()

ELECTROLYTIC_CELL.recipeBuilder()
        .notConsumable(metaitem('stickNickel'))
        .notConsumable(metaitem('stickIron'))
        .notConsumable(fluid('rock_salt') * 131)
        .notConsumable(fluid('potassium_carbonate') * 166)
        .inputs(metaitem('dustPotassiumHydroxide') * 4)
        .outputs(metaitem('dustPotassium') * 2)
        .fluidOutputs(fluid('oxygen') * 1000)
        .fluidOutputs(fluid('steam') * 1000)
        .EUt(30)
        .duration(600)
        .buildAndRegister()

ELECTROLYTIC_CELL.recipeBuilder()
        .notConsumable(metaitem('stickNickel'))
        .notConsumable(metaitem('stickIron'))
        .fluidInputs(fluid('rock_salt') * 288)
        .notConsumable(fluid('potassium_fluoride') * 144)
        .fluidOutputs(fluid('chlorine') * 1000)
        .outputs(metaitem('dustSodium'))
        .EUt(30)
        .duration(300)
        .buildAndRegister()

//DOWNS CELL PROCESSES
ELECTROLYZER.recipeBuilder()
        .notConsumable(metaitem('stickNickel'))
        .notConsumable(metaitem('stickIron'))
        .fluidInputs(fluid('salt') * 288)
        .fluidOutputs(fluid('chlorine') * 1000)
        .outputs(metaitem('dustSodium'))
        .EUt(30)
        .duration(300)
        .buildAndRegister()

ELECTROLYZER.recipeBuilder()
        .notConsumable(metaitem('graphite_electrode'))
        .notConsumable(metaitem('stickSteel'))
        .fluidInputs(fluid('calcium_chloride') * 432)
        .fluidOutputs(fluid('chlorine') * 2000)
        .outputs(metaitem('dustCalcium'))
        .EUt(30)
        .duration(300)
        .buildAndRegister()

ELECTROLYZER.recipeBuilder()
        .notConsumable(metaitem('graphite_electrode'))
        .notConsumable(metaitem('stickSteel'))
        .fluidInputs(fluid('magnesium_chloride') * 432)
        .fluidOutputs(fluid('chlorine') * 2000)
        .outputs(metaitem('dustMagnesium'))
        .EUt(30)
        .duration(300)
        .buildAndRegister()

ELECTROLYZER.recipeBuilder()
        .notConsumable(metaitem('graphite_electrode'))
        .notConsumable(metaitem('stickSteel'))
        .fluidInputs(fluid('purified_magnesium_chloride') * 432)
        .fluidOutputs(fluid('chlorine') * 2000)
        .outputs(metaitem('dustHighPurityMagnesium'))
        .EUt(30)
        .duration(300)
        .buildAndRegister()


