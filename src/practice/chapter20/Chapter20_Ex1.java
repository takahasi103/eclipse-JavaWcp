package practice.chapter20;

//	次のクラスは複数スレッドから同時に実行するとデータが破壊される恐れがあります。
//	このコードをスレッドセーフなものに修正して下さい。
//	
//	class Counter {
//		private long count = 0;
//	
//		public void add(long i) {
//			System.out.println("足し算します threadName = " + Thread.currentThread().getName());
//			count += i;
//		}
//	
//		public void mul(long i) {
//			long c = count;
//			System.out.println("かけ算をします threadName = " + Thread.currentThread().getName());
//			count *= i;
//		}
//	}

public class Chapter20_Ex1 {

}
