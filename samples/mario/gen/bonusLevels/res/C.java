package bonusLevels.res; public class C extends mario.objects.hero.World { public static mario.objects.hero.World value() {if (!featurea.app.Context.isProduction()) {return featurea.app.Context.getResources().getResource(C.class);} else {return new C();}}{ if (featurea.app.Context.isProduction()) { {setTheme(mario.Theme.underground);}{final bonusLevels.res.C.Hero var1139 = new bonusLevels.res.C.Hero();final mario.objects.landscape.Tube var1140 = new mario.objects.landscape.Tube() { {setPosition(featurea.util.Vector.valueOf("208, 168"));setCorner(true);}{}{this.build();} };final mario.layers.PlatformLayer var1141 = new mario.layers.PlatformLayer() { {setXy(new int[] { 0,256,200,224,});}{}{this.build();} };final mario.layers.BlockLayer var1142 = new mario.layers.BlockLayer() { {}{}{this.build();} };setHero(var1139);add(var1140);add(var1141);add(var1142);}{this.build();}} }public static class Hero extends mario.objects.hero.Hero { public static mario.objects.hero.Hero value() {if (!featurea.app.Context.isProduction()) {return featurea.app.Context.getResources().getResource(Hero.class);} else {return new Hero();}}{ if (featurea.app.Context.isProduction()) { {setPosition(featurea.util.Vector.valueOf("24.0, 32.0, 0.0"));}{}{this.build();}} } }  } 