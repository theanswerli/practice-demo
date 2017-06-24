package com.theanswerli.exception;

/**
 * Created by Wade on 2017/03/13.
 */
public class CatchRuntimeException {

	public static void main(String[] args) {
		try {
			throw new RuntimeException("runtime exception");
		} catch (Exception e) {
			System.out.print("catch ...." + e.getMessage());
		}
	}

}
