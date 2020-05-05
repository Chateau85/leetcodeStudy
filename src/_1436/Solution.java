package _1436;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		List<List<String>> paths = new ArrayList<>();
		List<String> temp;
		// String[][] strArr = { { "London", "New York" }, { "New York", "Lima" },
		// {"Lima", "Sao Paulo" } };
		// String[][] strArr = { { "B", "C" }, { "D", "B" }, { "C", "A" } };
		// String[][] strArr = { { "A", "Z" } };
		// String[][] strArr = { { "qMTSlfgZlC", "ePvzZaqLXj" }, { "xKhZXfuBeC",
		// "TtnllZpKKg" }, { "ePvzZaqLXj", "sxrvXFcqgG" }, { "sxrvXFcqgG", "xKhZXfuBeC"
		// }, { "TtnllZpKKg", "OAxMijOZgW" } };
		String[][] strArr = { { "JzAfmaCPHu", "YrihBlTA B" }, { "pjGKxZiyJQ", "NfvIVuujoG" },
				{ "yosAEL fbB", "FuYrgmVCwB" }, { "pEYBgcAqwm", "ISyRTDeeDk" }, { "EclbFhmHdm", "eQYdeYYGYV" },
				{ "mKQHMCrrIh", "wol wrourd" }, { "UTfngQtzQm", "KZZfzjOPam" }, { "Cj DnfwduB", "fQSRuYeHFT" },
				{ "IzinRpCGZG", "DfmfJHsfQL" }, { "P oECVmuYN", "XnrtEwddVr" }, { "wtKJX PqlC", "tyuapKUlNo" },
				{ "DGidELVdwi", "KtfvXQswTe" }, { "UCqgQNMzah", "EkLQC JAtw" }, { "uZAMkmeASo", "vxQzjQEwYC" },
				{ "gpAcvhLcTt", "aEgunNbUfx" }, { " kMXiNuIkt", "GUKizodqfB" }, { "NfvIVuujoG", "KmtpzfBTCq" },
				{ "wnxSkUKrUi", "knSPzMKSCJ" }, { "eVDcZrmslr", "eftrSDgdOF" }, { "eftrSDgdOF", "pTpKcNRKiT" },
				{ "CtDOTMjxLM", " kMXiNuIkt" }, { "SVrxhBgFIK", "BBPNwsruub" }, { "knSPzMKSCJ", "IBbDWtcJbN" },
				{ "EkLQC JAtw", " yDljNvLUI" }, { "PhtoYRoXuA", "NnubNucgxD" }, { "KZZfzjOPam", "cEtwYDAsMW" },
				{ "AxCBBxNXNc", "CtDOTMjxLM" }, { "uSNyGWwRIO", "WWKvwGGuMT" }, { "PdIYKBsGvD", "Cj DnfwduB" },
				{ "BBPNwsruub", "ToLGYhhAnM" }, { "vpjHijwPLa", "amxKCVszAU" }, { "MGsCe MDqL", "UCqgQNMzah" },
				{ "dEKRh ByaS", "ljlMLUGukS" }, { "NnubNucgxD", "IzinRpCGZG" }, { "pTpKcNRKiT", "uZAMkmeASo" },
				{ "vwEoMxCL x", "wtWbrQNKNZ" }, { "LwrXGcGUhi", "EclbFhmHdm" }, { "ljlMLUGukS", " tTMkhHAR " },
				{ "oYbMPhJEst", "uSNyGWwRIO" }, { "wrHdJYYNUV", "PfdZuAdWpo" }, { "cEtwYDAsMW", "MGsCe MDqL" },
				{ "KmtpzfBTCq", "iGRfuKaQWS" }, { "aEgunNbUfx", "bpZqoBktuh" }, { "vxQzjQEwYC", "kjsCMsewNZ" },
				{ "LsZlxAAlV ", "gpwBN Fxve" }, { "tyuapKUlNo", "PeSRlphgtk" }, { "ISyRTDeeDk", "JzAfmaCPHu" },
				{ "wgeOwwKtEk", "PdIYKBsGvD" }, { "WWKvwGGuMT", "P oECVmuYN" }, { "DfmfJHsfQL", "DGidELVdwi" },
				{ "iGRfuKaQWS", "UQLhlNnniG" }, { "YrihBlTA B", "PhtoYRoXuA" }, { "XnrtEwddVr", "SVrxhBgFIK" },
				{ "ieEAdUkWWa", "JtHGdqzU K" }, { "IBbDWtcJbN", "KiWvLvEtQX" }, { " yDljNvLUI", "LsZlxAAlV " },
				{ "whLLP dJnn", "wnxSkUKrUi" }, { "VDhTrJumep", "Dzdoxan FB" }, { "bpZqoBktuh", "pjGKxZiyJQ" },
				{ "JtHGdqzU K", "pEYBgcAqwm" }, { "VTjnvPWJrx", "vwEoMxCL x" }, { "amxKCVszAU", "wtKJX PqlC" },
				{ "gpwBN Fxve", "dEKRh ByaS" }, { "wol wrourd", "vpjHijwPLa" }, { "wtWbrQNKNZ", "whLLP dJnn" },
				{ "KiWvLvEtQX", "VDhTrJumep" }, { "ENKUNxyuUz", "OQWZtUD dM" }, { "FuYrgmVCwB", "gpAcvhLcTt" },
				{ "ToLGYhhAnM", "ENKUNxyuUz" }, { "Dzdoxan FB", "AxCBBxNXNc" }, { "PeSRlphgtk", "wgeOwwKtEk" },
				{ "GUKizodqfB", "ieEAdUkWWa" }, { "OQWZtUD dM", "wrHdJYYNUV" }, { "fQSRuYeHFT", "oYbMPhJEst" },
				{ "UQLhlNnniG", "mKQHMCrrIh" }, { "PfdZuAdWpo", "eVDcZrmslr" }, { "KtfvXQswTe", "LqThBLPGvY" },
				{ "kjsCMsewNZ", "UTfngQtzQm" }, { "eQYdeYYGYV", "yosAEL fbB" }, { "EHSyzsGQqO", "LwrXGcGUhi" },
				{ "LqThBLPGvY", "EHSyzsGQqO" } };
		for (String[] arr : strArr) {
			temp = new ArrayList<String>();
			for (String str : arr) {
				temp.add(str);
			}
			paths.add(temp);
		}

		String dest = destCity(paths);
		String dest2 = destCity2(paths);
		System.out.println(dest2);
	}

	private static String destCity(List<List<String>> paths) {
		String[] cityA = new String[paths.size()];
		String[] cityB = new String[paths.size()];

		for (int i = 0; i < paths.size(); i++) {
			cityA[i] = paths.get(i).get(0);
			cityB[i] = paths.get(i).get(1);
		}

		for (int i = 0; i < cityA.length; i++) {
			for (int j = 0; j < cityB.length; j++) {
				if (cityA[i].equalsIgnoreCase(cityB[j])) {
					cityA[i] = "-";
					cityB[j] = "-";
				}
			}
		}

		String dest = "";
		for (int i = 0; i < cityB.length; i++) {
			if (!cityB[i].equalsIgnoreCase("-")) {
				dest = cityB[i];
			}
		}

		return dest;
	}

	private static String destCity2(List<List<String>> paths) {
		HashSet<String> set = new HashSet();
		for (List<String> listCityA : paths) {
			set.add(listCityA.get(0));
		}
		for (List<String> listCityB : paths) {
			if (set.add(listCityB.get(1))) {
				return listCityB.get(1);
			}
		}
		return "";
	}
}
