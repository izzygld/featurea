package screens.res; public class GameplayScreen extends mario.GameplayScreen { public static mario.GameplayScreen value() {if (!featurea.app.Context.isProduction()) {return featurea.app.Context.getResources().getResource(GameplayScreen.class);} else {return new GameplayScreen();}}{ if (featurea.app.Context.isProduction()) { {}{final featurea.res.platformer.Joystick var1336 = new featurea.res.platformer.Joystick();final featurea.platformer.util.PerformanceInfo var1337 = new featurea.platformer.util.PerformanceInfo() { {}{}{this.build();} };setJoystick(var1336);add(var1337);}{this.build();}} }public static class Joystick extends featurea.res.platformer.Joystick { public static featurea.res.platformer.Joystick value() {if (!featurea.app.Context.isProduction()) {return featurea.app.Context.getResources().getResource(Joystick.class);} else {return new Joystick();}}{ if (featurea.app.Context.isProduction()) { {}{}{this.build();}} }public static class ButtonUp extends featurea.ui.Button { public static featurea.ui.Button value() {if (!featurea.app.Context.isProduction()) {return featurea.app.Context.getResources().getResource(ButtonUp.class);} else {return new ButtonUp();}}{ if (featurea.app.Context.isProduction()) { {setPosition(84.0,258.0,0.0);setRectangle(-30,-30,30,30);setSprite("joystick/arrowKey.png");setSize(featurea.util.Size.valueOf("60, 60"));{ String a = "!!!!!!!!"; }{ String a = "!!!!!!!!"; }}{}{this.build();}} } } public static class ButtonDown extends featurea.ui.Button { public static featurea.ui.Button value() {if (!featurea.app.Context.isProduction()) {return featurea.app.Context.getResources().getResource(ButtonDown.class);} else {return new ButtonDown();}}{ if (featurea.app.Context.isProduction()) { {setPosition(84.0,361.0,0.0);setRectangle(-30,-30,30,30);setSprite("joystick/arrowKey.png");setSize(featurea.util.Size.valueOf("60, 60"));{ String a = "!!!!!!!!"; }{ String a = "!!!!!!!!"; }}{}{this.build();}} } } public static class ButtonLeft extends featurea.ui.Button { public static featurea.ui.Button value() {if (!featurea.app.Context.isProduction()) {return featurea.app.Context.getResources().getResource(ButtonLeft.class);} else {return new ButtonLeft();}}{ if (featurea.app.Context.isProduction()) { {setPosition(30.0,310.0,0.0);setRectangle(-30,-30,30,30);setSprite("joystick/arrowKey.png");setSize(featurea.util.Size.valueOf("60, 60"));{ String a = "!!!!!!!!"; }{ String a = "!!!!!!!!"; }}{}{this.build();}} } } public static class ButtonRight extends featurea.ui.Button { public static featurea.ui.Button value() {if (!featurea.app.Context.isProduction()) {return featurea.app.Context.getResources().getResource(ButtonRight.class);} else {return new ButtonRight();}}{ if (featurea.app.Context.isProduction()) { {setPosition(138.0,310.0,0.0);setRectangle(-30,-30,30,30);setSprite("joystick/arrowKey.png");setSize(featurea.util.Size.valueOf("60, 60"));{ String a = "!!!!!!!!"; }{ String a = "!!!!!!!!"; }}{}{this.build();}} } } public static class ButtonJump extends featurea.ui.Button { public static featurea.ui.Button value() {if (!featurea.app.Context.isProduction()) {return featurea.app.Context.getResources().getResource(ButtonJump.class);} else {return new ButtonJump();}}{ if (featurea.app.Context.isProduction()) { {setPosition(488, 356);setRectangle(-40,-40,40,40);setSprite("joystick/greenRoundButton.png");setSize(featurea.util.Size.valueOf("80, 80"));{ String a = "!!!!!!!!"; }{ String a = "!!!!!!!!"; }}{}{this.build();}} } } public static class ButtonFire extends featurea.ui.Button { public static featurea.ui.Button value() {if (!featurea.app.Context.isProduction()) {return featurea.app.Context.getResources().getResource(ButtonFire.class);} else {return new ButtonFire();}}{ if (featurea.app.Context.isProduction()) { {setPosition(556, 300);setRectangle(-40,-40,40,40);setSprite("joystick/blueRoundButton.png");setSize(featurea.util.Size.valueOf("80, 80"));{ String a = "!!!!!!!!"; }{ String a = "!!!!!!!!"; }}{}{this.build();}} } } public static class ButtonSettings extends featurea.ui.Button { public static featurea.ui.Button value() {if (!featurea.app.Context.isProduction()) {return featurea.app.Context.getResources().getResource(ButtonSettings.class);} else {return new ButtonSettings();}}{ if (featurea.app.Context.isProduction()) { {setPosition(40, 40);setRectangle(-40,-40,40,40);setVisible(false);setSprite("joystick/settings.png");setSize(featurea.util.Size.valueOf("80, 80"));{ String a = "!!!!!!!!"; }}{}{this.build();}} } } public static class ButtonConfig extends featurea.ui.Button { public static featurea.ui.Button value() {if (!featurea.app.Context.isProduction()) {return featurea.app.Context.getResources().getResource(ButtonConfig.class);} else {return new ButtonConfig();}}{ if (featurea.app.Context.isProduction()) { {setPosition(32, 32);setRectangle(-32,-32,32,32);setVisible(false);setSprite("joystick/config.png");setSize(featurea.util.Size.valueOf("64, 64"));{ String a = "!!!!!!!!"; }}{}{this.build();}} } }  }  } 