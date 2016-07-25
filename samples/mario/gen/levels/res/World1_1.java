package levels.res; public class World1_1 extends mario.objects.hero.World { public static mario.objects.hero.World value() {if (!featurea.app.Context.isProduction()) {return featurea.app.Context.getResources().getResource(World1_1.class);} else {return new World1_1();}}{ if (featurea.app.Context.isProduction()) { {setSize(featurea.util.Size.valueOf("3384, 224"));setTheme(mario.Theme.overworld);}{final levels.res.World1_1.Hero var250 = new levels.res.World1_1.Hero();final mario.objects.background.ThemeBackground var251 = new mario.objects.background.ThemeBackground() { {setStep(featurea.util.Vector.valueOf("768, 0"));setValue("cloud.png, 136, 64, 312, 48;          cloudTriple.png, 440, 64;          cloudDouble.png, 584, 48;          hill.png, 0, 200;          hillSmall.png, 254, 200;          bushTriple.png, 184, 200;          bush.png, 376, 200;          bushDouble.png, 664, 200;");}{}{this.build();} };final mario.objects.landscape.Tube var252 = new mario.objects.landscape.Tube() { {setPosition(featurea.util.Vector.valueOf("1166.0, 167.0, 0.0"));setTrunkCount(2);setCorner(false);setPiranhaPlant(true);}{}{this.build();} };final mario.objects.landscape.Tube var253 = new mario.objects.landscape.Tube() { {setPosition(featurea.util.Vector.valueOf("736.0, 136.0"));setTrunkCount(4);}{}{this.build();} };final mario.objects.landscape.Tube var254 = new mario.objects.landscape.Tube() { {setPosition(featurea.util.Vector.valueOf("2864.0, 168.0, 0.0"));setTrunkCount(2);setOut("asdf2332");}{}{this.build();} };final mario.objects.landscape.Tube var255 = new mario.objects.landscape.Tube() { {setPosition(featurea.util.Vector.valueOf("608.0, 152.0, 0.0"));setTrunkCount(3);}{}{this.build();} };final mario.objects.landscape.Tube var256 = new mario.objects.landscape.Tube() { {setPosition(featurea.util.Vector.valueOf("448.0, 170.0, 0.0"));setTrunkCount(2);}{}{this.build();} };final mario.objects.landscape.Tube var257 = new mario.objects.landscape.Tube() { {setPosition(featurea.util.Vector.valueOf("912.0, 136.0, 0.0"));setTrunkCount(4);setBonus("a");}{}{this.build();} };final mario.objects.landscape.Tube var258 = new mario.objects.landscape.Tube() { {setPosition(featurea.util.Vector.valueOf("2594.0, 167.0, 0.0"));setTrunkCount(2);}{}{this.build();} };final mario.objects.enemies.KoopaTroopa var259 = new mario.objects.enemies.KoopaTroopa() { {setPosition(featurea.util.Vector.valueOf("1682.0, 176.0, 0.0"));setVisible(true);}{}{this.build();} };final mario.objects.enemies.Goomba var260 = new mario.objects.enemies.Goomba() { {setPosition(featurea.util.Vector.valueOf("840.0, 186.0, 0.0"));setSize(16,16);setVisible(true);}{}{this.build();} };final mario.objects.enemies.Goomba var261 = new mario.objects.enemies.Goomba() { {setPosition(featurea.util.Vector.valueOf("864.0, 184.0, 0.0"));setAngle(0);}{}{this.build();} };final mario.objects.enemies.Goomba var262 = new mario.objects.enemies.Goomba() { {setPosition(featurea.util.Vector.valueOf("332.0, 184.0, 0.0"));setAngle(0);}{}{this.build();} };final mario.objects.enemies.Goomba var263 = new mario.objects.enemies.Goomba() { {setPosition(featurea.util.Vector.valueOf("1263.0, 78.0, 0.0"));}{}{this.build();} };final mario.objects.enemies.Goomba var264 = new mario.objects.enemies.Goomba() { {setPosition(featurea.util.Vector.valueOf("1322.0, 56.0, 0.0"));}{}{this.build();} };final mario.objects.landscape.Flagpole var265 = new mario.objects.landscape.Flagpole() { {setPosition(featurea.util.Vector.valueOf("3175.0, -186.0, 0.0"));}{}{this.build();} };final mario.objects.enemies.Goomba var266 = new mario.objects.enemies.Goomba() { {setPosition(featurea.util.Vector.valueOf("1562.0, 184.0, 0.0"));}{}{this.build();} };final mario.objects.enemies.Goomba var267 = new mario.objects.enemies.Goomba() { {setPosition(featurea.util.Vector.valueOf("1589.0, 186.0, 0.0"));}{}{this.build();} };final mario.objects.enemies.Goomba var268 = new mario.objects.enemies.Goomba() { {setPosition(featurea.util.Vector.valueOf("1976.0, 184.0"));}{}{this.build();} };final mario.objects.enemies.Goomba var269 = new mario.objects.enemies.Goomba() { {setPosition(featurea.util.Vector.valueOf("1999.0, 184.0"));}{}{this.build();} };final mario.objects.enemies.Goomba var270 = new mario.objects.enemies.Goomba() { {setPosition(featurea.util.Vector.valueOf("2028.0, 184.0"));}{}{this.build();} };final mario.objects.enemies.Goomba var271 = new mario.objects.enemies.Goomba() { {setPosition(featurea.util.Vector.valueOf("2053.0, 184.0"));}{}{this.build();} };final mario.objects.enemies.Goomba var272 = new mario.objects.enemies.Goomba() { {setPosition(featurea.util.Vector.valueOf("2767.0, 184.0"));}{}{this.build();} };final mario.objects.enemies.Goomba var273 = new mario.objects.enemies.Goomba() { {setPosition(featurea.util.Vector.valueOf("2787.0, 184.0"));}{}{this.build();} };final mario.objects.background.CastleBackground var274 = new mario.objects.background.CastleBackground() { {setCastle2(featurea.util.Vector.valueOf("3275.0, 120.0, 0.0"));}{}{this.build();} };final mario.objects.enemies.Goomba var275 = new mario.objects.enemies.Goomba() { {setPosition(featurea.util.Vector.valueOf("644.0, 184.0, 0.0"));}{}{this.build();} };final mario.objects.landscape.Block var276 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("320.0, 136.0"));}{}{this.build();} };final mario.objects.landscape.Block var277 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("256.0, 136.0, 0.0"));setBonus(mario.objects.bonuses.Bonus.valueOf("coinRotate, 1"));}{}{this.build();} };final mario.objects.landscape.Block var278 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("336.0, 136.0"));setBonus(mario.objects.bonuses.Bonus.valueOf("becomeBig"));}{}{this.build();} };final mario.objects.landscape.Block var279 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("352.0, 136.0"));}{}{this.build();} };final mario.objects.landscape.Block var280 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("368.0, 136.0"));setBonus(mario.objects.bonuses.Bonus.valueOf("coinRotate, 1"));}{}{this.build();} };final mario.objects.landscape.Block var281 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("384.0, 136.0"));}{}{this.build();} };final mario.objects.landscape.Block var282 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("352.0, 72.0"));setBonus(mario.objects.bonuses.Bonus.valueOf("coinRotate, 1"));}{}{this.build();} };final mario.objects.landscape.Block var283 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("1024.0, 120.0"));setVisible(false);setBonus(mario.objects.bonuses.Bonus.valueOf("levelUp"));}{}{this.build();} };final mario.objects.landscape.Block var284 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("1232.0, 136.0"));}{}{this.build();} };final mario.objects.landscape.Block var285 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("1248.0, 136.0"));setBonus(mario.objects.bonuses.Bonus.valueOf("becomeBig"));}{}{this.build();} };final mario.objects.landscape.Block var286 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("1264.0, 136.0"));}{}{this.build();} };final mario.objects.landscape.Block var287 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("1278.0, 72.0"));}{}{this.build();} };final mario.objects.landscape.Block var288 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("1294.0, 72.0"));}{}{this.build();} };final mario.objects.landscape.Block var289 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("1310.0, 72.0"));}{}{this.build();} };final mario.objects.landscape.Block var290 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("1326.0, 72.0"));}{}{this.build();} };final mario.objects.landscape.Block var291 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("1342.0, 72.0"));}{}{this.build();} };final mario.objects.landscape.Block var292 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("1358.0, 72.0"));}{}{this.build();} };final mario.objects.landscape.Block var293 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("1374.0, 72.0"));}{}{this.build();} };final mario.objects.landscape.Block var294 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("1456.0, 72.0"));}{}{this.build();} };final mario.objects.landscape.Block var295 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("1472.0, 72.0"));}{}{this.build();} };final mario.objects.landscape.Block var296 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("1488.0, 72.0"));}{}{this.build();} };final mario.objects.landscape.Block var297 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("1504.0, 72.0"));setBonus(mario.objects.bonuses.Bonus.valueOf("coinRotate, 1"));}{}{this.build();} };final mario.objects.landscape.Block var298 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("1504.0, 136.0"));setBonus(mario.objects.bonuses.Bonus.valueOf("coinRotate, 10"));}{}{this.build();} };final mario.objects.landscape.Block var299 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("1600.0, 136.0"));}{}{this.build();} };final mario.objects.landscape.Block var300 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("1616.0, 136.0, 0.0"));setBonus(mario.objects.bonuses.Bonus.valueOf("star"));}{}{this.build();} };final mario.objects.landscape.Block var301 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("1699.0, 136.0"));setBonus(mario.objects.bonuses.Bonus.valueOf("coinRotate, 1"));}{}{this.build();} };final mario.objects.landscape.Block var302 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("1744.0, 136.0"));setBonus(mario.objects.bonuses.Bonus.valueOf("coinRotate, 1"));}{}{this.build();} };final mario.objects.landscape.Block var303 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("1792.0, 136.0"));setBonus(mario.objects.bonuses.Bonus.valueOf("coinRotate, 1"));}{}{this.build();} };final mario.objects.landscape.Block var304 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("1744.0, 72.0"));setBonus(mario.objects.bonuses.Bonus.valueOf("becomeBig"));}{}{this.build();} };final mario.objects.landscape.Block var305 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("1888.0, 136.0"));}{}{this.build();} };final mario.objects.landscape.Block var306 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("1936.0, 72.0"));}{}{this.build();} };final mario.objects.landscape.Block var307 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("1952.0, 72.0"));}{}{this.build();} };final mario.objects.landscape.Block var308 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("1968.0, 72.0, 0.0"));}{}{this.build();} };final mario.objects.landscape.Block var309 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("2048.0, 72.0"));}{}{this.build();} };final mario.objects.landscape.Block var310 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("2064.0, 72.0"));setBonus(mario.objects.bonuses.Bonus.valueOf("coinRotate, 1"));}{}{this.build();} };final mario.objects.landscape.Block var311 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("2080.0, 72.0"));setBonus(mario.objects.bonuses.Bonus.valueOf("coinRotate, 1"));}{}{this.build();} };final mario.objects.landscape.Block var312 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("2096.0, 72.0"));}{}{this.build();} };final mario.objects.landscape.Block var313 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("2064.0, 136.0"));}{}{this.build();} };final mario.objects.landscape.Block var314 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("2080.0, 136.0"));}{}{this.build();} };final mario.objects.landscape.Block var315 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("2688.0, 136.0"));}{}{this.build();} };final mario.objects.landscape.Block var316 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("2704.0, 136.0"));}{}{this.build();} };final mario.objects.landscape.Block var317 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("2720.0, 136.0"));setBonus(mario.objects.bonuses.Bonus.valueOf("coinRotate, 1"));}{}{this.build();} };final mario.objects.landscape.Block var318 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("2736.0, 136.0"));}{}{this.build();} };final mario.objects.landscape.Stairs var319 = new mario.objects.landscape.Stairs() { {setPosition(featurea.util.Vector.valueOf("2144.0, 200.0, 0.0"));setSteps(new int[] { 1, 2, 3, 4});}{}{this.build();} };final mario.objects.landscape.Stairs var320 = new mario.objects.landscape.Stairs() { {setPosition(featurea.util.Vector.valueOf("2240.0, 200.0, 0.0"));setSteps(new int[] { 4, 3, 2, 1});}{}{this.build();} };final mario.objects.landscape.Stairs var321 = new mario.objects.landscape.Stairs() { {setPosition(featurea.util.Vector.valueOf("2368.0, 200.0, 0.0"));setSteps(new int[] { 1, 2, 3, 4, 4});}{}{this.build();} };final mario.objects.landscape.Stairs var322 = new mario.objects.landscape.Stairs() { {setPosition(featurea.util.Vector.valueOf("2480.0, 200.0, 0.0"));setSteps(new int[] { 4, 3, 2, 1});}{}{this.build();} };final mario.objects.landscape.Stairs var323 = new mario.objects.landscape.Stairs() { {setPosition(featurea.util.Vector.valueOf("2896.0, 200.0, 0.0"));setSteps(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 8});}{}{this.build();} };final mario.objects.landscape.Platform var324 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("0.0, 200.0"));setLength(69);setHighness(2);}{}{this.build();} };final mario.objects.landscape.Platform var325 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("1416.0, 200.0, 0.0"));setLength(123);setHighness(2);}{}{this.build();} };final mario.objects.landscape.Platform var326 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("1132.0, 200.0, 0.0"));setLength(15);setHighness(2);}{}{this.build();} };setHero(var250);add(var251);add(var252);add(var253);add(var254);add(var255);add(var256);add(var257);add(var258);add(var259);add(var260);add(var261);add(var262);add(var263);add(var264);add(var265);add(var266);add(var267);add(var268);add(var269);add(var270);add(var271);add(var272);add(var273);add(var274);add(var275);add(var276);add(var277);add(var278);add(var279);add(var280);add(var281);add(var282);add(var283);add(var284);add(var285);add(var286);add(var287);add(var288);add(var289);add(var290);add(var291);add(var292);add(var293);add(var294);add(var295);add(var296);add(var297);add(var298);add(var299);add(var300);add(var301);add(var302);add(var303);add(var304);add(var305);add(var306);add(var307);add(var308);add(var309);add(var310);add(var311);add(var312);add(var313);add(var314);add(var315);add(var316);add(var317);add(var318);add(var319);add(var320);add(var321);add(var322);add(var323);add(var324);add(var325);add(var326);}{this.build();}} }public static class Hero extends mario.objects.hero.Hero { public static mario.objects.hero.Hero value() {if (!featurea.app.Context.isProduction()) {return featurea.app.Context.getResources().getResource(Hero.class);} else {return new Hero();}}{ if (featurea.app.Context.isProduction()) { {setPosition(featurea.util.Vector.valueOf("254.0, 85.0, 10.0"));setState(mario.objects.hero.HeroState.small);}{}{this.build();}} } }  } 