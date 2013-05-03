package com.broken_e.test.ui.game;

import com.broken_e.utils.KeyValue;
import com.badlogic.gdx.utils.StringBuilder;

public class Stats {

	public KeyValue<String> keyValue = new KeyValue<String>();

	static public final String strPOINTS = "Points";
	static public final String strSTRIKES = "Strikes";

	private final StringBuilder tmpSB = new StringBuilder();

	public Stats() {
		// if (!keyValue.containsKey(strPOINTS, false))
		// keyValue.put(strPOINTS, 0);
	}

	public void pointUp() {
		keyValue.addToValue(strPOINTS, 1);
	}

	/** not safe to continue using the returned StringBuilder */
	public StringBuilder getPoints() {
		tmpSB.setLength(0);
		tmpSB.append(keyValue.getValue(strPOINTS));
		return tmpSB;
	}


	public StringBuilder mobExploded() {
		keyValue.addToValue(strSTRIKES, 1);
		tmpSB.setLength(0);
		int strikes = keyValue.getValue(strSTRIKES);
		for (int i = 0; i < strikes; i++)
			tmpSB.append('X');
		return tmpSB;

	}

	public void reset() {
		keyValue.clear();
	}

	public int getStrikes() {
		return keyValue.getValue(strSTRIKES);
	}

}