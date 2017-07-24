import scala.annotation.tailrec

val l = List(("one", streamRange(1, 10000)), ("two", streamRange(11, 20000)), ("three", streamRange(21, 3000)))

def streamRange(begin: Int, end: Int): Stream[Int] =
  if(begin > end) Stream.empty
  else begin #:: streamRange(begin + 1, end)

def streamFrom[A](list: List[Stream[A]]) = {
  @tailrec def concat(streams: List[Stream[A]], acc: Stream[A]): Stream[A] = streams match {
    case Nil => acc
    case head :: tail => concat(tail, head #::: acc)
  }

  concat(list, Stream.empty)
}

l.unzip._1

streamFrom(l.unzip._2)