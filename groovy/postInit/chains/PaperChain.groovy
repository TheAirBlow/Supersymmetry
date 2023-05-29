import static globals.Globals.*

AUTOCLAVE = recipemap('autoclave')
ROASTER = recipemap('roaster')
BR = recipemap('batch_reactor')
CHEMICAL_BATH = recipemap('chemical_bath')
DT = recipemap('distillation_tower')

AUTOCLAVE.recipeBuilder()
        .inputs(metaitem('dustWood'))
        .fluidInputs(fluid('white_liquor') * 1000)
        .outputs(metaitem('dustRawCellulose'))
        .fluidOutputs(fluid('black_liquor') * 1000)
        .duration(200)
        .EUt(30)
        .buildAndRegister()

CHEMICAL_BATH.recipeBuilder()
        .inputs(metaitem('dustRawCellulose'))
        .fluidInputs(fluid('water') * 250)
        .outputs(metaitem('dustCellulose'))
        .fluidOutputs(fluid('black_liquor') * 250)
        .duration(200)
        .EUt(30)
        .buildAndRegister()

CHEMICAL_BATH.recipeBuilder()
        .inputs(metaitem('dustCellulose'))
        .fluidInputs(fluid('water') * 1000)
        .outputs(item('minecraft:paper') * 8)
        .duration(200)
        .EUt(30)
        .buildAndRegister()

CHEMICAL_BATH.recipeBuilder()
        .inputs(metaitem('dustCellulose'))
        .fluidInputs(fluid('distilled_water') * 1000)
        .outputs(item('minecraft:paper') * 8)
        .duration(200)
        .EUt(30)
        .buildAndRegister()

DT.recipeBuilder()
        .fluidInputs(fluid('black_liquor') * 1250)
        .fluidOutputs(fluid('concentrated_black_liquor') * 1000)
        .fluidOutputs(fluid('resin') * 250)
        .duration(200)
        .EUt(30)
        .buildAndRegister()

ROASTER.recipeBuilder()
        .inputs(metaitem('dustCarbon') * 2)
        .fluidInputs(fluid('concentrated_black_liquor') * 1000)
        .fluidOutputs(fluid('carbon_dioxide') * 2000)
        .fluidOutputs(fluid('green_liquor') * 1000)
        .duration(200)
        .EUt(30)
        .buildAndRegister()

BR.recipeBuilder()
        .inputs(metaitem('dustQuicklime') * 2)
        .fluidInputs(fluid('green_liquor') * 1000)
        .outputs(metaitem('dustLimestone') * 5)
        .fluidOutputs(fluid('white_liquor') * 1000)
        .duration(200)
        .EUt(30)
        .buildAndRegister()