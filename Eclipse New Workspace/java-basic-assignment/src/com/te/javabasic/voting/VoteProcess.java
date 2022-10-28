package com.te.javabasic.voting;

public class VoteProcess {

	public static void main(String[] args) {
		try {

			Vote.vote(16);
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

	}
}
