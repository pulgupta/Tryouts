package org.study.patterns.prototype;

public class PrototypeTester {
	public static void main(String[] args) {
		SystemCache.loadCache();
		SystemDetails sd = SystemCache.getDetails(1);
		System.out.println(sd.getType());
	}
}
