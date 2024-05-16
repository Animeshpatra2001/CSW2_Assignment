/*Q6. Write a memory-intensive program which creates a lot of objects. Try G1 collector on this program. Print timestamp and heap size. Use the following commands to print the heap size and free space.
Command to print total memory of heap:
Runtime.getRuntime().totalMemory();
Command to print free memory of heap:
Runtime.getRuntime().freeMemory();*/
package garbageCollection;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Q06_MemoryIntensiveProgram {
	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
// Enable G1 garbage collector
		System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "4");
		System.setProperty("java.compiler", "");
		System.setProperty("sun.misc.ContendedAnnotatedTypes.Enabled", "true");
		System.setProperty("sun.rt.contended", "true");
		System.setProperty("java.awt.headless", "true");
		System.setProperty("sun.management.jmxremote", "true");
		System.setProperty("sun.management.jmxremote.port", "9010");
		System.setProperty("sun.management.jmxremote.authenticate", "false");
		System.setProperty("sun.management.jmxremote.ssl", "false");
		System.setProperty("java.security.egd", "file:/dev/./urandom");
// Print initial timestamp and heap size
		System.out.println("Initial timestamp: " + new SimpleDateFormat("yyyy-MM-ddHH:mm:ss.SSS").format(new Date()));
		System.out.println("Initial total memory: " + runtime.totalMemory() + " bytes");
		System.out.println("Initial free memory: " + runtime.freeMemory() + " bytes");
// Create a lot of objects
		int totalObjects = 10000000;
		Object[] objects = new Object[totalObjects];
		Random random = new Random();
		for (int i = 0; i < totalObjects; i++) {
			objects[i] = new Object() {
				@SuppressWarnings("unused")
				int value = random.nextInt(100);
			};
		}
// Print final timestamp and heap size
		System.out.println("Final timestamp: " + new SimpleDateFormat("yyyy-MM-ddHH:mm:ss.SSS").format(new Date()));
		System.out.println("Final total memory: " + runtime.totalMemory() + " bytes");
		System.out.println("Final free memory: " + runtime.freeMemory() + " bytes");
	}
}