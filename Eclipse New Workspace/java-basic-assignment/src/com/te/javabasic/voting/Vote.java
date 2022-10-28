package com.te.javabasic.voting;

public class Vote {

	static void vote(int age) throws VoteException {
		if (age < 18) {

			throw new VoteException("not eligible");
		}
	}

}
