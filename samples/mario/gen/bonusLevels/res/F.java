package bonusLevels.res; public class F extends mario.objects.hero.World { public static mario.objects.hero.World value() {if (!featurea.app.Context.isProduction()) {return featurea.app.Context.getResources().getResource(F.class);} else {return new F();}}{ if (featurea.app.Context.isProduction()) { {setSize(featurea.util.Size.valueOf("1032, 224"));setTheme(mario.Theme.underwater);}{final mario.objects.landscape.Tube var234 = new mario.objects.landscape.Tube() { {setPosition(featurea.util.Vector.valueOf("992, 104"));setCorner(true);}{}{this.build();} };final mario.layers.PlatformLayer var235 = new mario.layers.PlatformLayer() { {setXy(new int[] { 0, 352, 200, 224,               176, 256, 88, 104,               416, 448, 24, 72,               416, 448, 152, 224,               512, 544, 24, 72,               512, 544, 152, 224,               544, 608, 200, 224,               608, 704, 56, 72,               640, 672, 200, 224,                704, 1032, 200, 224,               944, 1032, 184, 200,               960, 1032, 168, 184,               976, 1032, 136, 168,               1008, 1032, 88, 136,               976, 1032, 24, 88,                800, 864, 136, 152,               864, 928, 88, 104});}{}{this.build();} };final mario.objects.landscape.Stairs var236 = new mario.objects.landscape.Stairs() { {setPosition(featurea.util.Vector.valueOf("192, 200"));setSteps(new int[] { 3});}{}{this.build();} };final mario.objects.landscape.Stairs var237 = new mario.objects.landscape.Stairs() { {setPosition(featurea.util.Vector.valueOf("240, 88"));setSteps(new int[] { 2});}{}{this.build();} };final mario.objects.landscape.Stairs var238 = new mario.objects.landscape.Stairs() { {setPosition(featurea.util.Vector.valueOf("320, 200"));setSteps(new int[] { 4});}{}{this.build();} };final mario.objects.landscape.Stairs var239 = new mario.objects.landscape.Stairs() { {setPosition(featurea.util.Vector.valueOf("608, 136"));setSteps(new int[] { 4});}{}{this.build();} };final mario.objects.landscape.Stairs var240 = new mario.objects.landscape.Stairs() { {setPosition(featurea.util.Vector.valueOf("688, 136"));setSteps(new int[] { 4});}{}{this.build();} };final mario.objects.landscape.Stairs var241 = new mario.objects.landscape.Stairs() { {setPosition(featurea.util.Vector.valueOf("736, 200"));setSteps(new int[] { 2});}{}{this.build();} };add(var234);add(var235);add(var236);add(var237);add(var238);add(var239);add(var240);add(var241);}{this.build();}} } } 