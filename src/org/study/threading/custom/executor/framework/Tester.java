package org.study.threading.custom.executor.framework;

public class Tester {

	public static void main(String[] args) {
		CustomExecutorFramework cef = new CustomExecutorFramework(4);
		cef.submitTask(() -> {
			for(int i=0; i<10; i++) {
				System.out.print("1-" + i + " ");
			}
		});
		cef.submitTask(() -> {
			for(int i=0; i<10; i++) {
				System.out.print("2-" + i + " ");
			}
		});
		cef.submitTask(() -> {
			for(int i=0; i<10; i++) {
				System.out.print("3-" + i + " ");
			}
		});
		cef.submitTask(() -> {
			for(int i=0; i<10; i++) {
				System.out.print("4-" + i + " ");
			}
		});
		cef.submitTask(() -> {
			for(int i=0; i<10; i++) {
				System.out.print("5-" + i + " ");
			}
		});
		cef.submitTask(() -> {
			for(int i=0; i<10; i++) {
				System.out.print("6-" + i + " ");
			}
		});
	}
}
