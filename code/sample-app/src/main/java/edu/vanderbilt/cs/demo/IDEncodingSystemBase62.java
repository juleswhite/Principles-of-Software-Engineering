package edu.vanderbilt.cs.demo;

import java.util.LinkedList;
import java.util.stream.Collectors;

/**
 * Unfortunately, the code in this class isn't as efficient or clear as it could
 * be. You can bet that there is an open response question coming to refactor
 * this code.
 * 
 * @author jules
 *
 */
public class IDEncodingSystemBase62 implements IDEncodingSystem {

	private final String alphabet = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

	@Override
	public long decocdeId(String encodedId) {
		char[] coeffs = encodedId.toCharArray();

		long sum = 0;
		for (int i = 0; i < coeffs.length; i++) {
			int ex = alphabet.indexOf(coeffs[i]);
			double v = (ex * Math.pow(62.0, (coeffs.length - i - 1)));
			sum += v;
		}

		return sum;
	}

	@Override
	public String encodeId(long id) {
		LinkedList<Long> exps = new LinkedList<>();
		while (id > 0) {
			exps.addFirst(id % 62);
			id = id / 62;
		}

		return exps.stream().map(exp -> "" + alphabet.charAt(exp.intValue())).collect(Collectors.joining(""));
	}

}
