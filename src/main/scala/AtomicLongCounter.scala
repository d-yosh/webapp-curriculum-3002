import java.util.concurrent.atomic.AtomicLong

object AtomicLongCounterMain extends App {

  for (i <- 1 to 100) {
    new Thread(() => println(AtomicLongCounter.next)).start()
  }
}

object AtomicLongCounter {
  private[this] val counter: AtomicLong = new AtomicLong(1)
  def next: Long = counter.getAndIncrement()

}
