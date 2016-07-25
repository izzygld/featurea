package com.badlogic.gdx.utils;
import java.util.Random;
public class MathUtils {
	static public final float PI = 3.1415927f;
	static private final int SIN_BITS = 13;
	static private final int SIN_MASK = ~(-1 << SIN_BITS);
	static private final int SIN_COUNT = SIN_MASK + 1;
	static private final float radFull = PI * 2;
	static private final float degFull = 360;
	static private final float radToIndex = SIN_COUNT / radFull;
	static private final float degToIndex = SIN_COUNT / degFull;
	static public final float radiansToDegrees = 180f / PI;
	static public final float degreesToRadians = PI / 180;
	static public final float[] sin = new float[SIN_COUNT];
	static public final float[] cos = new float[SIN_COUNT];
	static {
		for (int i = 0; i < SIN_COUNT; i++) {
			float a = (i + 0.5f) / SIN_COUNT * radFull;
			sin[i] = (float)Math.sin(a);
			cos[i] = (float)Math.cos(a);
		}
		for (int i = 0; i < 360; i += 90) {
			sin[(int)(i * degToIndex) & SIN_MASK] = (float)Math.sin(i * degreesToRadians);
			cos[(int)(i * degToIndex) & SIN_MASK] = (float)Math.cos(i * degreesToRadians);
		}
	}
	static public final float sin (float rad) {
		return sin[(int)(rad * radToIndex) & SIN_MASK];
	}
	static public final float cos (float rad) {
		return cos[(int)(rad * radToIndex) & SIN_MASK];
	}
	static public final float sinDeg (float deg) {
		return sin[(int)(deg * degToIndex) & SIN_MASK];
	}
	static public final float cosDeg (float deg) {
		return cos[(int)(deg * degToIndex) & SIN_MASK];
	}
	static private final int ATAN2_BITS = 7;
	static private final int ATAN2_BITS2 = ATAN2_BITS << 1;
	static private final int ATAN2_MASK = ~(-1 << ATAN2_BITS2);
	static private final int ATAN2_COUNT = ATAN2_MASK + 1;
	static private final int ATAN2_DIM = (int)Math.sqrt(ATAN2_COUNT);
	static private final float INV_ATAN2_DIM_MINUS_1 = 1.0f / (ATAN2_DIM - 1);
	static private final float[] atan2 = new float[ATAN2_COUNT];
	static {
		for (int i = 0; i < ATAN2_DIM; i++) {
			for (int j = 0; j < ATAN2_DIM; j++) {
				float x0 = (float)i / ATAN2_DIM;
				float y0 = (float)j / ATAN2_DIM;
				atan2[j * ATAN2_DIM + i] = (float)Math.atan2(y0, x0);
			}
		}
	}
	static public final float atan2 (float y, float x) {
		float add, mul;
		if (x < 0) {
			if (y < 0) {
				y = -y;
				mul = 1;
			} else
				mul = -1;
			x = -x;
			add = -PI;
		} else {
			if (y < 0) {
				y = -y;
				mul = -1;
			} else
				mul = 1;
			add = 0;
		}
		float invDiv = 1 / ((x < y ? y : x) * INV_ATAN2_DIM_MINUS_1);
		int xi = (int)(x * invDiv);
		int yi = (int)(y * invDiv);
		return (atan2[yi * ATAN2_DIM + xi] + add) * mul;
	}
	static public Random random = new Random();
	static public final int random (int range) {
		return random.nextInt(range + 1);
	}
	static public final int random (int start, int end) {
		return start + random.nextInt(end - start + 1);
	}
	static public final boolean randomBoolean () {
		return random.nextBoolean();
	}
	static public final float random () {
		return random.nextFloat();
	}
	static public final float random (float range) {
		return random.nextFloat() * range;
	}
	static public final float random (float start, float end) {
		return start + random.nextFloat() * (end - start);
	}
	static public int nextPowerOfTwo (int value) {
		if (value == 0) return 1;
		value--;
		value |= value >> 1;
		value |= value >> 2;
		value |= value >> 4;
		value |= value >> 8;
		value |= value >> 16;
		return value + 1;
	}
	static public boolean isPowerOfTwo (int value) {
		return value != 0 && (value & value - 1) == 0;
	}
	static public int clamp (int value, int min, int max) {
		if (value < min) return min;
		if (value > max) return max;
		return value;
	}
	static public short clamp (short value, short min, short max) {
		if (value < min) return min;
		if (value > max) return max;
		return value;
	}
	static public float clamp (float value, float min, float max) {
		if (value < min) return min;
		if (value > max) return max;
		return value;
	}
	static private final int BIG_ENOUGH_INT = 16 * 1024;
	static private final double BIG_ENOUGH_FLOOR = BIG_ENOUGH_INT;
	static private final double CEIL = 0.9999999;
	static private final double BIG_ENOUGH_CEIL = NumberUtils
		.longBitsToDouble(NumberUtils.doubleToLongBits(BIG_ENOUGH_INT + 1) - 1);
	static private final double BIG_ENOUGH_ROUND = BIG_ENOUGH_INT + 0.5f;
	static public int floor (float x) {
		return (int)(x + BIG_ENOUGH_FLOOR) - BIG_ENOUGH_INT;
	}
	static public int floorPositive (float x) {
		return (int)x;
	}
	static public int ceil (float x) {
		return (int)(x + BIG_ENOUGH_CEIL) - BIG_ENOUGH_INT;
	}
	static public int ceilPositive (float x) {
		return (int)(x + CEIL);
	}
	static public int round (float x) {
		return (int)(x + BIG_ENOUGH_ROUND) - BIG_ENOUGH_INT;
	}
	static public int roundPositive (float x) {
		return (int)(x + 0.5f);
	}
}
